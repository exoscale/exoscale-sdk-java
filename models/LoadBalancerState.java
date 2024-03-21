package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Load Balancer state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LoadBalancerState implements ValuedEnum {
    Creating("creating"),
    Migrated("migrated"),
    Deleting("deleting"),
    Running("running"),
    Migrating("migrating"),
    Error("error");
    public final String value;
    LoadBalancerState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LoadBalancerState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "creating": return Creating;
            case "migrated": return Migrated;
            case "deleting": return Deleting;
            case "running": return Running;
            case "migrating": return Migrating;
            case "error": return Error;
            default: return null;
        }
    }
}
