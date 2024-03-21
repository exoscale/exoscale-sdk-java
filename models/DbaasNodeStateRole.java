package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Role of this node. Only returned for a subset of service types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasNodeStateRole implements ValuedEnum {
    Standby("standby"),
    Master("master"),
    ReadReplica("read-replica");
    public final String value;
    DbaasNodeStateRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasNodeStateRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standby": return Standby;
            case "master": return Master;
            case "read-replica": return ReadReplica;
            default: return null;
        }
    }
}
