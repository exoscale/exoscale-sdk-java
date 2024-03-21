package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Record commit time of transactions.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaPgTrackCommitTimestamp implements ValuedEnum {
    Off("off"),
    On("on");
    public final String value;
    JsonSchemaPgTrackCommitTimestamp(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaPgTrackCommitTimestamp forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "off": return Off;
            case "on": return On;
            default: return null;
        }
    }
}
