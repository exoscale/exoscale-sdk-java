
# Github Auth Integration

## Structure

`GithubAuthIntegration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllowSignUp` | `Boolean` | Optional | - | Boolean getAllowSignUp() | setAllowSignUp(Boolean allowSignUp) |
| `ClientId` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Required | **Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[ -~]+$` | String getClientSecret() | setClientSecret(String clientSecret) |
| `TeamIds` | `List<Integer>` | Optional | **Constraints**: *Maximum Items*: `50`, `>= 1`, `<= 9.223372036854776E+18` | List<Integer> getTeamIds() | setTeamIds(List<Integer> teamIds) |
| `AllowedOrganizations` | `List<String>` | Optional | **Constraints**: *Maximum Items*: `50`, *Maximum Length*: `256`, *Pattern*: `^[A-Za-z0-9-]+$` | List<String> getAllowedOrganizations() | setAllowedOrganizations(List<String> allowedOrganizations) |

## Example (as JSON)

```json
{
  "allow_sign_up": false,
  "client_id": "b1ba0bf54a4c2c0a1c29",
  "client_secret": "bfa6gea4f129076761dcba8ce5e1e406bd83af7b",
  "team_ids": [
    193,
    194,
    195
  ],
  "allowed_organizations": [
    "allowed_organizations0"
  ]
}
```

