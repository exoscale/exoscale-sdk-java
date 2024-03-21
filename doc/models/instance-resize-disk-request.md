
# Instance Resize Disk Request

## Structure

`InstanceResizeDiskRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DiskSize` | `long` | Required | Instance disk size in GB<br>**Constraints**: `>= 10`, `<= 50000` | long getDiskSize() | setDiskSize(long diskSize) |

## Example (as JSON)

```json
{
  "disk-size": 246
}
```

