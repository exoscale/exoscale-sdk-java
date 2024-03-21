
# Dbaas Service Mysql

## Structure

`DbaasServiceMysql`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UpdatedAt` | `LocalDateTime` | Optional | Service last update timestamp (ISO 8601) | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `NodeCount` | `Long` | Optional | Number of service nodes in the active plan<br>**Constraints**: `>= 0` | Long getNodeCount() | setNodeCount(Long nodeCount) |
| `ConnectionInfo` | [`ConnectionInfo`](../../doc/models/connection-info.md) | Optional | MySQL connection information properties | ConnectionInfo getConnectionInfo() | setConnectionInfo(ConnectionInfo connectionInfo) |
| `BackupSchedule` | [`BackupSchedule`](../../doc/models/backup-schedule.md) | Optional | Backup schedule | BackupSchedule getBackupSchedule() | setBackupSchedule(BackupSchedule backupSchedule) |
| `NodeCpuCount` | `Long` | Optional | Number of CPUs for each node<br>**Constraints**: `>= 0` | Long getNodeCpuCount() | setNodeCpuCount(Long nodeCpuCount) |
| `Integrations` | [`List<DbaasIntegration>`](../../doc/models/dbaas-integration.md) | Optional | Service integrations | List<DbaasIntegration> getIntegrations() | setIntegrations(List<DbaasIntegration> integrations) |
| `Zone` | `String` | Optional | The zone where the service is running | String getZone() | setZone(String zone) |
| `NodeStates` | [`List<DbaasNodeState>`](../../doc/models/dbaas-node-state.md) | Optional | State of individual service nodes | List<DbaasNodeState> getNodeStates() | setNodeStates(List<DbaasNodeState> nodeStates) |
| `Name` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getName() | setName(String name) |
| `Type` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `64` | String getType() | setType(String type) |
| `State` | [`EnumServiceStateEnum`](../../doc/models/enum-service-state-enum.md) | Optional | - | EnumServiceStateEnum getState() | setState(EnumServiceStateEnum state) |
| `Databases` | `List<String>` | Optional | List of MySQL databases<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | List<String> getDatabases() | setDatabases(List<String> databases) |
| `IpFilter` | `List<String>` | Optional | Allowed CIDR address blocks for incoming connections | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `Backups` | [`List<DbaasServiceBackup>`](../../doc/models/dbaas-service-backup.md) | Optional | List of backups for the service | List<DbaasServiceBackup> getBackups() | setBackups(List<DbaasServiceBackup> backups) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `Notifications` | [`List<DbaasServiceNotification>`](../../doc/models/dbaas-service-notification.md) | Optional | Service notifications | List<DbaasServiceNotification> getNotifications() | setNotifications(List<DbaasServiceNotification> notifications) |
| `Components` | [`List<Component>`](../../doc/models/component.md) | Optional | Service component information objects | List<Component> getComponents() | setComponents(List<Component> components) |
| `MysqlSettings` | [`MysqlConfConfigurationValues`](../../doc/models/mysql-conf-configuration-values.md) | Optional | - | MysqlConfConfigurationValues getMysqlSettings() | setMysqlSettings(MysqlConfConfigurationValues mysqlSettings) |
| `Maintenance` | [`DbaasServiceMaintenance`](../../doc/models/dbaas-service-maintenance.md) | Optional | Automatic maintenance settings | DbaasServiceMaintenance getMaintenance() | setMaintenance(DbaasServiceMaintenance maintenance) |
| `DiskSize` | `Long` | Optional | TODO UNIT disk space for data storage<br>**Constraints**: `>= 0` | Long getDiskSize() | setDiskSize(Long diskSize) |
| `NodeMemory` | `Long` | Optional | TODO UNIT of memory for each node<br>**Constraints**: `>= 0` | Long getNodeMemory() | setNodeMemory(Long nodeMemory) |
| `Uri` | `String` | Optional | URI for connecting to the service (may be absent) | String getUri() | setUri(String uri) |
| `UriParams` | `Object` | Optional | service_uri parameterized into key-value pairs | Object getUriParams() | setUriParams(Object uriParams) |
| `Version` | `String` | Optional | MySQL version | String getVersion() | setVersion(String version) |
| `CreatedAt` | `LocalDateTime` | Optional | Service creation timestamp (ISO 8601) | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Plan` | `String` | Required | Subscription plan | String getPlan() | setPlan(String plan) |
| `Users` | [`List<User>`](../../doc/models/user.md) | Optional | List of service users | List<User> getUsers() | setUsers(List<User> users) |

## Example (as JSON)

```json
{
  "updated-at": "2016-03-13T12:52:32.123Z",
  "node-count": 36,
  "connection-info": {
    "uri": [
      "uri9",
      "uri0"
    ],
    "params": [
      "params9",
      "params0"
    ],
    "standby": [
      "standby3",
      "standby2",
      "standby1"
    ]
  },
  "backup-schedule": {
    "backup-hour": 84,
    "backup-minute": 60
  },
  "node-cpu-count": 102,
  "name": "name6",
  "type": "type4",
  "plan": "plan2"
}
```

