
# Kafka Connect Configuration Values

## Structure

`KafkaConnectConfigurationValues`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProducerBufferMemory` | `Integer` | Optional | The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).<br>**Constraints**: `>= 5242880`, `<= 134217728` | Integer getProducerBufferMemory() | setProducerBufferMemory(Integer producerBufferMemory) |
| `ConsumerMaxPollIntervalMs` | `Integer` | Optional | The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).<br>**Constraints**: `>= 1`, `<= 2147483647` | Integer getConsumerMaxPollIntervalMs() | setConsumerMaxPollIntervalMs(Integer consumerMaxPollIntervalMs) |
| `ProducerCompressionType` | [`TheDefaultCompressionTypeForProducersEnum`](../../doc/models/the-default-compression-type-for-producers-enum.md) | Optional | Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression. | TheDefaultCompressionTypeForProducersEnum getProducerCompressionType() | setProducerCompressionType(TheDefaultCompressionTypeForProducersEnum producerCompressionType) |
| `ConnectorClientConfigOverridePolicy` | [`ClientConfigOverridePolicyEnum`](../../doc/models/client-config-override-policy-enum.md) | Optional | Defines what client configurations can be overridden by the connector. Default is None | ClientConfigOverridePolicyEnum getConnectorClientConfigOverridePolicy() | setConnectorClientConfigOverridePolicy(ClientConfigOverridePolicyEnum connectorClientConfigOverridePolicy) |
| `OffsetFlushIntervalMs` | `Integer` | Optional | The interval at which to try committing offsets for tasks (defaults to 60000).<br>**Constraints**: `>= 1`, `<= 100000000` | Integer getOffsetFlushIntervalMs() | setOffsetFlushIntervalMs(Integer offsetFlushIntervalMs) |
| `ScheduledRebalanceMaxDelayMs` | `Integer` | Optional | The maximum delay that is scheduled in order to wait for the return of one or more departed workers before rebalancing and reassigning their connectors and tasks to the group. During this period the connectors and tasks of the departed workers remain unassigned.  Defaults to 5 minutes.<br>**Constraints**: `>= 0`, `<= 600000` | Integer getScheduledRebalanceMaxDelayMs() | setScheduledRebalanceMaxDelayMs(Integer scheduledRebalanceMaxDelayMs) |
| `ConsumerFetchMaxBytes` | `Integer` | Optional | Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum.<br>**Constraints**: `>= 1048576`, `<= 104857600` | Integer getConsumerFetchMaxBytes() | setConsumerFetchMaxBytes(Integer consumerFetchMaxBytes) |
| `ConsumerMaxPartitionFetchBytes` | `Integer` | Optional | Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress.<br>**Constraints**: `>= 1048576`, `<= 104857600` | Integer getConsumerMaxPartitionFetchBytes() | setConsumerMaxPartitionFetchBytes(Integer consumerMaxPartitionFetchBytes) |
| `OffsetFlushTimeoutMs` | `Integer` | Optional | Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).<br>**Constraints**: `>= 1`, `<= 2147483647` | Integer getOffsetFlushTimeoutMs() | setOffsetFlushTimeoutMs(Integer offsetFlushTimeoutMs) |
| `ConsumerAutoOffsetReset` | [`ConsumerAutoOffsetResetEnum`](../../doc/models/consumer-auto-offset-reset-enum.md) | Optional | What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest | ConsumerAutoOffsetResetEnum getConsumerAutoOffsetReset() | setConsumerAutoOffsetReset(ConsumerAutoOffsetResetEnum consumerAutoOffsetReset) |
| `ProducerMaxRequestSize` | `Integer` | Optional | This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests.<br>**Constraints**: `>= 131072`, `<= 67108864` | Integer getProducerMaxRequestSize() | setProducerMaxRequestSize(Integer producerMaxRequestSize) |
| `ProducerBatchSize` | `Integer` | Optional | This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will 'linger' for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).<br>**Constraints**: `>= 0`, `<= 5242880` | Integer getProducerBatchSize() | setProducerBatchSize(Integer producerBatchSize) |
| `SessionTimeoutMs` | `Integer` | Optional | The timeout in milliseconds used to detect failures when using Kafka’s group management facilities (defaults to 10000).<br>**Constraints**: `>= 1`, `<= 2147483647` | Integer getSessionTimeoutMs() | setSessionTimeoutMs(Integer sessionTimeoutMs) |
| `ProducerLingerMs` | `Integer` | Optional | This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will 'linger' for the specified time waiting for more records to show up. Defaults to 0.<br>**Constraints**: `>= 0`, `<= 5000` | Integer getProducerLingerMs() | setProducerLingerMs(Integer producerLingerMs) |
| `ConsumerIsolationLevel` | [`ConsumerIsolationLevelEnum`](../../doc/models/consumer-isolation-level-enum.md) | Optional | Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired. | ConsumerIsolationLevelEnum getConsumerIsolationLevel() | setConsumerIsolationLevel(ConsumerIsolationLevelEnum consumerIsolationLevel) |
| `ConsumerMaxPollRecords` | `Integer` | Optional | The maximum number of records returned in a single call to poll() (defaults to 500).<br>**Constraints**: `>= 1`, `<= 10000` | Integer getConsumerMaxPollRecords() | setConsumerMaxPollRecords(Integer consumerMaxPollRecords) |

## Example (as JSON)

```json
{
  "producer_buffer_memory": 8388608,
  "consumer_max_poll_interval_ms": 300000,
  "offset_flush_interval_ms": 60000,
  "scheduled_rebalance_max_delay_ms": 300000,
  "consumer_fetch_max_bytes": 52428800,
  "consumer_max_partition_fetch_bytes": 1048576,
  "offset_flush_timeout_ms": 5000,
  "producer_max_request_size": 1048576,
  "producer_batch_size": 1024,
  "session_timeout_ms": 10000,
  "producer_linger_ms": 100,
  "consumer_max_poll_records": 500,
  "producer_compression_type": "snappy",
  "connector_client_config_override_policy": "None"
}
```

