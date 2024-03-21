package com.exoscale.dbaasmysql.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasMysqlPostRequestBodyIntegrations implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The destService property
     */
    private String destService;
    /**
     * Integration settings
     */
    private DbaasMysqlPostRequestBodyIntegrationsSettings settings;
    /**
     * The sourceService property
     */
    private String sourceService;
    /**
     * Integration type
     */
    private DbaasMysqlPostRequestBodyIntegrationsType type;
    /**
     * Instantiates a new DbaasMysqlPostRequestBodyIntegrations and sets the default values.
     */
    public DbaasMysqlPostRequestBodyIntegrations() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasMysqlPostRequestBodyIntegrations
     */
    @jakarta.annotation.Nonnull
    public static DbaasMysqlPostRequestBodyIntegrations createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasMysqlPostRequestBodyIntegrations();
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
     * Gets the dest-service property value. The destService property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestService() {
        return this.destService;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("dest-service", (n) -> { this.setDestService(n.getStringValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(DbaasMysqlPostRequestBodyIntegrationsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("source-service", (n) -> { this.setSourceService(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(DbaasMysqlPostRequestBodyIntegrationsType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. Integration settings
     * @return a DbaasMysqlPostRequestBodyIntegrationsSettings
     */
    @jakarta.annotation.Nullable
    public DbaasMysqlPostRequestBodyIntegrationsSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the source-service property value. The sourceService property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceService() {
        return this.sourceService;
    }
    /**
     * Gets the type property value. Integration type
     * @return a DbaasMysqlPostRequestBodyIntegrationsType
     */
    @jakarta.annotation.Nullable
    public DbaasMysqlPostRequestBodyIntegrationsType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dest-service", this.getDestService());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeStringValue("source-service", this.getSourceService());
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
     * Sets the dest-service property value. The destService property
     * @param value Value to set for the dest-service property.
     */
    public void setDestService(@jakarta.annotation.Nullable final String value) {
        this.destService = value;
    }
    /**
     * Sets the settings property value. Integration settings
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final DbaasMysqlPostRequestBodyIntegrationsSettings value) {
        this.settings = value;
    }
    /**
     * Sets the source-service property value. The sourceService property
     * @param value Value to set for the source-service property.
     */
    public void setSourceService(@jakarta.annotation.Nullable final String value) {
        this.sourceService = value;
    }
    /**
     * Sets the type property value. Integration type
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final DbaasMysqlPostRequestBodyIntegrationsType value) {
        this.type = value;
    }
}
