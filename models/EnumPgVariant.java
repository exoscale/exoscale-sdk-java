package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnumPgVariant implements ValuedEnum {
    Timescale("timescale"),
    Aiven("aiven");
    public final String value;
    EnumPgVariant(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnumPgVariant forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "timescale": return Timescale;
            case "aiven": return Aiven;
            default: return null;
        }
    }
}
