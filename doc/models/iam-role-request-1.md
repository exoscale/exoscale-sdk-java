
# Iam Role Request 1

## Structure

`IamRoleRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | IAM Role name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `191` | String getName() | setName(String name) |
| `Description` | `String` | Optional | IAM Role description<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Permissions` | [`List<Permission2Enum>`](../../doc/models/permission-2-enum.md) | Optional | IAM Role permissions<br>**Constraints**: *Unique Items Required* | List<Permission2Enum> getPermissions() | setPermissions(List<Permission2Enum> permissions) |
| `Editable` | `Boolean` | Optional | Sets if the IAM Role Policy is editable or not (default: true). This setting cannot be changed after creation | Boolean getEditable() | setEditable(Boolean editable) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `Policy` | [`IamPolicy`](../../doc/models/iam-policy.md) | Optional | Policy | IamPolicy getPolicy() | setPolicy(IamPolicy policy) |

## Example (as JSON)

```json
{
  "name": "name4",
  "description": "description4",
  "permissions": [
    "bypass-governance-retention",
    "bypass-governance-retention",
    "bypass-governance-retention"
  ],
  "editable": false,
  "labels": {
    "key0": "labels2"
  },
  "policy": {
    "default-service-strategy": "allow",
    "services": {
      "key0": {
        "type": "allow",
        "rules": [
          {
            "action": "allow",
            "expression": "expression4",
            "resources": [
              "resources7",
              "resources8"
            ]
          },
          {
            "action": "allow",
            "expression": "expression4",
            "resources": [
              "resources7",
              "resources8"
            ]
          }
        ]
      }
    }
  }
}
```

