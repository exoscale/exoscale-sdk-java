

# SearchBackpressureSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | The search backpressure mode. Valid values are monitor_only, enforced, or disabled. Default is monitor_only |  [optional] |
|**nodeDuress** | [**NodeDuressSettings**](NodeDuressSettings.md) |  |  [optional] |
|**searchShardTask** | [**SearchShardSettings**](SearchShardSettings.md) |  |  [optional] |
|**searchTask** | [**SearchTaskSettings**](SearchTaskSettings.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| MONITOR_ONLY | &quot;monitor_only&quot; |
| ENFORCED | &quot;enforced&quot; |
| DISABLED | &quot;disabled&quot; |



