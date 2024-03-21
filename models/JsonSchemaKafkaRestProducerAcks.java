package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to 'all' or '-1', the leader will wait for the full set of in-sync replicas to acknowledge the record.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaKafkaRestProducerAcks implements ValuedEnum {
    All("all"),
    Minus_1("-1"),
    Zero("0"),
    One("1");
    public final String value;
    JsonSchemaKafkaRestProducerAcks(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaKafkaRestProducerAcks forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "-1": return Minus_1;
            case "0": return Zero;
            case "1": return One;
            default: return null;
        }
    }
}
