
# Iam Policy

Policy

## Structure

`IamPolicy`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DefaultServiceStrategy` | [`DefaultServiceStrategyEnum`](../../doc/models/default-service-strategy-enum.md) | Required | IAM default service strategy | DefaultServiceStrategyEnum getDefaultServiceStrategy() | setDefaultServiceStrategy(DefaultServiceStrategyEnum defaultServiceStrategy) |
| `Services` | [`Map<String, IamServicePolicy>`](../../doc/models/iam-service-policy.md) | Required | IAM services | Map<String, IamServicePolicy> getServices() | setServices(Map<String, IamServicePolicy> services) |

## Example (as JSON)

```json
{
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
    },
    "key1": {
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
    },
    "key2": {
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
```

