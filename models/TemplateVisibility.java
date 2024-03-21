package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Template visibility
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TemplateVisibility implements ValuedEnum {
    Private("private"),
    Public("public");
    public final String value;
    TemplateVisibility(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TemplateVisibility forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "private": return Private;
            case "public": return Public;
            default: return null;
        }
    }
}
