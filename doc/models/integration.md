
# Integration

## Structure

`Integration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | Integration type<br>**Default**: `"read_replica"` | String getType() | setType(String type) |
| `SourceService` | `String` | Optional | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getSourceService() | setSourceService(String sourceService) |
| `DestService` | `String` | Optional | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getDestService() | setDestService(String destService) |
| `Settings` | `Object` | Optional | Integration settings | Object getSettings() | setSettings(Object settings) |

## Example (as JSON)

```json
{
  "type": "read_replica",
  "source-service": "source-service8",
  "dest-service": "dest-service4",
  "settings": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

