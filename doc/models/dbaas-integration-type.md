
# Dbaas Integration Type

## Structure

`DbaasIntegrationType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | The type of the integration. | String getType() | setType(String type) |
| `SourceDescription` | `String` | Optional | The description of the source service types. | String getSourceDescription() | setSourceDescription(String sourceDescription) |
| `SourceServiceTypes` | `List<String>` | Optional | A list of the source service types the integration supports. | List<String> getSourceServiceTypes() | setSourceServiceTypes(List<String> sourceServiceTypes) |
| `DestDescription` | `String` | Optional | The description of the destination service types. | String getDestDescription() | setDestDescription(String destDescription) |
| `DestServiceTypes` | `List<String>` | Optional | A list of the destination service types the integration supports. | List<String> getDestServiceTypes() | setDestServiceTypes(List<String> destServiceTypes) |
| `Settings` | [`Settings`](../../doc/models/settings.md) | Optional | A JSON schema of additional settings of the integration. | Settings getSettings() | setSettings(Settings settings) |

## Example (as JSON)

```json
{
  "type": "type2",
  "source-description": "source-description8",
  "source-service-types": [
    "source-service-types6",
    "source-service-types7",
    "source-service-types8"
  ],
  "dest-description": "dest-description6",
  "dest-service-types": [
    "dest-service-types3"
  ]
}
```

