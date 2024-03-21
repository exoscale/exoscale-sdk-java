package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Snapshot state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SnapshotState implements ValuedEnum {
    Snapshotting("snapshotting"),
    Deleted("deleted"),
    Exporting("exporting"),
    Ready("ready"),
    Deleting("deleting"),
    Error("error"),
    Exported("exported");
    public final String value;
    SnapshotState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SnapshotState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "snapshotting": return Snapshotting;
            case "deleted": return Deleted;
            case "exporting": return Exporting;
            case "ready": return Ready;
            case "deleting": return Deleting;
            case "error": return Error;
            case "exported": return Exported;
            default: return null;
        }
    }
}
