
# Configure Log Cleaner for Topic Compaction

## Structure

`ConfigureLogCleanerForTopicCompaction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LogCleanerDeleteRetentionMs` | `Integer` | Optional | How long are delete records retained?<br>**Constraints**: `>= 0`, `<= 315569260000` | Integer getLogCleanerDeleteRetentionMs() | setLogCleanerDeleteRetentionMs(Integer logCleanerDeleteRetentionMs) |
| `LogCleanerMaxCompactionLagMs` | `Integer` | Optional | The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted<br>**Constraints**: `>= 30000`, `<= 9.223372036854776E+18` | Integer getLogCleanerMaxCompactionLagMs() | setLogCleanerMaxCompactionLagMs(Integer logCleanerMaxCompactionLagMs) |
| `LogCleanerMinCleanableRatio` | `Double` | Optional | Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option.<br>**Constraints**: `>= 0.2`, `<= 0.9` | Double getLogCleanerMinCleanableRatio() | setLogCleanerMinCleanableRatio(Double logCleanerMinCleanableRatio) |
| `LogCleanerMinCompactionLagMs` | `Integer` | Optional | The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.<br>**Constraints**: `>= 0`, `<= 9.223372036854776E+18` | Integer getLogCleanerMinCompactionLagMs() | setLogCleanerMinCompactionLagMs(Integer logCleanerMinCompactionLagMs) |
| `LogCleanupPolicy` | [`LogCleanupPolicyEnum`](../../doc/models/log-cleanup-policy-enum.md) | Optional | The default cleanup policy for segments beyond the retention window | LogCleanupPolicyEnum getLogCleanupPolicy() | setLogCleanupPolicy(LogCleanupPolicyEnum logCleanupPolicy) |

## Example (as JSON)

```json
{
  "log_cleaner_delete_retention_ms": 86400000,
  "log_cleaner_min_cleanable_ratio": 0.5,
  "log_cleanup_policy": "delete",
  "log_cleaner_max_compaction_lag_ms": 140,
  "log_cleaner_min_compaction_lag_ms": 68
}
```

