package com.exoscale.securitygroup;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GetVisibilityQueryParameterType implements ValuedEnum {
    Private("private"),
    Public("public");
    public final String value;
    GetVisibilityQueryParameterType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GetVisibilityQueryParameterType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "private": return Private;
            case "public": return Public;
            default: return null;
        }
    }
}
