
# Block Storage Create Snapshot Request

## Structure

`BlockStorageCreateSnapshotRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Snapshot name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "name": "name4",
  "labels": {
    "key0": "labels2",
    "key1": "labels3"
  }
}
```

