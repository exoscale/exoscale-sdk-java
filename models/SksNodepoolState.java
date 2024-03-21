package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Nodepool state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SksNodepoolState implements ValuedEnum {
    RenewingToken("renewing-token"),
    Creating("creating"),
    Deleting("deleting"),
    Running("running"),
    Scaling("scaling"),
    Updating("updating"),
    Error("error");
    public final String value;
    SksNodepoolState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SksNodepoolState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "renewing-token": return RenewingToken;
            case "creating": return Creating;
            case "deleting": return Deleting;
            case "running": return Running;
            case "scaling": return Scaling;
            case "updating": return Updating;
            case "error": return Error;
            default: return null;
        }
    }
}
