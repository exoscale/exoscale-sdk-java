package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Boot mode (default: legacy)
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TemplateBootMode implements ValuedEnum {
    Legacy("legacy"),
    Uefi("uefi");
    public final String value;
    TemplateBootMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TemplateBootMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "legacy": return Legacy;
            case "uefi": return Uefi;
            default: return null;
        }
    }
}
