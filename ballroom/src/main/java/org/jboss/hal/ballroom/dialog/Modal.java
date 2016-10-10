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
package org.jboss.hal.ballroom.dialog;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.NonNls;

import static jsinterop.annotations.JsPackage.GLOBAL;
import static org.jboss.hal.resources.UIConstants.OBJECT;

@JsType(isNative = true)
public abstract class Modal {

    @JsFunction
    @FunctionalInterface
    public interface ModalHandler {

        void handle();
    }


    @JsType(isNative = true, namespace = GLOBAL, name = OBJECT)
    public static class ModalOptions {

        public String backdrop;
        public boolean keyboard;

        @JsOverlay
        public static ModalOptions create(final boolean closeOnEsc) {
            ModalOptions options = new ModalOptions();
            options.backdrop = "static"; //NON-NLS
            options.keyboard = closeOnEsc;
            return options;
        }
    }


    @JsMethod(namespace = GLOBAL)
    public native static Modal $(@NonNls String selector);

    public native void modal(ModalOptions modalOptions);

    public native void modal(@NonNls String action);

    public native void on(@NonNls String event, ModalHandler handler);
}