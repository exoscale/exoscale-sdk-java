package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PublicIpAssignment implements ValuedEnum {
    Inet4("inet4"),
    Dual("dual"),
    None("none");
    public final String value;
    PublicIpAssignment(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PublicIpAssignment forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "inet4": return Inet4;
            case "dual": return Dual;
            case "none": return None;
            default: return null;
        }
    }
}
