package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaGrafanaCookieSamesite implements ValuedEnum {
    Lax("lax"),
    Strict("strict"),
    None("none");
    public final String value;
    JsonSchemaGrafanaCookieSamesite(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaGrafanaCookieSamesite forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "lax": return Lax;
            case "strict": return Strict;
            case "none": return None;
            default: return null;
        }
    }
}
