package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specify the final compression type for a given topic. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'uncompressed' which is equivalent to no compression; and 'producer' which means retain the original compression codec set by the producer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaKafkaCompressionType implements ValuedEnum {
    Gzip("gzip"),
    Snappy("snappy"),
    Lz4("lz4"),
    Zstd("zstd"),
    Uncompressed("uncompressed"),
    Producer("producer");
    public final String value;
    JsonSchemaKafkaCompressionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaKafkaCompressionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "gzip": return Gzip;
            case "snappy": return Snappy;
            case "lz4": return Lz4;
            case "zstd": return Zstd;
            case "uncompressed": return Uncompressed;
            case "producer": return Producer;
            default: return null;
        }
    }
}
