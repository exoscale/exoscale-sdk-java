package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * DNS domain record
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DnsDomainRecord implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * DNS domain record content
     */
    private String content;
    /**
     * DNS domain record creation date
     */
    private OffsetDateTime createdAt;
    /**
     * DNS domain record ID
     */
    private UUID id;
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
     * DNS domain record type
     */
    private DnsDomainRecordType type;
    /**
     * DNS domain record update date
     */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new DnsDomainRecord and sets the default values.
     */
    public DnsDomainRecord() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DnsDomainRecord
     */
    @jakarta.annotation.Nonnull
    public static DnsDomainRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DnsDomainRecord();
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
     * Gets the created-at property value. DNS domain record creation date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getLongValue()); });
        deserializerMap.put("ttl", (n) -> { this.setTtl(n.getLongValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(DnsDomainRecordType::forValue)); });
        deserializerMap.put("updated-at", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. DNS domain record ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
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
     * Gets the type property value. DNS domain record type
     * @return a DnsDomainRecordType
     */
    @jakarta.annotation.Nullable
    public DnsDomainRecordType getType() {
        return this.type;
    }
    /**
     * Gets the updated-at property value. DNS domain record update date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
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
        writer.writeEnumValue("type", this.getType());
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
     * Sets the created-at property value. DNS domain record creation date
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. DNS domain record ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
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
    /**
     * Sets the type property value. DNS domain record type
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final DnsDomainRecordType value) {
        this.type = value;
    }
    /**
     * Sets the updated-at property value. DNS domain record update date
     * @param value Value to set for the updated-at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
