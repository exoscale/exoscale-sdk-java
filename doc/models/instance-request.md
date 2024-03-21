
# Instance Request

## Structure

`InstanceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Instance name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `UserData` | `String` | Optional | Instance Cloud-init user-data<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32768` | String getUserData() | setUserData(String userData) |
| `PublicIpAssignment` | [`PublicIpAssignmentEnum`](../../doc/models/public-ip-assignment-enum.md) | Optional | - | PublicIpAssignmentEnum getPublicIpAssignment() | setPublicIpAssignment(PublicIpAssignmentEnum publicIpAssignment) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "name": "name8",
  "user-data": "user-data4",
  "public-ip-assignment": "dual",
  "labels": {
    "key0": "labels6",
    "key1": "labels7",
    "key2": "labels8"
  }
}
```

