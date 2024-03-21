package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Current state of the service node
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasNodeStateState implements ValuedEnum {
    Leaving("leaving"),
    Running("running"),
    Syncing_data("syncing_data"),
    Setting_up_vm("setting_up_vm"),
    Unknown("unknown");
    public final String value;
    DbaasNodeStateState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasNodeStateState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "leaving": return Leaving;
            case "running": return Running;
            case "syncing_data": return Syncing_data;
            case "setting_up_vm": return Setting_up_vm;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
