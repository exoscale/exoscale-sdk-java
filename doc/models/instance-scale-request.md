
# Instance Scale Request

## Structure

`InstanceScaleRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InstanceType` | [`InstanceType`](../../doc/models/instance-type.md) | Required | Compute instance type | InstanceType getInstanceType() | setInstanceType(InstanceType instanceType) |

## Example (as JSON)

```json
{
  "instance-type": {
    "id": "00001bb6-0000-0000-0000-000000000000",
    "size": "mega",
    "family": "gpu3",
    "cpus": 158,
    "gpus": 2
  }
}
```

