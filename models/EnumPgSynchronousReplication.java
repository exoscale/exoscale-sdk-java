package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnumPgSynchronousReplication implements ValuedEnum {
    Quorum("quorum"),
    Off("off");
    public final String value;
    EnumPgSynchronousReplication(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnumPgSynchronousReplication forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "quorum": return Quorum;
            case "off": return Off;
            default: return null;
        }
    }
}
