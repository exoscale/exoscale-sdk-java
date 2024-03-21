package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Extra information regarding the progress for current state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasNodeStateProgressUpdate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether this phase has been completed or not
     */
    private Boolean completed;
    /**
     * Current progress for this phase. May be missing or null.
     */
    private Long current;
    /**
     * Maximum progress value for this phase. May be missing or null. May change.
     */
    private Long max;
    /**
     * Minimum progress value for this phase. May be missing or null.
     */
    private Long min;
    /**
     * Key identifying this phase
     */
    private DbaasNodeStateProgressUpdatePhase phase;
    /**
     * Unit for current/min/max values. New units may be added.                        If null should be treated as generic unit
     */
    private String unit;
    /**
     * Instantiates a new DbaasNodeStateProgressUpdate and sets the default values.
     */
    public DbaasNodeStateProgressUpdate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasNodeStateProgressUpdate
     */
    @jakarta.annotation.Nonnull
    public static DbaasNodeStateProgressUpdate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasNodeStateProgressUpdate();
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
     * Gets the completed property value. Indicates whether this phase has been completed or not
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCompleted() {
        return this.completed;
    }
    /**
     * Gets the current property value. Current progress for this phase. May be missing or null.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCurrent() {
        return this.current;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("completed", (n) -> { this.setCompleted(n.getBooleanValue()); });
        deserializerMap.put("current", (n) -> { this.setCurrent(n.getLongValue()); });
        deserializerMap.put("max", (n) -> { this.setMax(n.getLongValue()); });
        deserializerMap.put("min", (n) -> { this.setMin(n.getLongValue()); });
        deserializerMap.put("phase", (n) -> { this.setPhase(n.getEnumValue(DbaasNodeStateProgressUpdatePhase::forValue)); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max property value. Maximum progress value for this phase. May be missing or null. May change.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMax() {
        return this.max;
    }
    /**
     * Gets the min property value. Minimum progress value for this phase. May be missing or null.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMin() {
        return this.min;
    }
    /**
     * Gets the phase property value. Key identifying this phase
     * @return a DbaasNodeStateProgressUpdatePhase
     */
    @jakarta.annotation.Nullable
    public DbaasNodeStateProgressUpdatePhase getPhase() {
        return this.phase;
    }
    /**
     * Gets the unit property value. Unit for current/min/max values. New units may be added.                        If null should be treated as generic unit
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
        writer.writeBooleanValue("completed", this.getCompleted());
        writer.writeLongValue("current", this.getCurrent());
        writer.writeLongValue("max", this.getMax());
        writer.writeLongValue("min", this.getMin());
        writer.writeEnumValue("phase", this.getPhase());
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
     * Sets the completed property value. Indicates whether this phase has been completed or not
     * @param value Value to set for the completed property.
     */
    public void setCompleted(@jakarta.annotation.Nullable final Boolean value) {
        this.completed = value;
    }
    /**
     * Sets the current property value. Current progress for this phase. May be missing or null.
     * @param value Value to set for the current property.
     */
    public void setCurrent(@jakarta.annotation.Nullable final Long value) {
        this.current = value;
    }
    /**
     * Sets the max property value. Maximum progress value for this phase. May be missing or null. May change.
     * @param value Value to set for the max property.
     */
    public void setMax(@jakarta.annotation.Nullable final Long value) {
        this.max = value;
    }
    /**
     * Sets the min property value. Minimum progress value for this phase. May be missing or null.
     * @param value Value to set for the min property.
     */
    public void setMin(@jakarta.annotation.Nullable final Long value) {
        this.min = value;
    }
    /**
     * Sets the phase property value. Key identifying this phase
     * @param value Value to set for the phase property.
     */
    public void setPhase(@jakarta.annotation.Nullable final DbaasNodeStateProgressUpdatePhase value) {
        this.phase = value;
    }
    /**
     * Sets the unit property value. Unit for current/min/max values. New units may be added.                        If null should be treated as generic unit
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final String value) {
        this.unit = value;
    }
}
