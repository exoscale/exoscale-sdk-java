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
 * IAM API Key
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IamApiKey implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * IAM API Key
     */
    private String key;
    /**
     * IAM API Key name
     */
    private String name;
    /**
     * IAM API Key Role ID
     */
    private UUID roleId;
    /**
     * Instantiates a new IamApiKey and sets the default values.
     */
    public IamApiKey() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IamApiKey
     */
    @jakarta.annotation.Nonnull
    public static IamApiKey createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IamApiKey();
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
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("role-id", (n) -> { this.setRoleId(n.getUUIDValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. IAM API Key
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the name property value. IAM API Key name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the role-id property value. IAM API Key Role ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getRoleId() {
        return this.roleId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("key", this.getKey());
        writer.writeStringValue("name", this.getName());
        writer.writeUUIDValue("role-id", this.getRoleId());
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
     * Sets the key property value. IAM API Key
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the name property value. IAM API Key name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the role-id property value. IAM API Key Role ID
     * @param value Value to set for the role-id property.
     */
    public void setRoleId(@jakarta.annotation.Nullable final UUID value) {
        this.roleId = value;
    }
}
