# JsonSchemaKafkaRest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**producerAcks** | [**ProducerAcksEnum**](#ProducerAcksEnum) | The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to &#x27;all&#x27; or &#x27;-1&#x27;, the leader will wait for the full set of in-sync replicas to acknowledge the record. |  [optional]
**producerCompressionType** | [**ProducerCompressionTypeEnum**](#ProducerCompressionTypeEnum) | Specify the default compression type for producers. This configuration accepts the standard compression codecs (&#x27;gzip&#x27;, &#x27;snappy&#x27;, &#x27;lz4&#x27;, &#x27;zstd&#x27;). It additionally accepts &#x27;none&#x27; which is the default and equivalent to no compression. |  [optional]
**producerLingerMs** | **Integer** | Wait for up to the given delay to allow batching records together |  [optional]
**producerMaxRequestSize** | **Integer** | The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size. |  [optional]
**consumerEnableAutoCommit** | **Boolean** | If true the consumer&#x27;s offset will be periodically committed to Kafka in the background |  [optional]
**consumerRequestMaxBytes** | **Integer** | Maximum number of bytes in unencoded message keys and values by a single request |  [optional]
**consumerRequestTimeoutMs** | [**ConsumerRequestTimeoutMsEnum**](#ConsumerRequestTimeoutMsEnum) | The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached |  [optional]
**simpleconsumerPoolSizeMax** | **Integer** | Maximum number of SimpleConsumers that can be instantiated per broker |  [optional]

<a name="ProducerAcksEnum"></a>
## Enum: ProducerAcksEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
_1 | &quot;-1&quot;
_0 | &quot;0&quot;
_1_3 | &quot;1&quot;

<a name="ProducerCompressionTypeEnum"></a>
## Enum: ProducerCompressionTypeEnum
Name | Value
---- | -----
GZIP | &quot;gzip&quot;
SNAPPY | &quot;snappy&quot;
LZ4 | &quot;lz4&quot;
ZSTD | &quot;zstd&quot;
NONE | &quot;none&quot;

<a name="ConsumerRequestTimeoutMsEnum"></a>
## Enum: ConsumerRequestTimeoutMsEnum
Name | Value
---- | -----
NUMBER_1000 | 1000
NUMBER_15000 | 15000
NUMBER_30000 | 30000
