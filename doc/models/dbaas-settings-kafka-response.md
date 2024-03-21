
# Dbaas Settings Kafka Response

## Structure

`DbaasSettingsKafkaResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Settings` | [`Settings6`](../../doc/models/settings-6.md) | Optional | - | Settings6 getSettings() | setSettings(Settings6 settings) |

## Example (as JSON)

```json
{
  "settings": {
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
}
```

