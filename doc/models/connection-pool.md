
# Connection Pool

## Structure

`ConnectionPool`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ConnectionUri` | `String` | Required | Connection URI for the DB pool | String getConnectionUri() | setConnectionUri(String connectionUri) |
| `Database` | `String` | Required | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getDatabase() | setDatabase(String database) |
| `Mode` | [`EnumPgPoolModeEnum`](../../doc/models/enum-pg-pool-mode-enum.md) | Required | - | EnumPgPoolModeEnum getMode() | setMode(EnumPgPoolModeEnum mode) |
| `Name` | `String` | Required | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `63` | String getName() | setName(String name) |
| `Size` | `long` | Required | **Constraints**: `>= 1`, `<= 10000` | long getSize() | setSize(long size) |
| `Username` | `String` | Required | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |

## Example (as JSON)

```json
{
  "connection-uri": "connection-uri8",
  "database": "database4",
  "mode": "transaction",
  "name": "name6",
  "size": 230,
  "username": "username4"
}
```

