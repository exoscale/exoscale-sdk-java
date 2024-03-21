package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaKafkaConnectProducerCompressionType implements ValuedEnum {
    Gzip("gzip"),
    Snappy("snappy"),
    Lz4("lz4"),
    Zstd("zstd"),
    None("none");
    public final String value;
    JsonSchemaKafkaConnectProducerCompressionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaKafkaConnectProducerCompressionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "gzip": return Gzip;
            case "snappy": return Snappy;
            case "lz4": return Lz4;
            case "zstd": return Zstd;
            case "none": return None;
            default: return null;
        }
    }
}
