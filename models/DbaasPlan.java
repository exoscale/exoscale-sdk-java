package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * DBaaS plan
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasPlan implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Requires authorization or publicly available
     */
    private Boolean authorized;
    /**
     * DBaaS plan backup config
     */
    private DbaasBackupConfig backupConfig;
    /**
     * DBaaS plan disk space
     */
    private Long diskSpace;
    /**
     * DBaaS plan max memory allocated percentage
     */
    private Long maxMemoryPercent;
    /**
     * DBaaS plan name
     */
    private String name;
    /**
     * DBaaS plan node count
     */
    private Long nodeCount;
    /**
     * DBaaS plan CPU count per node
     */
    private Long nodeCpuCount;
    /**
     * DBaaS plan memory count per node
     */
    private Long nodeMemory;
    /**
     * Instantiates a new DbaasPlan and sets the default values.
     */
    public DbaasPlan() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasPlan
     */
    @jakarta.annotation.Nonnull
    public static DbaasPlan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasPlan();
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
     * Gets the authorized property value. Requires authorization or publicly available
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorized() {
        return this.authorized;
    }
    /**
     * Gets the backup-config property value. DBaaS plan backup config
     * @return a DbaasBackupConfig
     */
    @jakarta.annotation.Nullable
    public DbaasBackupConfig getBackupConfig() {
        return this.backupConfig;
    }
    /**
     * Gets the disk-space property value. DBaaS plan disk space
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDiskSpace() {
        return this.diskSpace;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("authorized", (n) -> { this.setAuthorized(n.getBooleanValue()); });
        deserializerMap.put("backup-config", (n) -> { this.setBackupConfig(n.getObjectValue(DbaasBackupConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("disk-space", (n) -> { this.setDiskSpace(n.getLongValue()); });
        deserializerMap.put("max-memory-percent", (n) -> { this.setMaxMemoryPercent(n.getLongValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("node-count", (n) -> { this.setNodeCount(n.getLongValue()); });
        deserializerMap.put("node-cpu-count", (n) -> { this.setNodeCpuCount(n.getLongValue()); });
        deserializerMap.put("node-memory", (n) -> { this.setNodeMemory(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max-memory-percent property value. DBaaS plan max memory allocated percentage
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMaxMemoryPercent() {
        return this.maxMemoryPercent;
    }
    /**
     * Gets the name property value. DBaaS plan name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the node-count property value. DBaaS plan node count
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNodeCount() {
        return this.nodeCount;
    }
    /**
     * Gets the node-cpu-count property value. DBaaS plan CPU count per node
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNodeCpuCount() {
        return this.nodeCpuCount;
    }
    /**
     * Gets the node-memory property value. DBaaS plan memory count per node
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNodeMemory() {
        return this.nodeMemory;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("backup-config", this.getBackupConfig());
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
     * Sets the authorized property value. Requires authorization or publicly available
     * @param value Value to set for the authorized property.
     */
    public void setAuthorized(@jakarta.annotation.Nullable final Boolean value) {
        this.authorized = value;
    }
    /**
     * Sets the backup-config property value. DBaaS plan backup config
     * @param value Value to set for the backup-config property.
     */
    public void setBackupConfig(@jakarta.annotation.Nullable final DbaasBackupConfig value) {
        this.backupConfig = value;
    }
    /**
     * Sets the disk-space property value. DBaaS plan disk space
     * @param value Value to set for the disk-space property.
     */
    public void setDiskSpace(@jakarta.annotation.Nullable final Long value) {
        this.diskSpace = value;
    }
    /**
     * Sets the max-memory-percent property value. DBaaS plan max memory allocated percentage
     * @param value Value to set for the max-memory-percent property.
     */
    public void setMaxMemoryPercent(@jakarta.annotation.Nullable final Long value) {
        this.maxMemoryPercent = value;
    }
    /**
     * Sets the name property value. DBaaS plan name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the node-count property value. DBaaS plan node count
     * @param value Value to set for the node-count property.
     */
    public void setNodeCount(@jakarta.annotation.Nullable final Long value) {
        this.nodeCount = value;
    }
    /**
     * Sets the node-cpu-count property value. DBaaS plan CPU count per node
     * @param value Value to set for the node-cpu-count property.
     */
    public void setNodeCpuCount(@jakarta.annotation.Nullable final Long value) {
        this.nodeCpuCount = value;
    }
    /**
     * Sets the node-memory property value. DBaaS plan memory count per node
     * @param value Value to set for the node-memory property.
     */
    public void setNodeMemory(@jakarta.annotation.Nullable final Long value) {
        this.nodeMemory = value;
    }
}
