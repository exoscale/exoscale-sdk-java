
# Dbaas Postgres Connection Pool Request

## Structure

`DbaasPostgresConnectionPoolRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `63` | String getName() | setName(String name) |
| `DatabaseName` | `String` | Required | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getDatabaseName() | setDatabaseName(String databaseName) |
| `Mode` | [`EnumPgPoolModeEnum`](../../doc/models/enum-pg-pool-mode-enum.md) | Optional | - | EnumPgPoolModeEnum getMode() | setMode(EnumPgPoolModeEnum mode) |
| `Size` | `Long` | Optional | **Constraints**: `>= 1`, `<= 10000` | Long getSize() | setSize(Long size) |
| `Username` | `String` | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |

## Example (as JSON)

```json
{
  "name": "name2",
  "database-name": "database-name6",
  "mode": "session",
  "size": 192,
  "username": "username8"
}
```

