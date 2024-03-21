
# Iam Service Policy

## Structure

`IamServicePolicy`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type4Enum`](../../doc/models/type-4-enum.md) | Optional | - | Type4Enum getType() | setType(Type4Enum type) |
| `Rules` | [`List<IamServicePolicyRule>`](../../doc/models/iam-service-policy-rule.md) | Optional | - | List<IamServicePolicyRule> getRules() | setRules(List<IamServicePolicyRule> rules) |

## Example (as JSON)

```json
{
  "type": "deny",
  "rules": [
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
```

