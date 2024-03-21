# JsonSchemaKafkaConnect

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**producerBufferMemory** | **Integer** | The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432). |  [optional]
**consumerMaxPollIntervalMs** | **Integer** | The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000). |  [optional]
**producerCompressionType** | [**ProducerCompressionTypeEnum**](#ProducerCompressionTypeEnum) | Specify the default compression type for producers. This configuration accepts the standard compression codecs (&#x27;gzip&#x27;, &#x27;snappy&#x27;, &#x27;lz4&#x27;, &#x27;zstd&#x27;). It additionally accepts &#x27;none&#x27; which is the default and equivalent to no compression. |  [optional]
**connectorClientConfigOverridePolicy** | [**ConnectorClientConfigOverridePolicyEnum**](#ConnectorClientConfigOverridePolicyEnum) | Defines what client configurations can be overridden by the connector. Default is None |  [optional]
**offsetFlushIntervalMs** | **Integer** | The interval at which to try committing offsets for tasks (defaults to 60000). |  [optional]
**scheduledRebalanceMaxDelayMs** | **Integer** | The maximum delay that is scheduled in order to wait for the return of one or more departed workers before rebalancing and reassigning their connectors and tasks to the group. During this period the connectors and tasks of the departed workers remain unassigned.  Defaults to 5 minutes. |  [optional]
**consumerFetchMaxBytes** | **Integer** | Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum. |  [optional]
**consumerMaxPartitionFetchBytes** | **Integer** | Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress.  |  [optional]
**offsetFlushTimeoutMs** | **Integer** | Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000). |  [optional]
**consumerAutoOffsetReset** | [**ConsumerAutoOffsetResetEnum**](#ConsumerAutoOffsetResetEnum) | What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest |  [optional]
**producerMaxRequestSize** | **Integer** | This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests. |  [optional]
**producerBatchSize** | **Integer** | This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will &#x27;linger&#x27; for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384). |  [optional]
**sessionTimeoutMs** | **Integer** | The timeout in milliseconds used to detect failures when using Kafka’s group management facilities (defaults to 10000). |  [optional]
**producerLingerMs** | **Integer** | This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will &#x27;linger&#x27; for the specified time waiting for more records to show up. Defaults to 0. |  [optional]
**consumerIsolationLevel** | [**ConsumerIsolationLevelEnum**](#ConsumerIsolationLevelEnum) | Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired. |  [optional]
**consumerMaxPollRecords** | **Integer** | The maximum number of records returned in a single call to poll() (defaults to 500). |  [optional]

<a name="ProducerCompressionTypeEnum"></a>
## Enum: ProducerCompressionTypeEnum
Name | Value
---- | -----
GZIP | &quot;gzip&quot;
SNAPPY | &quot;snappy&quot;
LZ4 | &quot;lz4&quot;
ZSTD | &quot;zstd&quot;
NONE | &quot;none&quot;

<a name="ConnectorClientConfigOverridePolicyEnum"></a>
## Enum: ConnectorClientConfigOverridePolicyEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
ALL | &quot;All&quot;

<a name="ConsumerAutoOffsetResetEnum"></a>
## Enum: ConsumerAutoOffsetResetEnum
Name | Value
---- | -----
EARLIEST | &quot;earliest&quot;
LATEST | &quot;latest&quot;

<a name="ConsumerIsolationLevelEnum"></a>
## Enum: ConsumerIsolationLevelEnum
Name | Value
---- | -----
UNCOMMITTED | &quot;read_uncommitted&quot;
COMMITTED | &quot;read_committed&quot;
