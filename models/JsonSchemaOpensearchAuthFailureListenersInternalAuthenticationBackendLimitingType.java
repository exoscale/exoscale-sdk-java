package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of rate limiting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimitingType implements ValuedEnum {
    Username("username");
    public final String value;
    JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimitingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimitingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "username": return Username;
            default: return null;
        }
    }
}
