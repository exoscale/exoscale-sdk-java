package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaPgLogLinePrefix implements ValuedEnum {
    PidPUserUDbDAppAClientH("'pid=%p,user=%u,db=%d,app=%a,client=%h '"),
    TPL1UserUDbDAppAClientH("'%t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h '"),
    MPQUserUDbDAppA("'%m [%p] %q[user=%u,db=%d,app=%a] '");
    public final String value;
    JsonSchemaPgLogLinePrefix(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaPgLogLinePrefix forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "'pid=%p,user=%u,db=%d,app=%a,client=%h '": return PidPUserUDbDAppAClientH;
            case "'%t [%p]: [%l-1] user=%u,db=%d,app=%a,client=%h '": return TPL1UserUDbDAppAClientH;
            case "'%m [%p] %q[user=%u,db=%d,app=%a] '": return MPQUserUDbDAppA;
            default: return null;
        }
    }
}
