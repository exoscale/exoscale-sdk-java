package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Instance type size
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InstanceTypeSize implements ValuedEnum {
    Large("large"),
    Huge("huge"),
    Jumbo("jumbo"),
    Medium("medium"),
    Mega("mega"),
    Small("small"),
    ExtraLarge("extra-large"),
    Titan("titan"),
    Micro("micro"),
    Colossus("colossus"),
    Tiny("tiny");
    public final String value;
    InstanceTypeSize(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InstanceTypeSize forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "large": return Large;
            case "huge": return Huge;
            case "jumbo": return Jumbo;
            case "medium": return Medium;
            case "mega": return Mega;
            case "small": return Small;
            case "extra-large": return ExtraLarge;
            case "titan": return Titan;
            case "micro": return Micro;
            case "colossus": return Colossus;
            case "tiny": return Tiny;
            default: return null;
        }
    }
}
