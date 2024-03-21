package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * SKS Cluster
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksCluster implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Cluster addons
     */
    private java.util.List<SksClusterAddons> addons;
    /**
     * Enable auto upgrade of the control plane to the latest patch version available
     */
    private Boolean autoUpgrade;
    /**
     * Cluster CNI
     */
    private SksClusterCni cni;
    /**
     * Cluster creation date
     */
    private OffsetDateTime createdAt;
    /**
     * Cluster description
     */
    private String description;
    /**
     * Cluster endpoint
     */
    private String endpoint;
    /**
     * Cluster ID
     */
    private UUID id;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Cluster level
     */
    private SksClusterLevel level;
    /**
     * Cluster name
     */
    private String name;
    /**
     * Cluster Nodepools
     */
    private java.util.List<SksNodepool> nodepools;
    /**
     * Cluster state
     */
    private SksClusterState state;
    /**
     * Control plane Kubernetes version
     */
    private String version;
    /**
     * Instantiates a new SksCluster and sets the default values.
     */
    public SksCluster() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SksCluster
     */
    @jakarta.annotation.Nonnull
    public static SksCluster createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SksCluster();
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
     * Gets the addons property value. Cluster addons
     * @return a java.util.List<SksClusterAddons>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SksClusterAddons> getAddons() {
        return this.addons;
    }
    /**
     * Gets the auto-upgrade property value. Enable auto upgrade of the control plane to the latest patch version available
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoUpgrade() {
        return this.autoUpgrade;
    }
    /**
     * Gets the cni property value. Cluster CNI
     * @return a SksClusterCni
     */
    @jakarta.annotation.Nullable
    public SksClusterCni getCni() {
        return this.cni;
    }
    /**
     * Gets the created-at property value. Cluster creation date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the description property value. Cluster description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the endpoint property value. Cluster endpoint
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("addons", (n) -> { this.setAddons(n.getCollectionOfEnumValues(SksClusterAddons::forValue)); });
        deserializerMap.put("auto-upgrade", (n) -> { this.setAutoUpgrade(n.getBooleanValue()); });
        deserializerMap.put("cni", (n) -> { this.setCni(n.getEnumValue(SksClusterCni::forValue)); });
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("endpoint", (n) -> { this.setEndpoint(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getEnumValue(SksClusterLevel::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("nodepools", (n) -> { this.setNodepools(n.getCollectionOfObjectValues(SksNodepool::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SksClusterState::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Cluster ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a Labels
     */
    @jakarta.annotation.Nullable
    public Labels getLabels() {
        return this.labels;
    }
    /**
     * Gets the level property value. Cluster level
     * @return a SksClusterLevel
     */
    @jakarta.annotation.Nullable
    public SksClusterLevel getLevel() {
        return this.level;
    }
    /**
     * Gets the name property value. Cluster name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the nodepools property value. Cluster Nodepools
     * @return a java.util.List<SksNodepool>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SksNodepool> getNodepools() {
        return this.nodepools;
    }
    /**
     * Gets the state property value. Cluster state
     * @return a SksClusterState
     */
    @jakarta.annotation.Nullable
    public SksClusterState getState() {
        return this.state;
    }
    /**
     * Gets the version property value. Control plane Kubernetes version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("addons", this.getAddons());
        writer.writeBooleanValue("auto-upgrade", this.getAutoUpgrade());
        writer.writeEnumValue("cni", this.getCni());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeEnumValue("level", this.getLevel());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("version", this.getVersion());
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
     * Sets the addons property value. Cluster addons
     * @param value Value to set for the addons property.
     */
    public void setAddons(@jakarta.annotation.Nullable final java.util.List<SksClusterAddons> value) {
        this.addons = value;
    }
    /**
     * Sets the auto-upgrade property value. Enable auto upgrade of the control plane to the latest patch version available
     * @param value Value to set for the auto-upgrade property.
     */
    public void setAutoUpgrade(@jakarta.annotation.Nullable final Boolean value) {
        this.autoUpgrade = value;
    }
    /**
     * Sets the cni property value. Cluster CNI
     * @param value Value to set for the cni property.
     */
    public void setCni(@jakarta.annotation.Nullable final SksClusterCni value) {
        this.cni = value;
    }
    /**
     * Sets the created-at property value. Cluster creation date
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the description property value. Cluster description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the endpoint property value. Cluster endpoint
     * @param value Value to set for the endpoint property.
     */
    public void setEndpoint(@jakarta.annotation.Nullable final String value) {
        this.endpoint = value;
    }
    /**
     * Sets the id property value. Cluster ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the level property value. Cluster level
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final SksClusterLevel value) {
        this.level = value;
    }
    /**
     * Sets the name property value. Cluster name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the nodepools property value. Cluster Nodepools
     * @param value Value to set for the nodepools property.
     */
    public void setNodepools(@jakarta.annotation.Nullable final java.util.List<SksNodepool> value) {
        this.nodepools = value;
    }
    /**
     * Sets the state property value. Cluster state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final SksClusterState value) {
        this.state = value;
    }
    /**
     * Sets the version property value. Control plane Kubernetes version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
