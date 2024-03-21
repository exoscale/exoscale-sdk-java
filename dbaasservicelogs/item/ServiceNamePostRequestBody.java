package com.exoscale.dbaasservicelogs.item;

import com.exoscale.models.EnumSortOrder;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceNamePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * How many log entries to receive at most, up to 500 (default: 100)
     */
    private Long limit;
    /**
     * Opaque offset identifier
     */
    private String offset;
    /**
     * The sortOrder property
     */
    private EnumSortOrder sortOrder;
    /**
     * Instantiates a new ServiceNamePostRequestBody and sets the default values.
     */
    public ServiceNamePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceNamePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ServiceNamePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceNamePostRequestBody();
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
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getStringValue()); });
        deserializerMap.put("sort-order", (n) -> { this.setSortOrder(n.getEnumValue(EnumSortOrder::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. How many log entries to receive at most, up to 500 (default: 100)
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getLimit() {
        return this.limit;
    }
    /**
     * Gets the offset property value. Opaque offset identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOffset() {
        return this.offset;
    }
    /**
     * Gets the sort-order property value. The sortOrder property
     * @return a EnumSortOrder
     */
    @jakarta.annotation.Nullable
    public EnumSortOrder getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("limit", this.getLimit());
        writer.writeStringValue("offset", this.getOffset());
        writer.writeEnumValue("sort-order", this.getSortOrder());
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
     * Sets the limit property value. How many log entries to receive at most, up to 500 (default: 100)
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Long value) {
        this.limit = value;
    }
    /**
     * Sets the offset property value. Opaque offset identifier
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final String value) {
        this.offset = value;
    }
    /**
     * Sets the sort-order property value. The sortOrder property
     * @param value Value to set for the sort-order property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final EnumSortOrder value) {
        this.sortOrder = value;
    }
}
