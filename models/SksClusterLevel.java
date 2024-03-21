package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Cluster level
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SksClusterLevel implements ValuedEnum {
    Starter("starter"),
    Pro("pro");
    public final String value;
    SksClusterLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SksClusterLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "starter": return Starter;
            case "pro": return Pro;
            default: return null;
        }
    }
}
