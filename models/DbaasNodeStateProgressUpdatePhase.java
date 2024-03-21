package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Key identifying this phase
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasNodeStateProgressUpdatePhase implements ValuedEnum {
    Stream("stream"),
    Basebackup("basebackup"),
    Prepare("prepare"),
    Finalize("finalize");
    public final String value;
    DbaasNodeStateProgressUpdatePhase(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasNodeStateProgressUpdatePhase forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "stream": return Stream;
            case "basebackup": return Basebackup;
            case "prepare": return Prepare;
            case "finalize": return Finalize;
            default: return null;
        }
    }
}
