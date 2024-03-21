
# Dbaas Postgres User Request

## Structure

`DbaasPostgresUserRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Username` | `String` | Required | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |
| `AllowReplication` | `Boolean` | Optional | - | Boolean getAllowReplication() | setAllowReplication(Boolean allowReplication) |

## Example (as JSON)

```json
{
  "username": "username0",
  "allow-replication": false
}
```

