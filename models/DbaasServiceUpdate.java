package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Update waiting to be installed
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceUpdate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Deadline for installing the update
     */
    private OffsetDateTime deadline;
    /**
     * Description of the update
     */
    private String description;
    /**
     * The earliest time the update will be automatically applied
     */
    private OffsetDateTime startAfter;
    /**
     * The time when the update will be automatically applied
     */
    private OffsetDateTime startAt;
    /**
     * Instantiates a new DbaasServiceUpdate and sets the default values.
     */
    public DbaasServiceUpdate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceUpdate
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceUpdate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceUpdate();
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
     * Gets the deadline property value. Deadline for installing the update
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeadline() {
        return this.deadline;
    }
    /**
     * Gets the description property value. Description of the update
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("deadline", (n) -> { this.setDeadline(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("start-after", (n) -> { this.setStartAfter(n.getOffsetDateTimeValue()); });
        deserializerMap.put("start-at", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the start-after property value. The earliest time the update will be automatically applied
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartAfter() {
        return this.startAfter;
    }
    /**
     * Gets the start-at property value. The time when the update will be automatically applied
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartAt() {
        return this.startAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("deadline", this.getDeadline());
        writer.writeStringValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("start-after", this.getStartAfter());
        writer.writeOffsetDateTimeValue("start-at", this.getStartAt());
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
     * Sets the deadline property value. Deadline for installing the update
     * @param value Value to set for the deadline property.
     */
    public void setDeadline(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.deadline = value;
    }
    /**
     * Sets the description property value. Description of the update
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the start-after property value. The earliest time the update will be automatically applied
     * @param value Value to set for the start-after property.
     */
    public void setStartAfter(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAfter = value;
    }
    /**
     * Sets the start-at property value. The time when the update will be automatically applied
     * @param value Value to set for the start-at property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
}
