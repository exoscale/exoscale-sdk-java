package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Resource type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessKeyResourceResourceType implements ValuedEnum {
    Product("product"),
    Bucket("bucket");
    public final String value;
    AccessKeyResourceResourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessKeyResourceResourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "product": return Product;
            case "bucket": return Bucket;
            default: return null;
        }
    }
}
