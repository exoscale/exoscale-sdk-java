package com.exoscale.skscluster;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Cluster service level
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SksClusterPostRequestBodyLevel implements ValuedEnum {
    Starter("starter"),
    Pro("pro");
    public final String value;
    SksClusterPostRequestBodyLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SksClusterPostRequestBodyLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "starter": return Starter;
            case "pro": return Pro;
            default: return null;
        }
    }
}
