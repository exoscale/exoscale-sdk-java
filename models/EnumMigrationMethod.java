package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnumMigrationMethod implements ValuedEnum {
    Dump("dump"),
    Replication("replication");
    public final String value;
    EnumMigrationMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnumMigrationMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dump": return Dump;
            case "replication": return Replication;
            default: return null;
        }
    }
}
