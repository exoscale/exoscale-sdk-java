package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * IAM Access Key version
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessKeyVersion implements ValuedEnum {
    V2("v2"),
    V1("v1");
    public final String value;
    AccessKeyVersion(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessKeyVersion forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "v2": return V2;
            case "v1": return V1;
            default: return null;
        }
    }
}
