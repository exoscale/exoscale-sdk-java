
# Block Storage Volume

Block storage volume

## Structure

`BlockStorageVolume`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `Instance` | [`InstanceTarget`](../../doc/models/instance-target.md) | Optional | Target Instance | InstanceTarget getInstance() | setInstance(InstanceTarget instance) |
| `Name` | `String` | Optional | Volume name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `State` | [`State9Enum`](../../doc/models/state-9-enum.md) | Optional | Volume state | State9Enum getState() | setState(State9Enum state) |
| `Size` | `Long` | Optional | Volume size<br>**Constraints**: `>= 10`, `<= 10240` | Long getSize() | setSize(Long size) |
| `Blocksize` | `Long` | Optional | Volume block size<br>**Constraints**: `>= 0` | Long getBlocksize() | setBlocksize(Long blocksize) |
| `BlockStorageSnapshots` | [`List<BlockStorageSnapshotTarget>`](../../doc/models/block-storage-snapshot-target.md) | Optional | Volume snapshots, if any | List<BlockStorageSnapshotTarget> getBlockStorageSnapshots() | setBlockStorageSnapshots(List<BlockStorageSnapshotTarget> blockStorageSnapshots) |
| `Id` | `UUID` | Optional | Volume ID | UUID getId() | setId(UUID id) |
| `CreatedAt` | `LocalDateTime` | Optional | Volume creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |

## Example (as JSON)

```json
{
  "labels": {
    "key0": "labels6"
  },
  "instance": {
    "id": "00001032-0000-0000-0000-000000000000"
  },
  "name": "name0",
  "state": "deleted",
  "size": 126
}
```

