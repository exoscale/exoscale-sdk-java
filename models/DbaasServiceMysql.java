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
public class DbaasServiceMysql implements AdditionalDataHolder, Parsable {
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
    private DbaasServiceMysqlBackupSchedule backupSchedule;
    /**
     * Service component information objects
     */
    private java.util.List<DbaasServiceMysqlComponents> components;
    /**
     * MySQL connection information properties
     */
    private DbaasServiceMysqlConnectionInfo connectionInfo;
    /**
     * Service creation timestamp (ISO 8601)
     */
    private OffsetDateTime createdAt;
    /**
     * List of MySQL databases
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
     * The mysqlSettings property
     */
    private JsonSchemaMysql mysqlSettings;
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
     * Subscription plan
     */
    private String plan;
    /**
     * The state property
     */
    private EnumServiceState state;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
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
    private DbaasServiceMysqlUriParams uriParams;
    /**
     * List of service users
     */
    private java.util.List<DbaasServiceMysqlUsers> users;
    /**
     * MySQL version
     */
    private String version;
    /**
     * The zone where the service is running
     */
    private String zone;
    /**
     * Instantiates a new DbaasServiceMysql and sets the default values.
     */
    public DbaasServiceMysql() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceMysql
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceMysql createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceMysql();
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
     * @return a DbaasServiceMysqlBackupSchedule
     */
    @jakarta.annotation.Nullable
    public DbaasServiceMysqlBackupSchedule getBackupSchedule() {
        return this.backupSchedule;
    }
    /**
     * Gets the components property value. Service component information objects
     * @return a java.util.List<DbaasServiceMysqlComponents>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasServiceMysqlComponents> getComponents() {
        return this.components;
    }
    /**
     * Gets the connection-info property value. MySQL connection information properties
     * @return a DbaasServiceMysqlConnectionInfo
     */
    @jakarta.annotation.Nullable
    public DbaasServiceMysqlConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
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
     * Gets the databases property value. List of MySQL databases
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("backups", (n) -> { this.setBackups(n.getCollectionOfObjectValues(DbaasServiceBackup::createFromDiscriminatorValue)); });
        deserializerMap.put("backup-schedule", (n) -> { this.setBackupSchedule(n.getObjectValue(DbaasServiceMysqlBackupSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("components", (n) -> { this.setComponents(n.getCollectionOfObjectValues(DbaasServiceMysqlComponents::createFromDiscriminatorValue)); });
        deserializerMap.put("connection-info", (n) -> { this.setConnectionInfo(n.getObjectValue(DbaasServiceMysqlConnectionInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("databases", (n) -> { this.setDatabases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("disk-size", (n) -> { this.setDiskSize(n.getLongValue()); });
        deserializerMap.put("integrations", (n) -> { this.setIntegrations(n.getCollectionOfObjectValues(DbaasIntegration::createFromDiscriminatorValue)); });
        deserializerMap.put("ip-filter", (n) -> { this.setIpFilter(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(DbaasServiceMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("mysql-settings", (n) -> { this.setMysqlSettings(n.getObjectValue(JsonSchemaMysql::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("node-count", (n) -> { this.setNodeCount(n.getLongValue()); });
        deserializerMap.put("node-cpu-count", (n) -> { this.setNodeCpuCount(n.getLongValue()); });
        deserializerMap.put("node-memory", (n) -> { this.setNodeMemory(n.getLongValue()); });
        deserializerMap.put("node-states", (n) -> { this.setNodeStates(n.getCollectionOfObjectValues(DbaasNodeState::createFromDiscriminatorValue)); });
        deserializerMap.put("notifications", (n) -> { this.setNotifications(n.getCollectionOfObjectValues(DbaasServiceNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(EnumServiceState::forValue)); });
        deserializerMap.put("termination-protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("updated-at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        deserializerMap.put("uri-params", (n) -> { this.setUriParams(n.getObjectValue(DbaasServiceMysqlUriParams::createFromDiscriminatorValue)); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(DbaasServiceMysqlUsers::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
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
     * Gets the mysql-settings property value. The mysqlSettings property
     * @return a JsonSchemaMysql
     */
    @jakarta.annotation.Nullable
    public JsonSchemaMysql getMysqlSettings() {
        return this.mysqlSettings;
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
     * Gets the plan property value. Subscription plan
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPlan() {
        return this.plan;
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
     * Gets the termination-protection property value. Service is protected against termination and powering off
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
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
     * @return a DbaasServiceMysqlUriParams
     */
    @jakarta.annotation.Nullable
    public DbaasServiceMysqlUriParams getUriParams() {
        return this.uriParams;
    }
    /**
     * Gets the users property value. List of service users
     * @return a java.util.List<DbaasServiceMysqlUsers>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasServiceMysqlUsers> getUsers() {
        return this.users;
    }
    /**
     * Gets the version property value. MySQL version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeOffsetDateTimeValue("created-at", this.getCreatedAt());
        writer.writeCollectionOfPrimitiveValues("databases", this.getDatabases());
        writer.writeLongValue("disk-size", this.getDiskSize());
        writer.writeCollectionOfObjectValues("integrations", this.getIntegrations());
        writer.writeCollectionOfPrimitiveValues("ip-filter", this.getIpFilter());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeObjectValue("mysql-settings", this.getMysqlSettings());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("node-count", this.getNodeCount());
        writer.writeLongValue("node-cpu-count", this.getNodeCpuCount());
        writer.writeLongValue("node-memory", this.getNodeMemory());
        writer.writeCollectionOfObjectValues("node-states", this.getNodeStates());
        writer.writeCollectionOfObjectValues("notifications", this.getNotifications());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeEnumValue("state", this.getState());
        writer.writeBooleanValue("termination-protection", this.getTerminationProtection());
        writer.writeStringValue("type", this.getType());
        writer.writeOffsetDateTimeValue("updated-at", this.getUpdatedAt());
        writer.writeStringValue("uri", this.getUri());
        writer.writeObjectValue("uri-params", this.getUriParams());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
        writer.writeStringValue("version", this.getVersion());
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
    public void setBackupSchedule(@jakarta.annotation.Nullable final DbaasServiceMysqlBackupSchedule value) {
        this.backupSchedule = value;
    }
    /**
     * Sets the components property value. Service component information objects
     * @param value Value to set for the components property.
     */
    public void setComponents(@jakarta.annotation.Nullable final java.util.List<DbaasServiceMysqlComponents> value) {
        this.components = value;
    }
    /**
     * Sets the connection-info property value. MySQL connection information properties
     * @param value Value to set for the connection-info property.
     */
    public void setConnectionInfo(@jakarta.annotation.Nullable final DbaasServiceMysqlConnectionInfo value) {
        this.connectionInfo = value;
    }
    /**
     * Sets the created-at property value. Service creation timestamp (ISO 8601)
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the databases property value. List of MySQL databases
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
     * Sets the mysql-settings property value. The mysqlSettings property
     * @param value Value to set for the mysql-settings property.
     */
    public void setMysqlSettings(@jakarta.annotation.Nullable final JsonSchemaMysql value) {
        this.mysqlSettings = value;
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
     * Sets the plan property value. Subscription plan
     * @param value Value to set for the plan property.
     */
    public void setPlan(@jakarta.annotation.Nullable final String value) {
        this.plan = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final EnumServiceState value) {
        this.state = value;
    }
    /**
     * Sets the termination-protection property value. Service is protected against termination and powering off
     * @param value Value to set for the termination-protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
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
    public void setUriParams(@jakarta.annotation.Nullable final DbaasServiceMysqlUriParams value) {
        this.uriParams = value;
    }
    /**
     * Sets the users property value. List of service users
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<DbaasServiceMysqlUsers> value) {
        this.users = value;
    }
    /**
     * Sets the version property value. MySQL version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
    /**
     * Sets the zone property value. The zone where the service is running
     * @param value Value to set for the zone property.
     */
    public void setZone(@jakarta.annotation.Nullable final String value) {
        this.zone = value;
    }
}
