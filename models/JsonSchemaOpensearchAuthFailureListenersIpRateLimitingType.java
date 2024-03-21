package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of rate limiting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaOpensearchAuthFailureListenersIpRateLimitingType implements ValuedEnum {
    Ip("ip");
    public final String value;
    JsonSchemaOpensearchAuthFailureListenersIpRateLimitingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaOpensearchAuthFailureListenersIpRateLimitingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ip": return Ip;
            default: return null;
        }
    }
}
