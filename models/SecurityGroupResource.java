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
 * Security Group
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityGroupResource implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Security Group ID
     */
    private UUID id;
    /**
     * Security Group name
     */
    private String name;
    /**
     * Whether this points to a public security group. This is only valid when in the context of                   a rule addition which uses a public security group as a source or destination.
     */
    private SecurityGroupResourceVisibility visibility;
    /**
     * Instantiates a new SecurityGroupResource and sets the default values.
     */
    public SecurityGroupResource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecurityGroupResource
     */
    @jakarta.annotation.Nonnull
    public static SecurityGroupResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityGroupResource();
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
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getEnumValue(SecurityGroupResourceVisibility::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Security Group ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the name property value. Security Group name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the visibility property value. Whether this points to a public security group. This is only valid when in the context of                   a rule addition which uses a public security group as a source or destination.
     * @return a SecurityGroupResourceVisibility
     */
    @jakarta.annotation.Nullable
    public SecurityGroupResourceVisibility getVisibility() {
        return this.visibility;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("visibility", this.getVisibility());
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
     * Sets the id property value. Security Group ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the name property value. Security Group name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the visibility property value. Whether this points to a public security group. This is only valid when in the context of                   a rule addition which uses a public security group as a source or destination.
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final SecurityGroupResourceVisibility value) {
        this.visibility = value;
    }
}
