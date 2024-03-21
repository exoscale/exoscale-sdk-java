package com.exoscale.privatenetwork;

import com.exoscale.models.Labels;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivateNetworkPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Private Network description
     */
    private String description;
    /**
     * Private Network end IP address
     */
    private String endIp;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Private Network name
     */
    private String name;
    /**
     * Private Network netmask
     */
    private String netmask;
    /**
     * Private Network start IP address
     */
    private String startIp;
    /**
     * Instantiates a new PrivateNetworkPostRequestBody and sets the default values.
     */
    public PrivateNetworkPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivateNetworkPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static PrivateNetworkPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivateNetworkPostRequestBody();
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
     * Gets the description property value. Private Network description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the end-ip property value. Private Network end IP address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEndIp() {
        return this.endIp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("end-ip", (n) -> { this.setEndIp(n.getStringValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("netmask", (n) -> { this.setNetmask(n.getStringValue()); });
        deserializerMap.put("start-ip", (n) -> { this.setStartIp(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a Labels
     */
    @jakarta.annotation.Nullable
    public Labels getLabels() {
        return this.labels;
    }
    /**
     * Gets the name property value. Private Network name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the netmask property value. Private Network netmask
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetmask() {
        return this.netmask;
    }
    /**
     * Gets the start-ip property value. Private Network start IP address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStartIp() {
        return this.startIp;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("end-ip", this.getEndIp());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("netmask", this.getNetmask());
        writer.writeStringValue("start-ip", this.getStartIp());
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
     * Sets the description property value. Private Network description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the end-ip property value. Private Network end IP address
     * @param value Value to set for the end-ip property.
     */
    public void setEndIp(@jakarta.annotation.Nullable final String value) {
        this.endIp = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. Private Network name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the netmask property value. Private Network netmask
     * @param value Value to set for the netmask property.
     */
    public void setNetmask(@jakarta.annotation.Nullable final String value) {
        this.netmask = value;
    }
    /**
     * Sets the start-ip property value. Private Network start IP address
     * @param value Value to set for the start-ip property.
     */
    public void setStartIp(@jakarta.annotation.Nullable final String value) {
        this.startIp = value;
    }
}
