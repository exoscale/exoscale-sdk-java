package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasIntegrationType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description of the destination service types.
     */
    private String destDescription;
    /**
     * A list of the destination service types the integration supports.
     */
    private java.util.List<String> destServiceTypes;
    /**
     * A JSON schema of additional settings of the integration.
     */
    private DbaasIntegrationTypeSettings settings;
    /**
     * The description of the source service types.
     */
    private String sourceDescription;
    /**
     * A list of the source service types the integration supports.
     */
    private java.util.List<String> sourceServiceTypes;
    /**
     * The type of the integration.
     */
    private String type;
    /**
     * Instantiates a new DbaasIntegrationType and sets the default values.
     */
    public DbaasIntegrationType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasIntegrationType
     */
    @jakarta.annotation.Nonnull
    public static DbaasIntegrationType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasIntegrationType();
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
     * Gets the dest-description property value. The description of the destination service types.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestDescription() {
        return this.destDescription;
    }
    /**
     * Gets the dest-service-types property value. A list of the destination service types the integration supports.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDestServiceTypes() {
        return this.destServiceTypes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("dest-description", (n) -> { this.setDestDescription(n.getStringValue()); });
        deserializerMap.put("dest-service-types", (n) -> { this.setDestServiceTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(DbaasIntegrationTypeSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("source-description", (n) -> { this.setSourceDescription(n.getStringValue()); });
        deserializerMap.put("source-service-types", (n) -> { this.setSourceServiceTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. A JSON schema of additional settings of the integration.
     * @return a DbaasIntegrationTypeSettings
     */
    @jakarta.annotation.Nullable
    public DbaasIntegrationTypeSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the source-description property value. The description of the source service types.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceDescription() {
        return this.sourceDescription;
    }
    /**
     * Gets the source-service-types property value. A list of the source service types the integration supports.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSourceServiceTypes() {
        return this.sourceServiceTypes;
    }
    /**
     * Gets the type property value. The type of the integration.
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
        writer.writeStringValue("dest-description", this.getDestDescription());
        writer.writeCollectionOfPrimitiveValues("dest-service-types", this.getDestServiceTypes());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeStringValue("source-description", this.getSourceDescription());
        writer.writeCollectionOfPrimitiveValues("source-service-types", this.getSourceServiceTypes());
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
     * Sets the dest-description property value. The description of the destination service types.
     * @param value Value to set for the dest-description property.
     */
    public void setDestDescription(@jakarta.annotation.Nullable final String value) {
        this.destDescription = value;
    }
    /**
     * Sets the dest-service-types property value. A list of the destination service types the integration supports.
     * @param value Value to set for the dest-service-types property.
     */
    public void setDestServiceTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.destServiceTypes = value;
    }
    /**
     * Sets the settings property value. A JSON schema of additional settings of the integration.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final DbaasIntegrationTypeSettings value) {
        this.settings = value;
    }
    /**
     * Sets the source-description property value. The description of the source service types.
     * @param value Value to set for the source-description property.
     */
    public void setSourceDescription(@jakarta.annotation.Nullable final String value) {
        this.sourceDescription = value;
    }
    /**
     * Sets the source-service-types property value. A list of the source service types the integration supports.
     * @param value Value to set for the source-service-types property.
     */
    public void setSourceServiceTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.sourceServiceTypes = value;
    }
    /**
     * Sets the type property value. The type of the integration.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
