
# Dbaas Service Opensearch

## Structure

`DbaasServiceOpensearch`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | DbaaS service description | String getDescription() | setDescription(String description) |
| `MaxIndexCount` | `Long` | Optional | Maximum number of indexes to keep before deleting the oldest one<br>**Constraints**: `>= 0` | Long getMaxIndexCount() | setMaxIndexCount(Long maxIndexCount) |
| `UpdatedAt` | `LocalDateTime` | Optional | Service last update timestamp (ISO 8601) | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `NodeCount` | `Long` | Optional | Number of service nodes in the active plan<br>**Constraints**: `>= 0` | Long getNodeCount() | setNodeCount(Long nodeCount) |
| `ConnectionInfo` | [`ConnectionInfo5`](../../doc/models/connection-info-5.md) | Optional | Opensearch connection information properties | ConnectionInfo5 getConnectionInfo() | setConnectionInfo(ConnectionInfo5 connectionInfo) |
| `NodeCpuCount` | `Long` | Optional | Number of CPUs for each node<br>**Constraints**: `>= 0` | Long getNodeCpuCount() | setNodeCpuCount(Long nodeCpuCount) |
| `Integrations` | [`List<DbaasIntegration>`](../../doc/models/dbaas-integration.md) | Optional | Service integrations | List<DbaasIntegration> getIntegrations() | setIntegrations(List<DbaasIntegration> integrations) |
| `Zone` | `String` | Optional | The zone where the service is running | String getZone() | setZone(String zone) |
| `NodeStates` | [`List<DbaasNodeState>`](../../doc/models/dbaas-node-state.md) | Optional | State of individual service nodes | List<DbaasNodeState> getNodeStates() | setNodeStates(List<DbaasNodeState> nodeStates) |
| `Name` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getName() | setName(String name) |
| `KeepIndexRefreshInterval` | `Boolean` | Optional | Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn't fit your case, you can disable this by setting up this flag to true. | Boolean getKeepIndexRefreshInterval() | setKeepIndexRefreshInterval(Boolean keepIndexRefreshInterval) |
| `Type` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `64` | String getType() | setType(String type) |
| `State` | [`EnumServiceStateEnum`](../../doc/models/enum-service-state-enum.md) | Optional | - | EnumServiceStateEnum getState() | setState(EnumServiceStateEnum state) |
| `IpFilter` | `List<String>` | Optional | Allowed CIDR address blocks for incoming connections | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `Backups` | [`List<DbaasServiceBackup>`](../../doc/models/dbaas-service-backup.md) | Optional | List of backups for the service | List<DbaasServiceBackup> getBackups() | setBackups(List<DbaasServiceBackup> backups) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `Notifications` | [`List<DbaasServiceNotification>`](../../doc/models/dbaas-service-notification.md) | Optional | Service notifications | List<DbaasServiceNotification> getNotifications() | setNotifications(List<DbaasServiceNotification> notifications) |
| `Components` | [`List<Component>`](../../doc/models/component.md) | Optional | Service component information objects | List<Component> getComponents() | setComponents(List<Component> components) |
| `IndexPatterns` | [`List<IndexPattern>`](../../doc/models/index-pattern.md) | Optional | Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like 'logs.?' and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note 'logs.?' does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored. | List<IndexPattern> getIndexPatterns() | setIndexPatterns(List<IndexPattern> indexPatterns) |
| `Maintenance` | [`DbaasServiceMaintenance`](../../doc/models/dbaas-service-maintenance.md) | Optional | Automatic maintenance settings | DbaasServiceMaintenance getMaintenance() | setMaintenance(DbaasServiceMaintenance maintenance) |
| `IndexTemplate` | [`IndexTemplate`](../../doc/models/index-template.md) | Optional | Template settings for all new indexes | IndexTemplate getIndexTemplate() | setIndexTemplate(IndexTemplate indexTemplate) |
| `DiskSize` | `Long` | Optional | TODO UNIT disk space for data storage<br>**Constraints**: `>= 0` | Long getDiskSize() | setDiskSize(Long diskSize) |
| `NodeMemory` | `Long` | Optional | TODO UNIT of memory for each node<br>**Constraints**: `>= 0` | Long getNodeMemory() | setNodeMemory(Long nodeMemory) |
| `Uri` | `String` | Optional | URI for connecting to the service (may be absent) | String getUri() | setUri(String uri) |
| `OpensearchSettings` | [`OpenSearchSettings`](../../doc/models/open-search-settings.md) | Optional | - | OpenSearchSettings getOpensearchSettings() | setOpensearchSettings(OpenSearchSettings opensearchSettings) |
| `UriParams` | `Object` | Optional | service_uri parameterized into key-value pairs | Object getUriParams() | setUriParams(Object uriParams) |
| `Version` | `String` | Optional | OpenSearch version | String getVersion() | setVersion(String version) |
| `CreatedAt` | `LocalDateTime` | Optional | Service creation timestamp (ISO 8601) | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Plan` | `String` | Required | Subscription plan | String getPlan() | setPlan(String plan) |
| `OpensearchDashboards` | [`OpensearchDashboards`](../../doc/models/opensearch-dashboards.md) | Optional | OpenSearch Dashboards settings | OpensearchDashboards getOpensearchDashboards() | setOpensearchDashboards(OpensearchDashboards opensearchDashboards) |
| `Users` | [`List<User3>`](../../doc/models/user-3.md) | Optional | List of service users | List<User3> getUsers() | setUsers(List<User3> users) |

## Example (as JSON)

```json
{
  "description": "description8",
  "max-index-count": 78,
  "updated-at": "2016-03-13T12:52:32.123Z",
  "node-count": 4,
  "connection-info": {
    "uri": [
      "uri9",
      "uri0"
    ],
    "username": "username8",
    "password": "password2",
    "dashboard-uri": "dashboard-uri4"
  },
  "name": "name8",
  "type": "type2",
  "plan": "plan6"
}
```

