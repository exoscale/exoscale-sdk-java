package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaGrafanaDateFormats implements Parsable {
    /**
     * The default_timezone property
     */
    private String defaultTimezone;
    /**
     * The full_date property
     */
    private String fullDate;
    /**
     * The interval_day property
     */
    private String intervalDay;
    /**
     * The interval_hour property
     */
    private String intervalHour;
    /**
     * The interval_minute property
     */
    private String intervalMinute;
    /**
     * The interval_month property
     */
    private String intervalMonth;
    /**
     * The interval_second property
     */
    private String intervalSecond;
    /**
     * The interval_year property
     */
    private String intervalYear;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaGrafanaDateFormats
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaGrafanaDateFormats createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaGrafanaDateFormats();
    }
    /**
     * Gets the default_timezone property value. The default_timezone property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultTimezone() {
        return this.defaultTimezone;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("default_timezone", (n) -> { this.setDefaultTimezone(n.getStringValue()); });
        deserializerMap.put("full_date", (n) -> { this.setFullDate(n.getStringValue()); });
        deserializerMap.put("interval_day", (n) -> { this.setIntervalDay(n.getStringValue()); });
        deserializerMap.put("interval_hour", (n) -> { this.setIntervalHour(n.getStringValue()); });
        deserializerMap.put("interval_minute", (n) -> { this.setIntervalMinute(n.getStringValue()); });
        deserializerMap.put("interval_month", (n) -> { this.setIntervalMonth(n.getStringValue()); });
        deserializerMap.put("interval_second", (n) -> { this.setIntervalSecond(n.getStringValue()); });
        deserializerMap.put("interval_year", (n) -> { this.setIntervalYear(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the full_date property value. The full_date property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFullDate() {
        return this.fullDate;
    }
    /**
     * Gets the interval_day property value. The interval_day property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntervalDay() {
        return this.intervalDay;
    }
    /**
     * Gets the interval_hour property value. The interval_hour property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntervalHour() {
        return this.intervalHour;
    }
    /**
     * Gets the interval_minute property value. The interval_minute property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntervalMinute() {
        return this.intervalMinute;
    }
    /**
     * Gets the interval_month property value. The interval_month property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntervalMonth() {
        return this.intervalMonth;
    }
    /**
     * Gets the interval_second property value. The interval_second property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntervalSecond() {
        return this.intervalSecond;
    }
    /**
     * Gets the interval_year property value. The interval_year property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIntervalYear() {
        return this.intervalYear;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("default_timezone", this.getDefaultTimezone());
        writer.writeStringValue("full_date", this.getFullDate());
        writer.writeStringValue("interval_day", this.getIntervalDay());
        writer.writeStringValue("interval_hour", this.getIntervalHour());
        writer.writeStringValue("interval_minute", this.getIntervalMinute());
        writer.writeStringValue("interval_month", this.getIntervalMonth());
        writer.writeStringValue("interval_second", this.getIntervalSecond());
        writer.writeStringValue("interval_year", this.getIntervalYear());
    }
    /**
     * Sets the default_timezone property value. The default_timezone property
     * @param value Value to set for the default_timezone property.
     */
    public void setDefaultTimezone(@jakarta.annotation.Nullable final String value) {
        this.defaultTimezone = value;
    }
    /**
     * Sets the full_date property value. The full_date property
     * @param value Value to set for the full_date property.
     */
    public void setFullDate(@jakarta.annotation.Nullable final String value) {
        this.fullDate = value;
    }
    /**
     * Sets the interval_day property value. The interval_day property
     * @param value Value to set for the interval_day property.
     */
    public void setIntervalDay(@jakarta.annotation.Nullable final String value) {
        this.intervalDay = value;
    }
    /**
     * Sets the interval_hour property value. The interval_hour property
     * @param value Value to set for the interval_hour property.
     */
    public void setIntervalHour(@jakarta.annotation.Nullable final String value) {
        this.intervalHour = value;
    }
    /**
     * Sets the interval_minute property value. The interval_minute property
     * @param value Value to set for the interval_minute property.
     */
    public void setIntervalMinute(@jakarta.annotation.Nullable final String value) {
        this.intervalMinute = value;
    }
    /**
     * Sets the interval_month property value. The interval_month property
     * @param value Value to set for the interval_month property.
     */
    public void setIntervalMonth(@jakarta.annotation.Nullable final String value) {
        this.intervalMonth = value;
    }
    /**
     * Sets the interval_second property value. The interval_second property
     * @param value Value to set for the interval_second property.
     */
    public void setIntervalSecond(@jakarta.annotation.Nullable final String value) {
        this.intervalSecond = value;
    }
    /**
     * Sets the interval_year property value. The interval_year property
     * @param value Value to set for the interval_year property.
     */
    public void setIntervalYear(@jakarta.annotation.Nullable final String value) {
        this.intervalYear = value;
    }
}
