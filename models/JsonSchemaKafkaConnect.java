package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaKafkaConnect implements Parsable {
    /**
     * Defines what client configurations can be overridden by the connector. Default is None
     */
    private JsonSchemaKafkaConnectConnectorClientConfigOverridePolicy connectorClientConfigOverridePolicy;
    /**
     * What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest
     */
    private JsonSchemaKafkaConnectConsumerAutoOffsetReset consumerAutoOffsetReset;
    /**
     * Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum.
     */
    private Integer consumerFetchMaxBytes;
    /**
     * Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired.
     */
    private JsonSchemaKafkaConnectConsumerIsolationLevel consumerIsolationLevel;
    /**
     * Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress. 
     */
    private Integer consumerMaxPartitionFetchBytes;
    /**
     * The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).
     */
    private Integer consumerMaxPollIntervalMs;
    /**
     * The maximum number of records returned in a single call to poll() (defaults to 500).
     */
    private Integer consumerMaxPollRecords;
    /**
     * The interval at which to try committing offsets for tasks (defaults to 60000).
     */
    private Integer offsetFlushIntervalMs;
    /**
     * Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).
     */
    private Integer offsetFlushTimeoutMs;
    /**
     * This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will 'linger' for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).
     */
    private Integer producerBatchSize;
    /**
     * The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).
     */
    private Integer producerBufferMemory;
    /**
     * Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
     */
    private JsonSchemaKafkaConnectProducerCompressionType producerCompressionType;
    /**
     * This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will 'linger' for the specified time waiting for more records to show up. Defaults to 0.
     */
    private Integer producerLingerMs;
    /**
     * This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests.
     */
    private Integer producerMaxRequestSize;
    /**
     * The maximum delay that is scheduled in order to wait for the return of one or more departed workers before rebalancing and reassigning their connectors and tasks to the group. During this period the connectors and tasks of the departed workers remain unassigned.  Defaults to 5 minutes.
     */
    private Integer scheduledRebalanceMaxDelayMs;
    /**
     * The timeout in milliseconds used to detect failures when using Kafkas group management facilities (defaults to 10000).
     */
    private Integer sessionTimeoutMs;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaKafkaConnect
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaKafkaConnect createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaKafkaConnect();
    }
    /**
     * Gets the connector_client_config_override_policy property value. Defines what client configurations can be overridden by the connector. Default is None
     * @return a JsonSchemaKafkaConnectConnectorClientConfigOverridePolicy
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaConnectConnectorClientConfigOverridePolicy getConnectorClientConfigOverridePolicy() {
        return this.connectorClientConfigOverridePolicy;
    }
    /**
     * Gets the consumer_auto_offset_reset property value. What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest
     * @return a JsonSchemaKafkaConnectConsumerAutoOffsetReset
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaConnectConsumerAutoOffsetReset getConsumerAutoOffsetReset() {
        return this.consumerAutoOffsetReset;
    }
    /**
     * Gets the consumer_fetch_max_bytes property value. Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConsumerFetchMaxBytes() {
        return this.consumerFetchMaxBytes;
    }
    /**
     * Gets the consumer_isolation_level property value. Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired.
     * @return a JsonSchemaKafkaConnectConsumerIsolationLevel
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaConnectConsumerIsolationLevel getConsumerIsolationLevel() {
        return this.consumerIsolationLevel;
    }
    /**
     * Gets the consumer_max_partition_fetch_bytes property value. Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress. 
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConsumerMaxPartitionFetchBytes() {
        return this.consumerMaxPartitionFetchBytes;
    }
    /**
     * Gets the consumer_max_poll_interval_ms property value. The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConsumerMaxPollIntervalMs() {
        return this.consumerMaxPollIntervalMs;
    }
    /**
     * Gets the consumer_max_poll_records property value. The maximum number of records returned in a single call to poll() (defaults to 500).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConsumerMaxPollRecords() {
        return this.consumerMaxPollRecords;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("connector_client_config_override_policy", (n) -> { this.setConnectorClientConfigOverridePolicy(n.getEnumValue(JsonSchemaKafkaConnectConnectorClientConfigOverridePolicy::forValue)); });
        deserializerMap.put("consumer_auto_offset_reset", (n) -> { this.setConsumerAutoOffsetReset(n.getEnumValue(JsonSchemaKafkaConnectConsumerAutoOffsetReset::forValue)); });
        deserializerMap.put("consumer_fetch_max_bytes", (n) -> { this.setConsumerFetchMaxBytes(n.getIntegerValue()); });
        deserializerMap.put("consumer_isolation_level", (n) -> { this.setConsumerIsolationLevel(n.getEnumValue(JsonSchemaKafkaConnectConsumerIsolationLevel::forValue)); });
        deserializerMap.put("consumer_max_partition_fetch_bytes", (n) -> { this.setConsumerMaxPartitionFetchBytes(n.getIntegerValue()); });
        deserializerMap.put("consumer_max_poll_interval_ms", (n) -> { this.setConsumerMaxPollIntervalMs(n.getIntegerValue()); });
        deserializerMap.put("consumer_max_poll_records", (n) -> { this.setConsumerMaxPollRecords(n.getIntegerValue()); });
        deserializerMap.put("offset_flush_interval_ms", (n) -> { this.setOffsetFlushIntervalMs(n.getIntegerValue()); });
        deserializerMap.put("offset_flush_timeout_ms", (n) -> { this.setOffsetFlushTimeoutMs(n.getIntegerValue()); });
        deserializerMap.put("producer_batch_size", (n) -> { this.setProducerBatchSize(n.getIntegerValue()); });
        deserializerMap.put("producer_buffer_memory", (n) -> { this.setProducerBufferMemory(n.getIntegerValue()); });
        deserializerMap.put("producer_compression_type", (n) -> { this.setProducerCompressionType(n.getEnumValue(JsonSchemaKafkaConnectProducerCompressionType::forValue)); });
        deserializerMap.put("producer_linger_ms", (n) -> { this.setProducerLingerMs(n.getIntegerValue()); });
        deserializerMap.put("producer_max_request_size", (n) -> { this.setProducerMaxRequestSize(n.getIntegerValue()); });
        deserializerMap.put("scheduled_rebalance_max_delay_ms", (n) -> { this.setScheduledRebalanceMaxDelayMs(n.getIntegerValue()); });
        deserializerMap.put("session_timeout_ms", (n) -> { this.setSessionTimeoutMs(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the offset_flush_interval_ms property value. The interval at which to try committing offsets for tasks (defaults to 60000).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffsetFlushIntervalMs() {
        return this.offsetFlushIntervalMs;
    }
    /**
     * Gets the offset_flush_timeout_ms property value. Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffsetFlushTimeoutMs() {
        return this.offsetFlushTimeoutMs;
    }
    /**
     * Gets the producer_batch_size property value. This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will 'linger' for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProducerBatchSize() {
        return this.producerBatchSize;
    }
    /**
     * Gets the producer_buffer_memory property value. The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProducerBufferMemory() {
        return this.producerBufferMemory;
    }
    /**
     * Gets the producer_compression_type property value. Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
     * @return a JsonSchemaKafkaConnectProducerCompressionType
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaConnectProducerCompressionType getProducerCompressionType() {
        return this.producerCompressionType;
    }
    /**
     * Gets the producer_linger_ms property value. This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will 'linger' for the specified time waiting for more records to show up. Defaults to 0.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProducerLingerMs() {
        return this.producerLingerMs;
    }
    /**
     * Gets the producer_max_request_size property value. This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProducerMaxRequestSize() {
        return this.producerMaxRequestSize;
    }
    /**
     * Gets the scheduled_rebalance_max_delay_ms property value. The maximum delay that is scheduled in order to wait for the return of one or more departed workers before rebalancing and reassigning their connectors and tasks to the group. During this period the connectors and tasks of the departed workers remain unassigned.  Defaults to 5 minutes.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getScheduledRebalanceMaxDelayMs() {
        return this.scheduledRebalanceMaxDelayMs;
    }
    /**
     * Gets the session_timeout_ms property value. The timeout in milliseconds used to detect failures when using Kafkas group management facilities (defaults to 10000).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSessionTimeoutMs() {
        return this.sessionTimeoutMs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("connector_client_config_override_policy", this.getConnectorClientConfigOverridePolicy());
        writer.writeEnumValue("consumer_auto_offset_reset", this.getConsumerAutoOffsetReset());
        writer.writeIntegerValue("consumer_fetch_max_bytes", this.getConsumerFetchMaxBytes());
        writer.writeEnumValue("consumer_isolation_level", this.getConsumerIsolationLevel());
        writer.writeIntegerValue("consumer_max_partition_fetch_bytes", this.getConsumerMaxPartitionFetchBytes());
        writer.writeIntegerValue("consumer_max_poll_interval_ms", this.getConsumerMaxPollIntervalMs());
        writer.writeIntegerValue("consumer_max_poll_records", this.getConsumerMaxPollRecords());
        writer.writeIntegerValue("offset_flush_interval_ms", this.getOffsetFlushIntervalMs());
        writer.writeIntegerValue("offset_flush_timeout_ms", this.getOffsetFlushTimeoutMs());
        writer.writeIntegerValue("producer_batch_size", this.getProducerBatchSize());
        writer.writeIntegerValue("producer_buffer_memory", this.getProducerBufferMemory());
        writer.writeEnumValue("producer_compression_type", this.getProducerCompressionType());
        writer.writeIntegerValue("producer_linger_ms", this.getProducerLingerMs());
        writer.writeIntegerValue("producer_max_request_size", this.getProducerMaxRequestSize());
        writer.writeIntegerValue("scheduled_rebalance_max_delay_ms", this.getScheduledRebalanceMaxDelayMs());
        writer.writeIntegerValue("session_timeout_ms", this.getSessionTimeoutMs());
    }
    /**
     * Sets the connector_client_config_override_policy property value. Defines what client configurations can be overridden by the connector. Default is None
     * @param value Value to set for the connector_client_config_override_policy property.
     */
    public void setConnectorClientConfigOverridePolicy(@jakarta.annotation.Nullable final JsonSchemaKafkaConnectConnectorClientConfigOverridePolicy value) {
        this.connectorClientConfigOverridePolicy = value;
    }
    /**
     * Sets the consumer_auto_offset_reset property value. What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest
     * @param value Value to set for the consumer_auto_offset_reset property.
     */
    public void setConsumerAutoOffsetReset(@jakarta.annotation.Nullable final JsonSchemaKafkaConnectConsumerAutoOffsetReset value) {
        this.consumerAutoOffsetReset = value;
    }
    /**
     * Sets the consumer_fetch_max_bytes property value. Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum.
     * @param value Value to set for the consumer_fetch_max_bytes property.
     */
    public void setConsumerFetchMaxBytes(@jakarta.annotation.Nullable final Integer value) {
        this.consumerFetchMaxBytes = value;
    }
    /**
     * Sets the consumer_isolation_level property value. Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired.
     * @param value Value to set for the consumer_isolation_level property.
     */
    public void setConsumerIsolationLevel(@jakarta.annotation.Nullable final JsonSchemaKafkaConnectConsumerIsolationLevel value) {
        this.consumerIsolationLevel = value;
    }
    /**
     * Sets the consumer_max_partition_fetch_bytes property value. Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress. 
     * @param value Value to set for the consumer_max_partition_fetch_bytes property.
     */
    public void setConsumerMaxPartitionFetchBytes(@jakarta.annotation.Nullable final Integer value) {
        this.consumerMaxPartitionFetchBytes = value;
    }
    /**
     * Sets the consumer_max_poll_interval_ms property value. The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).
     * @param value Value to set for the consumer_max_poll_interval_ms property.
     */
    public void setConsumerMaxPollIntervalMs(@jakarta.annotation.Nullable final Integer value) {
        this.consumerMaxPollIntervalMs = value;
    }
    /**
     * Sets the consumer_max_poll_records property value. The maximum number of records returned in a single call to poll() (defaults to 500).
     * @param value Value to set for the consumer_max_poll_records property.
     */
    public void setConsumerMaxPollRecords(@jakarta.annotation.Nullable final Integer value) {
        this.consumerMaxPollRecords = value;
    }
    /**
     * Sets the offset_flush_interval_ms property value. The interval at which to try committing offsets for tasks (defaults to 60000).
     * @param value Value to set for the offset_flush_interval_ms property.
     */
    public void setOffsetFlushIntervalMs(@jakarta.annotation.Nullable final Integer value) {
        this.offsetFlushIntervalMs = value;
    }
    /**
     * Sets the offset_flush_timeout_ms property value. Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).
     * @param value Value to set for the offset_flush_timeout_ms property.
     */
    public void setOffsetFlushTimeoutMs(@jakarta.annotation.Nullable final Integer value) {
        this.offsetFlushTimeoutMs = value;
    }
    /**
     * Sets the producer_batch_size property value. This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will 'linger' for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).
     * @param value Value to set for the producer_batch_size property.
     */
    public void setProducerBatchSize(@jakarta.annotation.Nullable final Integer value) {
        this.producerBatchSize = value;
    }
    /**
     * Sets the producer_buffer_memory property value. The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).
     * @param value Value to set for the producer_buffer_memory property.
     */
    public void setProducerBufferMemory(@jakarta.annotation.Nullable final Integer value) {
        this.producerBufferMemory = value;
    }
    /**
     * Sets the producer_compression_type property value. Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
     * @param value Value to set for the producer_compression_type property.
     */
    public void setProducerCompressionType(@jakarta.annotation.Nullable final JsonSchemaKafkaConnectProducerCompressionType value) {
        this.producerCompressionType = value;
    }
    /**
     * Sets the producer_linger_ms property value. This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will 'linger' for the specified time waiting for more records to show up. Defaults to 0.
     * @param value Value to set for the producer_linger_ms property.
     */
    public void setProducerLingerMs(@jakarta.annotation.Nullable final Integer value) {
        this.producerLingerMs = value;
    }
    /**
     * Sets the producer_max_request_size property value. This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests.
     * @param value Value to set for the producer_max_request_size property.
     */
    public void setProducerMaxRequestSize(@jakarta.annotation.Nullable final Integer value) {
        this.producerMaxRequestSize = value;
    }
    /**
     * Sets the scheduled_rebalance_max_delay_ms property value. The maximum delay that is scheduled in order to wait for the return of one or more departed workers before rebalancing and reassigning their connectors and tasks to the group. During this period the connectors and tasks of the departed workers remain unassigned.  Defaults to 5 minutes.
     * @param value Value to set for the scheduled_rebalance_max_delay_ms property.
     */
    public void setScheduledRebalanceMaxDelayMs(@jakarta.annotation.Nullable final Integer value) {
        this.scheduledRebalanceMaxDelayMs = value;
    }
    /**
     * Sets the session_timeout_ms property value. The timeout in milliseconds used to detect failures when using Kafkas group management facilities (defaults to 10000).
     * @param value Value to set for the session_timeout_ms property.
     */
    public void setSessionTimeoutMs(@jakarta.annotation.Nullable final Integer value) {
        this.sessionTimeoutMs = value;
    }
}
