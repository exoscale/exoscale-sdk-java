
# Dbaas Settings Pg Response

## Structure

`DbaasSettingsPgResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Settings` | [`Settings5`](../../doc/models/settings-5.md) | Optional | - | Settings5 getSettings() | setSettings(Settings5 settings) |

## Example (as JSON)

```json
{
  "settings": {
    "pg": {
      "properties": {
        "key1": "val1",
        "key2": "val2"
      },
      "additionalProperties": false,
      "type": "type2",
      "title": "title4"
    },
    "pglookout": {
      "properties": {
        "key1": "val1",
        "key2": "val2"
      },
      "additionalProperties": false,
      "type": "type4",
      "title": "title8"
    },
    "pgbouncer": {
      "properties": {
        "key1": "val1",
        "key2": "val2"
      },
      "additionalProperties": false,
      "type": "type0",
      "title": "title6"
    },
    "timescaledb": {
      "properties": {
        "key1": "val1",
        "key2": "val2"
      },
      "additionalProperties": false,
      "type": "type8",
      "title": "title2"
    }
  }
}
```

