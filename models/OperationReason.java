package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Operation failure reason
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OperationReason implements ValuedEnum {
    Incorrect("incorrect"),
    Unknown("unknown"),
    Unavailable("unavailable"),
    Forbidden("forbidden"),
    Busy("busy"),
    Fault("fault"),
    Partial("partial"),
    NotFound("not-found"),
    Interrupted("interrupted"),
    Unsupported("unsupported"),
    Conflict("conflict");
    public final String value;
    OperationReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OperationReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "incorrect": return Incorrect;
            case "unknown": return Unknown;
            case "unavailable": return Unavailable;
            case "forbidden": return Forbidden;
            case "busy": return Busy;
            case "fault": return Fault;
            case "partial": return Partial;
            case "not-found": return NotFound;
            case "interrupted": return Interrupted;
            case "unsupported": return Unsupported;
            case "conflict": return Conflict;
            default: return null;
        }
    }
}
