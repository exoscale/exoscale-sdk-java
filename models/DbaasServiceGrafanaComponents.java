package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceGrafanaComponents implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Service component name
     */
    private String component;
    /**
     * DNS name for connecting to the service component
     */
    private String host;
    /**
     * Port number for connecting to the service component
     */
    private Long port;
    /**
     * The route property
     */
    private EnumComponentRoute route;
    /**
     * The usage property
     */
    private EnumComponentUsage usage;
    /**
     * Instantiates a new DbaasServiceGrafanaComponents and sets the default values.
     */
    public DbaasServiceGrafanaComponents() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceGrafanaComponents
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceGrafanaComponents createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceGrafanaComponents();
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
     * Gets the component property value. Service component name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComponent() {
        return this.component;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("component", (n) -> { this.setComponent(n.getStringValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getLongValue()); });
        deserializerMap.put("route", (n) -> { this.setRoute(n.getEnumValue(EnumComponentRoute::forValue)); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getEnumValue(EnumComponentUsage::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the host property value. DNS name for connecting to the service component
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHost() {
        return this.host;
    }
    /**
     * Gets the port property value. Port number for connecting to the service component
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPort() {
        return this.port;
    }
    /**
     * Gets the route property value. The route property
     * @return a EnumComponentRoute
     */
    @jakarta.annotation.Nullable
    public EnumComponentRoute getRoute() {
        return this.route;
    }
    /**
     * Gets the usage property value. The usage property
     * @return a EnumComponentUsage
     */
    @jakarta.annotation.Nullable
    public EnumComponentUsage getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("component", this.getComponent());
        writer.writeStringValue("host", this.getHost());
        writer.writeLongValue("port", this.getPort());
        writer.writeEnumValue("route", this.getRoute());
        writer.writeEnumValue("usage", this.getUsage());
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
     * Sets the component property value. Service component name
     * @param value Value to set for the component property.
     */
    public void setComponent(@jakarta.annotation.Nullable final String value) {
        this.component = value;
    }
    /**
     * Sets the host property value. DNS name for connecting to the service component
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final String value) {
        this.host = value;
    }
    /**
     * Sets the port property value. Port number for connecting to the service component
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Long value) {
        this.port = value;
    }
    /**
     * Sets the route property value. The route property
     * @param value Value to set for the route property.
     */
    public void setRoute(@jakarta.annotation.Nullable final EnumComponentRoute value) {
        this.route = value;
    }
    /**
     * Sets the usage property value. The usage property
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final EnumComponentUsage value) {
        this.usage = value;
    }
}
