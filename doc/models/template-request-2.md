
# Template Request 2

## Structure

`TemplateRequest2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Maintainer` | `String` | Optional | Template maintainer<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getMaintainer() | setMaintainer(String maintainer) |
| `Description` | `String` | Optional | Template description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `SshKeyEnabled` | `boolean` | Required | Enable SSH key-based login | boolean getSshKeyEnabled() | setSshKeyEnabled(boolean sshKeyEnabled) |
| `Name` | `String` | Required | Template name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `DefaultUser` | `String` | Optional | Template default user<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getDefaultUser() | setDefaultUser(String defaultUser) |
| `Size` | `Long` | Optional | Template size<br>**Constraints**: `> 0` | Long getSize() | setSize(Long size) |
| `PasswordEnabled` | `boolean` | Required | Enable password-based login | boolean getPasswordEnabled() | setPasswordEnabled(boolean passwordEnabled) |
| `Build` | `String` | Optional | Template build<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getBuild() | setBuild(String build) |
| `Checksum` | `String` | Required | Template MD5 checksum<br>**Constraints**: *Minimum Length*: `1` | String getChecksum() | setChecksum(String checksum) |
| `BootMode` | [`BootModeEnum`](../../doc/models/boot-mode-enum.md) | Optional | Boot mode (default: legacy) | BootModeEnum getBootMode() | setBootMode(BootModeEnum bootMode) |
| `Url` | `String` | Required | Template source URL<br>**Constraints**: *Minimum Length*: `1` | String getUrl() | setUrl(String url) |
| `Version` | `String` | Optional | Template version<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getVersion() | setVersion(String version) |

## Example (as JSON)

```json
{
  "maintainer": "maintainer8",
  "description": "description4",
  "ssh-key-enabled": false,
  "name": "name4",
  "default-user": "default-user6",
  "size": 54,
  "password-enabled": false,
  "build": "build0",
  "checksum": "checksum6",
  "url": "url8"
}
```

