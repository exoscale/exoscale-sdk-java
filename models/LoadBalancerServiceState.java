package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Load Balancer Service state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LoadBalancerServiceState implements ValuedEnum {
    Creating("creating"),
    Deleting("deleting"),
    Running("running"),
    Updating("updating"),
    Error("error");
    public final String value;
    LoadBalancerServiceState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LoadBalancerServiceState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "creating": return Creating;
            case "deleting": return Deleting;
            case "running": return Running;
            case "updating": return Updating;
            case "error": return Error;
            default: return null;
        }
    }
}
