
# Dbaas Postgres Request 1

## Structure

`DbaasPostgresRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PgbouncerSettings` | [`PGBouncerConnectionPoolingSettings`](../../doc/models/pg-bouncer-connection-pooling-settings.md) | Optional | - | PGBouncerConnectionPoolingSettings getPgbouncerSettings() | setPgbouncerSettings(PGBouncerConnectionPoolingSettings pgbouncerSettings) |
| `BackupSchedule` | [`BackupSchedule2`](../../doc/models/backup-schedule-2.md) | Optional | - | BackupSchedule2 getBackupSchedule() | setBackupSchedule(BackupSchedule2 backupSchedule) |
| `Variant` | [`EnumPgVariantEnum`](../../doc/models/enum-pg-variant-enum.md) | Optional | - | EnumPgVariantEnum getVariant() | setVariant(EnumPgVariantEnum variant) |
| `Integrations` | [`List<Integration>`](../../doc/models/integration.md) | Optional | Service integrations to be enabled when creating the service. | List<Integration> getIntegrations() | setIntegrations(List<Integration> integrations) |
| `TimescaledbSettings` | [`TimescaleDBExtensionConfigurationValues`](../../doc/models/timescale-db-extension-configuration-values.md) | Optional | - | TimescaleDBExtensionConfigurationValues getTimescaledbSettings() | setTimescaledbSettings(TimescaleDBExtensionConfigurationValues timescaledbSettings) |
| `IpFilter` | `List<String>` | Optional | Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16' | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `ForkFromService` | `String` | Optional | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getForkFromService() | setForkFromService(String forkFromService) |
| `SynchronousReplication` | [`EnumPgSynchronousReplicationEnum`](../../doc/models/enum-pg-synchronous-replication-enum.md) | Optional | - | EnumPgSynchronousReplicationEnum getSynchronousReplication() | setSynchronousReplication(EnumPgSynchronousReplicationEnum synchronousReplication) |
| `RecoveryBackupTime` | `String` | Optional | ISO time of a backup to recover from for services that support arbitrary times<br>**Constraints**: *Minimum Length*: `1` | String getRecoveryBackupTime() | setRecoveryBackupTime(String recoveryBackupTime) |
| `PglookoutSettings` | [`PGLookoutSettings`](../../doc/models/pg-lookout-settings.md) | Optional | - | PGLookoutSettings getPglookoutSettings() | setPglookoutSettings(PGLookoutSettings pglookoutSettings) |
| `Maintenance` | [`Maintenance`](../../doc/models/maintenance.md) | Optional | Automatic maintenance settings | Maintenance getMaintenance() | setMaintenance(Maintenance maintenance) |
| `AdminUsername` | `String` | Optional | Custom username for admin user. This must be set only when a new service is being created.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[_A-Za-z0-9][-._A-Za-z0-9]{0,63}$` | String getAdminUsername() | setAdminUsername(String adminUsername) |
| `Version` | [`DbaasPgTargetVersionsEnum`](../../doc/models/dbaas-pg-target-versions-enum.md) | Optional | - | DbaasPgTargetVersionsEnum getVersion() | setVersion(DbaasPgTargetVersionsEnum version) |
| `Plan` | `String` | Required | Subscription plan<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getPlan() | setPlan(String plan) |
| `WorkMem` | `Long` | Optional | Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).<br>**Constraints**: `>= 1`, `<= 1024` | Long getWorkMem() | setWorkMem(Long workMem) |
| `SharedBuffersPercentage` | `Long` | Optional | Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.<br>**Constraints**: `>= 20`, `<= 60` | Long getSharedBuffersPercentage() | setSharedBuffersPercentage(Long sharedBuffersPercentage) |
| `PgSettings` | [`PostgresqlConfConfigurationValues`](../../doc/models/postgresql-conf-configuration-values.md) | Optional | - | PostgresqlConfConfigurationValues getPgSettings() | setPgSettings(PostgresqlConfConfigurationValues pgSettings) |
| `AdminPassword` | `String` | Optional | Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `256`, *Pattern*: `^[a-zA-Z0-9-_]+$` | String getAdminPassword() | setAdminPassword(String adminPassword) |
| `Migration` | [`Migration`](../../doc/models/migration.md) | Optional | Migrate data from existing server | Migration getMigration() | setMigration(Migration migration) |

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
  "backup-schedule": {
    "backup-hour": 84,
    "backup-minute": 60
  },
  "variant": "timescale",
  "integrations": [
    {
      "type": "type4",
      "source-service": "source-service2",
      "dest-service": "dest-service4",
      "settings": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "type": "type4",
      "source-service": "source-service2",
      "dest-service": "dest-service4",
      "settings": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "type": "type4",
      "source-service": "source-service2",
      "dest-service": "dest-service4",
      "settings": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  ],
  "timescaledb-settings": {
    "max_background_workers": 230
  },
  "plan": "plan2"
}
```

