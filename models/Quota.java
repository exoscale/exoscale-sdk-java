package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Organization Quota
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Quota implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Resource Limit. -1 for Unlimited
     */
    private Long limit;
    /**
     * Resource Name
     */
    private String resource;
    /**
     * Resource Usage
     */
    private Long usage;
    /**
     * Instantiates a new Quota and sets the default values.
     */
    public Quota() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Quota
     */
    @jakarta.annotation.Nonnull
    public static Quota createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Quota();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getLongValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. Resource Limit. -1 for Unlimited
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getLimit() {
        return this.limit;
    }
    /**
     * Gets the resource property value. Resource Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResource() {
        return this.resource;
    }
    /**
     * Gets the usage property value. Resource Usage
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("limit", this.getLimit());
        writer.writeStringValue("resource", this.getResource());
        writer.writeLongValue("usage", this.getUsage());
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
     * Sets the limit property value. Resource Limit. -1 for Unlimited
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Long value) {
        this.limit = value;
    }
    /**
     * Sets the resource property value. Resource Name
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final String value) {
        this.resource = value;
    }
    /**
     * Sets the usage property value. Resource Usage
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final Long value) {
        this.usage = value;
    }
}
