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
 * Elastic IP
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ElasticIp implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Elastic IP address family
     */
    private ElasticIpAddressfamily addressfamily;
    /**
     * Elastic IP cidr
     */
    private String cidr;
    /**
     * Elastic IP description
     */
    private String description;
    /**
     * Elastic IP address healthcheck
     */
    private ElasticIpHealthcheck healthcheck;
    /**
     * Elastic IP ID
     */
    private UUID id;
    /**
     * Elastic IP address
     */
    private String ip;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Instantiates a new ElasticIp and sets the default values.
     */
    public ElasticIp() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ElasticIp
     */
    @jakarta.annotation.Nonnull
    public static ElasticIp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ElasticIp();
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
     * Gets the addressfamily property value. Elastic IP address family
     * @return a ElasticIpAddressfamily
     */
    @jakarta.annotation.Nullable
    public ElasticIpAddressfamily getAddressfamily() {
        return this.addressfamily;
    }
    /**
     * Gets the cidr property value. Elastic IP cidr
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCidr() {
        return this.cidr;
    }
    /**
     * Gets the description property value. Elastic IP description
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
        deserializerMap.put("addressfamily", (n) -> { this.setAddressfamily(n.getEnumValue(ElasticIpAddressfamily::forValue)); });
        deserializerMap.put("cidr", (n) -> { this.setCidr(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("healthcheck", (n) -> { this.setHealthcheck(n.getObjectValue(ElasticIpHealthcheck::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("ip", (n) -> { this.setIp(n.getStringValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the healthcheck property value. Elastic IP address healthcheck
     * @return a ElasticIpHealthcheck
     */
    @jakarta.annotation.Nullable
    public ElasticIpHealthcheck getHealthcheck() {
        return this.healthcheck;
    }
    /**
     * Gets the id property value. Elastic IP ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the ip property value. Elastic IP address
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("healthcheck", this.getHealthcheck());
        writer.writeObjectValue("labels", this.getLabels());
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
     * Sets the addressfamily property value. Elastic IP address family
     * @param value Value to set for the addressfamily property.
     */
    public void setAddressfamily(@jakarta.annotation.Nullable final ElasticIpAddressfamily value) {
        this.addressfamily = value;
    }
    /**
     * Sets the cidr property value. Elastic IP cidr
     * @param value Value to set for the cidr property.
     */
    public void setCidr(@jakarta.annotation.Nullable final String value) {
        this.cidr = value;
    }
    /**
     * Sets the description property value. Elastic IP description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the healthcheck property value. Elastic IP address healthcheck
     * @param value Value to set for the healthcheck property.
     */
    public void setHealthcheck(@jakarta.annotation.Nullable final ElasticIpHealthcheck value) {
        this.healthcheck = value;
    }
    /**
     * Sets the id property value. Elastic IP ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the ip property value. Elastic IP address
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
}
