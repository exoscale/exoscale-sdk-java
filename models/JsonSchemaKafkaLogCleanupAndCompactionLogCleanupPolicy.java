package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The default cleanup policy for segments beyond the retention window
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaKafkaLogCleanupAndCompactionLogCleanupPolicy implements ValuedEnum {
    Delete("delete"),
    Compact("compact"),
    CompactDelete("compact,delete");
    public final String value;
    JsonSchemaKafkaLogCleanupAndCompactionLogCleanupPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaKafkaLogCleanupAndCompactionLogCleanupPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "delete": return Delete;
            case "compact": return Compact;
            case "compact,delete": return CompactDelete;
            default: return null;
        }
    }
}
