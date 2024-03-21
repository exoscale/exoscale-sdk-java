package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InstanceState implements ValuedEnum {
    Expunging("expunging"),
    Starting("starting"),
    Destroying("destroying"),
    Running("running"),
    Stopping("stopping"),
    Stopped("stopped"),
    Migrating("migrating"),
    Error("error"),
    Destroyed("destroyed");
    public final String value;
    InstanceState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InstanceState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "expunging": return Expunging;
            case "starting": return Starting;
            case "destroying": return Destroying;
            case "running": return Running;
            case "stopping": return Stopping;
            case "stopped": return Stopped;
            case "migrating": return Migrating;
            case "error": return Error;
            case "destroyed": return Destroyed;
            default: return null;
        }
    }
}
