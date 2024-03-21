
# Generic O Auth Integration

## Structure

`GenericOAuthIntegration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Scopes` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `50`, *Maximum Length*: `256`, *Pattern*: `^[\S]+$` | List<String> getScopes() | setScopes(List<String> scopes) |
| `AllowedDomains` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `50`, *Maximum Length*: `255` | List<String> getAllowedDomains() | setAllowedDomains(List<String> allowedDomains) |
| `AllowedOrganizations` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `50`, *Maximum Length*: `256`, *Pattern*: `^[\S]+$` | List<String> getAllowedOrganizations() | setAllowedOrganizations(List<String> allowedOrganizations) |
| `TokenUrl` | `String` | Required | **Constraints**: *Maximum Length*: `2048` | String getTokenUrl() | setTokenUrl(String tokenUrl) |
| `Name` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^[a-zA-Z0-9_\- ]+$` | String getName() | setName(String name) |
| `AuthUrl` | `String` | Required | **Constraints**: *Maximum Length*: `2048` | String getAuthUrl() | setAuthUrl(String authUrl) |
| `ApiUrl` | `String` | Required | **Constraints**: *Maximum Length*: `2048` | String getApiUrl() | setApiUrl(String apiUrl) |
| `AutoLogin` | `Boolean` | Optional | - | Boolean getAutoLogin() | setAutoLogin(Boolean autoLogin) |
| `ClientId` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientSecret() | setClientSecret(String clientSecret) |
| `AllowSignUp` | `Boolean` | Optional | - | Boolean getAllowSignUp() | setAllowSignUp(Boolean allowSignUp) |

## Example (as JSON)

```json
{
  "token_url": "https://yourprovider.com/oauth/token",
  "name": "My authentication",
  "auth_url": "https://yourprovider.com/oauth/authorize",
  "api_url": "https://yourprovider.com/api",
  "auto_login": false,
  "client_id": "b1ba0bf54a4c2c0a1c29",
  "client_secret": "bfa6gea4f129076761dcba8ce5e1e406bd83af7b",
  "allow_sign_up": false,
  "scopes": [
    "scopes0",
    "scopes9"
  ],
  "allowed_domains": [
    "allowed_domains9"
  ],
  "allowed_organizations": [
    "allowed_organizations8"
  ]
}
```

