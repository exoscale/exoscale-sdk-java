

# DbaasNodeStateProgressUpdate

Extra information regarding the progress for current state

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completed** | **Boolean** | Indicates whether this phase has been completed or not |  |
|**current** | **Long** | Current progress for this phase. May be missing or null. |  [optional] |
|**max** | **Long** | Maximum progress value for this phase. May be missing or null. May change. |  [optional] |
|**min** | **Long** | Minimum progress value for this phase. May be missing or null. |  [optional] |
|**phase** | [**PhaseEnum**](#PhaseEnum) | Key identifying this phase |  |
|**unit** | **String** | Unit for current/min/max values. New units may be added.                         If null should be treated as generic unit |  [optional] |



## Enum: PhaseEnum

| Name | Value |
|---- | -----|
| STREAM | &quot;stream&quot; |
| BASEBACKUP | &quot;basebackup&quot; |
| PREPARE | &quot;prepare&quot; |
| FINALIZE | &quot;finalize&quot; |



