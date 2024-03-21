package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defines what client configurations can be overridden by the connector. Default is None
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaKafkaConnectConnectorClientConfigOverridePolicy implements ValuedEnum {
    None("None"),
    All("All");
    public final String value;
    JsonSchemaKafkaConnectConnectorClientConfigOverridePolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaKafkaConnectConnectorClientConfigOverridePolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "None": return None;
            case "All": return All;
            default: return null;
        }
    }
}
