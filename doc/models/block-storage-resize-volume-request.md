
# Block Storage Resize Volume Request

## Structure

`BlockStorageResizeVolumeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Size` | `long` | Required | Volume size in GB<br>**Constraints**: `>= 11`, `<= 10240` | long getSize() | setSize(long size) |

## Example (as JSON)

```json
{
  "size": 68
}
```

