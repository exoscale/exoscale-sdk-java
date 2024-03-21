package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaPgTrackIoTiming implements ValuedEnum {
    Off("off"),
    On("on");
    public final String value;
    JsonSchemaPgTrackIoTiming(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaPgTrackIoTiming forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "off": return Off;
            case "on": return On;
            default: return null;
        }
    }
}
