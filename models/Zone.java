package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Zone
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Zone implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Zone API endpoint
     */
    private String apiEndpoint;
    /**
     * The name property
     */
    private ZoneName name;
    /**
     * Zone SOS endpoint
     */
    private String sosEndpoint;
    /**
     * Instantiates a new Zone and sets the default values.
     */
    public Zone() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Zone
     */
    @jakarta.annotation.Nonnull
    public static Zone createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Zone();
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
     * Gets the api-endpoint property value. Zone API endpoint
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApiEndpoint() {
        return this.apiEndpoint;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("api-endpoint", (n) -> { this.setApiEndpoint(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getEnumValue(ZoneName::forValue)); });
        deserializerMap.put("sos-endpoint", (n) -> { this.setSosEndpoint(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a ZoneName
     */
    @jakarta.annotation.Nullable
    public ZoneName getName() {
        return this.name;
    }
    /**
     * Gets the sos-endpoint property value. Zone SOS endpoint
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSosEndpoint() {
        return this.sosEndpoint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("name", this.getName());
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
     * Sets the api-endpoint property value. Zone API endpoint
     * @param value Value to set for the api-endpoint property.
     */
    public void setApiEndpoint(@jakarta.annotation.Nullable final String value) {
        this.apiEndpoint = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final ZoneName value) {
        this.name = value;
    }
    /**
     * Sets the sos-endpoint property value. Zone SOS endpoint
     * @param value Value to set for the sos-endpoint property.
     */
    public void setSosEndpoint(@jakarta.annotation.Nullable final String value) {
        this.sosEndpoint = value;
    }
}
