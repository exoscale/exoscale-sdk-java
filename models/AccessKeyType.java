package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * IAM Access Key type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessKeyType implements ValuedEnum {
    Restricted("restricted"),
    Unrestricted("unrestricted");
    public final String value;
    AccessKeyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessKeyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "restricted": return Restricted;
            case "unrestricted": return Unrestricted;
            default: return null;
        }
    }
}
