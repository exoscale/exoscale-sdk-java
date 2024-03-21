
# Dbaas Service Redis

## Structure

`DbaasServiceRedis`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UpdatedAt` | `LocalDateTime` | Optional | Service last update timestamp (ISO 8601) | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `NodeCount` | `Long` | Optional | Number of service nodes in the active plan<br>**Constraints**: `>= 0` | Long getNodeCount() | setNodeCount(Long nodeCount) |
| `ConnectionInfo` | [`ConnectionInfo4`](../../doc/models/connection-info-4.md) | Optional | Redis connection information properties | ConnectionInfo4 getConnectionInfo() | setConnectionInfo(ConnectionInfo4 connectionInfo) |
| `NodeCpuCount` | `Long` | Optional | Number of CPUs for each node<br>**Constraints**: `>= 0` | Long getNodeCpuCount() | setNodeCpuCount(Long nodeCpuCount) |
| `Integrations` | [`List<DbaasIntegration>`](../../doc/models/dbaas-integration.md) | Optional | Service integrations | List<DbaasIntegration> getIntegrations() | setIntegrations(List<DbaasIntegration> integrations) |
| `Zone` | `String` | Optional | The zone where the service is running | String getZone() | setZone(String zone) |
| `NodeStates` | [`List<DbaasNodeState>`](../../doc/models/dbaas-node-state.md) | Optional | State of individual service nodes | List<DbaasNodeState> getNodeStates() | setNodeStates(List<DbaasNodeState> nodeStates) |
| `Name` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getName() | setName(String name) |
| `RedisSettings` | [`RedisSettings`](../../doc/models/redis-settings.md) | Optional | - | RedisSettings getRedisSettings() | setRedisSettings(RedisSettings redisSettings) |
| `Type` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `64` | String getType() | setType(String type) |
| `State` | [`EnumServiceStateEnum`](../../doc/models/enum-service-state-enum.md) | Optional | - | EnumServiceStateEnum getState() | setState(EnumServiceStateEnum state) |
| `IpFilter` | `List<String>` | Optional | Allowed CIDR address blocks for incoming connections | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `Backups` | [`List<DbaasServiceBackup>`](../../doc/models/dbaas-service-backup.md) | Optional | List of backups for the service | List<DbaasServiceBackup> getBackups() | setBackups(List<DbaasServiceBackup> backups) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `Notifications` | [`List<DbaasServiceNotification>`](../../doc/models/dbaas-service-notification.md) | Optional | Service notifications | List<DbaasServiceNotification> getNotifications() | setNotifications(List<DbaasServiceNotification> notifications) |
| `Components` | [`List<Component4>`](../../doc/models/component-4.md) | Optional | Service component information objects | List<Component4> getComponents() | setComponents(List<Component4> components) |
| `Maintenance` | [`DbaasServiceMaintenance`](../../doc/models/dbaas-service-maintenance.md) | Optional | Automatic maintenance settings | DbaasServiceMaintenance getMaintenance() | setMaintenance(DbaasServiceMaintenance maintenance) |
| `DiskSize` | `Long` | Optional | TODO UNIT disk space for data storage<br>**Constraints**: `>= 0` | Long getDiskSize() | setDiskSize(Long diskSize) |
| `NodeMemory` | `Long` | Optional | TODO UNIT of memory for each node<br>**Constraints**: `>= 0` | Long getNodeMemory() | setNodeMemory(Long nodeMemory) |
| `Uri` | `String` | Optional | URI for connecting to the service (may be absent) | String getUri() | setUri(String uri) |
| `UriParams` | `Object` | Optional | service_uri parameterized into key-value pairs | Object getUriParams() | setUriParams(Object uriParams) |
| `Version` | `String` | Optional | Redis version | String getVersion() | setVersion(String version) |
| `CreatedAt` | `LocalDateTime` | Optional | Service creation timestamp (ISO 8601) | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Plan` | `String` | Required | Subscription plan | String getPlan() | setPlan(String plan) |
| `Users` | [`List<User4>`](../../doc/models/user-4.md) | Optional | List of service users | List<User4> getUsers() | setUsers(List<User4> users) |

## Example (as JSON)

```json
{
  "updated-at": "2016-03-13T12:52:32.123Z",
  "node-count": 216,
  "connection-info": {
    "uri": [
      "uri9",
      "uri0"
    ],
    "password": "password2",
    "slave": [
      "slave5"
    ]
  },
  "node-cpu-count": 26,
  "integrations": [
    {
      "description": "description6",
      "settings": {
        "key1": "val1",
        "key2": "val2"
      },
      "type": "type4",
      "is-enabled": false,
      "source": "source2"
    },
    {
      "description": "description6",
      "settings": {
        "key1": "val1",
        "key2": "val2"
      },
      "type": "type4",
      "is-enabled": false,
      "source": "source2"
    },
    {
      "description": "description6",
      "settings": {
        "key1": "val1",
        "key2": "val2"
      },
      "type": "type4",
      "is-enabled": false,
      "source": "source2"
    }
  ],
  "name": "name0",
  "type": "type0",
  "plan": "plan4"
}
```

