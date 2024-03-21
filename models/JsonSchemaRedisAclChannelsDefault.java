package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaRedisAclChannelsDefault implements ValuedEnum {
    Allchannels("allchannels"),
    Resetchannels("resetchannels");
    public final String value;
    JsonSchemaRedisAclChannelsDefault(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaRedisAclChannelsDefault forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allchannels": return Allchannels;
            case "resetchannels": return Resetchannels;
            default: return null;
        }
    }
}
