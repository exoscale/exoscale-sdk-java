
# Kafka REST Configuration

## Structure

`KafkaRESTConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProducerAcks` | [`ProducerAcksEnum`](../../doc/models/producer-acks-enum.md) | Optional | The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to 'all' or '-1', the leader will wait for the full set of in-sync replicas to acknowledge the record.<br>**Default**: `ProducerAcksEnum.ENUM_11` | ProducerAcksEnum getProducerAcks() | setProducerAcks(ProducerAcksEnum producerAcks) |
| `ProducerCompressionType` | [`ProducerCompressionTypeEnum`](../../doc/models/producer-compression-type-enum.md) | Optional | Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression. | ProducerCompressionTypeEnum getProducerCompressionType() | setProducerCompressionType(ProducerCompressionTypeEnum producerCompressionType) |
| `ProducerLingerMs` | `Integer` | Optional | Wait for up to the given delay to allow batching records together<br>**Default**: `0`<br>**Constraints**: `>= 0`, `<= 5000` | Integer getProducerLingerMs() | setProducerLingerMs(Integer producerLingerMs) |
| `ProducerMaxRequestSize` | `Integer` | Optional | The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size.<br>**Default**: `1048576`<br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getProducerMaxRequestSize() | setProducerMaxRequestSize(Integer producerMaxRequestSize) |
| `ConsumerEnableAutoCommit` | `Boolean` | Optional | If true the consumer's offset will be periodically committed to Kafka in the background<br>**Default**: `true` | Boolean getConsumerEnableAutoCommit() | setConsumerEnableAutoCommit(Boolean consumerEnableAutoCommit) |
| `ConsumerRequestMaxBytes` | `Integer` | Optional | Maximum number of bytes in unencoded message keys and values by a single request<br>**Default**: `67108864`<br>**Constraints**: `>= 0`, `<= 671088640` | Integer getConsumerRequestMaxBytes() | setConsumerRequestMaxBytes(Integer consumerRequestMaxBytes) |
| `ConsumerRequestTimeoutMs` | [`ConsumerRequestTimeoutMsEnum`](../../doc/models/consumer-request-timeout-ms-enum.md) | Optional | The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached<br>**Default**: `ConsumerRequestTimeoutMsEnum.ENUM_1000` | ConsumerRequestTimeoutMsEnum getConsumerRequestTimeoutMs() | setConsumerRequestTimeoutMs(ConsumerRequestTimeoutMsEnum consumerRequestTimeoutMs) |
| `SimpleconsumerPoolSizeMax` | `Integer` | Optional | Maximum number of SimpleConsumers that can be instantiated per broker<br>**Default**: `25`<br>**Constraints**: `>= 10`, `<= 250` | Integer getSimpleconsumerPoolSizeMax() | setSimpleconsumerPoolSizeMax(Integer simpleconsumerPoolSizeMax) |

## Example (as JSON)

```json
{
  "producer_acks": "1",
  "producer_linger_ms": 0,
  "producer_max_request_size": 1048576,
  "consumer_enable_auto_commit": true,
  "consumer_request_max_bytes": 67108864,
  "consumer_request_timeout_ms": 1000,
  "simpleconsumer_pool_size_max": 25,
  "producer_compression_type": "snappy"
}
```

