
# Quota Response

## Structure

`QuotaResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Quotas` | [`List<Quota>`](../../doc/models/quota.md) | Optional | - | List<Quota> getQuotas() | setQuotas(List<Quota> quotas) |

## Example (as JSON)

```json
{
  "quotas": [
    {
      "resource": "resource8",
      "usage": 122,
      "limit": 88
    }
  ]
}
```

