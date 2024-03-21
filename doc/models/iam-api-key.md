
# Iam Api Key

IAM API Key

## Structure

`IamApiKey`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | IAM API Key name | String getName() | setName(String name) |
| `Key` | `String` | Optional | IAM API Key | String getKey() | setKey(String key) |
| `RoleId` | `UUID` | Optional | IAM API Key Role ID | UUID getRoleId() | setRoleId(UUID roleId) |

## Example (as JSON)

```json
{
  "name": "name4",
  "key": "key4",
  "role-id": "000003ca-0000-0000-0000-000000000000"
}
```

