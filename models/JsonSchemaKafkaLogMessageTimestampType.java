package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Define whether the timestamp in the message is message create time or log append time.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaKafkaLogMessageTimestampType implements ValuedEnum {
    CreateTime("CreateTime"),
    LogAppendTime("LogAppendTime");
    public final String value;
    JsonSchemaKafkaLogMessageTimestampType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaKafkaLogMessageTimestampType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CreateTime": return CreateTime;
            case "LogAppendTime": return LogAppendTime;
            default: return null;
        }
    }
}
