package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaRedisPersistence implements ValuedEnum {
    Off("off"),
    Rdb("rdb");
    public final String value;
    JsonSchemaRedisPersistence(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaRedisPersistence forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "off": return Off;
            case "rdb": return Rdb;
            default: return null;
        }
    }
}
