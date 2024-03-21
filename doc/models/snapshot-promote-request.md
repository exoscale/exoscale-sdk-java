
# Snapshot Promote Request

## Structure

`SnapshotPromoteRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Template name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Template description<br>**Constraints**: *Maximum Length*: `4096` | String getDescription() | setDescription(String description) |
| `DefaultUser` | `String` | Optional | Template default user<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getDefaultUser() | setDefaultUser(String defaultUser) |
| `SshKeyEnabled` | `Boolean` | Optional | Enable SSH key-based login in the template | Boolean getSshKeyEnabled() | setSshKeyEnabled(Boolean sshKeyEnabled) |
| `PasswordEnabled` | `Boolean` | Optional | Enable password-based login in the template | Boolean getPasswordEnabled() | setPasswordEnabled(Boolean passwordEnabled) |

## Example (as JSON)

```json
{
  "name": "name8",
  "description": "description8",
  "default-user": "default-user0",
  "ssh-key-enabled": false,
  "password-enabled": false
}
```

