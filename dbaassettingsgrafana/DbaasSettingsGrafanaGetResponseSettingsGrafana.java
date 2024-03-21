package com.exoscale.dbaassettingsgrafana;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Grafana configuration values
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasSettingsGrafanaGetResponseSettingsGrafana implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The additionalProperties property
     */
    private Boolean additionalProperties;
    /**
     * The properties property
     */
    private DbaasSettingsGrafanaGetResponseSettingsGrafanaProperties properties;
    /**
     * The title property
     */
    private String title;
    /**
     * The type property
     */
    private String type;
    /**
     * Instantiates a new DbaasSettingsGrafanaGetResponseSettingsGrafana and sets the default values.
     */
    public DbaasSettingsGrafanaGetResponseSettingsGrafana() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasSettingsGrafanaGetResponseSettingsGrafana
     */
    @jakarta.annotation.Nonnull
    public static DbaasSettingsGrafanaGetResponseSettingsGrafana createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasSettingsGrafanaGetResponseSettingsGrafana();
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
     * Gets the additionalProperties property value. The additionalProperties property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAdditionalProperties() {
        return this.additionalProperties;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("additionalProperties", (n) -> { this.setAdditionalProperties(n.getBooleanValue()); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getObjectValue(DbaasSettingsGrafanaGetResponseSettingsGrafanaProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the properties property value. The properties property
     * @return a DbaasSettingsGrafanaGetResponseSettingsGrafanaProperties
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsGrafanaGetResponseSettingsGrafanaProperties getProperties() {
        return this.properties;
    }
    /**
     * Gets the title property value. The title property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the type property value. The type property
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
        writer.writeBooleanValue("additionalProperties", this.getAdditionalProperties());
        writer.writeObjectValue("properties", this.getProperties());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the additionalProperties property value. The additionalProperties property
     * @param value Value to set for the additionalProperties property.
     */
    public void setAdditionalProperties(@jakarta.annotation.Nullable final Boolean value) {
        this.additionalProperties = value;
    }
    /**
     * Sets the properties property value. The properties property
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final DbaasSettingsGrafanaGetResponseSettingsGrafanaProperties value) {
        this.properties = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
