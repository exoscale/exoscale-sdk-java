package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Whether this points to a public security group. This is only valid when in the context of                   a rule addition which uses a public security group as a source or destination.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityGroupResourceVisibility implements ValuedEnum {
    Private("private"),
    Public("public");
    public final String value;
    SecurityGroupResourceVisibility(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityGroupResourceVisibility forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "private": return Private;
            case "public": return Public;
            default: return null;
        }
    }
}
