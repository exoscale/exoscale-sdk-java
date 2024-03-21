package com.exoscale.instance;

import com.exoscale.models.InstanceState;
import com.exoscale.models.InstanceType;
import com.exoscale.models.Labels;
import com.exoscale.models.Manager;
import com.exoscale.models.PrivateNetwork;
import com.exoscale.models.PublicIpAssignment;
import com.exoscale.models.SecurityGroup;
import com.exoscale.models.SshKey;
import com.exoscale.models.Template;
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
public class InstanceGetResponseInstances implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instance creation date
     */
    private OffsetDateTime createdAt;
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
     * Instantiates a new InstanceGetResponseInstances and sets the default values.
     */
    public InstanceGetResponseInstances() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstanceGetResponseInstances
     */
    @jakarta.annotation.Nonnull
    public static InstanceGetResponseInstances createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstanceGetResponseInstances();
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
     * Gets the created-at property value. Instance creation date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
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
        deserializerMap.put("ssh-key", (n) -> { this.setSshKey(n.getObjectValue(SshKey::createFromDiscriminatorValue)); });
        deserializerMap.put("ssh-keys", (n) -> { this.setSshKeys(n.getCollectionOfObjectValues(SshKey::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(InstanceState::forValue)); });
        deserializerMap.put("template", (n) -> { this.setTemplate(n.getObjectValue(Template::createFromDiscriminatorValue)); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("created-at", this.getCreatedAt());
        writer.writeUUIDValue("id", this.getId());
        writer.writeObjectValue("instance-type", this.getInstanceType());
        writer.writeStringValue("ipv6-address", this.getIpv6Address());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeObjectValue("manager", this.getManager());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("private-networks", this.getPrivateNetworks());
        writer.writeStringValue("public-ip", this.getPublicIp());
        writer.writeEnumValue("public-ip-assignment", this.getPublicIpAssignment());
        writer.writeCollectionOfObjectValues("security-groups", this.getSecurityGroups());
        writer.writeObjectValue("ssh-key", this.getSshKey());
        writer.writeCollectionOfObjectValues("ssh-keys", this.getSshKeys());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the created-at property value. Instance creation date
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
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
}
