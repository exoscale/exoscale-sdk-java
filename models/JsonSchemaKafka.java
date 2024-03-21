package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaKafka implements Parsable {
    /**
     * Enable auto creation of topics
     */
    private Boolean autoCreateTopicsEnable;
    /**
     * Specify the final compression type for a given topic. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'uncompressed' which is equivalent to no compression; and 'producer' which means retain the original compression codec set by the producer.
     */
    private JsonSchemaKafkaCompressionType compressionType;
    /**
     * Idle connections timeout: the server socket processor threads close the connections that idle for longer than this.
     */
    private Integer connectionsMaxIdleMs;
    /**
     * Replication factor for autocreated topics
     */
    private Integer defaultReplicationFactor;
    /**
     * The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.
     */
    private Integer groupInitialRebalanceDelayMs;
    /**
     * The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    private Integer groupMaxSessionTimeoutMs;
    /**
     * The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     */
    private Integer groupMinSessionTimeoutMs;
    /**
     * The logCleanupAndCompaction property
     */
    private JsonSchemaKafkaLogCleanupAndCompaction logCleanupAndCompaction;
    /**
     * The number of messages accumulated on a log partition before messages are flushed to disk
     */
    private Integer logFlushIntervalMessages;
    /**
     * The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used
     */
    private Integer logFlushIntervalMs;
    /**
     * The interval with which Kafka adds an entry to the offset index
     */
    private Integer logIndexIntervalBytes;
    /**
     * The maximum size in bytes of the offset index
     */
    private Integer logIndexSizeMaxBytes;
    /**
     * The maximum size of local log segments that can grow for a partition before it gets eligible for deletion. If set to -2, the value of log.retention.bytes is used. The effective value should always be less than or equal to log.retention.bytes value.
     */
    private Integer logLocalRetentionBytes;
    /**
     * The number of milliseconds to keep the local log segments before it gets eligible for deletion. If set to -2, the value of log.retention.ms is used. The effective value should always be less than or equal to log.retention.ms value.
     */
    private Integer logLocalRetentionMs;
    /**
     * This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests. 
     */
    private Boolean logMessageDownconversionEnable;
    /**
     * The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message
     */
    private Integer logMessageTimestampDifferenceMaxMs;
    /**
     * Define whether the timestamp in the message is message create time or log append time.
     */
    private JsonSchemaKafkaLogMessageTimestampType logMessageTimestampType;
    /**
     * Should pre allocate file when create new segment?
     */
    private Boolean logPreallocate;
    /**
     * The maximum size of the log before deleting messages
     */
    private Integer logRetentionBytes;
    /**
     * The number of hours to keep a log file before deleting it
     */
    private Integer logRetentionHours;
    /**
     * The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.
     */
    private Integer logRetentionMs;
    /**
     * The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used
     */
    private Integer logRollJitterMs;
    /**
     * The maximum time before a new log segment is rolled out (in milliseconds).
     */
    private Integer logRollMs;
    /**
     * The maximum size of a single log file
     */
    private Integer logSegmentBytes;
    /**
     * The amount of time to wait before deleting a file from the filesystem
     */
    private Integer logSegmentDeleteDelayMs;
    /**
     * The maximum number of connections allowed from each ip address (defaults to 2147483647).
     */
    private Integer maxConnectionsPerIp;
    /**
     * The maximum number of incremental fetch sessions that the broker will maintain.
     */
    private Integer maxIncrementalFetchSessionCacheSlots;
    /**
     * The maximum size of message that the server can receive.
     */
    private Integer messageMaxBytes;
    /**
     * When a producer sets acks to 'all' (or '-1'), min.insync.replicas specifies the minimum number of replicas that must acknowledge a write for the write to be considered successful.
     */
    private Integer minInsyncReplicas;
    /**
     * Number of partitions for autocreated topics
     */
    private Integer numPartitions;
    /**
     * Log retention window in minutes for offsets topic
     */
    private Integer offsetsRetentionMinutes;
    /**
     * The purge interval (in number of requests) of the producer request purgatory(defaults to 1000).
     */
    private Integer producerPurgatoryPurgeIntervalRequests;
    /**
     * The number of bytes of messages to attempt to fetch for each partition (defaults to 1048576). This is not an absolute maximum, if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made.
     */
    private Integer replicaFetchMaxBytes;
    /**
     * Maximum bytes expected for the entire fetch response (defaults to 10485760). Records are fetched in batches, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made. As such, this is not an absolute maximum.
     */
    private Integer replicaFetchResponseMaxBytes;
    /**
     * The (optional) comma-delimited setting for the broker to use to verify that the JWT was issued for one of the expected audiences.
     */
    private String saslOauthbearerExpectedAudience;
    /**
     * Optional setting for the broker to use to verify that the JWT was created by the expected issuer.
     */
    private String saslOauthbearerExpectedIssuer;
    /**
     * OIDC JWKS endpoint URL. By setting this the SASL SSL OAuth2/OIDC authentication is enabled. See also other options for SASL OAuth2/OIDC. 
     */
    private String saslOauthbearerJwksEndpointUrl;
    /**
     * Name of the scope from which to extract the subject claim from the JWT. Defaults to sub.
     */
    private String saslOauthbearerSubClaimName;
    /**
     * The maximum number of bytes in a socket request (defaults to 104857600).
     */
    private Integer socketRequestMaxBytes;
    /**
     * The interval at which to remove transactions that have expired due to transactional.id.expiration.ms passing (defaults to 3600000 (1 hour)).
     */
    private Integer transactionRemoveExpiredTransactionCleanupIntervalMs;
    /**
     * The transaction topic segment bytes should be kept relatively small in order to facilitate faster log compaction and cache loads (defaults to 104857600 (100 mebibytes)).
     */
    private Integer transactionStateLogSegmentBytes;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaKafka
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaKafka createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaKafka();
    }
    /**
     * Gets the auto_create_topics_enable property value. Enable auto creation of topics
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoCreateTopicsEnable() {
        return this.autoCreateTopicsEnable;
    }
    /**
     * Gets the compression_type property value. Specify the final compression type for a given topic. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'uncompressed' which is equivalent to no compression; and 'producer' which means retain the original compression codec set by the producer.
     * @return a JsonSchemaKafkaCompressionType
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaCompressionType getCompressionType() {
        return this.compressionType;
    }
    /**
     * Gets the connections_max_idle_ms property value. Idle connections timeout: the server socket processor threads close the connections that idle for longer than this.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConnectionsMaxIdleMs() {
        return this.connectionsMaxIdleMs;
    }
    /**
     * Gets the default_replication_factor property value. Replication factor for autocreated topics
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefaultReplicationFactor() {
        return this.defaultReplicationFactor;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(41);
        deserializerMap.put("auto_create_topics_enable", (n) -> { this.setAutoCreateTopicsEnable(n.getBooleanValue()); });
        deserializerMap.put("compression_type", (n) -> { this.setCompressionType(n.getEnumValue(JsonSchemaKafkaCompressionType::forValue)); });
        deserializerMap.put("connections_max_idle_ms", (n) -> { this.setConnectionsMaxIdleMs(n.getIntegerValue()); });
        deserializerMap.put("default_replication_factor", (n) -> { this.setDefaultReplicationFactor(n.getIntegerValue()); });
        deserializerMap.put("group_initial_rebalance_delay_ms", (n) -> { this.setGroupInitialRebalanceDelayMs(n.getIntegerValue()); });
        deserializerMap.put("group_max_session_timeout_ms", (n) -> { this.setGroupMaxSessionTimeoutMs(n.getIntegerValue()); });
        deserializerMap.put("group_min_session_timeout_ms", (n) -> { this.setGroupMinSessionTimeoutMs(n.getIntegerValue()); });
        deserializerMap.put("log-cleanup-and-compaction", (n) -> { this.setLogCleanupAndCompaction(n.getObjectValue(JsonSchemaKafkaLogCleanupAndCompaction::createFromDiscriminatorValue)); });
        deserializerMap.put("log_flush_interval_messages", (n) -> { this.setLogFlushIntervalMessages(n.getIntegerValue()); });
        deserializerMap.put("log_flush_interval_ms", (n) -> { this.setLogFlushIntervalMs(n.getIntegerValue()); });
        deserializerMap.put("log_index_interval_bytes", (n) -> { this.setLogIndexIntervalBytes(n.getIntegerValue()); });
        deserializerMap.put("log_index_size_max_bytes", (n) -> { this.setLogIndexSizeMaxBytes(n.getIntegerValue()); });
        deserializerMap.put("log_local_retention_bytes", (n) -> { this.setLogLocalRetentionBytes(n.getIntegerValue()); });
        deserializerMap.put("log_local_retention_ms", (n) -> { this.setLogLocalRetentionMs(n.getIntegerValue()); });
        deserializerMap.put("log_message_downconversion_enable", (n) -> { this.setLogMessageDownconversionEnable(n.getBooleanValue()); });
        deserializerMap.put("log_message_timestamp_difference_max_ms", (n) -> { this.setLogMessageTimestampDifferenceMaxMs(n.getIntegerValue()); });
        deserializerMap.put("log_message_timestamp_type", (n) -> { this.setLogMessageTimestampType(n.getEnumValue(JsonSchemaKafkaLogMessageTimestampType::forValue)); });
        deserializerMap.put("log_preallocate", (n) -> { this.setLogPreallocate(n.getBooleanValue()); });
        deserializerMap.put("log_retention_bytes", (n) -> { this.setLogRetentionBytes(n.getIntegerValue()); });
        deserializerMap.put("log_retention_hours", (n) -> { this.setLogRetentionHours(n.getIntegerValue()); });
        deserializerMap.put("log_retention_ms", (n) -> { this.setLogRetentionMs(n.getIntegerValue()); });
        deserializerMap.put("log_roll_jitter_ms", (n) -> { this.setLogRollJitterMs(n.getIntegerValue()); });
        deserializerMap.put("log_roll_ms", (n) -> { this.setLogRollMs(n.getIntegerValue()); });
        deserializerMap.put("log_segment_bytes", (n) -> { this.setLogSegmentBytes(n.getIntegerValue()); });
        deserializerMap.put("log_segment_delete_delay_ms", (n) -> { this.setLogSegmentDeleteDelayMs(n.getIntegerValue()); });
        deserializerMap.put("max_connections_per_ip", (n) -> { this.setMaxConnectionsPerIp(n.getIntegerValue()); });
        deserializerMap.put("max_incremental_fetch_session_cache_slots", (n) -> { this.setMaxIncrementalFetchSessionCacheSlots(n.getIntegerValue()); });
        deserializerMap.put("message_max_bytes", (n) -> { this.setMessageMaxBytes(n.getIntegerValue()); });
        deserializerMap.put("min_insync_replicas", (n) -> { this.setMinInsyncReplicas(n.getIntegerValue()); });
        deserializerMap.put("num_partitions", (n) -> { this.setNumPartitions(n.getIntegerValue()); });
        deserializerMap.put("offsets_retention_minutes", (n) -> { this.setOffsetsRetentionMinutes(n.getIntegerValue()); });
        deserializerMap.put("producer_purgatory_purge_interval_requests", (n) -> { this.setProducerPurgatoryPurgeIntervalRequests(n.getIntegerValue()); });
        deserializerMap.put("replica_fetch_max_bytes", (n) -> { this.setReplicaFetchMaxBytes(n.getIntegerValue()); });
        deserializerMap.put("replica_fetch_response_max_bytes", (n) -> { this.setReplicaFetchResponseMaxBytes(n.getIntegerValue()); });
        deserializerMap.put("sasl_oauthbearer_expected_audience", (n) -> { this.setSaslOauthbearerExpectedAudience(n.getStringValue()); });
        deserializerMap.put("sasl_oauthbearer_expected_issuer", (n) -> { this.setSaslOauthbearerExpectedIssuer(n.getStringValue()); });
        deserializerMap.put("sasl_oauthbearer_jwks_endpoint_url", (n) -> { this.setSaslOauthbearerJwksEndpointUrl(n.getStringValue()); });
        deserializerMap.put("sasl_oauthbearer_sub_claim_name", (n) -> { this.setSaslOauthbearerSubClaimName(n.getStringValue()); });
        deserializerMap.put("socket_request_max_bytes", (n) -> { this.setSocketRequestMaxBytes(n.getIntegerValue()); });
        deserializerMap.put("transaction_remove_expired_transaction_cleanup_interval_ms", (n) -> { this.setTransactionRemoveExpiredTransactionCleanupIntervalMs(n.getIntegerValue()); });
        deserializerMap.put("transaction_state_log_segment_bytes", (n) -> { this.setTransactionStateLogSegmentBytes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group_initial_rebalance_delay_ms property value. The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getGroupInitialRebalanceDelayMs() {
        return this.groupInitialRebalanceDelayMs;
    }
    /**
     * Gets the group_max_session_timeout_ms property value. The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getGroupMaxSessionTimeoutMs() {
        return this.groupMaxSessionTimeoutMs;
    }
    /**
     * Gets the group_min_session_timeout_ms property value. The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getGroupMinSessionTimeoutMs() {
        return this.groupMinSessionTimeoutMs;
    }
    /**
     * Gets the log-cleanup-and-compaction property value. The logCleanupAndCompaction property
     * @return a JsonSchemaKafkaLogCleanupAndCompaction
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaLogCleanupAndCompaction getLogCleanupAndCompaction() {
        return this.logCleanupAndCompaction;
    }
    /**
     * Gets the log_flush_interval_messages property value. The number of messages accumulated on a log partition before messages are flushed to disk
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogFlushIntervalMessages() {
        return this.logFlushIntervalMessages;
    }
    /**
     * Gets the log_flush_interval_ms property value. The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogFlushIntervalMs() {
        return this.logFlushIntervalMs;
    }
    /**
     * Gets the log_index_interval_bytes property value. The interval with which Kafka adds an entry to the offset index
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogIndexIntervalBytes() {
        return this.logIndexIntervalBytes;
    }
    /**
     * Gets the log_index_size_max_bytes property value. The maximum size in bytes of the offset index
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogIndexSizeMaxBytes() {
        return this.logIndexSizeMaxBytes;
    }
    /**
     * Gets the log_local_retention_bytes property value. The maximum size of local log segments that can grow for a partition before it gets eligible for deletion. If set to -2, the value of log.retention.bytes is used. The effective value should always be less than or equal to log.retention.bytes value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogLocalRetentionBytes() {
        return this.logLocalRetentionBytes;
    }
    /**
     * Gets the log_local_retention_ms property value. The number of milliseconds to keep the local log segments before it gets eligible for deletion. If set to -2, the value of log.retention.ms is used. The effective value should always be less than or equal to log.retention.ms value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogLocalRetentionMs() {
        return this.logLocalRetentionMs;
    }
    /**
     * Gets the log_message_downconversion_enable property value. This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests. 
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLogMessageDownconversionEnable() {
        return this.logMessageDownconversionEnable;
    }
    /**
     * Gets the log_message_timestamp_difference_max_ms property value. The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogMessageTimestampDifferenceMaxMs() {
        return this.logMessageTimestampDifferenceMaxMs;
    }
    /**
     * Gets the log_message_timestamp_type property value. Define whether the timestamp in the message is message create time or log append time.
     * @return a JsonSchemaKafkaLogMessageTimestampType
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaLogMessageTimestampType getLogMessageTimestampType() {
        return this.logMessageTimestampType;
    }
    /**
     * Gets the log_preallocate property value. Should pre allocate file when create new segment?
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLogPreallocate() {
        return this.logPreallocate;
    }
    /**
     * Gets the log_retention_bytes property value. The maximum size of the log before deleting messages
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogRetentionBytes() {
        return this.logRetentionBytes;
    }
    /**
     * Gets the log_retention_hours property value. The number of hours to keep a log file before deleting it
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogRetentionHours() {
        return this.logRetentionHours;
    }
    /**
     * Gets the log_retention_ms property value. The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogRetentionMs() {
        return this.logRetentionMs;
    }
    /**
     * Gets the log_roll_jitter_ms property value. The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogRollJitterMs() {
        return this.logRollJitterMs;
    }
    /**
     * Gets the log_roll_ms property value. The maximum time before a new log segment is rolled out (in milliseconds).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogRollMs() {
        return this.logRollMs;
    }
    /**
     * Gets the log_segment_bytes property value. The maximum size of a single log file
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogSegmentBytes() {
        return this.logSegmentBytes;
    }
    /**
     * Gets the log_segment_delete_delay_ms property value. The amount of time to wait before deleting a file from the filesystem
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogSegmentDeleteDelayMs() {
        return this.logSegmentDeleteDelayMs;
    }
    /**
     * Gets the max_connections_per_ip property value. The maximum number of connections allowed from each ip address (defaults to 2147483647).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxConnectionsPerIp() {
        return this.maxConnectionsPerIp;
    }
    /**
     * Gets the max_incremental_fetch_session_cache_slots property value. The maximum number of incremental fetch sessions that the broker will maintain.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxIncrementalFetchSessionCacheSlots() {
        return this.maxIncrementalFetchSessionCacheSlots;
    }
    /**
     * Gets the message_max_bytes property value. The maximum size of message that the server can receive.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMessageMaxBytes() {
        return this.messageMaxBytes;
    }
    /**
     * Gets the min_insync_replicas property value. When a producer sets acks to 'all' (or '-1'), min.insync.replicas specifies the minimum number of replicas that must acknowledge a write for the write to be considered successful.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinInsyncReplicas() {
        return this.minInsyncReplicas;
    }
    /**
     * Gets the num_partitions property value. Number of partitions for autocreated topics
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumPartitions() {
        return this.numPartitions;
    }
    /**
     * Gets the offsets_retention_minutes property value. Log retention window in minutes for offsets topic
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffsetsRetentionMinutes() {
        return this.offsetsRetentionMinutes;
    }
    /**
     * Gets the producer_purgatory_purge_interval_requests property value. The purge interval (in number of requests) of the producer request purgatory(defaults to 1000).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProducerPurgatoryPurgeIntervalRequests() {
        return this.producerPurgatoryPurgeIntervalRequests;
    }
    /**
     * Gets the replica_fetch_max_bytes property value. The number of bytes of messages to attempt to fetch for each partition (defaults to 1048576). This is not an absolute maximum, if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getReplicaFetchMaxBytes() {
        return this.replicaFetchMaxBytes;
    }
    /**
     * Gets the replica_fetch_response_max_bytes property value. Maximum bytes expected for the entire fetch response (defaults to 10485760). Records are fetched in batches, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made. As such, this is not an absolute maximum.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getReplicaFetchResponseMaxBytes() {
        return this.replicaFetchResponseMaxBytes;
    }
    /**
     * Gets the sasl_oauthbearer_expected_audience property value. The (optional) comma-delimited setting for the broker to use to verify that the JWT was issued for one of the expected audiences.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSaslOauthbearerExpectedAudience() {
        return this.saslOauthbearerExpectedAudience;
    }
    /**
     * Gets the sasl_oauthbearer_expected_issuer property value. Optional setting for the broker to use to verify that the JWT was created by the expected issuer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSaslOauthbearerExpectedIssuer() {
        return this.saslOauthbearerExpectedIssuer;
    }
    /**
     * Gets the sasl_oauthbearer_jwks_endpoint_url property value. OIDC JWKS endpoint URL. By setting this the SASL SSL OAuth2/OIDC authentication is enabled. See also other options for SASL OAuth2/OIDC. 
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSaslOauthbearerJwksEndpointUrl() {
        return this.saslOauthbearerJwksEndpointUrl;
    }
    /**
     * Gets the sasl_oauthbearer_sub_claim_name property value. Name of the scope from which to extract the subject claim from the JWT. Defaults to sub.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSaslOauthbearerSubClaimName() {
        return this.saslOauthbearerSubClaimName;
    }
    /**
     * Gets the socket_request_max_bytes property value. The maximum number of bytes in a socket request (defaults to 104857600).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSocketRequestMaxBytes() {
        return this.socketRequestMaxBytes;
    }
    /**
     * Gets the transaction_remove_expired_transaction_cleanup_interval_ms property value. The interval at which to remove transactions that have expired due to transactional.id.expiration.ms passing (defaults to 3600000 (1 hour)).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionRemoveExpiredTransactionCleanupIntervalMs() {
        return this.transactionRemoveExpiredTransactionCleanupIntervalMs;
    }
    /**
     * Gets the transaction_state_log_segment_bytes property value. The transaction topic segment bytes should be kept relatively small in order to facilitate faster log compaction and cache loads (defaults to 104857600 (100 mebibytes)).
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionStateLogSegmentBytes() {
        return this.transactionStateLogSegmentBytes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("auto_create_topics_enable", this.getAutoCreateTopicsEnable());
        writer.writeEnumValue("compression_type", this.getCompressionType());
        writer.writeIntegerValue("connections_max_idle_ms", this.getConnectionsMaxIdleMs());
        writer.writeIntegerValue("default_replication_factor", this.getDefaultReplicationFactor());
        writer.writeIntegerValue("group_initial_rebalance_delay_ms", this.getGroupInitialRebalanceDelayMs());
        writer.writeIntegerValue("group_max_session_timeout_ms", this.getGroupMaxSessionTimeoutMs());
        writer.writeIntegerValue("group_min_session_timeout_ms", this.getGroupMinSessionTimeoutMs());
        writer.writeObjectValue("log-cleanup-and-compaction", this.getLogCleanupAndCompaction());
        writer.writeIntegerValue("log_flush_interval_messages", this.getLogFlushIntervalMessages());
        writer.writeIntegerValue("log_flush_interval_ms", this.getLogFlushIntervalMs());
        writer.writeIntegerValue("log_index_interval_bytes", this.getLogIndexIntervalBytes());
        writer.writeIntegerValue("log_index_size_max_bytes", this.getLogIndexSizeMaxBytes());
        writer.writeIntegerValue("log_local_retention_bytes", this.getLogLocalRetentionBytes());
        writer.writeIntegerValue("log_local_retention_ms", this.getLogLocalRetentionMs());
        writer.writeBooleanValue("log_message_downconversion_enable", this.getLogMessageDownconversionEnable());
        writer.writeIntegerValue("log_message_timestamp_difference_max_ms", this.getLogMessageTimestampDifferenceMaxMs());
        writer.writeEnumValue("log_message_timestamp_type", this.getLogMessageTimestampType());
        writer.writeBooleanValue("log_preallocate", this.getLogPreallocate());
        writer.writeIntegerValue("log_retention_bytes", this.getLogRetentionBytes());
        writer.writeIntegerValue("log_retention_hours", this.getLogRetentionHours());
        writer.writeIntegerValue("log_retention_ms", this.getLogRetentionMs());
        writer.writeIntegerValue("log_roll_jitter_ms", this.getLogRollJitterMs());
        writer.writeIntegerValue("log_roll_ms", this.getLogRollMs());
        writer.writeIntegerValue("log_segment_bytes", this.getLogSegmentBytes());
        writer.writeIntegerValue("log_segment_delete_delay_ms", this.getLogSegmentDeleteDelayMs());
        writer.writeIntegerValue("max_connections_per_ip", this.getMaxConnectionsPerIp());
        writer.writeIntegerValue("max_incremental_fetch_session_cache_slots", this.getMaxIncrementalFetchSessionCacheSlots());
        writer.writeIntegerValue("message_max_bytes", this.getMessageMaxBytes());
        writer.writeIntegerValue("min_insync_replicas", this.getMinInsyncReplicas());
        writer.writeIntegerValue("num_partitions", this.getNumPartitions());
        writer.writeIntegerValue("offsets_retention_minutes", this.getOffsetsRetentionMinutes());
        writer.writeIntegerValue("producer_purgatory_purge_interval_requests", this.getProducerPurgatoryPurgeIntervalRequests());
        writer.writeIntegerValue("replica_fetch_max_bytes", this.getReplicaFetchMaxBytes());
        writer.writeIntegerValue("replica_fetch_response_max_bytes", this.getReplicaFetchResponseMaxBytes());
        writer.writeStringValue("sasl_oauthbearer_expected_audience", this.getSaslOauthbearerExpectedAudience());
        writer.writeStringValue("sasl_oauthbearer_expected_issuer", this.getSaslOauthbearerExpectedIssuer());
        writer.writeStringValue("sasl_oauthbearer_jwks_endpoint_url", this.getSaslOauthbearerJwksEndpointUrl());
        writer.writeStringValue("sasl_oauthbearer_sub_claim_name", this.getSaslOauthbearerSubClaimName());
        writer.writeIntegerValue("socket_request_max_bytes", this.getSocketRequestMaxBytes());
        writer.writeIntegerValue("transaction_remove_expired_transaction_cleanup_interval_ms", this.getTransactionRemoveExpiredTransactionCleanupIntervalMs());
        writer.writeIntegerValue("transaction_state_log_segment_bytes", this.getTransactionStateLogSegmentBytes());
    }
    /**
     * Sets the auto_create_topics_enable property value. Enable auto creation of topics
     * @param value Value to set for the auto_create_topics_enable property.
     */
    public void setAutoCreateTopicsEnable(@jakarta.annotation.Nullable final Boolean value) {
        this.autoCreateTopicsEnable = value;
    }
    /**
     * Sets the compression_type property value. Specify the final compression type for a given topic. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'uncompressed' which is equivalent to no compression; and 'producer' which means retain the original compression codec set by the producer.
     * @param value Value to set for the compression_type property.
     */
    public void setCompressionType(@jakarta.annotation.Nullable final JsonSchemaKafkaCompressionType value) {
        this.compressionType = value;
    }
    /**
     * Sets the connections_max_idle_ms property value. Idle connections timeout: the server socket processor threads close the connections that idle for longer than this.
     * @param value Value to set for the connections_max_idle_ms property.
     */
    public void setConnectionsMaxIdleMs(@jakarta.annotation.Nullable final Integer value) {
        this.connectionsMaxIdleMs = value;
    }
    /**
     * Sets the default_replication_factor property value. Replication factor for autocreated topics
     * @param value Value to set for the default_replication_factor property.
     */
    public void setDefaultReplicationFactor(@jakarta.annotation.Nullable final Integer value) {
        this.defaultReplicationFactor = value;
    }
    /**
     * Sets the group_initial_rebalance_delay_ms property value. The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.
     * @param value Value to set for the group_initial_rebalance_delay_ms property.
     */
    public void setGroupInitialRebalanceDelayMs(@jakarta.annotation.Nullable final Integer value) {
        this.groupInitialRebalanceDelayMs = value;
    }
    /**
     * Sets the group_max_session_timeout_ms property value. The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     * @param value Value to set for the group_max_session_timeout_ms property.
     */
    public void setGroupMaxSessionTimeoutMs(@jakarta.annotation.Nullable final Integer value) {
        this.groupMaxSessionTimeoutMs = value;
    }
    /**
     * Sets the group_min_session_timeout_ms property value. The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.
     * @param value Value to set for the group_min_session_timeout_ms property.
     */
    public void setGroupMinSessionTimeoutMs(@jakarta.annotation.Nullable final Integer value) {
        this.groupMinSessionTimeoutMs = value;
    }
    /**
     * Sets the log-cleanup-and-compaction property value. The logCleanupAndCompaction property
     * @param value Value to set for the log-cleanup-and-compaction property.
     */
    public void setLogCleanupAndCompaction(@jakarta.annotation.Nullable final JsonSchemaKafkaLogCleanupAndCompaction value) {
        this.logCleanupAndCompaction = value;
    }
    /**
     * Sets the log_flush_interval_messages property value. The number of messages accumulated on a log partition before messages are flushed to disk
     * @param value Value to set for the log_flush_interval_messages property.
     */
    public void setLogFlushIntervalMessages(@jakarta.annotation.Nullable final Integer value) {
        this.logFlushIntervalMessages = value;
    }
    /**
     * Sets the log_flush_interval_ms property value. The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used
     * @param value Value to set for the log_flush_interval_ms property.
     */
    public void setLogFlushIntervalMs(@jakarta.annotation.Nullable final Integer value) {
        this.logFlushIntervalMs = value;
    }
    /**
     * Sets the log_index_interval_bytes property value. The interval with which Kafka adds an entry to the offset index
     * @param value Value to set for the log_index_interval_bytes property.
     */
    public void setLogIndexIntervalBytes(@jakarta.annotation.Nullable final Integer value) {
        this.logIndexIntervalBytes = value;
    }
    /**
     * Sets the log_index_size_max_bytes property value. The maximum size in bytes of the offset index
     * @param value Value to set for the log_index_size_max_bytes property.
     */
    public void setLogIndexSizeMaxBytes(@jakarta.annotation.Nullable final Integer value) {
        this.logIndexSizeMaxBytes = value;
    }
    /**
     * Sets the log_local_retention_bytes property value. The maximum size of local log segments that can grow for a partition before it gets eligible for deletion. If set to -2, the value of log.retention.bytes is used. The effective value should always be less than or equal to log.retention.bytes value.
     * @param value Value to set for the log_local_retention_bytes property.
     */
    public void setLogLocalRetentionBytes(@jakarta.annotation.Nullable final Integer value) {
        this.logLocalRetentionBytes = value;
    }
    /**
     * Sets the log_local_retention_ms property value. The number of milliseconds to keep the local log segments before it gets eligible for deletion. If set to -2, the value of log.retention.ms is used. The effective value should always be less than or equal to log.retention.ms value.
     * @param value Value to set for the log_local_retention_ms property.
     */
    public void setLogLocalRetentionMs(@jakarta.annotation.Nullable final Integer value) {
        this.logLocalRetentionMs = value;
    }
    /**
     * Sets the log_message_downconversion_enable property value. This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests. 
     * @param value Value to set for the log_message_downconversion_enable property.
     */
    public void setLogMessageDownconversionEnable(@jakarta.annotation.Nullable final Boolean value) {
        this.logMessageDownconversionEnable = value;
    }
    /**
     * Sets the log_message_timestamp_difference_max_ms property value. The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message
     * @param value Value to set for the log_message_timestamp_difference_max_ms property.
     */
    public void setLogMessageTimestampDifferenceMaxMs(@jakarta.annotation.Nullable final Integer value) {
        this.logMessageTimestampDifferenceMaxMs = value;
    }
    /**
     * Sets the log_message_timestamp_type property value. Define whether the timestamp in the message is message create time or log append time.
     * @param value Value to set for the log_message_timestamp_type property.
     */
    public void setLogMessageTimestampType(@jakarta.annotation.Nullable final JsonSchemaKafkaLogMessageTimestampType value) {
        this.logMessageTimestampType = value;
    }
    /**
     * Sets the log_preallocate property value. Should pre allocate file when create new segment?
     * @param value Value to set for the log_preallocate property.
     */
    public void setLogPreallocate(@jakarta.annotation.Nullable final Boolean value) {
        this.logPreallocate = value;
    }
    /**
     * Sets the log_retention_bytes property value. The maximum size of the log before deleting messages
     * @param value Value to set for the log_retention_bytes property.
     */
    public void setLogRetentionBytes(@jakarta.annotation.Nullable final Integer value) {
        this.logRetentionBytes = value;
    }
    /**
     * Sets the log_retention_hours property value. The number of hours to keep a log file before deleting it
     * @param value Value to set for the log_retention_hours property.
     */
    public void setLogRetentionHours(@jakarta.annotation.Nullable final Integer value) {
        this.logRetentionHours = value;
    }
    /**
     * Sets the log_retention_ms property value. The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.
     * @param value Value to set for the log_retention_ms property.
     */
    public void setLogRetentionMs(@jakarta.annotation.Nullable final Integer value) {
        this.logRetentionMs = value;
    }
    /**
     * Sets the log_roll_jitter_ms property value. The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used
     * @param value Value to set for the log_roll_jitter_ms property.
     */
    public void setLogRollJitterMs(@jakarta.annotation.Nullable final Integer value) {
        this.logRollJitterMs = value;
    }
    /**
     * Sets the log_roll_ms property value. The maximum time before a new log segment is rolled out (in milliseconds).
     * @param value Value to set for the log_roll_ms property.
     */
    public void setLogRollMs(@jakarta.annotation.Nullable final Integer value) {
        this.logRollMs = value;
    }
    /**
     * Sets the log_segment_bytes property value. The maximum size of a single log file
     * @param value Value to set for the log_segment_bytes property.
     */
    public void setLogSegmentBytes(@jakarta.annotation.Nullable final Integer value) {
        this.logSegmentBytes = value;
    }
    /**
     * Sets the log_segment_delete_delay_ms property value. The amount of time to wait before deleting a file from the filesystem
     * @param value Value to set for the log_segment_delete_delay_ms property.
     */
    public void setLogSegmentDeleteDelayMs(@jakarta.annotation.Nullable final Integer value) {
        this.logSegmentDeleteDelayMs = value;
    }
    /**
     * Sets the max_connections_per_ip property value. The maximum number of connections allowed from each ip address (defaults to 2147483647).
     * @param value Value to set for the max_connections_per_ip property.
     */
    public void setMaxConnectionsPerIp(@jakarta.annotation.Nullable final Integer value) {
        this.maxConnectionsPerIp = value;
    }
    /**
     * Sets the max_incremental_fetch_session_cache_slots property value. The maximum number of incremental fetch sessions that the broker will maintain.
     * @param value Value to set for the max_incremental_fetch_session_cache_slots property.
     */
    public void setMaxIncrementalFetchSessionCacheSlots(@jakarta.annotation.Nullable final Integer value) {
        this.maxIncrementalFetchSessionCacheSlots = value;
    }
    /**
     * Sets the message_max_bytes property value. The maximum size of message that the server can receive.
     * @param value Value to set for the message_max_bytes property.
     */
    public void setMessageMaxBytes(@jakarta.annotation.Nullable final Integer value) {
        this.messageMaxBytes = value;
    }
    /**
     * Sets the min_insync_replicas property value. When a producer sets acks to 'all' (or '-1'), min.insync.replicas specifies the minimum number of replicas that must acknowledge a write for the write to be considered successful.
     * @param value Value to set for the min_insync_replicas property.
     */
    public void setMinInsyncReplicas(@jakarta.annotation.Nullable final Integer value) {
        this.minInsyncReplicas = value;
    }
    /**
     * Sets the num_partitions property value. Number of partitions for autocreated topics
     * @param value Value to set for the num_partitions property.
     */
    public void setNumPartitions(@jakarta.annotation.Nullable final Integer value) {
        this.numPartitions = value;
    }
    /**
     * Sets the offsets_retention_minutes property value. Log retention window in minutes for offsets topic
     * @param value Value to set for the offsets_retention_minutes property.
     */
    public void setOffsetsRetentionMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.offsetsRetentionMinutes = value;
    }
    /**
     * Sets the producer_purgatory_purge_interval_requests property value. The purge interval (in number of requests) of the producer request purgatory(defaults to 1000).
     * @param value Value to set for the producer_purgatory_purge_interval_requests property.
     */
    public void setProducerPurgatoryPurgeIntervalRequests(@jakarta.annotation.Nullable final Integer value) {
        this.producerPurgatoryPurgeIntervalRequests = value;
    }
    /**
     * Sets the replica_fetch_max_bytes property value. The number of bytes of messages to attempt to fetch for each partition (defaults to 1048576). This is not an absolute maximum, if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made.
     * @param value Value to set for the replica_fetch_max_bytes property.
     */
    public void setReplicaFetchMaxBytes(@jakarta.annotation.Nullable final Integer value) {
        this.replicaFetchMaxBytes = value;
    }
    /**
     * Sets the replica_fetch_response_max_bytes property value. Maximum bytes expected for the entire fetch response (defaults to 10485760). Records are fetched in batches, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made. As such, this is not an absolute maximum.
     * @param value Value to set for the replica_fetch_response_max_bytes property.
     */
    public void setReplicaFetchResponseMaxBytes(@jakarta.annotation.Nullable final Integer value) {
        this.replicaFetchResponseMaxBytes = value;
    }
    /**
     * Sets the sasl_oauthbearer_expected_audience property value. The (optional) comma-delimited setting for the broker to use to verify that the JWT was issued for one of the expected audiences.
     * @param value Value to set for the sasl_oauthbearer_expected_audience property.
     */
    public void setSaslOauthbearerExpectedAudience(@jakarta.annotation.Nullable final String value) {
        this.saslOauthbearerExpectedAudience = value;
    }
    /**
     * Sets the sasl_oauthbearer_expected_issuer property value. Optional setting for the broker to use to verify that the JWT was created by the expected issuer.
     * @param value Value to set for the sasl_oauthbearer_expected_issuer property.
     */
    public void setSaslOauthbearerExpectedIssuer(@jakarta.annotation.Nullable final String value) {
        this.saslOauthbearerExpectedIssuer = value;
    }
    /**
     * Sets the sasl_oauthbearer_jwks_endpoint_url property value. OIDC JWKS endpoint URL. By setting this the SASL SSL OAuth2/OIDC authentication is enabled. See also other options for SASL OAuth2/OIDC. 
     * @param value Value to set for the sasl_oauthbearer_jwks_endpoint_url property.
     */
    public void setSaslOauthbearerJwksEndpointUrl(@jakarta.annotation.Nullable final String value) {
        this.saslOauthbearerJwksEndpointUrl = value;
    }
    /**
     * Sets the sasl_oauthbearer_sub_claim_name property value. Name of the scope from which to extract the subject claim from the JWT. Defaults to sub.
     * @param value Value to set for the sasl_oauthbearer_sub_claim_name property.
     */
    public void setSaslOauthbearerSubClaimName(@jakarta.annotation.Nullable final String value) {
        this.saslOauthbearerSubClaimName = value;
    }
    /**
     * Sets the socket_request_max_bytes property value. The maximum number of bytes in a socket request (defaults to 104857600).
     * @param value Value to set for the socket_request_max_bytes property.
     */
    public void setSocketRequestMaxBytes(@jakarta.annotation.Nullable final Integer value) {
        this.socketRequestMaxBytes = value;
    }
    /**
     * Sets the transaction_remove_expired_transaction_cleanup_interval_ms property value. The interval at which to remove transactions that have expired due to transactional.id.expiration.ms passing (defaults to 3600000 (1 hour)).
     * @param value Value to set for the transaction_remove_expired_transaction_cleanup_interval_ms property.
     */
    public void setTransactionRemoveExpiredTransactionCleanupIntervalMs(@jakarta.annotation.Nullable final Integer value) {
        this.transactionRemoveExpiredTransactionCleanupIntervalMs = value;
    }
    /**
     * Sets the transaction_state_log_segment_bytes property value. The transaction topic segment bytes should be kept relatively small in order to facilitate faster log compaction and cache loads (defaults to 104857600 (100 mebibytes)).
     * @param value Value to set for the transaction_state_log_segment_bytes property.
     */
    public void setTransactionStateLogSegmentBytes(@jakarta.annotation.Nullable final Integer value) {
        this.transactionStateLogSegmentBytes = value;
    }
}
