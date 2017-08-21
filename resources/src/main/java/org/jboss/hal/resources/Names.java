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
package org.jboss.hal.resources;

/** Common names and technical terms which are not meant to be translated. */
public interface Names {

    // KEEP THESE IN ALPHABETICAL ORDER!
    String ACCESS_CONTROL = "Access Control";
    String ACCESS_LOG = "Access Log";
    String ACTIVE_MQ = "ActiveMQ";
    String ADDRESS_SETTING = "Address Setting";
    String ACL_MODULE = "ACL Module";
    String ADMIN_OBJECT = "Admin Object";
    String AJP_LISTENER = "AJP Listener";
    String ARCHIVE = "Archive";
    String APPLICATION_SECURITY_DOMAIN = "Application Security Domain";
    String ASYNC_OPERATIONS = "Async Operations";
    String ATTRIBUTE_MAPPING = "Attribute Mapping";
    String AUDIT_LOG = "Audit Log";
    String AUDIT_MODULE = "Audit Module";
    String AUTHENTICATION_MODULE = "Authentication Module";
    String AUTHORIZATION_MODULE = "Authorization Module";

    String BACKUP_FOR = "Backup For";
    String BACKUP = "Backup";
    String BACKUPS = "Backups";
    String BATCH = "Batch";
    String BATCH_STATUS = "Batch Status";
    String BINARY_JDBC = "Binary JDBC";
    String BINARY_TABLE = "Binary Table";
    String BINDINGS_DIRECTORY = "Bindings Directory";
    String BOOT_ERRORS = "Boot Errors";
    String BOOTSTRAP = "Bootstrap";
    String BRIDGE = "Bridge";
    String BROADCAST_GROUP = "Broadcast Group";
    String BUFFER_CACHES = "Buffer Caches";
    String BUNDLED_EXTENSION = "Bundled Extension";

    String CACHE_CONTAINER = "Cache Container";
    String CHANNEL = "Channel";
    String CLIENT_CONFIGURATION = "Client Configuration";
    String CLIENT_MAPPING = "Client Mapping";
    String CLIENT_MAPPINGS = "Client Mappings";
    String CLUSTER_CONNECTION = "Cluster Connection";
    String CLUSTERING = "Clustering";
    String COLLECTION = "Collection";
    String CONFIGURATION = "Configuration";
    String CONFIGURATION_CHANGES = "Configuration Changes";
    String CONNECTION = "Connection";
    String CONNECTION_FACTORY = "Connection Factory";
    String CONNECTION_DEFINITION = "Connection Definition";
    String CONNECTIONS = "Connections";
    String CONNECTOR_SERVICE = "Connector Service";
    String CONTENT = "Content";
    String CONTEXT_ROOT = "Context Root";
    String CONTEXT_ROOTS = "Context Roots";
    String COOKIES = "Cookies";
    String CORE_QUEUE = "Core Queue";
    String CRAWLER = "Crawler";
    String CREDENTIAL_REFERENCE = "Credential Reference";
    String CUSTOM = "Custom";
    String CUSTOM_POLICY = "Custom Policy";

    String DATASOURCE = "Datasource";
    String DATASOURCES = "Datasources";
    String DATASOURCES_DRIVERS = "Datasources & Drivers";
    String DEFAULT_INTERFACE = "Default Interface";
    String DELIVERY_ACTIVE = "delivery active";
    String DELIVERY_INACTIVE = "delivery inactive";
    String DEPLOYMENT = "Deployment";
    String DEPLOYMENTS = "Deployments";
    String DESTINATION = "Destination";
    String DESTINATIONS = "Destinations";
    String DISCOVERY_GROUP = "Discovery Group";
    String DISTRIBUTED_CACHE = "Distributed Cache";
    String DIVERT = "Divert";
    String DOMAIN_CONTROLLER = "Domain Controller";

    String EE = "EE";
    String EJB3 = "EJB";
    String ELYTRON = "Elytron";
    String ENDPOINT_CONFIGURATION = "Endpoint Configuration";
    String ENTITY = "Entity";
    String ENTITY_CACHE = "Entity Cache";
    String EVICTION = "Eviction";
    String EXECUTION_ID = "Execution ID";
    String EXECUTIONS = "Executions";
    String EXPIRATION = "Expiration";
    String EXTENSION = "Extension";
    String EXTENSIONS = "Extensions";

    String FACTORIES_TRANSFORMERS = "Factories / Transformers";
    String FILE = "File";
    String FILTER = "Filter";
    String FILTERS = "Filters";
    String FORK = "Fork";

    String GENERIC_ACCEPTOR = "Generic Acceptor";
    String GENERIC_CONNECTOR = "Generic Connector";
    String GLOBAL_MODULES = "Global Modules";
    String GROUPING_HANDLER = "Grouping Handler";

