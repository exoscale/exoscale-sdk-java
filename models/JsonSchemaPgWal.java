package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaPgWal implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this.
     */
    private Integer maxSlotWalKeepSize;
    /**
     * PostgreSQL maximum WAL senders
     */
    private Integer maxWalSenders;
    /**
     * Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. Setting this value to zero disables the timeout.
     */
    private Integer walSenderTimeout;
    /**
     * WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance
     */
    private Integer walWriterDelay;
    /**
     * Instantiates a new JsonSchemaPgWal and sets the default values.
     */
    public JsonSchemaPgWal() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaPgWal
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaPgWal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaPgWal();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("max_slot_wal_keep_size", (n) -> { this.setMaxSlotWalKeepSize(n.getIntegerValue()); });
        deserializerMap.put("max_wal_senders", (n) -> { this.setMaxWalSenders(n.getIntegerValue()); });
        deserializerMap.put("wal_sender_timeout", (n) -> { this.setWalSenderTimeout(n.getIntegerValue()); });
        deserializerMap.put("wal_writer_delay", (n) -> { this.setWalWriterDelay(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max_slot_wal_keep_size property value. PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxSlotWalKeepSize() {
        return this.maxSlotWalKeepSize;
    }
    /**
     * Gets the max_wal_senders property value. PostgreSQL maximum WAL senders
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxWalSenders() {
        return this.maxWalSenders;
    }
    /**
     * Gets the wal_sender_timeout property value. Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. Setting this value to zero disables the timeout.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWalSenderTimeout() {
        return this.walSenderTimeout;
    }
    /**
     * Gets the wal_writer_delay property value. WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWalWriterDelay() {
        return this.walWriterDelay;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("max_slot_wal_keep_size", this.getMaxSlotWalKeepSize());
        writer.writeIntegerValue("max_wal_senders", this.getMaxWalSenders());
        writer.writeIntegerValue("wal_sender_timeout", this.getWalSenderTimeout());
        writer.writeIntegerValue("wal_writer_delay", this.getWalWriterDelay());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the max_slot_wal_keep_size property value. PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this.
     * @param value Value to set for the max_slot_wal_keep_size property.
     */
    public void setMaxSlotWalKeepSize(@jakarta.annotation.Nullable final Integer value) {
        this.maxSlotWalKeepSize = value;
    }
    /**
     * Sets the max_wal_senders property value. PostgreSQL maximum WAL senders
     * @param value Value to set for the max_wal_senders property.
     */
    public void setMaxWalSenders(@jakarta.annotation.Nullable final Integer value) {
        this.maxWalSenders = value;
    }
    /**
     * Sets the wal_sender_timeout property value. Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. Setting this value to zero disables the timeout.
     * @param value Value to set for the wal_sender_timeout property.
     */
    public void setWalSenderTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.walSenderTimeout = value;
    }
    /**
     * Sets the wal_writer_delay property value. WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance
     * @param value Value to set for the wal_writer_delay property.
     */
    public void setWalWriterDelay(@jakarta.annotation.Nullable final Integer value) {
        this.walWriterDelay = value;
    }
}
