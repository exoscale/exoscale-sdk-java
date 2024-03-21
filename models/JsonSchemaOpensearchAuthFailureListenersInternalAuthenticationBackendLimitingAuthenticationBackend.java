package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The internal backend. Enter `internal`
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimitingAuthenticationBackend implements ValuedEnum {
    Internal("internal");
    public final String value;
    JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimitingAuthenticationBackend(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimitingAuthenticationBackend forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "internal": return Internal;
            default: return null;
        }
    }
}
