
# Dbaas Redis Request 1

## Structure

`DbaasRedisRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Maintenance` | [`Maintenance`](../../doc/models/maintenance.md) | Optional | Automatic maintenance settings | Maintenance getMaintenance() | setMaintenance(Maintenance maintenance) |
| `Plan` | `String` | Required | Subscription plan<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getPlan() | setPlan(String plan) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `IpFilter` | `List<String>` | Optional | Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16' | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `Migration` | [`Migration`](../../doc/models/migration.md) | Optional | Migrate data from existing server | Migration getMigration() | setMigration(Migration migration) |
| `RedisSettings` | [`RedisSettings`](../../doc/models/redis-settings.md) | Optional | - | RedisSettings getRedisSettings() | setRedisSettings(RedisSettings redisSettings) |
| `ForkFromService` | `String` | Optional | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getForkFromService() | setForkFromService(String forkFromService) |
| `RecoveryBackupName` | `String` | Optional | Name of a backup to recover from for services that support backup names<br>**Constraints**: *Minimum Length*: `1` | String getRecoveryBackupName() | setRecoveryBackupName(String recoveryBackupName) |

## Example (as JSON)

```json
{
  "maintenance": {
    "dow": "never",
    "time": "time2"
  },
  "plan": "plan8",
  "termination-protection": false,
  "ip-filter": [
    "ip-filter5"
  ],
  "migration": {
    "host": "host4",
    "port": 136,
    "password": "password8",
    "ssl": false,
    "username": "username6",
    "dbname": "dbname8",
    "ignore-dbs": "ignore-dbs6"
  },
  "redis-settings": {
    "ssl": false,
    "lfu_log_factor": 188,
    "maxmemory_policy": "noeviction",
    "io_threads": 176,
    "lfu_decay_time": 206
  }
}
```

