
# Dbaas Integration Settings Dest Type Response

## Structure

`DbaasIntegrationSettingsDestTypeResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Settings` | [`Settings4`](../../doc/models/settings-4.md) | Optional | The JSON schema representing the settings for the given integration type, source, and destination service types. | Settings4 getSettings() | setSettings(Settings4 settings) |

## Example (as JSON)

```json
{
  "settings": {
    "properties": {
      "key1": "val1",
      "key2": "val2"
    },
    "additionalProperties": false,
    "type": "type2",
    "title": "title4"
  }
}
```

