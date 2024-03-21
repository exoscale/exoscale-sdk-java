package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Notification type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasServiceNotificationType implements ValuedEnum {
    Service_powered_off_removal("service_powered_off_removal"),
    Service_end_of_life("service_end_of_life");
    public final String value;
    DbaasServiceNotificationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasServiceNotificationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "service_powered_off_removal": return Service_powered_off_removal;
            case "service_end_of_life": return Service_end_of_life;
            default: return null;
        }
    }
}
