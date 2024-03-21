
# Detail

## Structure

`Detail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Dbname` | `String` | Optional | Migrated db name (PG) or number (Redis) | String getDbname() | setDbname(String dbname) |
| `Error` | `String` | Optional | Error message in case that migration has failed | String getError() | setError(String error) |
| `Method` | `String` | Optional | Migration method | String getMethod() | setMethod(String method) |
| `Status` | [`EnumMigrationStatusEnum`](../../doc/models/enum-migration-status-enum.md) | Optional | - | EnumMigrationStatusEnum getStatus() | setStatus(EnumMigrationStatusEnum status) |

## Example (as JSON)

```json
{
  "dbname": "dbname6",
  "error": "error6",
  "method": "method4",
  "status": "running"
}
```

