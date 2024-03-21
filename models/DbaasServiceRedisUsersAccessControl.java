package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceRedisUsersAccessControl implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The categories property
     */
    private java.util.List<String> categories;
    /**
     * The channels property
     */
    private java.util.List<String> channels;
    /**
     * The commands property
     */
    private java.util.List<String> commands;
    /**
     * The keys property
     */
    private java.util.List<String> keys;
    /**
     * Instantiates a new DbaasServiceRedisUsersAccessControl and sets the default values.
     */
    public DbaasServiceRedisUsersAccessControl() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceRedisUsersAccessControl
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceRedisUsersAccessControl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceRedisUsersAccessControl();
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
     * Gets the categories property value. The categories property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.categories;
    }
    /**
     * Gets the channels property value. The channels property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChannels() {
        return this.channels;
    }
    /**
     * Gets the commands property value. The commands property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCommands() {
        return this.commands;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("channels", (n) -> { this.setChannels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("commands", (n) -> { this.setCommands(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("keys", (n) -> { this.setKeys(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the keys property value. The keys property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKeys() {
        return this.keys;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfPrimitiveValues("channels", this.getChannels());
        writer.writeCollectionOfPrimitiveValues("commands", this.getCommands());
        writer.writeCollectionOfPrimitiveValues("keys", this.getKeys());
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
     * Sets the categories property value. The categories property
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.categories = value;
    }
    /**
     * Sets the channels property value. The channels property
     * @param value Value to set for the channels property.
     */
    public void setChannels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.channels = value;
    }
    /**
     * Sets the commands property value. The commands property
     * @param value Value to set for the commands property.
     */
    public void setCommands(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.commands = value;
    }
    /**
     * Sets the keys property value. The keys property
     * @param value Value to set for the keys property.
     */
    public void setKeys(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.keys = value;
    }
}
