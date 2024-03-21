package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enables tracking of function call counts and time used.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaPgTrackFunctions implements ValuedEnum {
    All("all"),
    Pl("pl"),
    None("none");
    public final String value;
    JsonSchemaPgTrackFunctions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaPgTrackFunctions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "pl": return Pl;
            case "none": return None;
            default: return null;
        }
    }
}
