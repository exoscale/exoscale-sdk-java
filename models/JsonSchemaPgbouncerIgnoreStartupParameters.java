package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaPgbouncerIgnoreStartupParameters implements ValuedEnum {
    Extra_float_digits("extra_float_digits"),
    Search_path("search_path");
    public final String value;
    JsonSchemaPgbouncerIgnoreStartupParameters(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaPgbouncerIgnoreStartupParameters forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "extra_float_digits": return Extra_float_digits;
            case "search_path": return Search_path;
            default: return null;
        }
    }
}
