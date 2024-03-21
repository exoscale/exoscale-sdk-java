
# Rule

## Structure

`Rule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Index` | `String` | Required | OpenSearch index pattern<br>**Constraints**: *Maximum Length*: `249`, *Pattern*: `[^\s\/]+` | String getIndex() | setIndex(String index) |
| `Permission` | [`EnumOpensearchRulePermissionEnum`](../../doc/models/enum-opensearch-rule-permission-enum.md) | Optional | - | EnumOpensearchRulePermissionEnum getPermission() | setPermission(EnumOpensearchRulePermissionEnum permission) |

## Example (as JSON)

```json
{
  "index": "index2",
  "permission": "readwrite"
}
```

