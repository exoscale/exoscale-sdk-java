package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaPgPgStatStatementsTrack implements ValuedEnum {
    All("all"),
    Top("top"),
    None("none");
    public final String value;
    JsonSchemaPgPgStatStatementsTrack(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaPgPgStatStatementsTrack forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "top": return Top;
            case "none": return None;
            default: return null;
        }
    }
}
