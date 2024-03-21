
# Sks Cluster Nodepool Evict Request

## Structure

`SksClusterNodepoolEvictRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Instances` | `List<UUID>` | Optional | **Constraints**: *Unique Items Required* | List<UUID> getInstances() | setInstances(List<UUID> instances) |

## Example (as JSON)

```json
{
  "instances": [
    "0000170f-0000-0000-0000-000000000000"
  ]
}
```

