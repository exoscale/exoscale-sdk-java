
# Git Lab Auth Integration

## Structure

`GitLabAuthIntegration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllowSignUp` | `Boolean` | Optional | - | Boolean getAllowSignUp() | setAllowSignUp(Boolean allowSignUp) |
| `ApiUrl` | `String` | Optional | **Constraints**: *Maximum Length*: `2048` | String getApiUrl() | setApiUrl(String apiUrl) |
| `AuthUrl` | `String` | Optional | **Constraints**: *Maximum Length*: `2048` | String getAuthUrl() | setAuthUrl(String authUrl) |
| `ClientId` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientSecret() | setClientSecret(String clientSecret) |
| `AllowedGroups` | `List<String>` | Required | **Constraints**: *Maximum Items*: `50`, *Maximum Length*: `256`, *Pattern*: `^[a-z0-9-_/]+$` | List<String> getAllowedGroups() | setAllowedGroups(List<String> allowedGroups) |
| `TokenUrl` | `String` | Optional | **Constraints**: *Maximum Length*: `2048` | String getTokenUrl() | setTokenUrl(String tokenUrl) |

## Example (as JSON)

```json
{
  "allow_sign_up": false,
  "api_url": "https://gitlab.com/api/v4",
  "auth_url": "https://gitlab.com/oauth/authorize",
  "client_id": "b1ba0bf54a4c2c0a1c29",
  "client_secret": "bfa6gea4f129076761dcba8ce5e1e406bd83af7b",
  "allowed_groups": [
    "allowed_groups2",
    "allowed_groups3"
  ],
  "token_url": "https://gitlab.com/oauth/token"
}
```

