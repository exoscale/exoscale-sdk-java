
# Maintenance

Automatic maintenance settings

## Structure

`Maintenance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Dow` | [`DowEnum`](../../doc/models/dow-enum.md) | Required | Day of week for installing updates | DowEnum getDow() | setDow(DowEnum dow) |
| `Time` | `String` | Required | Time for installing updates, UTC<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `8` | String getTime() | setTime(String time) |

## Example (as JSON)

```json
{
  "dow": "saturday",
  "time": "time6"
}
```

