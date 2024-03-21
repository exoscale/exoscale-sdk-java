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
 * Instance
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Instance implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instance Anti-affinity Groups
     */
    private java.util.List<AntiAffinityGroup> antiAffinityGroups;
    /**
     * Instance creation date
     */
    private OffsetDateTime createdAt;
    /**
     * Deploy target
     */
    private DeployTarget deployTarget;
    /**
     * Instance disk size in GB
     */
    private Long diskSize;
    /**
     * Instance Elastic IPs
     */
    private java.util.List<ElasticIp> elasticIps;
    /**
     * Instance ID
     */
    private UUID id;
    /**
     * Compute instance type
     */
    private InstanceType instanceType;
    /**
     * Instance IPv6 address
     */
    private String ipv6Address;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Resource manager
     */
    private Manager manager;
    /**
     * Instance name
     */
    private String name;
    /**
     * Instance Private Networks
     */
    private java.util.List<PrivateNetwork> privateNetworks;
    /**
     * Instance public IPv4 address
     */
    private String publicIp;
    /**
     * The publicIpAssignment property
     */
    private PublicIpAssignment publicIpAssignment;
    /**
     * Instance Security Groups
     */
    private java.util.List<SecurityGroup> securityGroups;
    /**
     * Instance Snapshots
     */
    private java.util.List<Snapshot> snapshots;
    /**
     * SSH key
     */
    private SshKey sshKey;
    /**
     * Instance SSH Keys
     */
    private java.util.List<SshKey> sshKeys;
    /**
     * The state property
     */
    private InstanceState state;
    /**
     * Instance template
     */
    private Template template;
    /**
     * Instance Cloud-init user-data (base64 encoded)
     */
    private String userData;
    /**
     * Instantiates a new Instance and sets the default values.
     */
    public Instance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Instance
     */
    @jakarta.annotation.Nonnull
    public static Instance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Instance();
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
     * Gets the anti-affinity-groups property value. Instance Anti-affinity Groups
     * @return a java.util.List<AntiAffinityGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AntiAffinityGroup> getAntiAffinityGroups() {
        return this.antiAffinityGroups;
    }
    /**
     * Gets the created-at property value. Instance creation date
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
     * Gets the disk-size property value. Instance disk size in GB
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDiskSize() {
        return this.diskSize;
    }
    /**
     * Gets the elastic-ips property value. Instance Elastic IPs
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(21);
        deserializerMap.put("anti-affinity-groups", (n) -> { this.setAntiAffinityGroups(n.getCollectionOfObjectValues(AntiAffinityGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploy-target", (n) -> { this.setDeployTarget(n.getObjectValue(DeployTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("disk-size", (n) -> { this.setDiskSize(n.getLongValue()); });
        deserializerMap.put("elastic-ips", (n) -> { this.setElasticIps(n.getCollectionOfObjectValues(ElasticIp::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("instance-type", (n) -> { this.setInstanceType(n.getObjectValue(InstanceType::createFromDiscriminatorValue)); });
        deserializerMap.put("ipv6-address", (n) -> { this.setIpv6Address(n.getStringValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("manager", (n) -> { this.setManager(n.getObjectValue(Manager::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("private-networks", (n) -> { this.setPrivateNetworks(n.getCollectionOfObjectValues(PrivateNetwork::createFromDiscriminatorValue)); });
        deserializerMap.put("public-ip", (n) -> { this.setPublicIp(n.getStringValue()); });
        deserializerMap.put("public-ip-assignment", (n) -> { this.setPublicIpAssignment(n.getEnumValue(PublicIpAssignment::forValue)); });
        deserializerMap.put("security-groups", (n) -> { this.setSecurityGroups(n.getCollectionOfObjectValues(SecurityGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("snapshots", (n) -> { this.setSnapshots(n.getCollectionOfObjectValues(Snapshot::createFromDiscriminatorValue)); });
        deserializerMap.put("ssh-key", (n) -> { this.setSshKey(n.getObjectValue(SshKey::createFromDiscriminatorValue)); });
        deserializerMap.put("ssh-keys", (n) -> { this.setSshKeys(n.getCollectionOfObjectValues(SshKey::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(InstanceState::forValue)); });
        deserializerMap.put("template", (n) -> { this.setTemplate(n.getObjectValue(Template::createFromDiscriminatorValue)); });
        deserializerMap.put("user-data", (n) -> { this.setUserData(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Instance ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
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
     * Gets the ipv6-address property value. Instance IPv6 address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpv6Address() {
        return this.ipv6Address;
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
     * Gets the name property value. Instance name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the private-networks property value. Instance Private Networks
     * @return a java.util.List<PrivateNetwork>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivateNetwork> getPrivateNetworks() {
        return this.privateNetworks;
    }
    /**
     * Gets the public-ip property value. Instance public IPv4 address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublicIp() {
        return this.publicIp;
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
     * Gets the security-groups property value. Instance Security Groups
     * @return a java.util.List<SecurityGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityGroup> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * Gets the snapshots property value. Instance Snapshots
     * @return a java.util.List<Snapshot>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Snapshot> getSnapshots() {
        return this.snapshots;
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
     * Gets the ssh-keys property value. Instance SSH Keys
     * @return a java.util.List<SshKey>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SshKey> getSshKeys() {
        return this.sshKeys;
    }
    /**
     * Gets the state property value. The state property
     * @return a InstanceState
     */
    @jakarta.annotation.Nullable
    public InstanceState getState() {
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
     * Gets the user-data property value. Instance Cloud-init user-data (base64 encoded)
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
        writer.writeLongValue("disk-size", this.getDiskSize());
        writer.writeCollectionOfObjectValues("elastic-ips", this.getElasticIps());
        writer.writeObjectValue("instance-type", this.getInstanceType());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeObjectValue("manager", this.getManager());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("private-networks", this.getPrivateNetworks());
        writer.writeEnumValue("public-ip-assignment", this.getPublicIpAssignment());
        writer.writeCollectionOfObjectValues("security-groups", this.getSecurityGroups());
        writer.writeCollectionOfObjectValues("snapshots", this.getSnapshots());
        writer.writeObjectValue("ssh-key", this.getSshKey());
        writer.writeCollectionOfObjectValues("ssh-keys", this.getSshKeys());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the anti-affinity-groups property value. Instance Anti-affinity Groups
     * @param value Value to set for the anti-affinity-groups property.
     */
    public void setAntiAffinityGroups(@jakarta.annotation.Nullable final java.util.List<AntiAffinityGroup> value) {
        this.antiAffinityGroups = value;
    }
    /**
     * Sets the created-at property value. Instance creation date
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
     * Sets the disk-size property value. Instance disk size in GB
     * @param value Value to set for the disk-size property.
     */
    public void setDiskSize(@jakarta.annotation.Nullable final Long value) {
        this.diskSize = value;
    }
    /**
     * Sets the elastic-ips property value. Instance Elastic IPs
     * @param value Value to set for the elastic-ips property.
     */
    public void setElasticIps(@jakarta.annotation.Nullable final java.util.List<ElasticIp> value) {
        this.elasticIps = value;
    }
    /**
     * Sets the id property value. Instance ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the instance-type property value. Compute instance type
     * @param value Value to set for the instance-type property.
     */
    public void setInstanceType(@jakarta.annotation.Nullable final InstanceType value) {
        this.instanceType = value;
    }
    /**
     * Sets the ipv6-address property value. Instance IPv6 address
     * @param value Value to set for the ipv6-address property.
     */
    public void setIpv6Address(@jakarta.annotation.Nullable final String value) {
        this.ipv6Address = value;
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
     * Sets the name property value. Instance name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the private-networks property value. Instance Private Networks
     * @param value Value to set for the private-networks property.
     */
    public void setPrivateNetworks(@jakarta.annotation.Nullable final java.util.List<PrivateNetwork> value) {
        this.privateNetworks = value;
    }
    /**
     * Sets the public-ip property value. Instance public IPv4 address
     * @param value Value to set for the public-ip property.
     */
    public void setPublicIp(@jakarta.annotation.Nullable final String value) {
        this.publicIp = value;
    }
    /**
     * Sets the public-ip-assignment property value. The publicIpAssignment property
     * @param value Value to set for the public-ip-assignment property.
     */
    public void setPublicIpAssignment(@jakarta.annotation.Nullable final PublicIpAssignment value) {
        this.publicIpAssignment = value;
    }
    /**
     * Sets the security-groups property value. Instance Security Groups
     * @param value Value to set for the security-groups property.
     */
    public void setSecurityGroups(@jakarta.annotation.Nullable final java.util.List<SecurityGroup> value) {
        this.securityGroups = value;
    }
    /**
     * Sets the snapshots property value. Instance Snapshots
     * @param value Value to set for the snapshots property.
     */
    public void setSnapshots(@jakarta.annotation.Nullable final java.util.List<Snapshot> value) {
        this.snapshots = value;
    }
    /**
     * Sets the ssh-key property value. SSH key
     * @param value Value to set for the ssh-key property.
     */
    public void setSshKey(@jakarta.annotation.Nullable final SshKey value) {
        this.sshKey = value;
    }
    /**
     * Sets the ssh-keys property value. Instance SSH Keys
     * @param value Value to set for the ssh-keys property.
     */
    public void setSshKeys(@jakarta.annotation.Nullable final java.util.List<SshKey> value) {
        this.sshKeys = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final InstanceState value) {
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
     * Sets the user-data property value. Instance Cloud-init user-data (base64 encoded)
     * @param value Value to set for the user-data property.
     */
    public void setUserData(@jakarta.annotation.Nullable final String value) {
        this.userData = value;
    }
}
