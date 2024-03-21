package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Status of the instance's healthcheck
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LoadBalancerServerStatusStatus implements ValuedEnum {
    Failure("failure"),
    Success("success");
    public final String value;
    LoadBalancerServerStatusStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LoadBalancerServerStatusStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "failure": return Failure;
            case "success": return Success;
            default: return null;
        }
    }
}
