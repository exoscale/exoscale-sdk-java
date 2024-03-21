package com.exoscale.privatenetwork.withidattach;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithIdAttachPutRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Compute instance
     */
    private WithIdAttachPutRequestBodyInstance instance;
    /**
     * Static IP address lease for the corresponding network interface
     */
    private String ip;
    /**
     * Instantiates a new WithIdAttachPutRequestBody and sets the default values.
     */
    public WithIdAttachPutRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithIdAttachPutRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithIdAttachPutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithIdAttachPutRequestBody();
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
        deserializerMap.put("instance", (n) -> { this.setInstance(n.getObjectValue(WithIdAttachPutRequestBodyInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("ip", (n) -> { this.setIp(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instance property value. Compute instance
     * @return a WithIdAttachPutRequestBodyInstance
     */
    @jakarta.annotation.Nullable
    public WithIdAttachPutRequestBodyInstance getInstance() {
        return this.instance;
    }
    /**
     * Gets the ip property value. Static IP address lease for the corresponding network interface
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
        writer.writeObjectValue("instance", this.getInstance());
        writer.writeStringValue("ip", this.getIp());
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
     * Sets the instance property value. Compute instance
     * @param value Value to set for the instance property.
     */
    public void setInstance(@jakarta.annotation.Nullable final WithIdAttachPutRequestBodyInstance value) {
        this.instance = value;
    }
    /**
     * Sets the ip property value. Static IP address lease for the corresponding network interface
     * @param value Value to set for the ip property.
     */
    public void setIp(@jakarta.annotation.Nullable final String value) {
        this.ip = value;
    }
}
