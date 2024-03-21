package com.exoscale.skscluster;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Cluster CNI
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SksClusterPostRequestBodyCni implements ValuedEnum {
    Calico("calico"),
    Cilium("cilium");
    public final String value;
    SksClusterPostRequestBodyCni(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SksClusterPostRequestBodyCni forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "calico": return Calico;
            case "cilium": return Cilium;
            default: return null;
        }
    }
}
