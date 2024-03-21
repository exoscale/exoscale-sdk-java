
# Block Storage Snapshot

Block storage snapshot

## Structure

`BlockStorageSnapshot`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Snapshot ID | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | Snapshot name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Size` | `Long` | Optional | Snapshot size<br>**Constraints**: `>= 10`, `<= 10240` | Long getSize() | setSize(Long size) |
| `CreatedAt` | `LocalDateTime` | Optional | Snapshot creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `State` | [`State8Enum`](../../doc/models/state-8-enum.md) | Optional | Snapshot state | State8Enum getState() | setState(State8Enum state) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `BlockStorageVolume` | [`BlockStorageVolumeTarget`](../../doc/models/block-storage-volume-target.md) | Optional | Target block storage volume | BlockStorageVolumeTarget getBlockStorageVolume() | setBlockStorageVolume(BlockStorageVolumeTarget blockStorageVolume) |

## Example (as JSON)

```json
{
  "id": "0000042a-0000-0000-0000-000000000000",
  "name": "name6",
  "size": 56,
  "created-at": "2016-03-13T12:52:32.123Z",
  "state": "creating"
}
```

