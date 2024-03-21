package com.exoscale.instance.withidstart;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Boot in Rescue Mode, using named profile (supported: netboot, netboot-efi)
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WithIdStartPutRequestBodyRescueProfile implements ValuedEnum {
    NetbootEfi("netboot-efi"),
    Netboot("netboot");
    public final String value;
    WithIdStartPutRequestBodyRescueProfile(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WithIdStartPutRequestBodyRescueProfile forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "netboot-efi": return NetbootEfi;
            case "netboot": return Netboot;
            default: return null;
        }
    }
}
