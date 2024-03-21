package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaGrafanaAlertingNodataOrNullvalues implements ValuedEnum {
    Alerting("alerting"),
    No_data("no_data"),
    Keep_state("keep_state"),
    Ok("ok");
    public final String value;
    JsonSchemaGrafanaAlertingNodataOrNullvalues(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaGrafanaAlertingNodataOrNullvalues forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alerting": return Alerting;
            case "no_data": return No_data;
            case "keep_state": return Keep_state;
            case "ok": return Ok;
            default: return null;
        }
    }
}
