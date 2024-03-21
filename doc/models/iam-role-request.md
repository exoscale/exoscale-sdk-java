
# Iam Role Request

## Structure

`IamRoleRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | IAM Role description<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Permissions` | [`List<Permission2Enum>`](../../doc/models/permission-2-enum.md) | Optional | IAM Role permissions<br>**Constraints**: *Unique Items Required* | List<Permission2Enum> getPermissions() | setPermissions(List<Permission2Enum> permissions) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "description": "description6",
  "permissions": [
    "bypass-governance-retention",
    "bypass-governance-retention",
    "bypass-governance-retention"
  ],
  "labels": {
    "key0": "labels4"
  }
}
```

