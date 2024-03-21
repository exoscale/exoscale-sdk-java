
# Dbaas Mysql Request 1

## Structure

`DbaasMysqlRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BackupSchedule` | [`BackupSchedule2`](../../doc/models/backup-schedule-2.md) | Optional | - | BackupSchedule2 getBackupSchedule() | setBackupSchedule(BackupSchedule2 backupSchedule) |
| `Integrations` | [`List<Integration>`](../../doc/models/integration.md) | Optional | Service integrations to be enabled when creating the service. | List<Integration> getIntegrations() | setIntegrations(List<Integration> integrations) |
| `IpFilter` | `List<String>` | Optional | Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16' | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `ForkFromService` | `String` | Optional | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getForkFromService() | setForkFromService(String forkFromService) |
| `RecoveryBackupTime` | `String` | Optional | ISO time of a backup to recover from for services that support arbitrary times<br>**Constraints**: *Minimum Length*: `1` | String getRecoveryBackupTime() | setRecoveryBackupTime(String recoveryBackupTime) |
| `MysqlSettings` | [`MysqlConfConfigurationValues`](../../doc/models/mysql-conf-configuration-values.md) | Optional | - | MysqlConfConfigurationValues getMysqlSettings() | setMysqlSettings(MysqlConfConfigurationValues mysqlSettings) |
| `Maintenance` | [`Maintenance`](../../doc/models/maintenance.md) | Optional | Automatic maintenance settings | Maintenance getMaintenance() | setMaintenance(Maintenance maintenance) |
| `AdminUsername` | `String` | Optional | Custom username for admin user. This must be set only when a new service is being created.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[_A-Za-z0-9][-._A-Za-z0-9]{0,63}$` | String getAdminUsername() | setAdminUsername(String adminUsername) |
| `Version` | `String` | Optional | MySQL major version<br>**Constraints**: *Minimum Length*: `1` | String getVersion() | setVersion(String version) |
| `Plan` | `String` | Required | Subscription plan<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getPlan() | setPlan(String plan) |
| `AdminPassword` | `String` | Optional | Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `256`, *Pattern*: `^[a-zA-Z0-9-_]+$` | String getAdminPassword() | setAdminPassword(String adminPassword) |
| `Migration` | [`Migration`](../../doc/models/migration.md) | Optional | Migrate data from existing server | Migration getMigration() | setMigration(Migration migration) |
| `BinlogRetentionPeriod` | `Long` | Optional | The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.<br>**Constraints**: `>= 600`, `<= 86400` | Long getBinlogRetentionPeriod() | setBinlogRetentionPeriod(Long binlogRetentionPeriod) |

## Example (as JSON)

```json
{
  "backup-schedule": {
    "backup-hour": 84,
    "backup-minute": 60
  },
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
  "ip-filter": [
    "ip-filter3"
  ],
  "termination-protection": false,
  "fork-from-service": "fork-from-service8",
  "plan": "plan0"
}
```

