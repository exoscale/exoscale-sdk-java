package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaGrafanaSmtpServerStarttlsPolicy implements ValuedEnum {
    OpportunisticStartTLS("OpportunisticStartTLS"),
    MandatoryStartTLS("MandatoryStartTLS"),
    NoStartTLS("NoStartTLS");
    public final String value;
    JsonSchemaGrafanaSmtpServerStarttlsPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaGrafanaSmtpServerStarttlsPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "OpportunisticStartTLS": return OpportunisticStartTLS;
            case "MandatoryStartTLS": return MandatoryStartTLS;
            case "NoStartTLS": return NoStartTLS;
            default: return null;
        }
    }
}
