package com.exoscale.dbaaspostgres.item.connectionpool;

import com.exoscale.models.EnumPgPoolMode;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectionPoolPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The databaseName property
     */
    private String databaseName;
    /**
     * The mode property
     */
    private EnumPgPoolMode mode;
    /**
     * The name property
     */
    private String name;
    /**
     * The size property
     */
    private Long size;
    /**
     * The username property
     */
    private String username;
    /**
     * Instantiates a new ConnectionPoolPostRequestBody and sets the default values.
     */
    public ConnectionPoolPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConnectionPoolPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ConnectionPoolPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectionPoolPostRequestBody();
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
     * Gets the database-name property value. The databaseName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("database-name", (n) -> { this.setDatabaseName(n.getStringValue()); });
        deserializerMap.put("mode", (n) -> { this.setMode(n.getEnumValue(EnumPgPoolMode::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mode property value. The mode property
     * @return a EnumPgPoolMode
     */
    @jakarta.annotation.Nullable
    public EnumPgPoolMode getMode() {
        return this.mode;
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the size property value. The size property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the username property value. The username property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("database-name", this.getDatabaseName());
        writer.writeEnumValue("mode", this.getMode());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("size", this.getSize());
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the database-name property value. The databaseName property
     * @param value Value to set for the database-name property.
     */
    public void setDatabaseName(@jakarta.annotation.Nullable final String value) {
        this.databaseName = value;
    }
    /**
     * Sets the mode property value. The mode property
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final EnumPgPoolMode value) {
        this.mode = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
