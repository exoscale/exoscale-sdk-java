package com.exoscale.loadbalancer.item.service;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Load balancing strategy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServicePostRequestBodyStrategy implements ValuedEnum {
    RoundRobin("round-robin"),
    SourceHash("source-hash");
    public final String value;
    ServicePostRequestBodyStrategy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServicePostRequestBodyStrategy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "round-robin": return RoundRobin;
            case "source-hash": return SourceHash;
            default: return null;
        }
    }
}
