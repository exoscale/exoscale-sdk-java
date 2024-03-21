
# Zone

Zone

## Structure

`Zone`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`ZoneNameEnum`](../../doc/models/zone-name-enum.md) | Optional | - | ZoneNameEnum getName() | setName(ZoneNameEnum name) |
| `ApiEndpoint` | `String` | Optional | Zone API endpoint | String getApiEndpoint() | setApiEndpoint(String apiEndpoint) |
| `SosEndpoint` | `String` | Optional | Zone SOS endpoint | String getSosEndpoint() | setSosEndpoint(String sosEndpoint) |

## Example (as JSON)

```json
{
  "name": "ch-gva-2",
  "api-endpoint": "api-endpoint8",
  "sos-endpoint": "sos-endpoint4"
}
```

