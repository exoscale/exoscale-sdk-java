package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Instance Pool state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InstancePoolState implements ValuedEnum {
    ScalingUp("scaling-up"),
    ScalingDown("scaling-down"),
    Destroying("destroying"),
    Creating("creating"),
    Suspended("suspended"),
    Running("running"),
    Updating("updating");
    public final String value;
    InstancePoolState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InstancePoolState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "scaling-up": return ScalingUp;
            case "scaling-down": return ScalingDown;
            case "destroying": return Destroying;
            case "creating": return Creating;
            case "suspended": return Suspended;
            case "running": return Running;
            case "updating": return Updating;
            default: return null;
        }
    }
}
