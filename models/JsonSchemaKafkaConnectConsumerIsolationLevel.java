package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaKafkaConnectConsumerIsolationLevel implements ValuedEnum {
    Read_uncommitted("read_uncommitted"),
    Read_committed("read_committed");
    public final String value;
    JsonSchemaKafkaConnectConsumerIsolationLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaKafkaConnectConsumerIsolationLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "read_uncommitted": return Read_uncommitted;
            case "read_committed": return Read_committed;
            default: return null;
        }
    }
}
