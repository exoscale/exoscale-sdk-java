package com.exoscale.dbaasopensearch.item;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Day of week for installing updates
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasOpensearchPutRequestBodyMaintenanceDow implements ValuedEnum {
    Saturday("saturday"),
    Tuesday("tuesday"),
    Never("never"),
    Wednesday("wednesday"),
    Sunday("sunday"),
    Friday("friday"),
    Monday("monday"),
    Thursday("thursday");
    public final String value;
    DbaasOpensearchPutRequestBodyMaintenanceDow(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasOpensearchPutRequestBodyMaintenanceDow forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "saturday": return Saturday;
            case "tuesday": return Tuesday;
            case "never": return Never;
            case "wednesday": return Wednesday;
            case "sunday": return Sunday;
            case "friday": return Friday;
            case "monday": return Monday;
            case "thursday": return Thursday;
            default: return null;
        }
    }
}
