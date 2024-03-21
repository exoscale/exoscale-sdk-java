package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceLogs implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The firstLogOffset property
     */
    private String firstLogOffset;
    /**
     * The logs property
     */
    private java.util.List<DbaasServiceLogsLogs> logs;
    /**
     * The offset property
     */
    private String offset;
    /**
     * Instantiates a new DbaasServiceLogs and sets the default values.
     */
    public DbaasServiceLogs() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceLogs
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceLogs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceLogs();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("first-log-offset", (n) -> { this.setFirstLogOffset(n.getStringValue()); });
        deserializerMap.put("logs", (n) -> { this.setLogs(n.getCollectionOfObjectValues(DbaasServiceLogsLogs::createFromDiscriminatorValue)); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first-log-offset property value. The firstLogOffset property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirstLogOffset() {
        return this.firstLogOffset;
    }
    /**
     * Gets the logs property value. The logs property
     * @return a java.util.List<DbaasServiceLogsLogs>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasServiceLogsLogs> getLogs() {
        return this.logs;
    }
    /**
     * Gets the offset property value. The offset property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOffset() {
        return this.offset;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("first-log-offset", this.getFirstLogOffset());
        writer.writeCollectionOfObjectValues("logs", this.getLogs());
        writer.writeStringValue("offset", this.getOffset());
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
     * Sets the first-log-offset property value. The firstLogOffset property
     * @param value Value to set for the first-log-offset property.
     */
    public void setFirstLogOffset(@jakarta.annotation.Nullable final String value) {
        this.firstLogOffset = value;
    }
    /**
     * Sets the logs property value. The logs property
     * @param value Value to set for the logs property.
     */
    public void setLogs(@jakarta.annotation.Nullable final java.util.List<DbaasServiceLogsLogs> value) {
        this.logs = value;
    }
    /**
     * Sets the offset property value. The offset property
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final String value) {
        this.offset = value;
    }
}
