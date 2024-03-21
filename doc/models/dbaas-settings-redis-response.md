
# Dbaas Settings Redis Response

## Structure

`DbaasSettingsRedisResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Settings` | [`Settings2`](../../doc/models/settings-2.md) | Optional | - | Settings2 getSettings() | setSettings(Settings2 settings) |

## Example (as JSON)

```json
{
  "settings": {
    "redis": {
      "properties": {
        "key1": "val1",
        "key2": "val2"
      },
      "additionalProperties": false,
      "type": "type8",
      "title": "title8"
    }
  }
}
```

