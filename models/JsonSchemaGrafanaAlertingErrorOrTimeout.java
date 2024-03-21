package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaGrafanaAlertingErrorOrTimeout implements ValuedEnum {
    Alerting("alerting"),
    Keep_state("keep_state");
    public final String value;
    JsonSchemaGrafanaAlertingErrorOrTimeout(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaGrafanaAlertingErrorOrTimeout forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alerting": return Alerting;
            case "keep_state": return Keep_state;
            default: return null;
        }
    }
}
