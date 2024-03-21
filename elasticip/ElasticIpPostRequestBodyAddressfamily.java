package com.exoscale.elasticip;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Elastic IP address family (default: :inet4)
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ElasticIpPostRequestBodyAddressfamily implements ValuedEnum {
    Inet4("inet4"),
    Inet6("inet6");
    public final String value;
    ElasticIpPostRequestBodyAddressfamily(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ElasticIpPostRequestBodyAddressfamily forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "inet4": return Inet4;
            case "inet6": return Inet6;
            default: return null;
        }
    }
}
