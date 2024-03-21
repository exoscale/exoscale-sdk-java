package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasIntegration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Description of the integration
     */
    private String description;
    /**
     * Destination service name
     */
    private String dest;
    /**
     * Integration id
     */
    private UUID id;
    /**
     * Whether the integration is active or not
     */
    private Boolean isActive;
    /**
     * Whether the integration is enabled or not
     */
    private Boolean isEnabled;
    /**
     * Integration settings
     */
    private DbaasIntegrationSettings settings;
    /**
     * Source service name
     */
    private String source;
    /**
     * Integration status
     */
    private String status;
    /**
     * Integration type
     */
    private String type;
    /**
     * Instantiates a new DbaasIntegration and sets the default values.
     */
    public DbaasIntegration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasIntegration
     */
    @jakarta.annotation.Nonnull
    public static DbaasIntegration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasIntegration();
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
     * Gets the description property value. Description of the integration
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the dest property value. Destination service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDest() {
        return this.dest;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("dest", (n) -> { this.setDest(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("is-active", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("is-enabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(DbaasIntegrationSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Integration id
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the is-active property value. Whether the integration is active or not
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }
    /**
     * Gets the is-enabled property value. Whether the integration is enabled or not
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the settings property value. Integration settings
     * @return a DbaasIntegrationSettings
     */
    @jakarta.annotation.Nullable
    public DbaasIntegrationSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the source property value. Source service name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.source;
    }
    /**
     * Gets the status property value. Integration status
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the type property value. Integration type
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("dest", this.getDest());
        writer.writeUUIDValue("id", this.getId());
        writer.writeBooleanValue("is-active", this.getIsActive());
        writer.writeBooleanValue("is-enabled", this.getIsEnabled());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeStringValue("source", this.getSource());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("type", this.getType());
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
     * Sets the description property value. Description of the integration
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the dest property value. Destination service name
     * @param value Value to set for the dest property.
     */
    public void setDest(@jakarta.annotation.Nullable final String value) {
        this.dest = value;
    }
    /**
     * Sets the id property value. Integration id
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the is-active property value. Whether the integration is active or not
     * @param value Value to set for the is-active property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.isActive = value;
    }
    /**
     * Sets the is-enabled property value. Whether the integration is enabled or not
     * @param value Value to set for the is-enabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the settings property value. Integration settings
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final DbaasIntegrationSettings value) {
        this.settings = value;
    }
    /**
     * Sets the source property value. Source service name
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.source = value;
    }
    /**
     * Sets the status property value. Integration status
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the type property value. Integration type
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
