package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The storage engine for in-memory internal temporary tables.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaMysqlInternalTmpMemStorageEngine implements ValuedEnum {
    TempTable("TempTable"),
    MEMORY("MEMORY");
    public final String value;
    JsonSchemaMysqlInternalTmpMemStorageEngine(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaMysqlInternalTmpMemStorageEngine forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TempTable": return TempTable;
            case "MEMORY": return MEMORY;
            default: return null;
        }
    }
}
