package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Kubelet image GC options
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KubeletImageGc implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The highThreshold property
     */
    private Long highThreshold;
    /**
     * The lowThreshold property
     */
    private Long lowThreshold;
    /**
     * The minAge property
     */
    private String minAge;
    /**
     * Instantiates a new KubeletImageGc and sets the default values.
     */
    public KubeletImageGc() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KubeletImageGc
     */
    @jakarta.annotation.Nonnull
    public static KubeletImageGc createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KubeletImageGc();
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
        deserializerMap.put("high-threshold", (n) -> { this.setHighThreshold(n.getLongValue()); });
        deserializerMap.put("low-threshold", (n) -> { this.setLowThreshold(n.getLongValue()); });
        deserializerMap.put("min-age", (n) -> { this.setMinAge(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the high-threshold property value. The highThreshold property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getHighThreshold() {
        return this.highThreshold;
    }
    /**
     * Gets the low-threshold property value. The lowThreshold property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getLowThreshold() {
        return this.lowThreshold;
    }
    /**
     * Gets the min-age property value. The minAge property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinAge() {
        return this.minAge;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("high-threshold", this.getHighThreshold());
        writer.writeLongValue("low-threshold", this.getLowThreshold());
        writer.writeStringValue("min-age", this.getMinAge());
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
     * Sets the high-threshold property value. The highThreshold property
     * @param value Value to set for the high-threshold property.
     */
    public void setHighThreshold(@jakarta.annotation.Nullable final Long value) {
        this.highThreshold = value;
    }
    /**
     * Sets the low-threshold property value. The lowThreshold property
     * @param value Value to set for the low-threshold property.
     */
    public void setLowThreshold(@jakarta.annotation.Nullable final Long value) {
        this.lowThreshold = value;
    }
    /**
     * Sets the min-age property value. The minAge property
     * @param value Value to set for the min-age property.
     */
    public void setMinAge(@jakarta.annotation.Nullable final String value) {
        this.minAge = value;
    }
}
