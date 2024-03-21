package com.exoscale.loadbalancer.item.service.item;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Network traffic protocol
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServicePutRequestBodyProtocol implements ValuedEnum {
    Tcp("tcp"),
    Udp("udp");
    public final String value;
    ServicePutRequestBodyProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServicePutRequestBodyProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tcp": return Tcp;
            case "udp": return Udp;
            default: return null;
        }
    }
}
