package com.exoscale.dbaassettingsgrafana;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasSettingsGrafanaGetResponseSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Grafana configuration values
     */
    private DbaasSettingsGrafanaGetResponseSettingsGrafana grafana;
    /**
     * Instantiates a new DbaasSettingsGrafanaGetResponseSettings and sets the default values.
     */
    public DbaasSettingsGrafanaGetResponseSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasSettingsGrafanaGetResponseSettings
     */
    @jakarta.annotation.Nonnull
    public static DbaasSettingsGrafanaGetResponseSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasSettingsGrafanaGetResponseSettings();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("grafana", (n) -> { this.setGrafana(n.getObjectValue(DbaasSettingsGrafanaGetResponseSettingsGrafana::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the grafana property value. Grafana configuration values
     * @return a DbaasSettingsGrafanaGetResponseSettingsGrafana
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsGrafanaGetResponseSettingsGrafana getGrafana() {
        return this.grafana;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("grafana", this.getGrafana());
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
     * Sets the grafana property value. Grafana configuration values
     * @param value Value to set for the grafana property.
     */
    public void setGrafana(@jakarta.annotation.Nullable final DbaasSettingsGrafanaGetResponseSettingsGrafana value) {
        this.grafana = value;
    }
}
