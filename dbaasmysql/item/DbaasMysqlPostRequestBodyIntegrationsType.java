package com.exoscale.dbaasmysql.item;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Integration type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DbaasMysqlPostRequestBodyIntegrationsType implements ValuedEnum {
    Read_replica("read_replica");
    public final String value;
    DbaasMysqlPostRequestBodyIntegrationsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DbaasMysqlPostRequestBodyIntegrationsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "read_replica": return Read_replica;
            default: return null;
        }
    }
}
