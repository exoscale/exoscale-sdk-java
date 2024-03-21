
# Block Storage Snapshot Response

## Structure

`BlockStorageSnapshotResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BlockStorageSnapshots` | [`List<BlockStorageSnapshot>`](../../doc/models/block-storage-snapshot.md) | Optional | - | List<BlockStorageSnapshot> getBlockStorageSnapshots() | setBlockStorageSnapshots(List<BlockStorageSnapshot> blockStorageSnapshots) |

## Example (as JSON)

```json
{
  "block-storage-snapshots": [
    {
      "id": "00002572-0000-0000-0000-000000000000",
      "name": "name6",
      "size": 16,
      "created-at": "2016-03-13T12:52:32.123Z",
      "state": "creating"
    }
  ]
}
```

