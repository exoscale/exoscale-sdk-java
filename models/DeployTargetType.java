package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Deploy Target type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeployTargetType implements ValuedEnum {
    Edge("edge"),
    Dedicated("dedicated");
    public final String value;
    DeployTargetType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeployTargetType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "edge": return Edge;
            case "dedicated": return Dedicated;
            default: return null;
        }
    }
}
