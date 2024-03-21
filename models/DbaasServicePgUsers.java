package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * List of service users
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServicePgUsers implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The allowReplication property
     */
    private Boolean allowReplication;
    /**
     * Account password. A missing field indicates a user overridden password.
     */
    private String password;
    /**
     * Account type
     */
    private String type;
    /**
     * Account username
     */
    private String username;
    /**
     * Instantiates a new DbaasServicePgUsers and sets the default values.
     */
    public DbaasServicePgUsers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServicePgUsers
     */
    @jakarta.annotation.Nonnull
    public static DbaasServicePgUsers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServicePgUsers();
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
     * Gets the allow-replication property value. The allowReplication property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowReplication() {
        return this.allowReplication;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allow-replication", (n) -> { this.setAllowReplication(n.getBooleanValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the password property value. Account password. A missing field indicates a user overridden password.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the type property value. Account type
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the username property value. Account username
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
        writer.writeBooleanValue("allow-replication", this.getAllowReplication());
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("type", this.getType());
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
     * Sets the allow-replication property value. The allowReplication property
     * @param value Value to set for the allow-replication property.
     */
    public void setAllowReplication(@jakarta.annotation.Nullable final Boolean value) {
        this.allowReplication = value;
    }
    /**
     * Sets the password property value. Account password. A missing field indicates a user overridden password.
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the type property value. Account type
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the username property value. Account username
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
