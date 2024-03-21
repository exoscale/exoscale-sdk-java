package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Snapshot state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BlockStorageSnapshotState implements ValuedEnum {
    PartiallyDestroyed("partially-destroyed"),
    Destroying("destroying"),
    Creating("creating"),
    Created("created"),
    Promoting("promoting"),
    Error("error"),
    Destroyed("destroyed"),
    Allocated("allocated");
    public final String value;
    BlockStorageSnapshotState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BlockStorageSnapshotState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "partially-destroyed": return PartiallyDestroyed;
            case "destroying": return Destroying;
            case "creating": return Creating;
            case "created": return Created;
            case "promoting": return Promoting;
            case "error": return Error;
            case "destroyed": return Destroyed;
            case "allocated": return Allocated;
            default: return null;
        }
    }
}
