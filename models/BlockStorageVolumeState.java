package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Volume state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BlockStorageVolumeState implements ValuedEnum {
    Snapshotting("snapshotting"),
    Deleted("deleted"),
    Creating("creating"),
    Detached("detached"),
    Deleting("deleting"),
    Attaching("attaching"),
    Error("error"),
    Attached("attached"),
    Detaching("detaching");
    public final String value;
    BlockStorageVolumeState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BlockStorageVolumeState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "snapshotting": return Snapshotting;
            case "deleted": return Deleted;
            case "creating": return Creating;
            case "detached": return Detached;
            case "deleting": return Deleting;
            case "attaching": return Attaching;
            case "error": return Error;
            case "attached": return Attached;
            case "detaching": return Detaching;
            default: return null;
        }
    }
}
