package com.exoscale.skscluster;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SksClusterPostRequestBodyAddons implements ValuedEnum {
    ExoscaleCloudController("exoscale-cloud-controller"),
    ExoscaleContainerStorageInterface("exoscale-container-storage-interface"),
    MetricsServer("metrics-server");
    public final String value;
    SksClusterPostRequestBodyAddons(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SksClusterPostRequestBodyAddons forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "exoscale-cloud-controller": return ExoscaleCloudController;
            case "exoscale-container-storage-interface": return ExoscaleContainerStorageInterface;
            case "metrics-server": return MetricsServer;
            default: return null;
        }
    }
}
