package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * DNS domain record type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DnsDomainRecordType implements ValuedEnum {
    NS("NS"),
    CAA("CAA"),
    NAPTR("NAPTR"),
    POOL("POOL"),
    A("A"),
    HINFO("HINFO"),
    CNAME("CNAME"),
    SOA("SOA"),
    SSHFP("SSHFP"),
    SRV("SRV"),
    AAAA("AAAA"),
    MX("MX"),
    TXT("TXT"),
    ALIAS("ALIAS"),
    URL("URL"),
    SPF("SPF");
    public final String value;
    DnsDomainRecordType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DnsDomainRecordType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NS": return NS;
            case "CAA": return CAA;
            case "NAPTR": return NAPTR;
            case "POOL": return POOL;
            case "A": return A;
            case "HINFO": return HINFO;
            case "CNAME": return CNAME;
            case "SOA": return SOA;
            case "SSHFP": return SSHFP;
            case "SRV": return SRV;
            case "AAAA": return AAAA;
            case "MX": return MX;
            case "TXT": return TXT;
            case "ALIAS": return ALIAS;
            case "URL": return URL;
            case "SPF": return SPF;
            default: return null;
        }
    }
}
