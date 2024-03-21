package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Network protocol
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityGroupRuleProtocol implements ValuedEnum {
    Tcp("tcp"),
    Esp("esp"),
    Icmp("icmp"),
    Udp("udp"),
    Gre("gre"),
    Ah("ah"),
    Ipip("ipip"),
    Icmpv6("icmpv6");
    public final String value;
    SecurityGroupRuleProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityGroupRuleProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tcp": return Tcp;
            case "esp": return Esp;
            case "icmp": return Icmp;
            case "udp": return Udp;
            case "gre": return Gre;
            case "ah": return Ah;
            case "ipip": return Ipip;
            case "icmpv6": return Icmpv6;
            default: return null;
        }
    }
}
