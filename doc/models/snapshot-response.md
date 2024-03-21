
# Snapshot Response

## Structure

`SnapshotResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Snapshots` | [`List<Snapshot>`](../../doc/models/snapshot.md) | Optional | - | List<Snapshot> getSnapshots() | setSnapshots(List<Snapshot> snapshots) |

## Example (as JSON)

```json
{
  "snapshots": [
    {
      "id": "000000f2-0000-0000-0000-000000000000",
      "name": "name2",
      "created-at": "2016-03-13T12:52:32.123Z",
      "state": "snapshotting",
      "size": 192
    }
  ]
}
```

