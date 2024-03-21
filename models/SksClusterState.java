package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Cluster state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SksClusterState implements ValuedEnum {
    RotatingCcmCredentials("rotating-ccm-credentials"),
    Creating("creating"),
    Upgrading("upgrading"),
    Deleting("deleting"),
    Running("running"),
    Suspending("suspending"),
    Updating("updating"),
    Error("error");
    public final String value;
    SksClusterState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SksClusterState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rotating-ccm-credentials": return RotatingCcmCredentials;
            case "creating": return Creating;
            case "upgrading": return Upgrading;
            case "deleting": return Deleting;
            case "running": return Running;
            case "suspending": return Suspending;
            case "updating": return Updating;
            case "error": return Error;
            default: return null;
        }
    }
}