    String HA_POLICY = "HA Policy";
    String HAL = "HAL";
    String HANDLER = "Handler";
    String HANDLERS = "Handlers";
    String HANDLER_CHAIN = "Handler Chain";
    String HEAP = "Heap";
    String HOST = "Host";
    String HOST_CONTROLLER = "Host Controller";
    String HOSTS = "Hosts";
    String HTTP = "HTTP";
    String HTTP_ACCEPTOR = "HTTP Acceptor";
    String HTTP_AUTHENTICATION_FACTORY = "HTTP Authentication Factory";
    String HTTP_CONNECTOR = "HTTP Connector";
    String HTTP_CONNECTOR_SECURITY = "HTTP Connector Security";
    String HTTP_CONNECTOR_SECURITY_POLICY = "HTTP Connector Security Policy";
    String HTTP_INVOKER = "HTTP Invoker";
    String HTTP_LISTENER = "HTTP Listener";
    String HTTPS = "HTTPS";
    String HTTPS_LISTENER = "HTTPS Listener";

    String IDENTITY_ATTRIBUTE_MAPPING = "Identity Attribute Mapping";
    String IDENTITY_MAPPING = "Identity Mapping";
    String IN_VM_ACCEPTOR = "In VM Acceptor";
    String IN_VM_CONNECTOR = "In VM Connector";
    String INBOUND = "Inbound";
    String INCLUDES = "Includes";
    String INSTANCE_ID = "Instance ID";
    String INTERFACE = "Interface";
    String INTERFACES = "Interfaces";
    String INVALIDATION_CACHE = "Invalidation Cache";
    String IO = "IO";

    String JACC_POLICY = "JACC Policy";
    String JDBC = "JDBC";
    String JDBC_DRIVER = "JDBC Driver";
    String JDBC_DRIVERS = "JDBC Drivers";
    String JDBC_REALM = "JDBC Realm";
    String JGROUPS = "JGroups";
    String JMS_BRIDGE = "JMS Bridge";
    String JNDI = "JNDI";
    String JOB = "Job";
    String JOURNAL_DIRECTORY = "Journal Directory";
    String JPA = "JPA";
    String JMS_QUEUE = "JMS Queue";
    String JMS_TOPIC = "JMS Topic";
    String JSP = "JSP";

    String LARGE_MESSAGES_DIRECTORY = "Large Messages Directory";
    String LDAP_KEY_STORE = "LDAP Key Store";
    String LDAP_REALM = "LDAP Realm";
    String LISTENER = "Listener";
    String LIVE_ONLY = "Live Only";
    String LOCAL_CACHE = "Local Cache";
    String LOCAL_OUTBOUND_CONNECTION = "Local Outbound Connection";
    String LOCATION = "Location";
    String LOCATIONS = "Locations";
    String LOCKING = "Locking";
    String LOGGING = "Logging";
    String LOGGING_PROFILE = "Logging Profile";
    String LOGGING_PROFILES = "Logging Profiles";
    String LONG_RUNNING = "long running";

    String MAIL_SESSION = "Mail Session";
    String MANAGEMENT = "Management";
    String MANAGEMENT_INTERFACE = "Management Interface";
    String MANAGEMENT_CONSOLE = "Management Console";
    String MANAGEMENT_MODEL = "Management Model";
    String MAPPERS_DECODERS = "Mappers / Decoders";
    String MAPPING_MODULE = "Mapping Module";
    String MASTER = "Master";
    String MB = "MB";
    String MECHANISM_CONFIGURATION = "Mechanism Configuration";
    String MECHANISM_CONFIGURATIONS = "Mechanism Configurations";
    String MECHANISM_REALM_CONFIGURATION = "Mechanism Realm Configuration";
    String MECHANISM_REALM_CONFIGURATIONS = "Mechanism Realm Configurations";
    String MESSAGE_DRIVEN_BEAN = "Message Driven Bean";
    String MESSAGING = "Messaging";
    String MIME_MAPPING = "Mime Mapping";
    String MISSING_DEPENDENCIES = "Missing Dependencies";
    String MISSING_TRANSITIVE_DEPENDENCIES = "Missing Transitive Dependencies";
    String MIXED_JDBC = "Mixed JDBC";
    String MODCLUSTER = "Modcluster";
    String MODULE = "Module";

    String NAME = "Name";
    String NEW_ITEM_TEMPLATE = "New Item Template";
    String NOT_AVAILABLE = "n/a";
    String NYI = "not yet implemented";

    String OUTBOUND_CONNECTION = "Outbound Connection";
    String OTHER_SETTINGS = "Other Settings";
    String OUTBOUND_LOCAL = "Outbound Local";
    String OUTBOUND_REMOTE = "Outbound Remote";
    String OTP_CREDENTIAL_MAPPER = "OTP Credential Mapper";

    String PAGING_DIRECTORY = "Paging Directory";
    String PARTITION_HANDLING = "Partition Handling";
    String PATCH = "Patch";
    String PATCHES = "Patches";
    String PATCHING = "Patching";
    String PATHS = "Paths";
    String PATTERN = "Pattern";
    String PERMISSIONS = "Permissions";
    String PERMISSION_MAPPINGS = "Permission Mappings";
    String PERSISTENCE = "Persistence";
    String POLICY = "Policy";
    String POOL = "Pool";
    String POOLED_CONNECTION_FACTORY = "Pooled Connection Factory";
    String PORTS = "Ports";
    String POST_HANDLER_CHAIN = "Post Handler Chain";
    String PRE_HANDLER_CHAIN = "Pre Handler Chain";
    String PRINCIPAL_QUERY = "Principal Query";
    String PROFILE = "Profile";
    String PROFILES = "Profiles";
    String PROPERTIES_REALM = "Properties Realm";
    String PROTOCOL = "Protocol";

