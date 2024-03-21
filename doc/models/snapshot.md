
# Snapshot

Snapshot

## Structure

`Snapshot`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Snapshot ID | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | Snapshot name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `CreatedAt` | `LocalDateTime` | Optional | Snapshot creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `State` | [`State3Enum`](../../doc/models/state-3-enum.md) | Optional | Snapshot state | State3Enum getState() | setState(State3Enum state) |
| `Size` | `Long` | Optional | Snapshot size in GB<br>**Constraints**: `>= 10`, `<= 50000` | Long getSize() | setSize(Long size) |
| `Export` | [`Export`](../../doc/models/export.md) | Optional | Exported snapshot information | Export getExport() | setExport(Export export) |
| `Instance` | [`Instance`](../../doc/models/instance.md) | Optional | Instance | Instance getInstance() | setInstance(Instance instance) |

## Example (as JSON)

```json
{
  "id": "00000ed6-0000-0000-0000-000000000000",
  "name": "name8",
  "created-at": "2016-03-13T12:52:32.123Z",
  "state": "error",
  "size": 140
}
```

