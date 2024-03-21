package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Related resource reference
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperationReference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Command name
     */
    private String command;
    /**
     * Reference ID
     */
    private UUID id;
    /**
     * Link to the referenced resource
     */
    private String link;
    /**
     * Instantiates a new OperationReference and sets the default values.
     */
    public OperationReference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OperationReference
     */
    @jakarta.annotation.Nonnull
    public static OperationReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OperationReference();
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
     * Gets the command property value. Command name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCommand() {
        return this.command;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("command", (n) -> { this.setCommand(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("link", (n) -> { this.setLink(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Reference ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the link property value. Link to the referenced resource
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLink() {
        return this.link;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("command", this.getCommand());
        writer.writeUUIDValue("id", this.getId());
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
     * Sets the command property value. Command name
     * @param value Value to set for the command property.
     */
    public void setCommand(@jakarta.annotation.Nullable final String value) {
        this.command = value;
    }
    /**
     * Sets the id property value. Reference ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the link property value. Link to the referenced resource
     * @param value Value to set for the link property.
     */
    public void setLink(@jakarta.annotation.Nullable final String value) {
        this.link = value;
    }
}
