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
 * Load Balancer
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LoadBalancer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Load Balancer creation date
     */
    private OffsetDateTime createdAt;
    /**
     * Load Balancer description
     */
    private String description;
    /**
     * Load Balancer ID
     */
    private UUID id;
    /**
     * Load Balancer public IP
     */
    private String ip;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Load Balancer name
     */
    private String name;
    /**
     * Load Balancer Services
     */
    private java.util.List<LoadBalancerService> services;
    /**
     * Load Balancer state
     */
    private LoadBalancerState state;
    /**
     * Instantiates a new LoadBalancer and sets the default values.
     */
    public LoadBalancer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LoadBalancer
     */
    @jakarta.annotation.Nonnull
    public static LoadBalancer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoadBalancer();
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
     * Gets the created-at property value. Load Balancer creation date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the description property value. Load Balancer description
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("ip", (n) -> { this.setIp(n.getStringValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getCollectionOfObjectValues(LoadBalancerService::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(LoadBalancerState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Load Balancer ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the ip property value. Load Balancer public IP
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIp() {
        return this.ip;
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
     * Gets the name property value. Load Balancer name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the services property value. Load Balancer Services
     * @return a java.util.List<LoadBalancerService>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LoadBalancerService> getServices() {
        return this.services;
    }
    /**
     * Gets the state property value. Load Balancer state
     * @return a LoadBalancerState
     */
    @jakarta.annotation.Nullable
    public LoadBalancerState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("services", this.getServices());
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
     * Sets the created-at property value. Load Balancer creation date
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the description property value. Load Balancer description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the id property value. Load Balancer ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the ip property value. Load Balancer public IP
     * @param value Value to set for the ip property.
     */
    public void setIp(@jakarta.annotation.Nullable final String value) {
        this.ip = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. Load Balancer name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the services property value. Load Balancer Services
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final java.util.List<LoadBalancerService> value) {
        this.services = value;
    }
    /**
     * Sets the state property value. Load Balancer state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final LoadBalancerState value) {
        this.state = value;
    }
}
