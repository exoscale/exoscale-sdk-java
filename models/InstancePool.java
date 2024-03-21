package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Instance Pool
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstancePool implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instance Pool Anti-affinity Groups
     */
    private java.util.List<AntiAffinityGroup> antiAffinityGroups;
    /**
     * Deploy target
     */
    private DeployTarget deployTarget;
    /**
     * Instance Pool description
     */
    private String description;
    /**
     * Instances disk size in GB
     */
    private Long diskSize;
    /**
     * Instances Elastic IPs
     */
    private java.util.List<ElasticIp> elasticIps;
    /**
     * Instance Pool ID
     */
    private UUID id;
    /**
     * The instances created by the Instance Pool will be prefixed with this value (default: pool)
     */
    private String instancePrefix;
    /**
     * Instances
     */
    private java.util.List<Instance> instances;
    /**
     * Compute instance type
     */
    private InstanceType instanceType;
    /**
     * Enable IPv6 for instances
     */
    private Boolean ipv6Enabled;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Resource manager
     */
    private Manager manager;
    /**
     * Minimum number of running instances
     */
    private Long minAvailable;
    /**
     * Instance Pool name
     */
    private String name;
    /**
     * Instance Pool Private Networks
     */
    private java.util.List<PrivateNetwork> privateNetworks;
    /**
     * The publicIpAssignment property
     */
    private PublicIpAssignment publicIpAssignment;
    /**
     * Instance Pool Security Groups
     */
    private java.util.List<SecurityGroup> securityGroups;
    /**
     * Number of instances
     */
    private Long size;
    /**
     * SSH key
     */
    private SshKey sshKey;
    /**
     * Instances SSH keys
     */
    private java.util.List<SshKey> sshKeys;
    /**
     * Instance Pool state
     */
    private InstancePoolState state;
    /**
     * Instance template
     */
    private Template template;
    /**
     * Instances Cloud-init user-data
     */
    private String userData;
    /**
     * Instantiates a new InstancePool and sets the default values.
     */
    public InstancePool() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstancePool
     */
    @jakarta.annotation.Nonnull
    public static InstancePool createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstancePool();
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
     * Gets the anti-affinity-groups property value. Instance Pool Anti-affinity Groups
     * @return a java.util.List<AntiAffinityGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AntiAffinityGroup> getAntiAffinityGroups() {
        return this.antiAffinityGroups;
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
     * Gets the description property value. Instance Pool description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the disk-size property value. Instances disk size in GB
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDiskSize() {
        return this.diskSize;
    }
    /**
     * Gets the elastic-ips property value. Instances Elastic IPs
     * @return a java.util.List<ElasticIp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ElasticIp> getElasticIps() {
        return this.elasticIps;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(23);
        deserializerMap.put("anti-affinity-groups", (n) -> { this.setAntiAffinityGroups(n.getCollectionOfObjectValues(AntiAffinityGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("deploy-target", (n) -> { this.setDeployTarget(n.getObjectValue(DeployTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("disk-size", (n) -> { this.setDiskSize(n.getLongValue()); });
        deserializerMap.put("elastic-ips", (n) -> { this.setElasticIps(n.getCollectionOfObjectValues(ElasticIp::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("instance-prefix", (n) -> { this.setInstancePrefix(n.getStringValue()); });
        deserializerMap.put("instances", (n) -> { this.setInstances(n.getCollectionOfObjectValues(Instance::createFromDiscriminatorValue)); });
        deserializerMap.put("instance-type", (n) -> { this.setInstanceType(n.getObjectValue(InstanceType::createFromDiscriminatorValue)); });
        deserializerMap.put("ipv6-enabled", (n) -> { this.setIpv6Enabled(n.getBooleanValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("manager", (n) -> { this.setManager(n.getObjectValue(Manager::createFromDiscriminatorValue)); });
        deserializerMap.put("min-available", (n) -> { this.setMinAvailable(n.getLongValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("private-networks", (n) -> { this.setPrivateNetworks(n.getCollectionOfObjectValues(PrivateNetwork::createFromDiscriminatorValue)); });
        deserializerMap.put("public-ip-assignment", (n) -> { this.setPublicIpAssignment(n.getEnumValue(PublicIpAssignment::forValue)); });
        deserializerMap.put("security-groups", (n) -> { this.setSecurityGroups(n.getCollectionOfObjectValues(SecurityGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("ssh-key", (n) -> { this.setSshKey(n.getObjectValue(SshKey::createFromDiscriminatorValue)); });
        deserializerMap.put("ssh-keys", (n) -> { this.setSshKeys(n.getCollectionOfObjectValues(SshKey::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(InstancePoolState::forValue)); });
        deserializerMap.put("template", (n) -> { this.setTemplate(n.getObjectValue(Template::createFromDiscriminatorValue)); });
        deserializerMap.put("user-data", (n) -> { this.setUserData(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Instance Pool ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the instance-prefix property value. The instances created by the Instance Pool will be prefixed with this value (default: pool)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstancePrefix() {
        return this.instancePrefix;
    }
    /**
     * Gets the instances property value. Instances
     * @return a java.util.List<Instance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Instance> getInstances() {
        return this.instances;
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
     * Gets the ipv6-enabled property value. Enable IPv6 for instances
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIpv6Enabled() {
        return this.ipv6Enabled;
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
     * Gets the manager property value. Resource manager
     * @return a Manager
     */
    @jakarta.annotation.Nullable
    public Manager getManager() {
        return this.manager;
    }
    /**
     * Gets the min-available property value. Minimum number of running instances
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMinAvailable() {
        return this.minAvailable;
    }
    /**
     * Gets the name property value. Instance Pool name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the private-networks property value. Instance Pool Private Networks
     * @return a java.util.List<PrivateNetwork>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivateNetwork> getPrivateNetworks() {
        return this.privateNetworks;
    }
    /**
     * Gets the public-ip-assignment property value. The publicIpAssignment property
     * @return a PublicIpAssignment
     */
    @jakarta.annotation.Nullable
    public PublicIpAssignment getPublicIpAssignment() {
        return this.publicIpAssignment;
    }
    /**
     * Gets the security-groups property value. Instance Pool Security Groups
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
     * Gets the ssh-key property value. SSH key
     * @return a SshKey
     */
    @jakarta.annotation.Nullable
    public SshKey getSshKey() {
        return this.sshKey;
    }
    /**
     * Gets the ssh-keys property value. Instances SSH keys
     * @return a java.util.List<SshKey>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SshKey> getSshKeys() {
        return this.sshKeys;
    }
    /**
     * Gets the state property value. Instance Pool state
     * @return a InstancePoolState
     */
    @jakarta.annotation.Nullable
    public InstancePoolState getState() {
        return this.state;
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
     * Gets the user-data property value. Instances Cloud-init user-data
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserData() {
        return this.userData;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("anti-affinity-groups", this.getAntiAffinityGroups());
        writer.writeObjectValue("deploy-target", this.getDeployTarget());
        writer.writeStringValue("description", this.getDescription());
        writer.writeLongValue("disk-size", this.getDiskSize());
        writer.writeCollectionOfObjectValues("elastic-ips", this.getElasticIps());
        writer.writeStringValue("instance-prefix", this.getInstancePrefix());
        writer.writeObjectValue("instance-type", this.getInstanceType());
        writer.writeBooleanValue("ipv6-enabled", this.getIpv6Enabled());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeObjectValue("manager", this.getManager());
        writer.writeLongValue("min-available", this.getMinAvailable());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("private-networks", this.getPrivateNetworks());
        writer.writeEnumValue("public-ip-assignment", this.getPublicIpAssignment());
        writer.writeCollectionOfObjectValues("security-groups", this.getSecurityGroups());
        writer.writeLongValue("size", this.getSize());
        writer.writeObjectValue("ssh-key", this.getSshKey());
        writer.writeCollectionOfObjectValues("ssh-keys", this.getSshKeys());
        writer.writeObjectValue("template", this.getTemplate());
        writer.writeStringValue("user-data", this.getUserData());
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
     * Sets the anti-affinity-groups property value. Instance Pool Anti-affinity Groups
     * @param value Value to set for the anti-affinity-groups property.
     */
    public void setAntiAffinityGroups(@jakarta.annotation.Nullable final java.util.List<AntiAffinityGroup> value) {
        this.antiAffinityGroups = value;
    }
    /**
     * Sets the deploy-target property value. Deploy target
     * @param value Value to set for the deploy-target property.
     */
    public void setDeployTarget(@jakarta.annotation.Nullable final DeployTarget value) {
        this.deployTarget = value;
    }
    /**
     * Sets the description property value. Instance Pool description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the disk-size property value. Instances disk size in GB
     * @param value Value to set for the disk-size property.
     */
    public void setDiskSize(@jakarta.annotation.Nullable final Long value) {
        this.diskSize = value;
    }
    /**
     * Sets the elastic-ips property value. Instances Elastic IPs
     * @param value Value to set for the elastic-ips property.
     */
    public void setElasticIps(@jakarta.annotation.Nullable final java.util.List<ElasticIp> value) {
        this.elasticIps = value;
    }
    /**
     * Sets the id property value. Instance Pool ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the instance-prefix property value. The instances created by the Instance Pool will be prefixed with this value (default: pool)
     * @param value Value to set for the instance-prefix property.
     */
    public void setInstancePrefix(@jakarta.annotation.Nullable final String value) {
        this.instancePrefix = value;
    }
    /**
     * Sets the instances property value. Instances
     * @param value Value to set for the instances property.
     */
    public void setInstances(@jakarta.annotation.Nullable final java.util.List<Instance> value) {
        this.instances = value;
    }
    /**
     * Sets the instance-type property value. Compute instance type
     * @param value Value to set for the instance-type property.
     */
    public void setInstanceType(@jakarta.annotation.Nullable final InstanceType value) {
        this.instanceType = value;
    }
    /**
     * Sets the ipv6-enabled property value. Enable IPv6 for instances
     * @param value Value to set for the ipv6-enabled property.
     */
    public void setIpv6Enabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ipv6Enabled = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the manager property value. Resource manager
     * @param value Value to set for the manager property.
     */
    public void setManager(@jakarta.annotation.Nullable final Manager value) {
        this.manager = value;
    }
    /**
     * Sets the min-available property value. Minimum number of running instances
     * @param value Value to set for the min-available property.
     */
    public void setMinAvailable(@jakarta.annotation.Nullable final Long value) {
        this.minAvailable = value;
    }
    /**
     * Sets the name property value. Instance Pool name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the private-networks property value. Instance Pool Private Networks
     * @param value Value to set for the private-networks property.
     */
    public void setPrivateNetworks(@jakarta.annotation.Nullable final java.util.List<PrivateNetwork> value) {
        this.privateNetworks = value;
    }
    /**
     * Sets the public-ip-assignment property value. The publicIpAssignment property
     * @param value Value to set for the public-ip-assignment property.
     */
    public void setPublicIpAssignment(@jakarta.annotation.Nullable final PublicIpAssignment value) {
        this.publicIpAssignment = value;
    }
    /**
     * Sets the security-groups property value. Instance Pool Security Groups
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
     * Sets the ssh-key property value. SSH key
     * @param value Value to set for the ssh-key property.
     */
    public void setSshKey(@jakarta.annotation.Nullable final SshKey value) {
        this.sshKey = value;
    }
    /**
     * Sets the ssh-keys property value. Instances SSH keys
     * @param value Value to set for the ssh-keys property.
     */
    public void setSshKeys(@jakarta.annotation.Nullable final java.util.List<SshKey> value) {
        this.sshKeys = value;
    }
    /**
     * Sets the state property value. Instance Pool state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final InstancePoolState value) {
        this.state = value;
    }
    /**
     * Sets the template property value. Instance template
     * @param value Value to set for the template property.
     */
    public void setTemplate(@jakarta.annotation.Nullable final Template value) {
        this.template = value;
    }
    /**
     * Sets the user-data property value. Instances Cloud-init user-data
     * @param value Value to set for the user-data property.
     */
    public void setUserData(@jakarta.annotation.Nullable final String value) {
        this.userData = value;
    }
}
