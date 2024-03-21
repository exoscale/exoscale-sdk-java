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
public class SecurityGroup implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Security Group description
     */
    private String description;
    /**
     * Security Group external sources
     */
    private java.util.List<String> externalSources;
    /**
     * Security Group ID
     */
    private UUID id;
    /**
     * Security Group name
     */
    private String name;
    /**
     * Security Group rules
     */
    private java.util.List<SecurityGroupRule> rules;
    /**
     * Instantiates a new SecurityGroup and sets the default values.
     */
    public SecurityGroup() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SecurityGroup
     */
    @jakarta.annotation.Nonnull
    public static SecurityGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityGroup();
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
     * Gets the description property value. Security Group description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the external-sources property value. Security Group external sources
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExternalSources() {
        return this.externalSources;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("external-sources", (n) -> { this.setExternalSources(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(SecurityGroupRule::createFromDiscriminatorValue)); });
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
     * Gets the rules property value. Security Group rules
     * @return a java.util.List<SecurityGroupRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityGroupRule> getRules() {
        return this.rules;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("external-sources", this.getExternalSources());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
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
     * Sets the description property value. Security Group description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the external-sources property value. Security Group external sources
     * @param value Value to set for the external-sources property.
     */
    public void setExternalSources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.externalSources = value;
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
     * Sets the rules property value. Security Group rules
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final java.util.List<SecurityGroupRule> value) {
        this.rules = value;
    }
}
