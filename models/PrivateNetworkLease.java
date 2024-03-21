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
 * Private Network leased IP address
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivateNetworkLease implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Attached instance ID
     */
    private UUID instanceId;
    /**
     * Private Network IP address
     */
    private String ip;
    /**
     * Instantiates a new PrivateNetworkLease and sets the default values.
     */
    public PrivateNetworkLease() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivateNetworkLease
     */
    @jakarta.annotation.Nonnull
    public static PrivateNetworkLease createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivateNetworkLease();
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
        deserializerMap.put("instance-id", (n) -> { this.setInstanceId(n.getUUIDValue()); });
        deserializerMap.put("ip", (n) -> { this.setIp(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instance-id property value. Attached instance ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getInstanceId() {
        return this.instanceId;
    }
    /**
     * Gets the ip property value. Private Network IP address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIp() {
        return this.ip;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
     * Sets the instance-id property value. Attached instance ID
     * @param value Value to set for the instance-id property.
     */
    public void setInstanceId(@jakarta.annotation.Nullable final UUID value) {
        this.instanceId = value;
    }
    /**
     * Sets the ip property value. Private Network IP address
     * @param value Value to set for the ip property.
     */
    public void setIp(@jakarta.annotation.Nullable final String value) {
        this.ip = value;
    }
}
