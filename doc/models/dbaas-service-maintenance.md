
# Dbaas Service Maintenance

Automatic maintenance settings

## Structure

`DbaasServiceMaintenance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Dow` | [`DowEnum`](../../doc/models/dow-enum.md) | Required | Day of week for installing updates | DowEnum getDow() | setDow(DowEnum dow) |
| `Time` | `String` | Required | Time for installing updates, UTC<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `8` | String getTime() | setTime(String time) |
| `Updates` | [`List<DbaasServiceUpdate>`](../../doc/models/dbaas-service-update.md) | Required | List of updates waiting to be installed | List<DbaasServiceUpdate> getUpdates() | setUpdates(List<DbaasServiceUpdate> updates) |

## Example (as JSON)

```json
{
  "dow": "sunday",
  "time": "time2",
  "updates": [
    {
      "description": "description0",
      "deadline": "2016-03-13T12:52:32.123Z",
      "start-after": "2016-03-13T12:52:32.123Z",
      "start-at": "2016-03-13T12:52:32.123Z"
    }
  ]
}
```

