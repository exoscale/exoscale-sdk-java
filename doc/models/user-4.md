
# User 4

## Structure

`User4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `AccessControl` | [`AccessControl`](../../doc/models/access-control.md) | Optional | - | AccessControl getAccessControl() | setAccessControl(AccessControl accessControl) |

## Example (as JSON)

```json
{
  "type": "type4",
  "username": "username4",
  "password": "password0",
  "access-control": {
    "categories": [
      "categories8",
      "categories7",
      "categories6"
    ],
    "channels": [
      "channels3",
      "channels4"
    ],
    "commands": [
      "commands3",
      "commands4",
      "commands5"
    ],
    "keys": [
      "keys8"
    ]
  }
}
```

