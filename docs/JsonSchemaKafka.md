# JsonSchemaKafka

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**saslOauthbearerExpectedAudience** | **String** | The (optional) comma-delimited setting for the broker to use to verify that the JWT was issued for one of the expected audiences. |  [optional]
**groupMaxSessionTimeoutMs** | **Integer** | The maximum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures. |  [optional]
**logFlushIntervalMessages** | **Integer** | The number of messages accumulated on a log partition before messages are flushed to disk |  [optional]
**saslOauthbearerJwksEndpointUrl** | **String** | OIDC JWKS endpoint URL. By setting this the SASL SSL OAuth2/OIDC authentication is enabled. See also other options for SASL OAuth2/OIDC.  |  [optional]
**maxConnectionsPerIp** | **Integer** | The maximum number of connections allowed from each ip address (defaults to 2147483647). |  [optional]
**saslOauthbearerExpectedIssuer** | **String** | Optional setting for the broker to use to verify that the JWT was created by the expected issuer. |  [optional]
**logIndexSizeMaxBytes** | **Integer** | The maximum size in bytes of the offset index |  [optional]
**autoCreateTopicsEnable** | **Boolean** | Enable auto creation of topics |  [optional]
**logIndexIntervalBytes** | **Integer** | The interval with which Kafka adds an entry to the offset index |  [optional]
**replicaFetchMaxBytes** | **Integer** | The number of bytes of messages to attempt to fetch for each partition (defaults to 1048576). This is not an absolute maximum, if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made. |  [optional]
**numPartitions** | **Integer** | Number of partitions for autocreated topics |  [optional]
**transactionStateLogSegmentBytes** | **Integer** | The transaction topic segment bytes should be kept relatively small in order to facilitate faster log compaction and cache loads (defaults to 104857600 (100 mebibytes)). |  [optional]
**replicaFetchResponseMaxBytes** | **Integer** | Maximum bytes expected for the entire fetch response (defaults to 10485760). Records are fetched in batches, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that progress can be made. As such, this is not an absolute maximum. |  [optional]
**logMessageTimestampType** | [**LogMessageTimestampTypeEnum**](#LogMessageTimestampTypeEnum) | Define whether the timestamp in the message is message create time or log append time. |  [optional]
**connectionsMaxIdleMs** | **Integer** | Idle connections timeout: the server socket processor threads close the connections that idle for longer than this. |  [optional]
**logFlushIntervalMs** | **Integer** | The maximum time in ms that a message in any topic is kept in memory before flushed to disk. If not set, the value in log.flush.scheduler.interval.ms is used |  [optional]
**logPreallocate** | **Boolean** | Should pre allocate file when create new segment? |  [optional]
**logSegmentDeleteDelayMs** | **Integer** | The amount of time to wait before deleting a file from the filesystem |  [optional]
**messageMaxBytes** | **Integer** | The maximum size of message that the server can receive. |  [optional]
**groupInitialRebalanceDelayMs** | **Integer** | The amount of time, in milliseconds, the group coordinator will wait for more consumers to join a new group before performing the first rebalance. A longer delay means potentially fewer rebalances, but increases the time until processing begins. The default value for this is 3 seconds. During development and testing it might be desirable to set this to 0 in order to not delay test execution time. |  [optional]
**logLocalRetentionBytes** | **Integer** | The maximum size of local log segments that can grow for a partition before it gets eligible for deletion. If set to -2, the value of log.retention.bytes is used. The effective value should always be less than or equal to log.retention.bytes value. |  [optional]
**logRollJitterMs** | **Integer** | The maximum jitter to subtract from logRollTimeMillis (in milliseconds). If not set, the value in log.roll.jitter.hours is used |  [optional]
**transactionRemoveExpiredTransactionCleanupIntervalMs** | **Integer** | The interval at which to remove transactions that have expired due to transactional.id.expiration.ms passing (defaults to 3600000 (1 hour)). |  [optional]
**defaultReplicationFactor** | **Integer** | Replication factor for autocreated topics |  [optional]
**logRollMs** | **Integer** | The maximum time before a new log segment is rolled out (in milliseconds). |  [optional]
**producerPurgatoryPurgeIntervalRequests** | **Integer** | The purge interval (in number of requests) of the producer request purgatory(defaults to 1000). |  [optional]
**logRetentionBytes** | **Integer** | The maximum size of the log before deleting messages |  [optional]
**minInsyncReplicas** | **Integer** | When a producer sets acks to &#x27;all&#x27; (or &#x27;-1&#x27;), min.insync.replicas specifies the minimum number of replicas that must acknowledge a write for the write to be considered successful. |  [optional]
**compressionType** | [**CompressionTypeEnum**](#CompressionTypeEnum) | Specify the final compression type for a given topic. This configuration accepts the standard compression codecs (&#x27;gzip&#x27;, &#x27;snappy&#x27;, &#x27;lz4&#x27;, &#x27;zstd&#x27;). It additionally accepts &#x27;uncompressed&#x27; which is equivalent to no compression; and &#x27;producer&#x27; which means retain the original compression codec set by the producer. |  [optional]
**logMessageTimestampDifferenceMaxMs** | **Integer** | The maximum difference allowed between the timestamp when a broker receives a message and the timestamp specified in the message |  [optional]
**logLocalRetentionMs** | **Integer** | The number of milliseconds to keep the local log segments before it gets eligible for deletion. If set to -2, the value of log.retention.ms is used. The effective value should always be less than or equal to log.retention.ms value. |  [optional]
**logMessageDownconversionEnable** | **Boolean** | This configuration controls whether down-conversion of message formats is enabled to satisfy consume requests.  |  [optional]
**saslOauthbearerSubClaimName** | **String** | Name of the scope from which to extract the subject claim from the JWT. Defaults to sub. |  [optional]
**maxIncrementalFetchSessionCacheSlots** | **Integer** | The maximum number of incremental fetch sessions that the broker will maintain. |  [optional]
**logRetentionHours** | **Integer** | The number of hours to keep a log file before deleting it |  [optional]
**groupMinSessionTimeoutMs** | **Integer** | The minimum allowed session timeout for registered consumers. Longer timeouts give consumers more time to process messages in between heartbeats at the cost of a longer time to detect failures. |  [optional]
**socketRequestMaxBytes** | **Integer** | The maximum number of bytes in a socket request (defaults to 104857600). |  [optional]
**logSegmentBytes** | **Integer** | The maximum size of a single log file |  [optional]
**logCleanupAndCompaction** | [**ConfigureLogCleanerForTopicCompaction**](ConfigureLogCleanerForTopicCompaction.md) |  |  [optional]
**offsetsRetentionMinutes** | **Integer** | Log retention window in minutes for offsets topic |  [optional]
**logRetentionMs** | **Integer** | The number of milliseconds to keep a log file before deleting it (in milliseconds), If not set, the value in log.retention.minutes is used. If set to -1, no time limit is applied. |  [optional]

<a name="LogMessageTimestampTypeEnum"></a>
## Enum: LogMessageTimestampTypeEnum
Name | Value
---- | -----
CREATETIME | &quot;CreateTime&quot;
LOGAPPENDTIME | &quot;LogAppendTime&quot;

<a name="CompressionTypeEnum"></a>
## Enum: CompressionTypeEnum
Name | Value
---- | -----
GZIP | &quot;gzip&quot;
SNAPPY | &quot;snappy&quot;
LZ4 | &quot;lz4&quot;
ZSTD | &quot;zstd&quot;
UNCOMPRESSED | &quot;uncompressed&quot;
PRODUCER | &quot;producer&quot;
