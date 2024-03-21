
# Opensearch ISM History Settings

## Structure

`OpensearchISMHistorySettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IsmEnabled` | `Boolean` | Required | **Default**: `true` | Boolean getIsmEnabled() | setIsmEnabled(Boolean ismEnabled) |
| `IsmHistoryEnabled` | `Boolean` | Optional | **Default**: `true` | Boolean getIsmHistoryEnabled() | setIsmHistoryEnabled(Boolean ismHistoryEnabled) |
| `IsmHistoryMaxAge` | `Integer` | Optional | **Default**: `24`<br>**Constraints**: `>= 1`, `<= 2147483647` | Integer getIsmHistoryMaxAge() | setIsmHistoryMaxAge(Integer ismHistoryMaxAge) |
| `IsmHistoryMaxDocs` | `Integer` | Optional | **Default**: `2500000`<br>**Constraints**: `>= 1`, `<= 9.223372036854776E+18` | Integer getIsmHistoryMaxDocs() | setIsmHistoryMaxDocs(Integer ismHistoryMaxDocs) |
| `IsmHistoryRolloverCheckPeriod` | `Integer` | Optional | **Default**: `8`<br>**Constraints**: `>= 1`, `<= 2147483647` | Integer getIsmHistoryRolloverCheckPeriod() | setIsmHistoryRolloverCheckPeriod(Integer ismHistoryRolloverCheckPeriod) |
| `IsmHistoryRolloverRetentionPeriod` | `Integer` | Optional | **Default**: `30`<br>**Constraints**: `>= 1`, `<= 2147483647` | Integer getIsmHistoryRolloverRetentionPeriod() | setIsmHistoryRolloverRetentionPeriod(Integer ismHistoryRolloverRetentionPeriod) |

## Example (as JSON)

```json
{
  "ism_enabled": true,
  "ism_history_enabled": true,
  "ism_history_max_age": 24,
  "ism_history_max_docs": 2500000,
  "ism_history_rollover_check_period": 8,
  "ism_history_rollover_retention_period": 30
}
```

