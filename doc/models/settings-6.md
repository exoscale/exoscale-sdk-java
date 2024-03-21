
# Settings 6

## Structure

`Settings6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Kafka` | [`Kafka`](../../doc/models/kafka.md) | Optional | Kafka broker configuration values | Kafka getKafka() | setKafka(Kafka kafka) |
| `KafkaConnect` | [`KafkaConnect`](../../doc/models/kafka-connect.md) | Optional | Kafka Connect configuration values | KafkaConnect getKafkaConnect() | setKafkaConnect(KafkaConnect kafkaConnect) |
| `KafkaRest` | [`KafkaRest`](../../doc/models/kafka-rest.md) | Optional | Kafka REST configuration | KafkaRest getKafkaRest() | setKafkaRest(KafkaRest kafkaRest) |
| `SchemaRegistry` | [`SchemaRegistry`](../../doc/models/schema-registry.md) | Optional | Schema Registry configuration | SchemaRegistry getSchemaRegistry() | setSchemaRegistry(SchemaRegistry schemaRegistry) |

## Example (as JSON)

```json
{
  "kafka": {
    "properties": {
      "key1": "val1",
      "key2": "val2"
    },
    "additionalProperties": false,
    "type": "type8",
    "title": "title2"
  },
  "kafka-connect": {
    "properties": {
      "key1": "val1",
      "key2": "val2"
    },
    "additionalProperties": false,
    "type": "type8",
    "title": "title8"
  },
  "kafka-rest": {
    "properties": {
      "key1": "val1",
      "key2": "val2"
    },
    "additionalProperties": false,
    "type": "type8",
    "title": "title8"
  },
  "schema-registry": {
    "properties": {
      "key1": "val1",
      "key2": "val2"
    },
    "additionalProperties": false,
    "type": "type0",
    "title": "title6"
  }
}
```

