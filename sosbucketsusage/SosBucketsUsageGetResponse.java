package com.exoscale.sosbucketsusage;

import com.exoscale.models.SosBucketUsage;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SosBucketsUsageGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The sosBucketsUsage property
     */
    private java.util.List<SosBucketUsage> sosBucketsUsage;
    /**
     * Instantiates a new SosBucketsUsageGetResponse and sets the default values.
     */
    public SosBucketsUsageGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SosBucketsUsageGetResponse
     */
    @jakarta.annotation.Nonnull
    public static SosBucketsUsageGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SosBucketsUsageGetResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("sos-buckets-usage", (n) -> { this.setSosBucketsUsage(n.getCollectionOfObjectValues(SosBucketUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sos-buckets-usage property value. The sosBucketsUsage property
     * @return a java.util.List<SosBucketUsage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SosBucketUsage> getSosBucketsUsage() {
        return this.sosBucketsUsage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("sos-buckets-usage", this.getSosBucketsUsage());
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
     * Sets the sos-buckets-usage property value. The sosBucketsUsage property
     * @param value Value to set for the sos-buckets-usage property.
     */
    public void setSosBucketsUsage(@jakarta.annotation.Nullable final java.util.List<SosBucketUsage> value) {
        this.sosBucketsUsage = value;
    }
}
