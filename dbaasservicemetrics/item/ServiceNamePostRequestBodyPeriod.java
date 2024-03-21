package com.exoscale.dbaasservicemetrics.item;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Metrics time period (default: hour)
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceNamePostRequestBodyPeriod implements ValuedEnum {
    Hour("hour"),
    Week("week"),
    Year("year"),
    Month("month"),
    Day("day");
    public final String value;
    ServiceNamePostRequestBodyPeriod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceNamePostRequestBodyPeriod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hour": return Hour;
            case "week": return Week;
            case "year": return Year;
            case "month": return Month;
            case "day": return Day;
            default: return null;
        }
    }
}
