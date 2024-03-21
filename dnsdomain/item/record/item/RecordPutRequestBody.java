package com.exoscale.dnsdomain.item.record.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecordPutRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * DNS domain record content
     */
    private String content;
    /**
     * DNS domain record name
     */
    private String name;
    /**
     * DNS domain record priority
     */
    private Long priority;
    /**
     * DNS domain record TTL
     */
    private Long ttl;
    /**
     * Instantiates a new RecordPutRequestBody and sets the default values.
     */
    public RecordPutRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecordPutRequestBody
     */
    @jakarta.annotation.Nonnull
    public static RecordPutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordPutRequestBody();
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
     * Gets the content property value. DNS domain record content
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getLongValue()); });
        deserializerMap.put("ttl", (n) -> { this.setTtl(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. DNS domain record name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the priority property value. DNS domain record priority
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPriority() {
        return this.priority;
    }
    /**
     * Gets the ttl property value. DNS domain record TTL
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTtl() {
        return this.ttl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("priority", this.getPriority());
        writer.writeLongValue("ttl", this.getTtl());
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
     * Sets the content property value. DNS domain record content
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the name property value. DNS domain record name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the priority property value. DNS domain record priority
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Long value) {
        this.priority = value;
    }
    /**
     * Sets the ttl property value. DNS domain record TTL
     * @param value Value to set for the ttl property.
     */
    public void setTtl(@jakarta.annotation.Nullable final Long value) {
        this.ttl = value;
    }
}
