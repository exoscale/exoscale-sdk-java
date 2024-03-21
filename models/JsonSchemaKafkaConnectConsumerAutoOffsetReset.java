package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaKafkaConnectConsumerAutoOffsetReset implements ValuedEnum {
    Earliest("earliest"),
    Latest("latest");
    public final String value;
    JsonSchemaKafkaConnectConsumerAutoOffsetReset(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaKafkaConnectConsumerAutoOffsetReset forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "earliest": return Earliest;
            case "latest": return Latest;
            default: return null;
        }
    }
}
