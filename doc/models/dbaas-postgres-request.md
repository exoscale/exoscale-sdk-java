
# Dbaas Postgres Request

## Structure

`DbaasPostgresRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PgbouncerSettings` | [`PGBouncerConnectionPoolingSettings`](../../doc/models/pg-bouncer-connection-pooling-settings.md) | Optional | - | PGBouncerConnectionPoolingSettings getPgbouncerSettings() | setPgbouncerSettings(PGBouncerConnectionPoolingSettings pgbouncerSettings) |
| `BackupSchedule` | [`BackupSchedule2`](../../doc/models/backup-schedule-2.md) | Optional | - | BackupSchedule2 getBackupSchedule() | setBackupSchedule(BackupSchedule2 backupSchedule) |
| `Variant` | [`EnumPgVariantEnum`](../../doc/models/enum-pg-variant-enum.md) | Optional | - | EnumPgVariantEnum getVariant() | setVariant(EnumPgVariantEnum variant) |
| `TimescaledbSettings` | [`TimescaleDBExtensionConfigurationValues`](../../doc/models/timescale-db-extension-configuration-values.md) | Optional | - | TimescaleDBExtensionConfigurationValues getTimescaledbSettings() | setTimescaledbSettings(TimescaleDBExtensionConfigurationValues timescaledbSettings) |
| `IpFilter` | `List<String>` | Optional | Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16' | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `SynchronousReplication` | [`EnumPgSynchronousReplicationEnum`](../../doc/models/enum-pg-synchronous-replication-enum.md) | Optional | - | EnumPgSynchronousReplicationEnum getSynchronousReplication() | setSynchronousReplication(EnumPgSynchronousReplicationEnum synchronousReplication) |
| `PglookoutSettings` | [`PGLookoutSettings`](../../doc/models/pg-lookout-settings.md) | Optional | - | PGLookoutSettings getPglookoutSettings() | setPglookoutSettings(PGLookoutSettings pglookoutSettings) |
| `Maintenance` | [`Maintenance`](../../doc/models/maintenance.md) | Optional | Automatic maintenance settings | Maintenance getMaintenance() | setMaintenance(Maintenance maintenance) |
| `Version` | `String` | Optional | Version | String getVersion() | setVersion(String version) |
| `Plan` | `String` | Optional | Subscription plan<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getPlan() | setPlan(String plan) |
| `WorkMem` | `Long` | Optional | Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).<br>**Constraints**: `>= 1`, `<= 1024` | Long getWorkMem() | setWorkMem(Long workMem) |
| `SharedBuffersPercentage` | `Long` | Optional | Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.<br>**Constraints**: `>= 20`, `<= 60` | Long getSharedBuffersPercentage() | setSharedBuffersPercentage(Long sharedBuffersPercentage) |
| `PgSettings` | [`PostgresqlConfConfigurationValues`](../../doc/models/postgresql-conf-configuration-values.md) | Optional | - | PostgresqlConfConfigurationValues getPgSettings() | setPgSettings(PostgresqlConfConfigurationValues pgSettings) |
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
  "timescaledb-settings": {
    "max_background_workers": 230
  },
  "ip-filter": [
    "ip-filter9"
  ]
}
```

