package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Controls the amount of detail written in the server log for each message that is logged.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaPgLogErrorVerbosity implements ValuedEnum {
    TERSE("TERSE"),
    DEFAULT("DEFAULT"),
    VERBOSE("VERBOSE");
    public final String value;
    JsonSchemaPgLogErrorVerbosity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaPgLogErrorVerbosity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TERSE": return TERSE;
            case "DEFAULT": return DEFAULT;
            case "VERBOSE": return VERBOSE;
            default: return null;
        }
    }
}
