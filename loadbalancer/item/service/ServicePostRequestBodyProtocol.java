package com.exoscale.loadbalancer.item.service;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Network traffic protocol
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServicePostRequestBodyProtocol implements ValuedEnum {
    Tcp("tcp"),
    Udp("udp");
    public final String value;
    ServicePostRequestBodyProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServicePostRequestBodyProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tcp": return Tcp;
            case "udp": return Udp;
            default: return null;
        }
    }
}
