package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnumMasterLinkStatus implements ValuedEnum {
    Up("up"),
    Down("down");
    public final String value;
    EnumMasterLinkStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnumMasterLinkStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "up": return Up;
            case "down": return Down;
            default: return null;
        }
    }
}
