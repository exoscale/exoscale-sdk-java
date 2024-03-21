package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaPglookout implements Parsable {
    /**
     * Number of seconds of master unavailability before triggering database failover to standby
     */
    private Integer maxFailoverReplicationTimeLag;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaPglookout
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaPglookout createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaPglookout();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("max_failover_replication_time_lag", (n) -> { this.setMaxFailoverReplicationTimeLag(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max_failover_replication_time_lag property value. Number of seconds of master unavailability before triggering database failover to standby
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxFailoverReplicationTimeLag() {
        return this.maxFailoverReplicationTimeLag;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("max_failover_replication_time_lag", this.getMaxFailoverReplicationTimeLag());
    }
    /**
     * Sets the max_failover_replication_time_lag property value. Number of seconds of master unavailability before triggering database failover to standby
     * @param value Value to set for the max_failover_replication_time_lag property.
     */
    public void setMaxFailoverReplicationTimeLag(@jakarta.annotation.Nullable final Integer value) {
        this.maxFailoverReplicationTimeLag = value;
    }
}
