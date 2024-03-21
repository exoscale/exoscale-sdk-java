package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Resource domain
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessKeyResourceDomain implements ValuedEnum {
    Partner("partner"),
    Sos("sos");
    public final String value;
    AccessKeyResourceDomain(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessKeyResourceDomain forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "partner": return Partner;
            case "sos": return Sos;
            default: return null;
        }
    }
}
