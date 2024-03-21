package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasPgTargetVersions implements ValuedEnum {
    OneFour("14"),
    OneFive("15"),
    OneTwo("12"),
    OneThree("13"),
    OneSix("16");
    public final String value;
    DbaasPgTargetVersions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasPgTargetVersions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "14": return OneFour;
            case "15": return OneFive;
            case "12": return OneTwo;
            case "13": return OneThree;
            case "16": return OneSix;
            default: return null;
        }
    }
}
