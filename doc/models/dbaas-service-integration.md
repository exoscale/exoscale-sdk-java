
# Dbaas Service Integration

Integrations with other services

## Structure

`DbaasServiceIntegration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IntegrationStatus` | `Object` | Optional | Integration status | Object getIntegrationStatus() | setIntegrationStatus(Object integrationStatus) |
| `Description` | `String` | Required | Description of the integration | String getDescription() | setDescription(String description) |
| `SourceServiceType` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `64` | String getSourceServiceType() | setSourceServiceType(String sourceServiceType) |
| `SourceEndpoint` | `String` | Optional | Source endpoint name | String getSourceEndpoint() | setSourceEndpoint(String sourceEndpoint) |
| `DestServiceType` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `64` | String getDestServiceType() | setDestServiceType(String destServiceType) |
| `IntegrationType` | `String` | Required | Type of the integration | String getIntegrationType() | setIntegrationType(String integrationType) |
| `DestEndpoint` | `String` | Optional | Destination endpoint name | String getDestEndpoint() | setDestEndpoint(String destEndpoint) |
| `UserConfig` | `Object` | Optional | Service integration settings | Object getUserConfig() | setUserConfig(Object userConfig) |
| `DestEndpointId` | `String` | Optional | Destination endpoint id | String getDestEndpointId() | setDestEndpointId(String destEndpointId) |
| `ServiceIntegrationId` | `String` | Required | Integration ID | String getServiceIntegrationId() | setServiceIntegrationId(String serviceIntegrationId) |
| `DestService` | `String` | Required | Destination service name | String getDestService() | setDestService(String destService) |
| `Active` | `boolean` | Required | True when integration is active | boolean getActive() | setActive(boolean active) |
| `SourceEndpointId` | `String` | Optional | Source endpoint ID | String getSourceEndpointId() | setSourceEndpointId(String sourceEndpointId) |
| `SourceService` | `String` | Required | Source service name | String getSourceService() | setSourceService(String sourceService) |
| `Enabled` | `boolean` | Required | True when integration is enabled | boolean getEnabled() | setEnabled(boolean enabled) |

## Example (as JSON)

```json
{
  "integration-status": {
    "key1": "val1",
    "key2": "val2"
  },
  "description": "description2",
  "source-service-type": "source-service-type8",
  "source-endpoint": "source-endpoint4",
  "dest-service-type": "dest-service-type0",
  "integration-type": "integration-type6",
  "dest-endpoint": "dest-endpoint6",
  "user-config": {
    "key1": "val1",
    "key2": "val2"
  },
  "dest-endpoint-id": "dest-endpoint-id0",
  "service-integration-id": "service-integration-id6",
  "dest-service": "dest-service6",
  "active": false,
  "source-service": "source-service6",
  "enabled": false
}
```

