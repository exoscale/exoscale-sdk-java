package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServicePg implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of backups for the service
     */
    private java.util.List<DbaasServiceBackup> backups;
    /**
     * Backup schedule
     */
    private DbaasServicePgBackupSchedule backupSchedule;
    /**
     * Service component information objects
     */
    private java.util.List<DbaasServicePgComponents> components;
    /**
     * PG connection information properties
     */
    private DbaasServicePgConnectionInfo connectionInfo;
    /**
     * PostgreSQL PGBouncer connection pools
     */
    private java.util.List<DbaasServicePgConnectionPools> connectionPools;
    /**
     * Service creation timestamp (ISO 8601)
     */
    private OffsetDateTime createdAt;
    /**
     * List of PostgreSQL databases
     */
    private java.util.List<String> databases;
    /**
     * TODO UNIT disk space for data storage
     */
    private Long diskSize;
    /**
     * Service integrations
     */
    private java.util.List<DbaasIntegration> integrations;
    /**
     * Allowed CIDR address blocks for incoming connections
     */
    private java.util.List<String> ipFilter;
    /**
     * Automatic maintenance settings
     */
    private DbaasServiceMaintenance maintenance;
    /**
     * Maximum number of connections allowed to an instance
     */
    private Long maxConnections;
    /**
     * The name property
     */
    private String name;
    /**
     * Number of service nodes in the active plan
     */
    private Long nodeCount;
    /**
     * Number of CPUs for each node
     */
    private Long nodeCpuCount;
    /**
     * TODO UNIT of memory for each node
     */
    private Long nodeMemory;
    /**
     * State of individual service nodes
     */
    private java.util.List<DbaasNodeState> nodeStates;
    /**
     * Service notifications
     */
    private java.util.List<DbaasServiceNotification> notifications;
    /**
     * The pgbouncerSettings property
     */
    private JsonSchemaPgbouncer pgbouncerSettings;
    /**
     * The pglookoutSettings property
     */
    private JsonSchemaPglookout pglookoutSettings;
    /**
     * The pgSettings property
     */
    private JsonSchemaPg pgSettings;
    /**
     * Subscription plan
     */
    private String plan;
    /**
     * Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
     */
    private Long sharedBuffersPercentage;
    /**
     * The state property
     */
    private EnumServiceState state;
    /**
     * The synchronousReplication property
     */
    private EnumPgSynchronousReplication synchronousReplication;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
    /**
     * The timescaledbSettings property
     */
    private JsonSchemaTimescaledb timescaledbSettings;
    /**
     * The type property
     */
    private String type;
    /**
     * Service last update timestamp (ISO 8601)
     */
    private OffsetDateTime updatedAt;
    /**
     * URI for connecting to the service (may be absent)
     */
    private String uri;
    /**
     * service_uri parameterized into key-value pairs
     */
    private DbaasServicePgUriParams uriParams;
    /**
     * List of service users
     */
    private java.util.List<DbaasServicePgUsers> users;
    /**
     * PostgreSQL version
     */
    private String version;
    /**
     * Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).
     */
    private Long workMem;
    /**
     * The zone where the service is running
     */
    private String zone;
    /**
     * Instantiates a new DbaasServicePg and sets the default values.
     */
    public DbaasServicePg() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServicePg
     */
    @jakarta.annotation.Nonnull
    public static DbaasServicePg createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServicePg();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the backups property value. List of backups for the service
     * @return a java.util.List<DbaasServiceBackup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasServiceBackup> getBackups() {
        return this.backups;
    }
    /**
     * Gets the backup-schedule property value. Backup schedule
     * @return a DbaasServicePgBackupSchedule
     */
    @jakarta.annotation.Nullable
    public DbaasServicePgBackupSchedule getBackupSchedule() {
        return this.backupSchedule;
    }
    /**
     * Gets the components property value. Service component information objects
     * @return a java.util.List<DbaasServicePgComponents>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasServicePgComponents> getComponents() {
        return this.components;
    }
    /**
     * Gets the connection-info property value. PG connection information properties
     * @return a DbaasServicePgConnectionInfo
     */
    @jakarta.annotation.Nullable
    public DbaasServicePgConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
    }
    /**
     * Gets the connection-pools property value. PostgreSQL PGBouncer connection pools
     * @return a java.util.List<DbaasServicePgConnectionPools>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasServicePgConnectionPools> getConnectionPools() {
        return this.connectionPools;
    }
    /**
     * Gets the created-at property value. Service creation timestamp (ISO 8601)
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the databases property value. List of PostgreSQL databases
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDatabases() {
        return this.databases;
    }
    /**
     * Gets the disk-size property value. TODO UNIT disk space for data storage
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDiskSize() {
        return this.diskSize;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(35);
        deserializerMap.put("backups", (n) -> { this.setBackups(n.getCollectionOfObjectValues(DbaasServiceBackup::createFromDiscriminatorValue)); });
        deserializerMap.put("backup-schedule", (n) -> { this.setBackupSchedule(n.getObjectValue(DbaasServicePgBackupSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("components", (n) -> { this.setComponents(n.getCollectionOfObjectValues(DbaasServicePgComponents::createFromDiscriminatorValue)); });
        deserializerMap.put("connection-info", (n) -> { this.setConnectionInfo(n.getObjectValue(DbaasServicePgConnectionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("connection-pools", (n) -> { this.setConnectionPools(n.getCollectionOfObjectValues(DbaasServicePgConnectionPools::createFromDiscriminatorValue)); });
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("databases", (n) -> { this.setDatabases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("disk-size", (n) -> { this.setDiskSize(n.getLongValue()); });
        deserializerMap.put("integrations", (n) -> { this.setIntegrations(n.getCollectionOfObjectValues(DbaasIntegration::createFromDiscriminatorValue)); });
        deserializerMap.put("ip-filter", (n) -> { this.setIpFilter(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(DbaasServiceMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("max-connections", (n) -> { this.setMaxConnections(n.getLongValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("node-count", (n) -> { this.setNodeCount(n.getLongValue()); });
        deserializerMap.put("node-cpu-count", (n) -> { this.setNodeCpuCount(n.getLongValue()); });
        deserializerMap.put("node-memory", (n) -> { this.setNodeMemory(n.getLongValue()); });
        deserializerMap.put("node-states", (n) -> { this.setNodeStates(n.getCollectionOfObjectValues(DbaasNodeState::createFromDiscriminatorValue)); });
        deserializerMap.put("notifications", (n) -> { this.setNotifications(n.getCollectionOfObjectValues(DbaasServiceNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("pgbouncer-settings", (n) -> { this.setPgbouncerSettings(n.getObjectValue(JsonSchemaPgbouncer::createFromDiscriminatorValue)); });
        deserializerMap.put("pglookout-settings", (n) -> { this.setPglookoutSettings(n.getObjectValue(JsonSchemaPglookout::createFromDiscriminatorValue)); });
        deserializerMap.put("pg-settings", (n) -> { this.setPgSettings(n.getObjectValue(JsonSchemaPg::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("shared-buffers-percentage", (n) -> { this.setSharedBuffersPercentage(n.getLongValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(EnumServiceState::forValue)); });
        deserializerMap.put("synchronous-replication", (n) -> { this.setSynchronousReplication(n.getEnumValue(EnumPgSynchronousReplication::forValue)); });
        deserializerMap.put("termination-protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("timescaledb-settings", (n) -> { this.setTimescaledbSettings(n.getObjectValue(JsonSchemaTimescaledb::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("updated-at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        deserializerMap.put("uri-params", (n) -> { this.setUriParams(n.getObjectValue(DbaasServicePgUriParams::createFromDiscriminatorValue)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(DbaasServicePgUsers::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        deserializerMap.put("work-mem", (n) -> { this.setWorkMem(n.getLongValue()); });
        deserializerMap.put("zone", (n) -> { this.setZone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the integrations property value. Service integrations
     * @return a java.util.List<DbaasIntegration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasIntegration> getIntegrations() {
        return this.integrations;
    }
    /**
     * Gets the ip-filter property value. Allowed CIDR address blocks for incoming connections
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIpFilter() {
        return this.ipFilter;
    }
    /**
     * Gets the maintenance property value. Automatic maintenance settings
     * @return a DbaasServiceMaintenance
     */
    @jakarta.annotation.Nullable
    public DbaasServiceMaintenance getMaintenance() {
        return this.maintenance;
    }
    /**
     * Gets the max-connections property value. Maximum number of connections allowed to an instance
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMaxConnections() {
        return this.maxConnections;
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the node-count property value. Number of service nodes in the active plan
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNodeCount() {
        return this.nodeCount;
    }
    /**
     * Gets the node-cpu-count property value. Number of CPUs for each node
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNodeCpuCount() {
        return this.nodeCpuCount;
    }
    /**
     * Gets the node-memory property value. TODO UNIT of memory for each node
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNodeMemory() {
        return this.nodeMemory;
    }
    /**
     * Gets the node-states property value. State of individual service nodes
     * @return a java.util.List<DbaasNodeState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasNodeState> getNodeStates() {
        return this.nodeStates;
    }
    /**
     * Gets the notifications property value. Service notifications
     * @return a java.util.List<DbaasServiceNotification>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasServiceNotification> getNotifications() {
        return this.notifications;
    }
    /**
     * Gets the pgbouncer-settings property value. The pgbouncerSettings property
     * @return a JsonSchemaPgbouncer
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgbouncer getPgbouncerSettings() {
        return this.pgbouncerSettings;
    }
    /**
     * Gets the pglookout-settings property value. The pglookoutSettings property
     * @return a JsonSchemaPglookout
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPglookout getPglookoutSettings() {
        return this.pglookoutSettings;
    }
    /**
     * Gets the pg-settings property value. The pgSettings property
     * @return a JsonSchemaPg
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPg getPgSettings() {
        return this.pgSettings;
    }
    /**
     * Gets the plan property value. Subscription plan
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPlan() {
        return this.plan;
    }
    /**
     * Gets the shared-buffers-percentage property value. Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSharedBuffersPercentage() {
        return this.sharedBuffersPercentage;
    }
    /**
     * Gets the state property value. The state property
     * @return a EnumServiceState
     */
    @jakarta.annotation.Nullable
    public EnumServiceState getState() {
        return this.state;
    }
    /**
     * Gets the synchronous-replication property value. The synchronousReplication property
     * @return a EnumPgSynchronousReplication
     */
    @jakarta.annotation.Nullable
    public EnumPgSynchronousReplication getSynchronousReplication() {
        return this.synchronousReplication;
    }
    /**
     * Gets the termination-protection property value. Service is protected against termination and powering off
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Gets the timescaledb-settings property value. The timescaledbSettings property
     * @return a JsonSchemaTimescaledb
     */
    @jakarta.annotation.Nullable
    public JsonSchemaTimescaledb getTimescaledbSettings() {
        return this.timescaledbSettings;
    }
    /**
     * Gets the type property value. The type property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the updated-at property value. Service last update timestamp (ISO 8601)
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the uri property value. URI for connecting to the service (may be absent)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUri() {
        return this.uri;
    }
    /**
     * Gets the uri-params property value. service_uri parameterized into key-value pairs
     * @return a DbaasServicePgUriParams
     */
    @jakarta.annotation.Nullable
    public DbaasServicePgUriParams getUriParams() {
        return this.uriParams;
    }
    /**
     * Gets the users property value. List of service users
     * @return a java.util.List<DbaasServicePgUsers>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasServicePgUsers> getUsers() {
        return this.users;
    }
    /**
     * Gets the version property value. PostgreSQL version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Gets the work-mem property value. Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getWorkMem() {
        return this.workMem;
    }
    /**
     * Gets the zone property value. The zone where the service is running
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getZone() {
        return this.zone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("backups", this.getBackups());
        writer.writeObjectValue("backup-schedule", this.getBackupSchedule());
        writer.writeCollectionOfObjectValues("components", this.getComponents());
        writer.writeObjectValue("connection-info", this.getConnectionInfo());
        writer.writeCollectionOfObjectValues("connection-pools", this.getConnectionPools());
        writer.writeOffsetDateTimeValue("created-at", this.getCreatedAt());
        writer.writeCollectionOfPrimitiveValues("databases", this.getDatabases());
        writer.writeLongValue("disk-size", this.getDiskSize());
        writer.writeCollectionOfObjectValues("integrations", this.getIntegrations());
        writer.writeCollectionOfPrimitiveValues("ip-filter", this.getIpFilter());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeLongValue("max-connections", this.getMaxConnections());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("node-count", this.getNodeCount());
        writer.writeLongValue("node-cpu-count", this.getNodeCpuCount());
        writer.writeLongValue("node-memory", this.getNodeMemory());
        writer.writeCollectionOfObjectValues("node-states", this.getNodeStates());
        writer.writeCollectionOfObjectValues("notifications", this.getNotifications());
        writer.writeObjectValue("pgbouncer-settings", this.getPgbouncerSettings());
        writer.writeObjectValue("pglookout-settings", this.getPglookoutSettings());
        writer.writeObjectValue("pg-settings", this.getPgSettings());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeLongValue("shared-buffers-percentage", this.getSharedBuffersPercentage());
        writer.writeEnumValue("state", this.getState());
        writer.writeEnumValue("synchronous-replication", this.getSynchronousReplication());
        writer.writeBooleanValue("termination-protection", this.getTerminationProtection());
        writer.writeObjectValue("timescaledb-settings", this.getTimescaledbSettings());
        writer.writeStringValue("type", this.getType());
        writer.writeOffsetDateTimeValue("updated-at", this.getUpdatedAt());
        writer.writeStringValue("uri", this.getUri());
        writer.writeObjectValue("uri-params", this.getUriParams());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
        writer.writeStringValue("version", this.getVersion());
        writer.writeLongValue("work-mem", this.getWorkMem());
        writer.writeStringValue("zone", this.getZone());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the backups property value. List of backups for the service
     * @param value Value to set for the backups property.
     */
    public void setBackups(@jakarta.annotation.Nullable final java.util.List<DbaasServiceBackup> value) {
        this.backups = value;
    }
    /**
     * Sets the backup-schedule property value. Backup schedule
     * @param value Value to set for the backup-schedule property.
     */
    public void setBackupSchedule(@jakarta.annotation.Nullable final DbaasServicePgBackupSchedule value) {
        this.backupSchedule = value;
    }
    /**
     * Sets the components property value. Service component information objects
     * @param value Value to set for the components property.
     */
    public void setComponents(@jakarta.annotation.Nullable final java.util.List<DbaasServicePgComponents> value) {
        this.components = value;
    }
    /**
     * Sets the connection-info property value. PG connection information properties
     * @param value Value to set for the connection-info property.
     */
    public void setConnectionInfo(@jakarta.annotation.Nullable final DbaasServicePgConnectionInfo value) {
        this.connectionInfo = value;
    }
    /**
     * Sets the connection-pools property value. PostgreSQL PGBouncer connection pools
     * @param value Value to set for the connection-pools property.
     */
    public void setConnectionPools(@jakarta.annotation.Nullable final java.util.List<DbaasServicePgConnectionPools> value) {
        this.connectionPools = value;
    }
    /**
     * Sets the created-at property value. Service creation timestamp (ISO 8601)
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the databases property value. List of PostgreSQL databases
     * @param value Value to set for the databases property.
     */
    public void setDatabases(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.databases = value;
    }
    /**
     * Sets the disk-size property value. TODO UNIT disk space for data storage
     * @param value Value to set for the disk-size property.
     */
    public void setDiskSize(@jakarta.annotation.Nullable final Long value) {
        this.diskSize = value;
    }
    /**
     * Sets the integrations property value. Service integrations
     * @param value Value to set for the integrations property.
     */
    public void setIntegrations(@jakarta.annotation.Nullable final java.util.List<DbaasIntegration> value) {
        this.integrations = value;
    }
    /**
     * Sets the ip-filter property value. Allowed CIDR address blocks for incoming connections
     * @param value Value to set for the ip-filter property.
     */
    public void setIpFilter(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ipFilter = value;
    }
    /**
     * Sets the maintenance property value. Automatic maintenance settings
     * @param value Value to set for the maintenance property.
     */
    public void setMaintenance(@jakarta.annotation.Nullable final DbaasServiceMaintenance value) {
        this.maintenance = value;
    }
    /**
     * Sets the max-connections property value. Maximum number of connections allowed to an instance
     * @param value Value to set for the max-connections property.
     */
    public void setMaxConnections(@jakarta.annotation.Nullable final Long value) {
        this.maxConnections = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the node-count property value. Number of service nodes in the active plan
     * @param value Value to set for the node-count property.
     */
    public void setNodeCount(@jakarta.annotation.Nullable final Long value) {
        this.nodeCount = value;
    }
    /**
     * Sets the node-cpu-count property value. Number of CPUs for each node
     * @param value Value to set for the node-cpu-count property.
     */
    public void setNodeCpuCount(@jakarta.annotation.Nullable final Long value) {
        this.nodeCpuCount = value;
    }
    /**
     * Sets the node-memory property value. TODO UNIT of memory for each node
     * @param value Value to set for the node-memory property.
     */
    public void setNodeMemory(@jakarta.annotation.Nullable final Long value) {
        this.nodeMemory = value;
    }
    /**
     * Sets the node-states property value. State of individual service nodes
     * @param value Value to set for the node-states property.
     */
    public void setNodeStates(@jakarta.annotation.Nullable final java.util.List<DbaasNodeState> value) {
        this.nodeStates = value;
    }
    /**
     * Sets the notifications property value. Service notifications
     * @param value Value to set for the notifications property.
     */
    public void setNotifications(@jakarta.annotation.Nullable final java.util.List<DbaasServiceNotification> value) {
        this.notifications = value;
    }
    /**
     * Sets the pgbouncer-settings property value. The pgbouncerSettings property
     * @param value Value to set for the pgbouncer-settings property.
     */
    public void setPgbouncerSettings(@jakarta.annotation.Nullable final JsonSchemaPgbouncer value) {
        this.pgbouncerSettings = value;
    }
    /**
     * Sets the pglookout-settings property value. The pglookoutSettings property
     * @param value Value to set for the pglookout-settings property.
     */
    public void setPglookoutSettings(@jakarta.annotation.Nullable final JsonSchemaPglookout value) {
        this.pglookoutSettings = value;
    }
    /**
     * Sets the pg-settings property value. The pgSettings property
     * @param value Value to set for the pg-settings property.
     */
    public void setPgSettings(@jakarta.annotation.Nullable final JsonSchemaPg value) {
        this.pgSettings = value;
    }
    /**
     * Sets the plan property value. Subscription plan
     * @param value Value to set for the plan property.
     */
    public void setPlan(@jakarta.annotation.Nullable final String value) {
        this.plan = value;
    }
    /**
     * Sets the shared-buffers-percentage property value. Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
     * @param value Value to set for the shared-buffers-percentage property.
     */
    public void setSharedBuffersPercentage(@jakarta.annotation.Nullable final Long value) {
        this.sharedBuffersPercentage = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final EnumServiceState value) {
        this.state = value;
    }
    /**
     * Sets the synchronous-replication property value. The synchronousReplication property
     * @param value Value to set for the synchronous-replication property.
     */
    public void setSynchronousReplication(@jakarta.annotation.Nullable final EnumPgSynchronousReplication value) {
        this.synchronousReplication = value;
    }
    /**
     * Sets the termination-protection property value. Service is protected against termination and powering off
     * @param value Value to set for the termination-protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
    /**
     * Sets the timescaledb-settings property value. The timescaledbSettings property
     * @param value Value to set for the timescaledb-settings property.
     */
    public void setTimescaledbSettings(@jakarta.annotation.Nullable final JsonSchemaTimescaledb value) {
        this.timescaledbSettings = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the updated-at property value. Service last update timestamp (ISO 8601)
     * @param value Value to set for the updated-at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
    /**
     * Sets the uri property value. URI for connecting to the service (may be absent)
     * @param value Value to set for the uri property.
     */
    public void setUri(@jakarta.annotation.Nullable final String value) {
        this.uri = value;
    }
    /**
     * Sets the uri-params property value. service_uri parameterized into key-value pairs
     * @param value Value to set for the uri-params property.
     */
    public void setUriParams(@jakarta.annotation.Nullable final DbaasServicePgUriParams value) {
        this.uriParams = value;
    }
    /**
     * Sets the users property value. List of service users
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<DbaasServicePgUsers> value) {
        this.users = value;
    }
    /**
     * Sets the version property value. PostgreSQL version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
    /**
     * Sets the work-mem property value. Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).
     * @param value Value to set for the work-mem property.
     */
    public void setWorkMem(@jakarta.annotation.Nullable final Long value) {
        this.workMem = value;
    }
    /**
     * Sets the zone property value. The zone where the service is running
     * @param value Value to set for the zone property.
     */
    public void setZone(@jakarta.annotation.Nullable final String value) {
        this.zone = value;
    }
}
