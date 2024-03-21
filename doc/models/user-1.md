
# User 1

## Structure

`User1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `AccessCert` | `String` | Optional | - | String getAccessCert() | setAccessCert(String accessCert) |
| `AccessCertExpiry` | `LocalDateTime` | Optional | - | LocalDateTime getAccessCertExpiry() | setAccessCertExpiry(LocalDateTime accessCertExpiry) |
| `AccessKey` | `String` | Optional | - | String getAccessKey() | setAccessKey(String accessKey) |

## Example (as JSON)

```json
{
  "type": "type0",
  "username": "username0",
  "password": "password4",
  "access-cert": "access-cert4",
  "access-cert-expiry": "2016-03-13T12:52:32.123Z"
}
```

