
# User 2

List of service users

## Structure

`User2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | Account type | String getType() | setType(String type) |
| `Username` | `String` | Required | Account username | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | Account password. A missing field indicates a user overridden password. | String getPassword() | setPassword(String password) |
| `AllowReplication` | `Boolean` | Optional | - | Boolean getAllowReplication() | setAllowReplication(Boolean allowReplication) |

## Example (as JSON)

```json
{
  "type": "type2",
  "username": "username2",
  "password": "password6",
  "allow-replication": false
}
```

