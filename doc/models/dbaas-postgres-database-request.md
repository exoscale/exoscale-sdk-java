
# Dbaas Postgres Database Request

## Structure

`DbaasPostgresDatabaseRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DatabaseName` | `String` | Required | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getDatabaseName() | setDatabaseName(String databaseName) |
| `LcCollate` | `String` | Optional | Default string sort order (LC_COLLATE) for PostgreSQL database<br>**Constraints**: *Maximum Length*: `128` | String getLcCollate() | setLcCollate(String lcCollate) |
| `LcCtype` | `String` | Optional | Default character classification (LC_CTYPE) for PostgreSQL database<br>**Constraints**: *Maximum Length*: `128` | String getLcCtype() | setLcCtype(String lcCtype) |

## Example (as JSON)

```json
{
  "database-name": "database-name6",
  "lc-collate": "lc-collate2",
  "lc-ctype": "lc-ctype4"
}
```

