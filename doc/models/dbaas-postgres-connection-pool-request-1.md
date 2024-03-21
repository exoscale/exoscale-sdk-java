
# Dbaas Postgres Connection Pool Request 1

## Structure

`DbaasPostgresConnectionPoolRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DatabaseName` | `String` | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getDatabaseName() | setDatabaseName(String databaseName) |
| `Mode` | [`EnumPgPoolModeEnum`](../../doc/models/enum-pg-pool-mode-enum.md) | Optional | - | EnumPgPoolModeEnum getMode() | setMode(EnumPgPoolModeEnum mode) |
| `Size` | `Long` | Optional | **Constraints**: `>= 1`, `<= 10000` | Long getSize() | setSize(Long size) |
| `Username` | `String` | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |

## Example (as JSON)

```json
{
  "database-name": "database-name2",
  "mode": "session",
  "size": 174,
  "username": "username8"
}
```

