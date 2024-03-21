package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Instance type family
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InstanceTypeFamily implements ValuedEnum {
    Gpu3("gpu3"),
    Gpu2("gpu2"),
    Gpu("gpu"),
    Memory("memory"),
    Storage("storage"),
    Standard("standard"),
    Colossus("colossus"),
    Cpu("cpu");
    public final String value;
    InstanceTypeFamily(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InstanceTypeFamily forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "gpu3": return Gpu3;
            case "gpu2": return Gpu2;
            case "gpu": return Gpu;
            case "memory": return Memory;
            case "storage": return Storage;
            case "standard": return Standard;
            case "colossus": return Colossus;
            case "cpu": return Cpu;
            default: return null;
        }
    }
}
