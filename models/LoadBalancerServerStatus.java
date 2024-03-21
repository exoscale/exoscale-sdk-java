package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Load Balancer Service status
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LoadBalancerServerStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Backend server public IP
     */
    private String publicIp;
    /**
     * Status of the instance's healthcheck
     */
    private LoadBalancerServerStatusStatus status;
    /**
     * Instantiates a new LoadBalancerServerStatus and sets the default values.
     */
    public LoadBalancerServerStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LoadBalancerServerStatus
     */
    @jakarta.annotation.Nonnull
    public static LoadBalancerServerStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoadBalancerServerStatus();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("public-ip", (n) -> { this.setPublicIp(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LoadBalancerServerStatusStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the public-ip property value. Backend server public IP
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublicIp() {
        return this.publicIp;
    }
    /**
     * Gets the status property value. Status of the instance's healthcheck
     * @return a LoadBalancerServerStatusStatus
     */
    @jakarta.annotation.Nullable
    public LoadBalancerServerStatusStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("public-ip", this.getPublicIp());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the public-ip property value. Backend server public IP
     * @param value Value to set for the public-ip property.
     */
    public void setPublicIp(@jakarta.annotation.Nullable final String value) {
        this.publicIp = value;
    }
    /**
     * Sets the status property value. Status of the instance's healthcheck
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final LoadBalancerServerStatusStatus value) {
        this.status = value;
    }
}
