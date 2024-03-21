
# Iam Role

IAM Role

## Structure

`IamRole`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | IAM Role ID | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | IAM Role name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | IAM Role description<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Permissions` | [`List<Permission2Enum>`](../../doc/models/permission-2-enum.md) | Optional | IAM Role permissions<br>**Constraints**: *Unique Items Required* | List<Permission2Enum> getPermissions() | setPermissions(List<Permission2Enum> permissions) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `Editable` | `Boolean` | Optional | IAM Role mutability | Boolean getEditable() | setEditable(Boolean editable) |
| `Policy` | [`IamPolicy`](../../doc/models/iam-policy.md) | Optional | Policy | IamPolicy getPolicy() | setPolicy(IamPolicy policy) |

## Example (as JSON)

```json
{
  "id": "00000f8c-0000-0000-0000-000000000000",
  "name": "name0",
  "description": "description0",
  "permissions": [
    "bypass-governance-retention",
    "bypass-governance-retention"
  ],
  "labels": {
    "key0": "labels4",
    "key1": "labels5"
  }
}
```

