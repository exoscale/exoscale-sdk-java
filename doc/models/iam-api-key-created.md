
# Iam Api Key Created

IAM API Key

## Structure

`IamApiKeyCreated`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | IAM API Key name | String getName() | setName(String name) |
| `Key` | `String` | Optional | IAM API Key | String getKey() | setKey(String key) |
| `Secret` | `String` | Optional | IAM API Key Secret | String getSecret() | setSecret(String secret) |
| `RoleId` | `UUID` | Optional | IAM API Key Role ID | UUID getRoleId() | setRoleId(UUID roleId) |

## Example (as JSON)

```json
{
  "name": "name2",
  "key": "key2",
  "secret": "secret8",
  "role-id": "00000340-0000-0000-0000-000000000000"
}
```

