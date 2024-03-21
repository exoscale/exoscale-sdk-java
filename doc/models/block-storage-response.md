
# Block Storage Response

## Structure

`BlockStorageResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BlockStorageVolumes` | [`List<BlockStorageVolume>`](../../doc/models/block-storage-volume.md) | Optional | - | List<BlockStorageVolume> getBlockStorageVolumes() | setBlockStorageVolumes(List<BlockStorageVolume> blockStorageVolumes) |

## Example (as JSON)

```json
{
  "block-storage-volumes": [
    {
      "labels": {
        "key0": "labels8",
        "key1": "labels9"
      },
      "instance": {
        "id": "00001032-0000-0000-0000-000000000000"
      },
      "name": "name6",
      "state": "creating",
      "size": 242
    },
    {
      "labels": {
        "key0": "labels8",
        "key1": "labels9"
      },
      "instance": {
        "id": "00001032-0000-0000-0000-000000000000"
      },
      "name": "name6",
      "state": "creating",
      "size": 242
    }
  ]
}
```

