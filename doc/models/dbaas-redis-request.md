
# Dbaas Redis Request

## Structure

`DbaasRedisRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Maintenance` | [`Maintenance`](../../doc/models/maintenance.md) | Optional | Automatic maintenance settings | Maintenance getMaintenance() | setMaintenance(Maintenance maintenance) |
| `Plan` | `String` | Optional | Subscription plan<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getPlan() | setPlan(String plan) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `IpFilter` | `List<String>` | Optional | Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16' | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `Migration` | [`Migration`](../../doc/models/migration.md) | Optional | Migrate data from existing server | Migration getMigration() | setMigration(Migration migration) |
| `RedisSettings` | [`RedisSettings`](../../doc/models/redis-settings.md) | Optional | - | RedisSettings getRedisSettings() | setRedisSettings(RedisSettings redisSettings) |

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
    "ip-filter9",
    "ip-filter0"
  ],
  "migration": {
    "host": "host4",
    "port": 136,
    "password": "password8",
    "ssl": false,
    "username": "username6",
    "dbname": "dbname8",
    "ignore-dbs": "ignore-dbs6"
  }
}
```

