package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Health check mode
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ElasticIpHealthcheckMode implements ValuedEnum {
    Tcp("tcp"),
    Http("http"),
    Https("https");
    public final String value;
    ElasticIpHealthcheckMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ElasticIpHealthcheckMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tcp": return Tcp;
            case "http": return Http;
            case "https": return Https;
            default: return null;
        }
    }
}
