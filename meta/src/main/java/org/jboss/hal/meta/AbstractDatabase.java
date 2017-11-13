/*
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.hal.meta;

import java.util.Map;
import java.util.Set;

import org.jboss.hal.db.PouchDB;
import org.jboss.hal.dmr.ResourceAddress;
import org.jetbrains.annotations.NonNls;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Single;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/** Abstract database which uses the specified statement context to resolve address templates. */
public abstract class AbstractDatabase<T> implements Database<T> {

    @NonNls private static final Logger logger = LoggerFactory.getLogger(AbstractDatabase.class);

    private StatementContext statementContext;
    private final String type;

    protected AbstractDatabase(StatementContext statementContext, String type) {
        this.statementContext = statementContext;
        this.type = type;
    }

    @Override
    public Map<ResourceAddress, AddressTemplate> addressLookup(Set<AddressTemplate> templates) {
        return templates.stream().collect(toMap(template -> template.resolve(statementContext), identity()));
    }

    @Override
    public Single<Map<ResourceAddress, T>> getAll(Set<AddressTemplate> templates) {
        Set<String> ids = templates.stream()
                .map(template -> template.resolve(statementContext).toString())
                .collect(toSet());

        return Single.create(em -> database().getAll(ids)
                .then(documents -> {
                    Map<ResourceAddress, T> metadata = documents.stream().collect(toMap(
                            document -> ResourceAddress.from(document.getId()),
                            document -> asMetadata(document)));
                    em.onSuccess(metadata);
                    return null;
                })
                .catch_(failure -> {
                    em.onError(new RuntimeException(String.valueOf(failure)));
                    return null;
                }));
    }

    @Override
    public Single<Map<ResourceAddress, T>> getRecursive(AddressTemplate template) {
        String id = template.resolve(statementContext).toString();
        return Single.create(em -> database().prefixSearch(id)
                .then(documents -> {
                    Map<ResourceAddress, T> metadata = documents.stream().collect(toMap(
                            document -> ResourceAddress.from(document.getId()),
                            document -> asMetadata(document)));
                    em.onSuccess(metadata);
                    return null;
                })
                .catch_(failure -> {
                    em.onError(new RuntimeException(String.valueOf(failure)));
                    return null;
                }));
    }

    @Override
    public String type() {
        return type;
    }

    protected abstract PouchDB database();
}