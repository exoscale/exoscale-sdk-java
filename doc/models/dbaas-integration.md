
# Dbaas Integration

## Structure

`DbaasIntegration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the integration | String getDescription() | setDescription(String description) |
| `Settings` | `Object` | Optional | Integration settings | Object getSettings() | setSettings(Object settings) |
| `Type` | `String` | Optional | Integration type | String getType() | setType(String type) |
| `IsEnabled` | `Boolean` | Optional | Whether the integration is enabled or not | Boolean getIsEnabled() | setIsEnabled(Boolean isEnabled) |
| `Source` | `String` | Optional | Source service name | String getSource() | setSource(String source) |
| `IsActive` | `Boolean` | Optional | Whether the integration is active or not | Boolean getIsActive() | setIsActive(Boolean isActive) |
| `Status` | `String` | Optional | Integration status | String getStatus() | setStatus(String status) |
| `Id` | `UUID` | Optional | Integration id | UUID getId() | setId(UUID id) |
| `Dest` | `String` | Optional | Destination service name | String getDest() | setDest(String dest) |

## Example (as JSON)

```json
{
  "description": "description8",
  "settings": {
    "key1": "val1",
    "key2": "val2"
  },
  "type": "type2",
  "is-enabled": false,
  "source": "source4"
}
```

