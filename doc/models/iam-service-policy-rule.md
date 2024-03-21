
# Iam Service Policy Rule

## Structure

`IamServicePolicyRule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | [`ActionEnum`](../../doc/models/action-enum.md) | Optional | - | ActionEnum getAction() | setAction(ActionEnum action) |
| `Expression` | `String` | Optional | - | String getExpression() | setExpression(String expression) |
| `Resources` | `List<String>` | Optional | - | List<String> getResources() | setResources(List<String> resources) |

## Example (as JSON)

```json
{
  "action": "allow",
  "expression": "expression8",
  "resources": [
    "resources9",
    "resources8"
  ]
}
```

