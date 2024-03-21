package com.exoscale.securitygroup.item.rules;

import com.exoscale.models.SecurityGroupResource;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RulesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Security Group rule description
     */
    private String description;
    /**
     * End port of the range
     */
    private Long endPort;
    /**
     * Network flow direction to match
     */
    private RulesPostRequestBodyFlowDirection flowDirection;
    /**
     * ICMP details (default: -1 (ANY))
     */
    private RulesPostRequestBodyIcmp icmp;
    /**
     * CIDR-formatted network allowed
     */
    private String network;
    /**
     * Network protocol
     */
    private RulesPostRequestBodyProtocol protocol;
    /**
     * Security Group
     */
    private SecurityGroupResource securityGroup;
    /**
     * Start port of the range
     */
    private Long startPort;
    /**
     * Instantiates a new RulesPostRequestBody and sets the default values.
     */
    public RulesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RulesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static RulesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RulesPostRequestBody();
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
     * Gets the description property value. Security Group rule description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the end-port property value. End port of the range
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getEndPort() {
        return this.endPort;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("end-port", (n) -> { this.setEndPort(n.getLongValue()); });
        deserializerMap.put("flow-direction", (n) -> { this.setFlowDirection(n.getEnumValue(RulesPostRequestBodyFlowDirection::forValue)); });
        deserializerMap.put("icmp", (n) -> { this.setIcmp(n.getObjectValue(RulesPostRequestBodyIcmp::createFromDiscriminatorValue)); });
        deserializerMap.put("network", (n) -> { this.setNetwork(n.getStringValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(RulesPostRequestBodyProtocol::forValue)); });
        deserializerMap.put("security-group", (n) -> { this.setSecurityGroup(n.getObjectValue(SecurityGroupResource::createFromDiscriminatorValue)); });
        deserializerMap.put("start-port", (n) -> { this.setStartPort(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flow-direction property value. Network flow direction to match
     * @return a RulesPostRequestBodyFlowDirection
     */
    @jakarta.annotation.Nullable
    public RulesPostRequestBodyFlowDirection getFlowDirection() {
        return this.flowDirection;
    }
    /**
     * Gets the icmp property value. ICMP details (default: -1 (ANY))
     * @return a RulesPostRequestBodyIcmp
     */
    @jakarta.annotation.Nullable
    public RulesPostRequestBodyIcmp getIcmp() {
        return this.icmp;
    }
    /**
     * Gets the network property value. CIDR-formatted network allowed
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetwork() {
        return this.network;
    }
    /**
     * Gets the protocol property value. Network protocol
     * @return a RulesPostRequestBodyProtocol
     */
    @jakarta.annotation.Nullable
    public RulesPostRequestBodyProtocol getProtocol() {
        return this.protocol;
    }
    /**
     * Gets the security-group property value. Security Group
     * @return a SecurityGroupResource
     */
    @jakarta.annotation.Nullable
    public SecurityGroupResource getSecurityGroup() {
        return this.securityGroup;
    }
    /**
     * Gets the start-port property value. Start port of the range
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getStartPort() {
        return this.startPort;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeLongValue("end-port", this.getEndPort());
        writer.writeEnumValue("flow-direction", this.getFlowDirection());
        writer.writeObjectValue("icmp", this.getIcmp());
        writer.writeStringValue("network", this.getNetwork());
        writer.writeEnumValue("protocol", this.getProtocol());
        writer.writeObjectValue("security-group", this.getSecurityGroup());
        writer.writeLongValue("start-port", this.getStartPort());
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
     * Sets the description property value. Security Group rule description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the end-port property value. End port of the range
     * @param value Value to set for the end-port property.
     */
    public void setEndPort(@jakarta.annotation.Nullable final Long value) {
        this.endPort = value;
    }
    /**
     * Sets the flow-direction property value. Network flow direction to match
     * @param value Value to set for the flow-direction property.
     */
    public void setFlowDirection(@jakarta.annotation.Nullable final RulesPostRequestBodyFlowDirection value) {
        this.flowDirection = value;
    }
    /**
     * Sets the icmp property value. ICMP details (default: -1 (ANY))
     * @param value Value to set for the icmp property.
     */
    public void setIcmp(@jakarta.annotation.Nullable final RulesPostRequestBodyIcmp value) {
        this.icmp = value;
    }
    /**
     * Sets the network property value. CIDR-formatted network allowed
     * @param value Value to set for the network property.
     */
    public void setNetwork(@jakarta.annotation.Nullable final String value) {
        this.network = value;
    }
    /**
     * Sets the protocol property value. Network protocol
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final RulesPostRequestBodyProtocol value) {
        this.protocol = value;
    }
    /**
     * Sets the security-group property value. Security Group
     * @param value Value to set for the security-group property.
     */
    public void setSecurityGroup(@jakarta.annotation.Nullable final SecurityGroupResource value) {
        this.securityGroup = value;
    }
    /**
     * Sets the start-port property value. Start port of the range
     * @param value Value to set for the start-port property.
     */
    public void setStartPort(@jakarta.annotation.Nullable final Long value) {
        this.startPort = value;
    }
}
