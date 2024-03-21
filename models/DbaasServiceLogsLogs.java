package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceLogsLogs implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The message property
     */
    private String message;
    /**
     * The node property
     */
    private String node;
    /**
     * The time property
     */
    private String time;
    /**
     * The unit property
     */
    private String unit;
    /**
     * Instantiates a new DbaasServiceLogsLogs and sets the default values.
     */
    public DbaasServiceLogsLogs() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceLogsLogs
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceLogsLogs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceLogsLogs();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("node", (n) -> { this.setNode(n.getStringValue()); });
        deserializerMap.put("time", (n) -> { this.setTime(n.getStringValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The message property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the node property value. The node property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNode() {
        return this.node;
    }
    /**
     * Gets the time property value. The time property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTime() {
        return this.time;
    }
    /**
     * Gets the unit property value. The unit property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUnit() {
        return this.unit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("node", this.getNode());
        writer.writeStringValue("time", this.getTime());
        writer.writeStringValue("unit", this.getUnit());
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
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the node property value. The node property
     * @param value Value to set for the node property.
     */
    public void setNode(@jakarta.annotation.Nullable final String value) {
        this.node = value;
    }
    /**
     * Sets the time property value. The time property
     * @param value Value to set for the time property.
     */
    public void setTime(@jakarta.annotation.Nullable final String value) {
        this.time = value;
    }
    /**
     * Sets the unit property value. The unit property
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final String value) {
        this.unit = value;
    }
}
