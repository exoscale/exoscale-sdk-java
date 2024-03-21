package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Access key operation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessKeyOperation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the operation
     */
    private String operation;
    /**
     * Tags associated with the operation
     */
    private java.util.List<String> tags;
    /**
     * Instantiates a new AccessKeyOperation and sets the default values.
     */
    public AccessKeyOperation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessKeyOperation
     */
    @jakarta.annotation.Nonnull
    public static AccessKeyOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessKeyOperation();
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
        deserializerMap.put("operation", (n) -> { this.setOperation(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the operation property value. Name of the operation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOperation() {
        return this.operation;
    }
    /**
     * Gets the tags property value. Tags associated with the operation
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("operation", this.getOperation());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
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
     * Sets the operation property value. Name of the operation
     * @param value Value to set for the operation property.
     */
    public void setOperation(@jakarta.annotation.Nullable final String value) {
        this.operation = value;
    }
    /**
     * Sets the tags property value. Tags associated with the operation
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
}
