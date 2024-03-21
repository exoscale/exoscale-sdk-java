
# Dbaas Service Grafana

## Structure

`DbaasServiceGrafana`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | DbaaS service description | String getDescription() | setDescription(String description) |
| `UpdatedAt` | `LocalDateTime` | Optional | Service last update timestamp (ISO 8601) | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `NodeCount` | `Long` | Optional | Number of service nodes in the active plan<br>**Constraints**: `>= 0` | Long getNodeCount() | setNodeCount(Long nodeCount) |
| `ConnectionInfo` | [`ConnectionInfo3`](../../doc/models/connection-info-3.md) | Optional | Grafana connection information properties | ConnectionInfo3 getConnectionInfo() | setConnectionInfo(ConnectionInfo3 connectionInfo) |
| `NodeCpuCount` | `Long` | Optional | Number of CPUs for each node<br>**Constraints**: `>= 0` | Long getNodeCpuCount() | setNodeCpuCount(Long nodeCpuCount) |
| `Integrations` | [`List<DbaasIntegration>`](../../doc/models/dbaas-integration.md) | Optional | Service integrations | List<DbaasIntegration> getIntegrations() | setIntegrations(List<DbaasIntegration> integrations) |
| `Zone` | `String` | Optional | The zone where the service is running | String getZone() | setZone(String zone) |
| `NodeStates` | [`List<DbaasNodeState>`](../../doc/models/dbaas-node-state.md) | Optional | State of individual service nodes | List<DbaasNodeState> getNodeStates() | setNodeStates(List<DbaasNodeState> nodeStates) |
| `Name` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getName() | setName(String name) |
| `Type` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `64` | String getType() | setType(String type) |
| `State` | [`EnumServiceStateEnum`](../../doc/models/enum-service-state-enum.md) | Optional | - | EnumServiceStateEnum getState() | setState(EnumServiceStateEnum state) |
| `GrafanaSettings` | [`GrafanaSettings`](../../doc/models/grafana-settings.md) | Optional | - | GrafanaSettings getGrafanaSettings() | setGrafanaSettings(GrafanaSettings grafanaSettings) |
| `IpFilter` | `List<String>` | Optional | Allowed CIDR address blocks for incoming connections | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `Backups` | [`List<DbaasServiceBackup>`](../../doc/models/dbaas-service-backup.md) | Optional | List of backups for the service | List<DbaasServiceBackup> getBackups() | setBackups(List<DbaasServiceBackup> backups) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `Notifications` | [`List<DbaasServiceNotification>`](../../doc/models/dbaas-service-notification.md) | Optional | Service notifications | List<DbaasServiceNotification> getNotifications() | setNotifications(List<DbaasServiceNotification> notifications) |
| `Components` | [`List<Component>`](../../doc/models/component.md) | Optional | Service component information objects | List<Component> getComponents() | setComponents(List<Component> components) |
| `Maintenance` | [`DbaasServiceMaintenance`](../../doc/models/dbaas-service-maintenance.md) | Optional | Automatic maintenance settings | DbaasServiceMaintenance getMaintenance() | setMaintenance(DbaasServiceMaintenance maintenance) |
| `DiskSize` | `Long` | Optional | TODO UNIT disk space for data storage<br>**Constraints**: `>= 0` | Long getDiskSize() | setDiskSize(Long diskSize) |
| `NodeMemory` | `Long` | Optional | TODO UNIT of memory for each node<br>**Constraints**: `>= 0` | Long getNodeMemory() | setNodeMemory(Long nodeMemory) |
| `Uri` | `String` | Optional | URI for connecting to the service (may be absent) | String getUri() | setUri(String uri) |
| `UriParams` | `Object` | Optional | service_uri parameterized into key-value pairs | Object getUriParams() | setUriParams(Object uriParams) |
| `Version` | `String` | Optional | Grafana version | String getVersion() | setVersion(String version) |
| `CreatedAt` | `LocalDateTime` | Optional | Service creation timestamp (ISO 8601) | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Plan` | `String` | Required | Subscription plan | String getPlan() | setPlan(String plan) |
| `Users` | [`List<User3>`](../../doc/models/user-3.md) | Optional | List of service users | List<User3> getUsers() | setUsers(List<User3> users) |

## Example (as JSON)

```json
{
  "description": "description0",
  "updated-at": "2016-03-13T12:52:32.123Z",
  "node-count": 28,
  "connection-info": {
    "uri": "uri2",
    "username": "username8",
    "password": "password2"
  },
  "node-cpu-count": 94,
  "name": "name0",
  "type": "type0",
  "plan": "plan6"
}
```

