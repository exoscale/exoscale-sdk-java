package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specifies the default TOAST compression method for values of compressible columns (the default is lz4).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaPgDefaultToastCompression implements ValuedEnum {
    Lz4("lz4"),
    Pglz("pglz");
    public final String value;
    JsonSchemaPgDefaultToastCompression(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaPgDefaultToastCompression forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "lz4": return Lz4;
            case "pglz": return Pglz;
            default: return null;
        }
    }
}
