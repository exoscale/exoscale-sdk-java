package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Operation status
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OperationState implements ValuedEnum {
    Failure("failure"),
    Pending("pending"),
    Success("success"),
    Timeout("timeout");
    public final String value;
    OperationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OperationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "failure": return Failure;
            case "pending": return Pending;
            case "success": return Success;
            case "timeout": return Timeout;
            default: return null;
        }
    }
}