    String QUERY = "Query";
    String QUERY_CACHE = "Query Cache";
    String QUEUE = "Queue";

    String REALM = "Realm";
    String RELAY = "Relay";
    String REMOTE = "Remote";
    String REMOTE_ACCEPTOR = "Remote Acceptor";
    String REMOTE_COMMAND = "Remote Command";
    String REMOTE_CONNECTOR = "Remote Connector";
    String REMOTE_CONNECTOR_SECURITY = "Remote Connector Security";
    String REMOTE_CONNECTOR_SECURITY_POLICY = "Remote Connector Security Policy";
    String REMOTE_OUTBOUND_CONNECTION = "Remote Outbound Connection";
    String REMOTE_SITE = "Remote Site";
    String REPLICATED_CACHE = "Replicated Cache";
    String REPLICATION_COLOCATED = "Replication Colocated";
    String REPLICATION_MASTER = "Replication Master";
    String REPLICATION_SLAVE = "Replication Slave";
    String RESOURCE = "Resource";
    String RESOURCE_ADAPTER = "Resource Adapter";
    String RESPONSE_HEADER = "Response Header";
    String ROOT_LOGGER = "Root Logger";
    String RUNTIME = "Runtime";

    String SASL_AUTHENTICATION_FACTORY = "SASL Authentication Factory";
    String SECOND_LEVEL_CACHE = "Second Level Cache";
    String SECURE_MANAGEMENT = "Secure Management";
    String SECURITY_DOMAIN = "Security Domain";
    String SECURITY_REALMS = "Security Realms";
    String SECURITY_SETTING = "Security Setting";
    String SERVER = "Server";
    String SERVER_GROUP = "Server Group";
    String SERVER_GROUPS = "Server Groups";
    String SERVLET_CONTAINER = "Servlet Container";
    String SESSIONS = "Sessions";
    String SHARED_STORE_COLOCATED = "Shared Store Colocated";
    String SHARED_STORE_MASTER = "Shared Store Master";
    String SHARED_STORE_SLAVE = "Shared Store Slave";
    String SIMPLE_PERMISSION_MAPPER = "Simple Permission Mapper";
    String SINGLE_SIGN_ON = "Single Sign On";
    String SINGLETON_BEAN = "Singleton Bean";
    String SHORT_RUNNING = "short running";
    String SLAVE = "Slave";
    String SOCKET_BINDING = "Socket Binding";
    String SOCKET_BINDING_GROUP = "Socket Binding Group";
    String SOCKET_BINDING_GROUPS = "Socket Binding Groups";
    String SOCKET_BINDINGS = "Socket Bindings";
    String SOURCE = "Source";
    String STANDALONE_EXTENSION = "Standalone Extension";
    String STANDALONE_SERVER = "Standalone Server";
    String STATE_TRANSFER = "State Transfer";
    String STORE = "Store";
    String STRING_TABLE = "String Table";
    String STACK = "Stack";
    String STATEFUL_SESSION_BEAN = "Stateful Session Bean";
    String STATELESS_SESSION_BEAN = "Stateless Session Bean";
    String SUBDEPLOYMENTS = "Subdeployments";
    String SUBSYSTEM = "Subsystem";
    String SUBSYSTEMS = "Subsystems";
    String SYSTEM_PROPERTIES = "System Properties";
    String SYSTEM_PROPERTY = "System Property";

    String TARGET = "Target";
    String TASKS = "Tasks";
    String THREAD_POOL = "Thread Pool";
    String THREAD_POOLS = "Thread Pools";
    String THREADS = "Threads";
    String TIMER = "Timer";
    String TOPOLOGY = "Topology";
    String TRANSPORT = "Transport";
    String TRANSACTION = "Transaction";
    String TRUST_MODULE = "Trust Module";

    String UNKNOWN = "unknown";
    String UNMANAGED_DEPLOYMENT = "Unmanaged Deployment";
    String UNDERTOW = "Undertow";
    String URL = "URL";
    String USER_PASSWORD_MAPPER = "User Password Mapper";

    String VALUE = "Value";

    String WEB = "Web";
    String WEBSERVICES_CONFIGURATION = "Webservices Configuration";
    String WEBSOCKETS = "Web Sockets";
    String WELCOME_FILE = "Welcome File";
    String WORKER = "Worker";
    String WRITE_BEHAVIOUR = "Write Behaviour";
    String WRITE_BEHIND = "Write Behind";
    String WRITE_THROUGH = "Write Through";

    String XA_DATASOURCE = "XA Datasource";
    String X509_CREDENTIAL_MAPPER = "X509 Credential Mapper";
}
