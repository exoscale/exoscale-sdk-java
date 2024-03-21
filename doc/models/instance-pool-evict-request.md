
# Instance Pool Evict Request

## Structure

`InstancePoolEvictRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Instances` | `List<UUID>` | Optional | - | List<UUID> getInstances() | setInstances(List<UUID> instances) |

## Example (as JSON)

```json
{
  "instances": [
    "000024af-0000-0000-0000-000000000000",
    "000024b0-0000-0000-0000-000000000000"
  ]
}
```

