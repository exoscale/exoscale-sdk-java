package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaRedisMaxmemoryPolicy implements ValuedEnum {
    Noeviction("noeviction"),
    AllkeysLru("allkeys-lru"),
    VolatileLru("volatile-lru"),
    AllkeysRandom("allkeys-random"),
    VolatileRandom("volatile-random"),
    VolatileTtl("volatile-ttl"),
    VolatileLfu("volatile-lfu"),
    AllkeysLfu("allkeys-lfu");
    public final String value;
    JsonSchemaRedisMaxmemoryPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaRedisMaxmemoryPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noeviction": return Noeviction;
            case "allkeys-lru": return AllkeysLru;
            case "volatile-lru": return VolatileLru;
            case "allkeys-random": return AllkeysRandom;
            case "volatile-random": return VolatileRandom;
            case "volatile-ttl": return VolatileTtl;
            case "volatile-lfu": return VolatileLfu;
            case "allkeys-lfu": return AllkeysLfu;
            default: return null;
        }
    }
}
