
# Dbaas Task

## Structure

`DbaasTask`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | - | UUID getId() | setId(UUID id) |
| `CreateTime` | `LocalDateTime` | Optional | - | LocalDateTime getCreateTime() | setCreateTime(LocalDateTime createTime) |
| `Result` | `String` | Optional | - | String getResult() | setResult(String result) |
| `ResultCodes` | [`List<ResultCode>`](../../doc/models/result-code.md) | Optional | - | List<ResultCode> getResultCodes() | setResultCodes(List<ResultCode> resultCodes) |
| `Success` | `Boolean` | Optional | - | Boolean getSuccess() | setSuccess(Boolean success) |
| `TaskType` | `String` | Optional | - | String getTaskType() | setTaskType(String taskType) |

## Example (as JSON)

```json
{
  "id": "00000826-0000-0000-0000-000000000000",
  "create-time": "2016-03-13T12:52:32.123Z",
  "result": "result0",
  "result-codes": [
    {
      "code": "code0",
      "dbname": "dbname6"
    },
    {
      "code": "code0",
      "dbname": "dbname6"
    },
    {
      "code": "code0",
      "dbname": "dbname6"
    }
  ],
  "success": false
}
```

