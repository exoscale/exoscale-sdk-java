

# ConfigureLogCleanerForTopicCompaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logCleanerDeleteRetentionMs** | **Integer** | How long are delete records retained? |  [optional] |
|**logCleanerMaxCompactionLagMs** | **Integer** | The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted |  [optional] |
|**logCleanerMinCleanableRatio** | **BigDecimal** | Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option. |  [optional] |
|**logCleanerMinCompactionLagMs** | **Integer** | The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted. |  [optional] |
|**logCleanupPolicy** | [**LogCleanupPolicyEnum**](#LogCleanupPolicyEnum) | The default cleanup policy for segments beyond the retention window |  [optional] |



## Enum: LogCleanupPolicyEnum

| Name | Value |
|---- | -----|
| DELETE | &quot;delete&quot; |
| COMPACT | &quot;compact&quot; |
| COMPACT_DELETE | &quot;compact,delete&quot; |



