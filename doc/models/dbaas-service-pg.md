
# Dbaas Service Pg

## Structure

`DbaasServicePg`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PgbouncerSettings` | [`PGBouncerConnectionPoolingSettings`](../../doc/models/pg-bouncer-connection-pooling-settings.md) | Optional | - | PGBouncerConnectionPoolingSettings getPgbouncerSettings() | setPgbouncerSettings(PGBouncerConnectionPoolingSettings pgbouncerSettings) |
| `UpdatedAt` | `LocalDateTime` | Optional | Service last update timestamp (ISO 8601) | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `NodeCount` | `Long` | Optional | Number of service nodes in the active plan<br>**Constraints**: `>= 0` | Long getNodeCount() | setNodeCount(Long nodeCount) |
| `ConnectionInfo` | [`ConnectionInfo2`](../../doc/models/connection-info-2.md) | Optional | PG connection information properties | ConnectionInfo2 getConnectionInfo() | setConnectionInfo(ConnectionInfo2 connectionInfo) |
| `BackupSchedule` | [`BackupSchedule`](../../doc/models/backup-schedule.md) | Optional | Backup schedule | BackupSchedule getBackupSchedule() | setBackupSchedule(BackupSchedule backupSchedule) |
| `NodeCpuCount` | `Long` | Optional | Number of CPUs for each node<br>**Constraints**: `>= 0` | Long getNodeCpuCount() | setNodeCpuCount(Long nodeCpuCount) |
| `Integrations` | [`List<DbaasIntegration>`](../../doc/models/dbaas-integration.md) | Optional | Service integrations | List<DbaasIntegration> getIntegrations() | setIntegrations(List<DbaasIntegration> integrations) |
| `Zone` | `String` | Optional | The zone where the service is running | String getZone() | setZone(String zone) |
| `NodeStates` | [`List<DbaasNodeState>`](../../doc/models/dbaas-node-state.md) | Optional | State of individual service nodes | List<DbaasNodeState> getNodeStates() | setNodeStates(List<DbaasNodeState> nodeStates) |
| `Name` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getName() | setName(String name) |
| `ConnectionPools` | [`List<ConnectionPool>`](../../doc/models/connection-pool.md) | Optional | PostgreSQL PGBouncer connection pools | List<ConnectionPool> getConnectionPools() | setConnectionPools(List<ConnectionPool> connectionPools) |
| `Type` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `64` | String getType() | setType(String type) |
| `State` | [`EnumServiceStateEnum`](../../doc/models/enum-service-state-enum.md) | Optional | - | EnumServiceStateEnum getState() | setState(EnumServiceStateEnum state) |
| `TimescaledbSettings` | [`TimescaleDBExtensionConfigurationValues`](../../doc/models/timescale-db-extension-configuration-values.md) | Optional | - | TimescaleDBExtensionConfigurationValues getTimescaledbSettings() | setTimescaledbSettings(TimescaleDBExtensionConfigurationValues timescaledbSettings) |
| `Databases` | `List<String>` | Optional | List of PostgreSQL databases<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | List<String> getDatabases() | setDatabases(List<String> databases) |
| `IpFilter` | `List<String>` | Optional | Allowed CIDR address blocks for incoming connections | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `Backups` | [`List<DbaasServiceBackup>`](../../doc/models/dbaas-service-backup.md) | Optional | List of backups for the service | List<DbaasServiceBackup> getBackups() | setBackups(List<DbaasServiceBackup> backups) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `Notifications` | [`List<DbaasServiceNotification>`](../../doc/models/dbaas-service-notification.md) | Optional | Service notifications | List<DbaasServiceNotification> getNotifications() | setNotifications(List<DbaasServiceNotification> notifications) |
| `Components` | [`List<Component>`](../../doc/models/component.md) | Optional | Service component information objects | List<Component> getComponents() | setComponents(List<Component> components) |
| `SynchronousReplication` | [`EnumPgSynchronousReplicationEnum`](../../doc/models/enum-pg-synchronous-replication-enum.md) | Optional | - | EnumPgSynchronousReplicationEnum getSynchronousReplication() | setSynchronousReplication(EnumPgSynchronousReplicationEnum synchronousReplication) |
| `PglookoutSettings` | [`PGLookoutSettings`](../../doc/models/pg-lookout-settings.md) | Optional | - | PGLookoutSettings getPglookoutSettings() | setPglookoutSettings(PGLookoutSettings pglookoutSettings) |
| `Maintenance` | [`DbaasServiceMaintenance`](../../doc/models/dbaas-service-maintenance.md) | Optional | Automatic maintenance settings | DbaasServiceMaintenance getMaintenance() | setMaintenance(DbaasServiceMaintenance maintenance) |
| `DiskSize` | `Long` | Optional | TODO UNIT disk space for data storage<br>**Constraints**: `>= 0` | Long getDiskSize() | setDiskSize(Long diskSize) |
| `NodeMemory` | `Long` | Optional | TODO UNIT of memory for each node<br>**Constraints**: `>= 0` | Long getNodeMemory() | setNodeMemory(Long nodeMemory) |
| `Uri` | `String` | Optional | URI for connecting to the service (may be absent) | String getUri() | setUri(String uri) |
| `UriParams` | `Object` | Optional | service_uri parameterized into key-value pairs | Object getUriParams() | setUriParams(Object uriParams) |
| `Version` | `String` | Optional | PostgreSQL version | String getVersion() | setVersion(String version) |
| `CreatedAt` | `LocalDateTime` | Optional | Service creation timestamp (ISO 8601) | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Plan` | `String` | Required | Subscription plan | String getPlan() | setPlan(String plan) |
| `WorkMem` | `Long` | Optional | Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).<br>**Constraints**: `>= 1`, `<= 1024` | Long getWorkMem() | setWorkMem(Long workMem) |
| `SharedBuffersPercentage` | `Long` | Optional | Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.<br>**Constraints**: `>= 20`, `<= 60` | Long getSharedBuffersPercentage() | setSharedBuffersPercentage(Long sharedBuffersPercentage) |
| `PgSettings` | [`PostgresqlConfConfigurationValues`](../../doc/models/postgresql-conf-configuration-values.md) | Optional | - | PostgresqlConfConfigurationValues getPgSettings() | setPgSettings(PostgresqlConfConfigurationValues pgSettings) |
| `MaxConnections` | `Long` | Optional | Maximum number of connections allowed to an instance<br>**Constraints**: `> 0` | Long getMaxConnections() | setMaxConnections(Long maxConnections) |
| `Users` | [`List<User2>`](../../doc/models/user-2.md) | Optional | List of service users | List<User2> getUsers() | setUsers(List<User2> users) |

## Example (as JSON)

```json
{
  "pgbouncer-settings": {
    "min_pool_size": 178,
    "ignore_startup_parameters": [
      "search_path",
      "extra_float_digits",
      "search_path"
    ],
    "server_lifetime": 8,
    "autodb_pool_mode": "transaction",
    "server_idle_timeout": 104
  },
  "updated-at": "2016-03-13T12:52:32.123Z",
  "node-count": 138,
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
    ],
    "syncing": [
      "syncing0",
      "syncing1"
    ]
  },
  "backup-schedule": {
    "backup-hour": 84,
    "backup-minute": 60
  },
  "name": "name2",
  "type": "type8",
  "plan": "plan2"
}
```

