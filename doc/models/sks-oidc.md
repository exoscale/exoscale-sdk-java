
# Sks Oidc

SKS Cluster OpenID config map

## Structure

`SksOidc`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ClientId` | `String` | Required | OpenID client ID<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getClientId() | setClientId(String clientId) |
| `IssuerUrl` | `String` | Required | OpenID provider URL<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getIssuerUrl() | setIssuerUrl(String issuerUrl) |
| `UsernameClaim` | `String` | Optional | JWT claim to use as the user name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getUsernameClaim() | setUsernameClaim(String usernameClaim) |
| `UsernamePrefix` | `String` | Optional | Prefix prepended to username claims<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getUsernamePrefix() | setUsernamePrefix(String usernamePrefix) |
| `GroupsClaim` | `String` | Optional | JWT claim to use as the user's group<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getGroupsClaim() | setGroupsClaim(String groupsClaim) |
| `GroupsPrefix` | `String` | Optional | Prefix prepended to group claims<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getGroupsPrefix() | setGroupsPrefix(String groupsPrefix) |
| `RequiredClaim` | `Map<String, String>` | Optional | A key value map that describes a required claim in the ID Token | Map<String, String> getRequiredClaim() | setRequiredClaim(Map<String, String> requiredClaim) |

## Example (as JSON)

```json
{
  "client-id": "client-id8",
  "issuer-url": "issuer-url2",
  "username-claim": "username-claim8",
  "username-prefix": "username-prefix0",
  "groups-claim": "groups-claim4",
  "groups-prefix": "groups-prefix0",
  "required-claim": {
    "key0": "required-claim3"
  }
}
```

