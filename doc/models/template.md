
# Template

Instance template

## Structure

`Template`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Maintainer` | `String` | Optional | Template maintainer | String getMaintainer() | setMaintainer(String maintainer) |
| `Description` | `String` | Optional | Template description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `SshKeyEnabled` | `Boolean` | Optional | Enable SSH key-based login | Boolean getSshKeyEnabled() | setSshKeyEnabled(Boolean sshKeyEnabled) |
| `Family` | `String` | Optional | Template family | String getFamily() | setFamily(String family) |
| `Name` | `String` | Optional | Template name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `DefaultUser` | `String` | Optional | Template default user<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getDefaultUser() | setDefaultUser(String defaultUser) |
| `Size` | `Long` | Optional | Template size<br>**Constraints**: `> 0` | Long getSize() | setSize(Long size) |
| `PasswordEnabled` | `Boolean` | Optional | Enable password-based login | Boolean getPasswordEnabled() | setPasswordEnabled(Boolean passwordEnabled) |
| `Build` | `String` | Optional | Template build | String getBuild() | setBuild(String build) |
| `Checksum` | `String` | Optional | Template MD5 checksum | String getChecksum() | setChecksum(String checksum) |
| `BootMode` | [`BootModeEnum`](../../doc/models/boot-mode-enum.md) | Optional | Boot mode (default: legacy) | BootModeEnum getBootMode() | setBootMode(BootModeEnum bootMode) |
| `Id` | `UUID` | Optional | Template ID | UUID getId() | setId(UUID id) |
| `Zones` | [`List<ZoneNameEnum>`](../../doc/models/zone-name-enum.md) | Optional | Zones availability | List<ZoneNameEnum> getZones() | setZones(List<ZoneNameEnum> zones) |
| `Url` | `String` | Optional | Template source URL | String getUrl() | setUrl(String url) |
| `Version` | `String` | Optional | Template version | String getVersion() | setVersion(String version) |
| `CreatedAt` | `LocalDateTime` | Optional | Template creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Visibility` | [`Visibility1Enum`](../../doc/models/visibility-1-enum.md) | Optional | Template visibility | Visibility1Enum getVisibility() | setVisibility(Visibility1Enum visibility) |

## Example (as JSON)

```json
{
  "maintainer": "maintainer0",
  "description": "description4",
  "ssh-key-enabled": false,
  "family": "family8",
  "name": "name6"
}
```

