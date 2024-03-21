
# Block Storage Request 1

## Structure

`BlockStorageRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Volume name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Size` | `Long` | Optional | Volume size in GB.<br>When a snapshot ID is supplied, this defaults to the size of the source volume, but can be set to a larger value.<br>**Constraints**: `>= 10`, `<= 10240` | Long getSize() | setSize(Long size) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `BlockStorageSnapshot` | [`BlockStorageSnapshotTarget`](../../doc/models/block-storage-snapshot-target.md) | Optional | Target block storage snapshot | BlockStorageSnapshotTarget getBlockStorageSnapshot() | setBlockStorageSnapshot(BlockStorageSnapshotTarget blockStorageSnapshot) |

## Example (as JSON)

```json
{
  "name": "name2",
  "size": 212,
  "labels": {
    "key0": "labels0",
    "key1": "labels9",
    "key2": "labels8"
  },
  "block-storage-snapshot": {
    "id": "0000042a-0000-0000-0000-000000000000"
  }
}
```

