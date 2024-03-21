package com.exoscale.dbaaspostgres.item;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Integration type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasPostgresPostRequestBodyIntegrationsType implements ValuedEnum {
    Read_replica("read_replica");
    public final String value;
    DbaasPostgresPostRequestBodyIntegrationsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasPostgresPostRequestBodyIntegrationsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "read_replica": return Read_replica;
            default: return null;
        }
    }
}
