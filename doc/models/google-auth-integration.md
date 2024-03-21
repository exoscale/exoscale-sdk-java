
# Google Auth Integration

## Structure

`GoogleAuthIntegration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllowSignUp` | `Boolean` | Optional | - | Boolean getAllowSignUp() | setAllowSignUp(Boolean allowSignUp) |
| `ClientId` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientSecret() | setClientSecret(String clientSecret) |
| `AllowedDomains` | `List<String>` | Required | **Constraints**: *Maximum Items*: `64`, *Maximum Length*: `255` | List<String> getAllowedDomains() | setAllowedDomains(List<String> allowedDomains) |

## Example (as JSON)

```json
{
  "allow_sign_up": false,
  "client_id": "b1ba0bf54a4c2c0a1c29",
  "client_secret": "bfa6gea4f129076761dcba8ce5e1e406bd83af7b",
  "allowed_domains": [
    "allowed_domains7",
    "allowed_domains8"
  ]
}
```

