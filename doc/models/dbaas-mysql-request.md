
# Dbaas Mysql Request

## Structure

`DbaasMysqlRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Maintenance` | [`Maintenance`](../../doc/models/maintenance.md) | Optional | Automatic maintenance settings | Maintenance getMaintenance() | setMaintenance(Maintenance maintenance) |
| `Plan` | `String` | Optional | Subscription plan<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getPlan() | setPlan(String plan) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `IpFilter` | `List<String>` | Optional | Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16' | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `MysqlSettings` | [`MysqlConfConfigurationValues`](../../doc/models/mysql-conf-configuration-values.md) | Optional | - | MysqlConfConfigurationValues getMysqlSettings() | setMysqlSettings(MysqlConfConfigurationValues mysqlSettings) |
| `Migration` | [`Migration`](../../doc/models/migration.md) | Optional | Migrate data from existing server | Migration getMigration() | setMigration(Migration migration) |
| `BinlogRetentionPeriod` | `Long` | Optional | The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.<br>**Constraints**: `>= 600`, `<= 86400` | Long getBinlogRetentionPeriod() | setBinlogRetentionPeriod(Long binlogRetentionPeriod) |
| `BackupSchedule` | [`BackupSchedule2`](../../doc/models/backup-schedule-2.md) | Optional | - | BackupSchedule2 getBackupSchedule() | setBackupSchedule(BackupSchedule2 backupSchedule) |

## Example (as JSON)

```json
{
  "maintenance": {
    "dow": "never",
    "time": "time2"
  },
  "plan": "plan4",
  "termination-protection": false,
  "ip-filter": [
    "ip-filter9"
  ],
  "mysql-settings": {
    "net_write_timeout": 102,
    "internal_tmp_mem_storage_engine": "TempTable",
    "sql_mode": "sql_mode8",
    "information_schema_stats_expiry": 44,
    "sort_buffer_size": 126
  }
}
```

