package com.exoscale.dbaasintegrationsettings.item.item.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DestTypeGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The JSON schema representing the settings for the given integration type, source, and destination service types.
     */
    private DestTypeGetResponseSettings settings;
    /**
     * Instantiates a new DestTypeGetResponse and sets the default values.
     */
    public DestTypeGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DestTypeGetResponse
     */
    @jakarta.annotation.Nonnull
    public static DestTypeGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DestTypeGetResponse();
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
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(DestTypeGetResponseSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. The JSON schema representing the settings for the given integration type, source, and destination service types.
     * @return a DestTypeGetResponseSettings
     */
    @jakarta.annotation.Nullable
    public DestTypeGetResponseSettings getSettings() {
        return this.settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("settings", this.getSettings());
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
     * Sets the settings property value. The JSON schema representing the settings for the given integration type, source, and destination service types.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final DestTypeGetResponseSettings value) {
        this.settings = value;
    }
}
