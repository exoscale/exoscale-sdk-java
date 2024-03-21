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
 * SKS Nodepool
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksNodepool implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Nodepool addons
     */
    private java.util.List<SksNodepoolAddons> addons;
    /**
     * Nodepool Anti-affinity Groups
     */
    private java.util.List<AntiAffinityGroup> antiAffinityGroups;
    /**
     * Nodepool creation date
     */
    private OffsetDateTime createdAt;
    /**
     * Deploy target
     */
    private DeployTarget deployTarget;
    /**
     * Nodepool description
     */
    private String description;
    /**
     * Nodepool instances disk size in GB
     */
    private Long diskSize;
    /**
     * Nodepool ID
     */
    private UUID id;
    /**
     * Instance Pool
     */
    private InstancePool instancePool;
    /**
     * The instances created by the Nodepool will be prefixed with this value (default: pool)
     */
    private String instancePrefix;
    /**
     * Compute instance type
     */
    private InstanceType instanceType;
    /**
     * Kubelet image GC options
     */
    private KubeletImageGc kubeletImageGc;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Nodepool name
     */
    private String name;
    /**
     * Nodepool Private Networks
     */
    private java.util.List<PrivateNetwork> privateNetworks;
    /**
     * Nodepool Security Groups
     */
    private java.util.List<SecurityGroup> securityGroups;
    /**
     * Number of instances
     */
    private Long size;
    /**
     * Nodepool state
     */
    private SksNodepoolState state;
    /**
     * The taints property
     */
    private SksNodepoolTaints taints;
    /**
     * Instance template
     */
    private Template template;
    /**
     * Nodepool version
     */
    private String version;
    /**
     * Instantiates a new SksNodepool and sets the default values.
     */
    public SksNodepool() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SksNodepool
     */
    @jakarta.annotation.Nonnull
    public static SksNodepool createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SksNodepool();
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
     * Gets the addons property value. Nodepool addons
     * @return a java.util.List<SksNodepoolAddons>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SksNodepoolAddons> getAddons() {
        return this.addons;
    }
    /**
     * Gets the anti-affinity-groups property value. Nodepool Anti-affinity Groups
     * @return a java.util.List<AntiAffinityGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AntiAffinityGroup> getAntiAffinityGroups() {
        return this.antiAffinityGroups;
    }
    /**
     * Gets the created-at property value. Nodepool creation date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the deploy-target property value. Deploy target
     * @return a DeployTarget
     */
    @jakarta.annotation.Nullable
    public DeployTarget getDeployTarget() {
        return this.deployTarget;
    }
    /**
     * Gets the description property value. Nodepool description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the disk-size property value. Nodepool instances disk size in GB
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("addons", (n) -> { this.setAddons(n.getCollectionOfEnumValues(SksNodepoolAddons::forValue)); });
        deserializerMap.put("anti-affinity-groups", (n) -> { this.setAntiAffinityGroups(n.getCollectionOfObjectValues(AntiAffinityGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploy-target", (n) -> { this.setDeployTarget(n.getObjectValue(DeployTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("disk-size", (n) -> { this.setDiskSize(n.getLongValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("instance-pool", (n) -> { this.setInstancePool(n.getObjectValue(InstancePool::createFromDiscriminatorValue)); });
        deserializerMap.put("instance-prefix", (n) -> { this.setInstancePrefix(n.getStringValue()); });
        deserializerMap.put("instance-type", (n) -> { this.setInstanceType(n.getObjectValue(InstanceType::createFromDiscriminatorValue)); });
        deserializerMap.put("kubelet-image-gc", (n) -> { this.setKubeletImageGc(n.getObjectValue(KubeletImageGc::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("private-networks", (n) -> { this.setPrivateNetworks(n.getCollectionOfObjectValues(PrivateNetwork::createFromDiscriminatorValue)); });
        deserializerMap.put("security-groups", (n) -> { this.setSecurityGroups(n.getCollectionOfObjectValues(SecurityGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SksNodepoolState::forValue)); });
        deserializerMap.put("taints", (n) -> { this.setTaints(n.getObjectValue(SksNodepoolTaints::createFromDiscriminatorValue)); });
        deserializerMap.put("template", (n) -> { this.setTemplate(n.getObjectValue(Template::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Nodepool ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the instance-pool property value. Instance Pool
     * @return a InstancePool
     */
    @jakarta.annotation.Nullable
    public InstancePool getInstancePool() {
        return this.instancePool;
    }
    /**
     * Gets the instance-prefix property value. The instances created by the Nodepool will be prefixed with this value (default: pool)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstancePrefix() {
        return this.instancePrefix;
    }
    /**
     * Gets the instance-type property value. Compute instance type
     * @return a InstanceType
     */
    @jakarta.annotation.Nullable
    public InstanceType getInstanceType() {
        return this.instanceType;
    }
    /**
     * Gets the kubelet-image-gc property value. Kubelet image GC options
     * @return a KubeletImageGc
     */
    @jakarta.annotation.Nullable
    public KubeletImageGc getKubeletImageGc() {
        return this.kubeletImageGc;
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
     * Gets the name property value. Nodepool name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the private-networks property value. Nodepool Private Networks
     * @return a java.util.List<PrivateNetwork>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivateNetwork> getPrivateNetworks() {
        return this.privateNetworks;
    }
    /**
     * Gets the security-groups property value. Nodepool Security Groups
     * @return a java.util.List<SecurityGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityGroup> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * Gets the size property value. Number of instances
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the state property value. Nodepool state
     * @return a SksNodepoolState
     */
    @jakarta.annotation.Nullable
    public SksNodepoolState getState() {
        return this.state;
    }
    /**
     * Gets the taints property value. The taints property
     * @return a SksNodepoolTaints
     */
    @jakarta.annotation.Nullable
    public SksNodepoolTaints getTaints() {
        return this.taints;
    }
    /**
     * Gets the template property value. Instance template
     * @return a Template
     */
    @jakarta.annotation.Nullable
    public Template getTemplate() {
        return this.template;
    }
    /**
     * Gets the version property value. Nodepool version
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
        writer.writeCollectionOfObjectValues("anti-affinity-groups", this.getAntiAffinityGroups());
        writer.writeObjectValue("deploy-target", this.getDeployTarget());
        writer.writeStringValue("description", this.getDescription());
        writer.writeLongValue("disk-size", this.getDiskSize());
        writer.writeObjectValue("instance-pool", this.getInstancePool());
        writer.writeStringValue("instance-prefix", this.getInstancePrefix());
        writer.writeObjectValue("instance-type", this.getInstanceType());
        writer.writeObjectValue("kubelet-image-gc", this.getKubeletImageGc());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("private-networks", this.getPrivateNetworks());
        writer.writeCollectionOfObjectValues("security-groups", this.getSecurityGroups());
        writer.writeLongValue("size", this.getSize());
        writer.writeObjectValue("taints", this.getTaints());
        writer.writeObjectValue("template", this.getTemplate());
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
     * Sets the addons property value. Nodepool addons
     * @param value Value to set for the addons property.
     */
    public void setAddons(@jakarta.annotation.Nullable final java.util.List<SksNodepoolAddons> value) {
        this.addons = value;
    }
    /**
     * Sets the anti-affinity-groups property value. Nodepool Anti-affinity Groups
     * @param value Value to set for the anti-affinity-groups property.
     */
    public void setAntiAffinityGroups(@jakarta.annotation.Nullable final java.util.List<AntiAffinityGroup> value) {
        this.antiAffinityGroups = value;
    }
    /**
     * Sets the created-at property value. Nodepool creation date
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the deploy-target property value. Deploy target
     * @param value Value to set for the deploy-target property.
     */
    public void setDeployTarget(@jakarta.annotation.Nullable final DeployTarget value) {
        this.deployTarget = value;
    }
    /**
     * Sets the description property value. Nodepool description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the disk-size property value. Nodepool instances disk size in GB
     * @param value Value to set for the disk-size property.
     */
    public void setDiskSize(@jakarta.annotation.Nullable final Long value) {
        this.diskSize = value;
    }
    /**
     * Sets the id property value. Nodepool ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the instance-pool property value. Instance Pool
     * @param value Value to set for the instance-pool property.
     */
    public void setInstancePool(@jakarta.annotation.Nullable final InstancePool value) {
        this.instancePool = value;
    }
    /**
     * Sets the instance-prefix property value. The instances created by the Nodepool will be prefixed with this value (default: pool)
     * @param value Value to set for the instance-prefix property.
     */
    public void setInstancePrefix(@jakarta.annotation.Nullable final String value) {
        this.instancePrefix = value;
    }
    /**
     * Sets the instance-type property value. Compute instance type
     * @param value Value to set for the instance-type property.
     */
    public void setInstanceType(@jakarta.annotation.Nullable final InstanceType value) {
        this.instanceType = value;
    }
    /**
     * Sets the kubelet-image-gc property value. Kubelet image GC options
     * @param value Value to set for the kubelet-image-gc property.
     */
    public void setKubeletImageGc(@jakarta.annotation.Nullable final KubeletImageGc value) {
        this.kubeletImageGc = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. Nodepool name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the private-networks property value. Nodepool Private Networks
     * @param value Value to set for the private-networks property.
     */
    public void setPrivateNetworks(@jakarta.annotation.Nullable final java.util.List<PrivateNetwork> value) {
        this.privateNetworks = value;
    }
    /**
     * Sets the security-groups property value. Nodepool Security Groups
     * @param value Value to set for the security-groups property.
     */
    public void setSecurityGroups(@jakarta.annotation.Nullable final java.util.List<SecurityGroup> value) {
        this.securityGroups = value;
    }
    /**
     * Sets the size property value. Number of instances
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the state property value. Nodepool state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final SksNodepoolState value) {
        this.state = value;
    }
    /**
     * Sets the taints property value. The taints property
     * @param value Value to set for the taints property.
     */
    public void setTaints(@jakarta.annotation.Nullable final SksNodepoolTaints value) {
        this.taints = value;
    }
    /**
     * Sets the template property value. Instance template
     * @param value Value to set for the template property.
     */
    public void setTemplate(@jakarta.annotation.Nullable final Template value) {
        this.template = value;
    }
    /**
     * Sets the version property value. Nodepool version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
