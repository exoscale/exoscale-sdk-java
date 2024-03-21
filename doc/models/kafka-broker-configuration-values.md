
# Kafka Broker Configuration Values

## Structure

`KafkaBrokerConfigurationValues`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SaslOauthbearerExpectedAudience` | `String` | Optional | The (optional) comma-delimited setting for the broker to use to verify that the JWT was issued for one of the expected audiences.<br>**Constraints**: *Maximum Length*: `128` | String getSaslOauthbearerExpectedAudience() | setSaslOauthbearerExpectedAudience(String saslOauthbearerExpectedAudience) |
| `GroupMaxSessionTimeoutMs` | `Integer` | Optional | The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.<br>**Constraints**: `>= 0`, `<= 1800000` | Integer getGroupMaxSessionTimeoutMs() | setGroupMaxSessionTimeoutMs(Integer groupMaxSessionTimeoutMs) |
| `LogFlushIntervalMessages` | `Long` | Optional | The number of messages accumulated on a log partition before messages are flushed to disk<br>**Constraints**: `>= 1`, `<= 9.223372036854776E+18` | Long getLogFlushIntervalMessages() | setLogFlushIntervalMessages(Long logFlushIntervalMessages) |
| `SaslOauthbearerJwksEndpointUrl` | `String` | Optional | OIDC JWKS endpoint URL. By setting this the SASL SSL OAuth2/OIDC authentication is enabled. See also other options for SASL OAuth2/OIDC.<br>**Constraints**: *Maximum Length*: `2048` | String getSaslOauthbearerJwksEndpointUrl() | setSaslOauthbearerJwksEndpointUrl(String saslOauthbearerJwksEndpointUrl) |
| `MaxConnectionsPerIp` | `Integer` | Optional | The maximum number of connections allowed from each ip address (defaults to 2147483647).<br>**Constraints**: `>= 256`, `<= 2147483647` | Integer getMaxConnectionsPerIp() | setMaxConnectionsPerIp(Integer maxConnectionsPerIp) |
| `SaslOauthbearerExpectedIssuer` | `String` | Optional | Optional setting for the broker to use to verify that the JWT was created by the expected issuer.<br>**Constraints**: *Maximum Length*: `128` | String getSaslOauthbearerExpectedIssuer() | setSaslOauthbearerExpectedIssuer(String saslOauthbearerExpectedIssuer) |
| `LogIndexSizeMaxBytes` | `Integer` | Optional | The maximum size in bytes of the offset index<br>**Constraints**: `>= 1048576`, `<= 104857600` | Integer getLogIndexSizeMaxBytes() | setLogIndexSizeMaxBytes(Integer logIndexSizeMaxBytes) |
| `AutoCreateTopicsEnable` | `Boolean` | Optional | Enable auto creation of topics | Boolean getAutoCreateTopicsEnable() | setAutoCreateTopicsEnable(Boolean autoCreateTopicsEnable) |
| `LogIndexIntervalBytes` | `Integer` | Optional | The interval with which Kafka adds an entry to the offset index<br>**Constraints**: `>= 0`, `<= 104857600` | Integer getLogIndexIntervalBytes() | setLogIndexIntervalBytes(Integer logIndexIntervalBytes) |
| `ReplicaFetchMaxBytes` | `Integer` | Optional | The number of bytes of messages to attempt to fetch for each partition (defaults to 1048576). This is not an absolute maximum, if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made.<br>**Constraints**: `>= 1048576`, `<= 104857600` | Integer getReplicaFetchMaxBytes() | setReplicaFetchMaxBytes(Integer replicaFetchMaxBytes) |
| `NumPartitions` | `Integer` | Optional | Number of partitions for autocreated topics<br>**Constraints**: `>= 1`, `<= 1000` | Integer getNumPartitions() | setNumPartitions(Integer numPartitions) |
| `TransactionStateLogSegmentBytes` | `Integer` | Optional | The transaction topic segment bytes should be kept relatively small in order to facilitate faster log compaction and cache loads (defaults to 104857600 (100 mebibytes)).<br>**Constraints**: `>= 1048576`, `<= 2147483647` | Integer getTransactionStateLogSegmentBytes() | setTransactionStateLogSegmentBytes(Integer transactionStateLogSegmentBytes) |
| `ReplicaFetchResponseMaxBytes` | `Integer` | Optional | Maximum bytes expected for the entire fetch response (defaults to 10485760). Records are fetched in batches, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made. As such, this is not an absolute maximum.<br>**Constraints**: `>= 10485760`, `<= 1048576000` | Integer getReplicaFetchResponseMaxBytes() | setReplicaFetchResponseMaxBytes(Integer replicaFetchResponseMaxBytes) |
| `LogMessageTimestampType` | [`LogMessageTimestampTypeEnum`](../../doc/models/log-message-timestamp-type-enum.md) | Optional | Define whether the timestamp in the message is message create time or log append time. | LogMessageTimestampTypeEnum getLogMessageTimestampType() | setLogMessageTimestampType(LogMessageTimestampTypeEnum logMessageTimestampType) |
| `ConnectionsMaxIdleMs` | `Integer` | Optional | Idle connections timeout: the server socket processor threads close the connections that idle for longer than this.<br>**Constraints**: `>= 1000`, `<= 3600000` | Integer getConnectionsMaxIdleMs() | setConnectionsMaxIdleMs(Integer connectionsMaxIdleMs) |
| `LogFlushIntervalMs` | `Integer` | Optional | The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used<br>**Constraints**: `>= 0`, `<= 9.223372036854776E+18` | Integer getLogFlushIntervalMs() | setLogFlushIntervalMs(Integer logFlushIntervalMs) |
| `LogPreallocate` | `Boolean` | Optional | Should pre allocate file when create new segment? | Boolean getLogPreallocate() | setLogPreallocate(Boolean logPreallocate) |
| `LogSegmentDeleteDelayMs` | `Integer` | Optional | The amount of time to wait before deleting a file from the filesystem<br>**Constraints**: `>= 0`, `<= 3600000` | Integer getLogSegmentDeleteDelayMs() | setLogSegmentDeleteDelayMs(Integer logSegmentDeleteDelayMs) |
| `MessageMaxBytes` | `Integer` | Optional | The maximum size of message that the server can receive.<br>**Constraints**: `>= 0`, `<= 100001200` | Integer getMessageMaxBytes() | setMessageMaxBytes(Integer messageMaxBytes) |
| `GroupInitialRebalanceDelayMs` | `Integer` | Optional | The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time.<br>**Constraints**: `>= 0`, `<= 300000` | Integer getGroupInitialRebalanceDelayMs() | setGroupInitialRebalanceDelayMs(Integer groupInitialRebalanceDelayMs) |
| `LogLocalRetentionBytes` | `Integer` | Optional | The maximum size of local log segments that can grow for a partition before it gets eligible for deletion. If set to -2, the value of log.retention.bytes is used. The effective value should always be less than or equal to log.retention.bytes value.<br>**Constraints**: `>= -2`, `<= 9.223372036854776E+18` | Integer getLogLocalRetentionBytes() | setLogLocalRetentionBytes(Integer logLocalRetentionBytes) |
| `LogRollJitterMs` | `Integer` | Optional | The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used<br>**Constraints**: `>= 0`, `<= 9.223372036854776E+18` | Integer getLogRollJitterMs() | setLogRollJitterMs(Integer logRollJitterMs) |
| `TransactionRemoveExpiredTransactionCleanupIntervalMs` | `Integer` | Optional | The interval at which to remove transactions that have expired due to transactional.id.expiration.ms passing (defaults to 3600000 (1 hour)).<br>**Constraints**: `>= 600000`, `<= 3600000` | Integer getTransactionRemoveExpiredTransactionCleanupIntervalMs() | setTransactionRemoveExpiredTransactionCleanupIntervalMs(Integer transactionRemoveExpiredTransactionCleanupIntervalMs) |
| `DefaultReplicationFactor` | `Integer` | Optional | Replication factor for autocreated topics<br>**Constraints**: `>= 1`, `<= 10` | Integer getDefaultReplicationFactor() | setDefaultReplicationFactor(Integer defaultReplicationFactor) |
| `LogRollMs` | `Integer` | Optional | The maximum time before a new log segment is rolled out (in milliseconds).<br>**Constraints**: `>= 1`, `<= 9.223372036854776E+18` | Integer getLogRollMs() | setLogRollMs(Integer logRollMs) |
| `ProducerPurgatoryPurgeIntervalRequests` | `Integer` | Optional | The purge interval (in number of requests) of the producer request purgatory(defaults to 1000).<br>**Constraints**: `>= 10`, `<= 10000` | Integer getProducerPurgatoryPurgeIntervalRequests() | setProducerPurgatoryPurgeIntervalRequests(Integer producerPurgatoryPurgeIntervalRequests) |
| `LogRetentionBytes` | `Integer` | Optional | The maximum size of the log before deleting messages<br>**Constraints**: `>= -1`, `<= 9.223372036854776E+18` | Integer getLogRetentionBytes() | setLogRetentionBytes(Integer logRetentionBytes) |
| `MinInsyncReplicas` | `Integer` | Optional | When a producer sets acks to 'all' (or '-1'), min.insync.replicas specifies the minimum number of replicas that must acknowledge a write for the write to be considered successful.<br>**Constraints**: `>= 1`, `<= 7` | Integer getMinInsyncReplicas() | setMinInsyncReplicas(Integer minInsyncReplicas) |
| `CompressionType` | [`CompressionTypeEnum`](../../doc/models/compression-type-enum.md) | Optional | Specify the final compression type for a given topic. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'uncompressed' which is equivalent to no compression; and 'producer' which means retain the original compression codec set by the producer. | CompressionTypeEnum getCompressionType() | setCompressionType(CompressionTypeEnum compressionType) |
| `LogMessageTimestampDifferenceMaxMs` | `Integer` | Optional | The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message<br>**Constraints**: `>= 0`, `<= 9.223372036854776E+18` | Integer getLogMessageTimestampDifferenceMaxMs() | setLogMessageTimestampDifferenceMaxMs(Integer logMessageTimestampDifferenceMaxMs) |
| `LogLocalRetentionMs` | `Integer` | Optional | The number of milliseconds to keep the local log segments before it gets eligible for deletion. If set to -2, the value of log.retention.ms is used. The effective value should always be less than or equal to log.retention.ms value.<br>**Constraints**: `>= -2`, `<= 9.223372036854776E+18` | Integer getLogLocalRetentionMs() | setLogLocalRetentionMs(Integer logLocalRetentionMs) |
| `LogMessageDownconversionEnable` | `Boolean` | Optional | This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests. | Boolean getLogMessageDownconversionEnable() | setLogMessageDownconversionEnable(Boolean logMessageDownconversionEnable) |
| `SaslOauthbearerSubClaimName` | `String` | Optional | Name of the scope from which to extract the subject claim from the JWT. Defaults to sub.<br>**Constraints**: *Maximum Length*: `128` | String getSaslOauthbearerSubClaimName() | setSaslOauthbearerSubClaimName(String saslOauthbearerSubClaimName) |
| `MaxIncrementalFetchSessionCacheSlots` | `Integer` | Optional | The maximum number of incremental fetch sessions that the broker will maintain.<br>**Constraints**: `>= 1000`, `<= 10000` | Integer getMaxIncrementalFetchSessionCacheSlots() | setMaxIncrementalFetchSessionCacheSlots(Integer maxIncrementalFetchSessionCacheSlots) |
| `LogRetentionHours` | `Integer` | Optional | The number of hours to keep a log file before deleting it<br>**Constraints**: `>= -1`, `<= 2147483647` | Integer getLogRetentionHours() | setLogRetentionHours(Integer logRetentionHours) |
| `GroupMinSessionTimeoutMs` | `Integer` | Optional | The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures.<br>**Constraints**: `>= 0`, `<= 60000` | Integer getGroupMinSessionTimeoutMs() | setGroupMinSessionTimeoutMs(Integer groupMinSessionTimeoutMs) |
| `SocketRequestMaxBytes` | `Integer` | Optional | The maximum number of bytes in a socket request (defaults to 104857600).<br>**Constraints**: `>= 10485760`, `<= 209715200` | Integer getSocketRequestMaxBytes() | setSocketRequestMaxBytes(Integer socketRequestMaxBytes) |
| `LogSegmentBytes` | `Integer` | Optional | The maximum size of a single log file<br>**Constraints**: `>= 10485760`, `<= 1073741824` | Integer getLogSegmentBytes() | setLogSegmentBytes(Integer logSegmentBytes) |
| `LogCleanupAndCompaction` | [`ConfigureLogCleanerForTopicCompaction`](../../doc/models/configure-log-cleaner-for-topic-compaction.md) | Optional | - | ConfigureLogCleanerForTopicCompaction getLogCleanupAndCompaction() | setLogCleanupAndCompaction(ConfigureLogCleanerForTopicCompaction logCleanupAndCompaction) |
| `OffsetsRetentionMinutes` | `Integer` | Optional | Log retention window in minutes for offsets topic<br>**Constraints**: `>= 1`, `<= 2147483647` | Integer getOffsetsRetentionMinutes() | setOffsetsRetentionMinutes(Integer offsetsRetentionMinutes) |
| `LogRetentionMs` | `Integer` | Optional | The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied.<br>**Constraints**: `>= -1`, `<= 9.223372036854776E+18` | Integer getLogRetentionMs() | setLogRetentionMs(Integer logRetentionMs) |

## Example (as JSON)

```json
{
  "group_max_session_timeout_ms": 1800000,
  "log_flush_interval_messages": 9223372036854775807,
  "log_index_size_max_bytes": 10485760,
  "auto_create_topics_enable": true,
  "log_index_interval_bytes": 4096,
  "transaction_state_log_segment_bytes": 104857600,
  "connections_max_idle_ms": 540000,
  "log_preallocate": false,
  "log_segment_delete_delay_ms": 60000,
  "message_max_bytes": 1048588,
  "group_initial_rebalance_delay_ms": 3000,
  "transaction_remove_expired_transaction_cleanup_interval_ms": 3600000,
  "min_insync_replicas": 1,
  "log_message_downconversion_enable": true,
  "max_incremental_fetch_session_cache_slots": 1000,
  "group_min_session_timeout_ms": 6000,
  "offsets_retention_minutes": 10080,
  "sasl_oauthbearer_expected_audience": "sasl_oauthbearer_expected_audience4",
  "sasl_oauthbearer_jwks_endpoint_url": "sasl_oauthbearer_jwks_endpoint_url6",
  "max_connections_per_ip": 116
}
```

