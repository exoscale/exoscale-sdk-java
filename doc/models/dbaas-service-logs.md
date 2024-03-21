
# Dbaas Service Logs

## Structure

`DbaasServiceLogs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offset` | `String` | Optional | - | String getOffset() | setOffset(String offset) |
| `FirstLogOffset` | `String` | Optional | - | String getFirstLogOffset() | setFirstLogOffset(String firstLogOffset) |
| `Logs` | [`List<Log>`](../../doc/models/log.md) | Optional | - | List<Log> getLogs() | setLogs(List<Log> logs) |

## Example (as JSON)

```json
{
  "offset": "offset0",
  "first-log-offset": "first-log-offset8",
  "logs": [
    {
      "unit": "unit6",
      "time": "time8",
      "message": "message8",
      "node": "node6"
    },
    {
      "unit": "unit6",
      "time": "time8",
      "message": "message8",
      "node": "node6"
    },
    {
      "unit": "unit6",
      "time": "time8",
      "message": "message8",
      "node": "node6"
    }
  ]
}
```

