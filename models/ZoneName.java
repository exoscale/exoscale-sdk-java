package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ZoneName implements ValuedEnum {
    ChDk2("ch-dk-2"),
    DeMuc1("de-muc-1"),
    ChGva2("ch-gva-2"),
    AtVie1("at-vie-1"),
    DeFra1("de-fra-1"),
    BgSof1("bg-sof-1"),
    AtVie2("at-vie-2");
    public final String value;
    ZoneName(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ZoneName forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ch-dk-2": return ChDk2;
            case "de-muc-1": return DeMuc1;
            case "ch-gva-2": return ChGva2;
            case "at-vie-1": return AtVie1;
            case "de-fra-1": return DeFra1;
            case "bg-sof-1": return BgSof1;
            case "at-vie-2": return AtVie2;
            default: return null;
        }
    }
}
