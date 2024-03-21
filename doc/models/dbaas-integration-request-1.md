
# Dbaas Integration Request 1

## Structure

`DbaasIntegrationRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IntegrationType` | [`EnumIntegrationTypesEnum`](../../doc/models/enum-integration-types-enum.md) | Required | - | EnumIntegrationTypesEnum getIntegrationType() | setIntegrationType(EnumIntegrationTypesEnum integrationType) |
| `SourceService` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getSourceService() | setSourceService(String sourceService) |
| `DestService` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getDestService() | setDestService(String destService) |
| `Settings` | `Object` | Optional | Integration settings | Object getSettings() | setSettings(Object settings) |

## Example (as JSON)

```json
{
  "integration-type": "datasource",
  "source-service": "source-service6",
  "dest-service": "dest-service6",
  "settings": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

