package com.exoscale.skscluster.item.nodepool;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NodepoolPostRequestBodyAddons implements ValuedEnum {
    StorageLvm("storage-lvm");
    public final String value;
    NodepoolPostRequestBodyAddons(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NodepoolPostRequestBodyAddons forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "storage-lvm": return StorageLvm;
            default: return null;
        }
    }
}
