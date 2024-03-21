package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnumMigrationStatus implements ValuedEnum {
    Running("running"),
    Syncing("syncing"),
    Failed("failed"),
    Done("done");
    public final String value;
    EnumMigrationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnumMigrationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "running": return Running;
            case "syncing": return Syncing;
            case "failed": return Failed;
            case "done": return Done;
            default: return null;
        }
    }
}
