package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Notification level
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasServiceNotificationLevel implements ValuedEnum {
    Warning("warning"),
    Notice("notice");
    public final String value;
    DbaasServiceNotificationLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasServiceNotificationLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "warning": return Warning;
            case "notice": return Notice;
            default: return null;
        }
    }
}
