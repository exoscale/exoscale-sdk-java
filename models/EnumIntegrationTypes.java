package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnumIntegrationTypes implements ValuedEnum {
    Datasource("datasource"),
    Logs("logs"),
    Metrics("metrics");
    public final String value;
    EnumIntegrationTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnumIntegrationTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "datasource": return Datasource;
            case "logs": return Logs;
            case "metrics": return Metrics;
            default: return null;
        }
    }
}
