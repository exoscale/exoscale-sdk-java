package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnumComponentRoute implements ValuedEnum {
    Dynamic("dynamic"),
    Private("private"),
    Public("public"),
    Privatelink("privatelink");
    public final String value;
    EnumComponentRoute(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnumComponentRoute forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dynamic": return Dynamic;
            case "private": return Private;
            case "public": return Public;
            case "privatelink": return Privatelink;
            default: return null;
        }
    }
}
