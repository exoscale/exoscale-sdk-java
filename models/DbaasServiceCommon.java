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
public class DbaasServiceCommon implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Service creation timestamp (ISO 8601)
     */
    private OffsetDateTime createdAt;
    /**
     * TODO UNIT disk space for data storage
     */
    private Long diskSize;
    /**
     * Service integrations
     */
    private java.util.List<DbaasIntegration> integrations;
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
     * The zone where the service is running
     */
    private String zone;
    /**
     * Instantiates a new DbaasServiceCommon and sets the default values.
     */
    public DbaasServiceCommon() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceCommon
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceCommon createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceCommon();
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
     * Gets the created-at property value. Service creation timestamp (ISO 8601)
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("disk-size", (n) -> { this.setDiskSize(n.getLongValue()); });
        deserializerMap.put("integrations", (n) -> { this.setIntegrations(n.getCollectionOfObjectValues(DbaasIntegration::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("node-count", (n) -> { this.setNodeCount(n.getLongValue()); });
        deserializerMap.put("node-cpu-count", (n) -> { this.setNodeCpuCount(n.getLongValue()); });
        deserializerMap.put("node-memory", (n) -> { this.setNodeMemory(n.getLongValue()); });
        deserializerMap.put("notifications", (n) -> { this.setNotifications(n.getCollectionOfObjectValues(DbaasServiceNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(EnumServiceState::forValue)); });
        deserializerMap.put("termination-protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("updated-at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
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
        writer.writeOffsetDateTimeValue("created-at", this.getCreatedAt());
        writer.writeLongValue("disk-size", this.getDiskSize());
        writer.writeCollectionOfObjectValues("integrations", this.getIntegrations());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("node-count", this.getNodeCount());
        writer.writeLongValue("node-cpu-count", this.getNodeCpuCount());
        writer.writeLongValue("node-memory", this.getNodeMemory());
        writer.writeCollectionOfObjectValues("notifications", this.getNotifications());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeEnumValue("state", this.getState());
        writer.writeBooleanValue("termination-protection", this.getTerminationProtection());
        writer.writeStringValue("type", this.getType());
        writer.writeOffsetDateTimeValue("updated-at", this.getUpdatedAt());
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
     * Sets the created-at property value. Service creation timestamp (ISO 8601)
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
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
     * Sets the zone property value. The zone where the service is running
     * @param value Value to set for the zone property.
     */
    public void setZone(@jakarta.annotation.Nullable final String value) {
        this.zone = value;
    }
}
