package com.exoscale.dbaasopensearch.item;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Deletion sorting algorithm
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasOpensearchPostRequestBodyIndexPatternsSortingAlgorithm implements ValuedEnum {
    Alphabetical("alphabetical"),
    Creation_date("creation_date");
    public final String value;
    DbaasOpensearchPostRequestBodyIndexPatternsSortingAlgorithm(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasOpensearchPostRequestBodyIndexPatternsSortingAlgorithm forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alphabetical": return Alphabetical;
            case "creation_date": return Creation_date;
            default: return null;
        }
    }
}
