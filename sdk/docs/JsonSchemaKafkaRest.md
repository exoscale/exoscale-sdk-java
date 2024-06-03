

# JsonSchemaKafkaRest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**producerCompressionType** | [**ProducerCompressionTypeEnum**](#ProducerCompressionTypeEnum) | Specify the default compression type for producers. This configuration accepts the standard compression codecs (&#39;gzip&#39;, &#39;snappy&#39;, &#39;lz4&#39;, &#39;zstd&#39;). It additionally accepts &#39;none&#39; which is the default and equivalent to no compression. |  [optional] |
|**nameStrategyValidation** | **Boolean** | If true, validate that given schema is registered under expected subject name by the used name strategy when producing messages. |  [optional] |
|**nameStrategy** | [**NameStrategyEnum**](#NameStrategyEnum) | Name strategy to use when selecting subject for storing schemas |  [optional] |
|**consumerEnableAutoCommit** | **Boolean** | If true the consumer&#39;s offset will be periodically committed to Kafka in the background |  [optional] |
|**producerAcks** | [**ProducerAcksEnum**](#ProducerAcksEnum) | The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to &#39;all&#39; or &#39;-1&#39;, the leader will wait for the full set of in-sync replicas to acknowledge the record. |  [optional] |
|**consumerRequestMaxBytes** | **Integer** | Maximum number of bytes in unencoded message keys and values by a single request |  [optional] |
|**producerMaxRequestSize** | **Integer** | The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size. |  [optional] |
|**simpleconsumerPoolSizeMax** | **Integer** | Maximum number of SimpleConsumers that can be instantiated per broker |  [optional] |
|**producerLingerMs** | **Integer** | Wait for up to the given delay to allow batching records together |  [optional] |
|**consumerRequestTimeoutMs** | [**ConsumerRequestTimeoutMsEnum**](#ConsumerRequestTimeoutMsEnum) | The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached |  [optional] |



## Enum: ProducerCompressionTypeEnum

| Name | Value |
|---- | -----|
| GZIP | &quot;gzip&quot; |
| SNAPPY | &quot;snappy&quot; |
| LZ4 | &quot;lz4&quot; |
| ZSTD | &quot;zstd&quot; |
| NONE | &quot;none&quot; |



## Enum: NameStrategyEnum

| Name | Value |
|---- | -----|
| TOPIC_NAME | &quot;topic_name&quot; |
| RECORD_NAME | &quot;record_name&quot; |
| TOPIC_RECORD_NAME | &quot;topic_record_name&quot; |



## Enum: ProducerAcksEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| _1 | &quot;-1&quot; |
| _0 | &quot;0&quot; |
| _12 | &quot;1&quot; |



## Enum: ConsumerRequestTimeoutMsEnum

| Name | Value |
|---- | -----|
| NUMBER_1000 | 1000 |
| NUMBER_15000 | 15000 |
| NUMBER_30000 | 30000 |



