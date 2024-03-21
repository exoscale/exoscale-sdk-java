
# Quota

Organization Quota

## Structure

`Quota`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Resource` | `String` | Optional | Resource Name | String getResource() | setResource(String resource) |
| `Usage` | `Long` | Optional | Resource Usage | Long getUsage() | setUsage(Long usage) |
| `Limit` | `Long` | Optional | Resource Limit. -1 for Unlimited | Long getLimit() | setLimit(Long limit) |

## Example (as JSON)

```json
{
  "resource": "resource8",
  "usage": 180,
  "limit": 30
}
```

