
# Azure ADO Auth Integration

## Structure

`AzureADOAuthIntegration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllowSignUp` | `Boolean` | Optional | - | Boolean getAllowSignUp() | setAllowSignUp(Boolean allowSignUp) |
| `ClientId` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientSecret() | setClientSecret(String clientSecret) |
| `AuthUrl` | `String` | Required | **Constraints**: *Maximum Length*: `2048` | String getAuthUrl() | setAuthUrl(String authUrl) |
| `TokenUrl` | `String` | Required | **Constraints**: *Maximum Length*: `2048` | String getTokenUrl() | setTokenUrl(String tokenUrl) |
| `AllowedGroups` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `50`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$` | List<String> getAllowedGroups() | setAllowedGroups(List<String> allowedGroups) |
| `AllowedDomains` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `50`, *Maximum Length*: `255` | List<String> getAllowedDomains() | setAllowedDomains(List<String> allowedDomains) |

## Example (as JSON)

```json
{
  "allow_sign_up": false,
  "client_id": "b1ba0bf54a4c2c0a1c29",
  "client_secret": "bfa6gea4f129076761dcba8ce5e1e406bd83af7b",
  "auth_url": "https://login.microsoftonline.com/<AZURE_TENANT_ID>/oauth2/v2.0/authorize",
  "token_url": "https://login.microsoftonline.com/<AZURE_TENANT_ID>/oauth2/v2.0/token",
  "allowed_groups": [
    "allowed_groups8"
  ],
  "allowed_domains": [
    "allowed_domains1",
    "allowed_domains2"
  ]
}
```

