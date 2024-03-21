package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Kafka Schema Registry permission
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasKafkaSchemaRegistryAclEntryPermission implements ValuedEnum {
    Schema_registry_read("schema_registry_read"),
    Schema_registry_write("schema_registry_write");
    public final String value;
    DbaasKafkaSchemaRegistryAclEntryPermission(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasKafkaSchemaRegistryAclEntryPermission forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "schema_registry_read": return Schema_registry_read;
            case "schema_registry_write": return Schema_registry_write;
            default: return null;
        }
    }
}
