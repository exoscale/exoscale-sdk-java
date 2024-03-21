package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Service notifications
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceNotification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Notification level
     */
    private DbaasServiceNotificationLevel level;
    /**
     * Human notification message
     */
    private String message;
    /**
     * Notification type
     */
    private DbaasServiceNotificationMetadata metadata;
    /**
     * Notification type
     */
    private DbaasServiceNotificationType type;
    /**
     * Instantiates a new DbaasServiceNotification and sets the default values.
     */
    public DbaasServiceNotification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceNotification
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceNotification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceNotification();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("level", (n) -> { this.setLevel(n.getEnumValue(DbaasServiceNotificationLevel::forValue)); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(DbaasServiceNotificationMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(DbaasServiceNotificationType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the level property value. Notification level
     * @return a DbaasServiceNotificationLevel
     */
    @jakarta.annotation.Nullable
    public DbaasServiceNotificationLevel getLevel() {
        return this.level;
    }
    /**
     * Gets the message property value. Human notification message
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the metadata property value. Notification type
     * @return a DbaasServiceNotificationMetadata
     */
    @jakarta.annotation.Nullable
    public DbaasServiceNotificationMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the type property value. Notification type
     * @return a DbaasServiceNotificationType
     */
    @jakarta.annotation.Nullable
    public DbaasServiceNotificationType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("level", this.getLevel());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("metadata", this.getMetadata());
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
     * Sets the level property value. Notification level
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final DbaasServiceNotificationLevel value) {
        this.level = value;
    }
    /**
     * Sets the message property value. Human notification message
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the metadata property value. Notification type
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final DbaasServiceNotificationMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the type property value. Notification type
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final DbaasServiceNotificationType value) {
        this.type = value;
    }
}
