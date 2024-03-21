
# Api Key Request

## Structure

`ApiKeyRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RoleId` | `UUID` | Required | IAM API Key Role ID | UUID getRoleId() | setRoleId(UUID roleId) |
| `Name` | `String` | Required | IAM API Key Name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |

## Example (as JSON)

```json
{
  "role-id": "00002022-0000-0000-0000-000000000000",
  "name": "name8"
}
```

