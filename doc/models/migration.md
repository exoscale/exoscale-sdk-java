
# Migration

Migrate data from existing server

## Structure

`Migration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Host` | `String` | Required | Hostname or IP address of the server where to migrate data from<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getHost() | setHost(String host) |
| `Port` | `long` | Required | Port number of the server where to migrate data from<br>**Constraints**: `>= 1`, `<= 65535` | long getPort() | setPort(long port) |
| `Password` | `String` | Optional | Password for authentication with the server where to migrate data from<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getPassword() | setPassword(String password) |
| `Ssl` | `Boolean` | Optional | The server where to migrate data from is secured with SSL | Boolean getSsl() | setSsl(Boolean ssl) |
| `Username` | `String` | Optional | User name for authentication with the server where to migrate data from<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getUsername() | setUsername(String username) |
| `Dbname` | `String` | Optional | Database name for bootstrapping the initial connection<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `63` | String getDbname() | setDbname(String dbname) |
| `IgnoreDbs` | `String` | Optional | Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2048` | String getIgnoreDbs() | setIgnoreDbs(String ignoreDbs) |
| `Method` | [`EnumMigrationMethodEnum`](../../doc/models/enum-migration-method-enum.md) | Optional | - | EnumMigrationMethodEnum getMethod() | setMethod(EnumMigrationMethodEnum method) |

## Example (as JSON)

```json
{
  "host": "host6",
  "port": 238,
  "password": "password6",
  "ssl": false,
  "username": "username8",
  "dbname": "dbname4",
  "ignore-dbs": "ignore-dbs4"
}
```

