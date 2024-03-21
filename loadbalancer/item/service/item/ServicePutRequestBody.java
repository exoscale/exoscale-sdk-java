package com.exoscale.loadbalancer.item.service.item;

import com.exoscale.models.LoadBalancerServiceHealthcheck;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePutRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Load Balancer Service description
     */
    private String description;
    /**
     * Load Balancer Service healthcheck
     */
    private LoadBalancerServiceHealthcheck healthcheck;
    /**
     * Load Balancer Service name
     */
    private String name;
    /**
     * Port exposed on the Load Balancer's public IP
     */
    private Long port;
    /**
     * Network traffic protocol
     */
    private ServicePutRequestBodyProtocol protocol;
    /**
     * Load balancing strategy
     */
    private ServicePutRequestBodyStrategy strategy;
    /**
     * Port on which the network traffic will be forwarded to on the receiving instance
     */
    private Long targetPort;
    /**
     * Instantiates a new ServicePutRequestBody and sets the default values.
     */
    public ServicePutRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePutRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServicePutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePutRequestBody();
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
     * Gets the description property value. Load Balancer Service description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("healthcheck", (n) -> { this.setHealthcheck(n.getObjectValue(LoadBalancerServiceHealthcheck::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getLongValue()); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getEnumValue(ServicePutRequestBodyProtocol::forValue)); });
        deserializerMap.put("strategy", (n) -> { this.setStrategy(n.getEnumValue(ServicePutRequestBodyStrategy::forValue)); });
        deserializerMap.put("target-port", (n) -> { this.setTargetPort(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthcheck property value. Load Balancer Service healthcheck
     * @return a LoadBalancerServiceHealthcheck
     */
    @jakarta.annotation.Nullable
    public LoadBalancerServiceHealthcheck getHealthcheck() {
        return this.healthcheck;
    }
    /**
     * Gets the name property value. Load Balancer Service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the port property value. Port exposed on the Load Balancer's public IP
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPort() {
        return this.port;
    }
    /**
     * Gets the protocol property value. Network traffic protocol
     * @return a ServicePutRequestBodyProtocol
     */
    @jakarta.annotation.Nullable
    public ServicePutRequestBodyProtocol getProtocol() {
        return this.protocol;
    }
    /**
     * Gets the strategy property value. Load balancing strategy
     * @return a ServicePutRequestBodyStrategy
     */
    @jakarta.annotation.Nullable
    public ServicePutRequestBodyStrategy getStrategy() {
        return this.strategy;
    }
    /**
     * Gets the target-port property value. Port on which the network traffic will be forwarded to on the receiving instance
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTargetPort() {
        return this.targetPort;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("healthcheck", this.getHealthcheck());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("port", this.getPort());
        writer.writeEnumValue("protocol", this.getProtocol());
        writer.writeEnumValue("strategy", this.getStrategy());
        writer.writeLongValue("target-port", this.getTargetPort());
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
     * Sets the description property value. Load Balancer Service description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the healthcheck property value. Load Balancer Service healthcheck
     * @param value Value to set for the healthcheck property.
     */
    public void setHealthcheck(@jakarta.annotation.Nullable final LoadBalancerServiceHealthcheck value) {
        this.healthcheck = value;
    }
    /**
     * Sets the name property value. Load Balancer Service name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the port property value. Port exposed on the Load Balancer's public IP
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Long value) {
        this.port = value;
    }
    /**
     * Sets the protocol property value. Network traffic protocol
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final ServicePutRequestBodyProtocol value) {
        this.protocol = value;
    }
    /**
     * Sets the strategy property value. Load balancing strategy
     * @param value Value to set for the strategy property.
     */
    public void setStrategy(@jakarta.annotation.Nullable final ServicePutRequestBodyStrategy value) {
        this.strategy = value;
    }
    /**
     * Sets the target-port property value. Port on which the network traffic will be forwarded to on the receiving instance
     * @param value Value to set for the target-port property.
     */
    public void setTargetPort(@jakarta.annotation.Nullable final Long value) {
        this.targetPort = value;
    }
}
