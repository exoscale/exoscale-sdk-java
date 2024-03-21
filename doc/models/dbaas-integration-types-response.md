
# Dbaas Integration Types Response

## Structure

`DbaasIntegrationTypesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DbaasIntegrationTypes` | [`List<DbaasIntegrationType>`](../../doc/models/dbaas-integration-type.md) | Optional | - | List<DbaasIntegrationType> getDbaasIntegrationTypes() | setDbaasIntegrationTypes(List<DbaasIntegrationType> dbaasIntegrationTypes) |

## Example (as JSON)

```json
{
  "dbaas-integration-types": [
    {
      "type": "type6",
      "source-description": "source-description4",
      "source-service-types": [
        "source-service-types2",
        "source-service-types3"
      ],
      "dest-description": "dest-description2",
      "dest-service-types": [
        "dest-service-types9",
        "dest-service-types0",
        "dest-service-types1"
      ]
    },
    {
      "type": "type6",
      "source-description": "source-description4",
      "source-service-types": [
        "source-service-types2",
        "source-service-types3"
      ],
      "dest-description": "dest-description2",
      "dest-service-types": [
        "dest-service-types9",
        "dest-service-types0",
        "dest-service-types1"
      ]
    }
  ]
}
```

