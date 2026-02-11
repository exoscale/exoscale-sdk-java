

# Title1

User Operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | Operation state |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Failure reason |  [optional] |
|**id** | **UUID** | Operation ID |  |
|**resource** | [**Title1Resource**](Title1Resource.md) |  |  |
|**message** | **String** | Failure message |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| FAILURE | &quot;failure&quot; |
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| TIMEOUT | &quot;timeout&quot; |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| INCORRECT | &quot;incorrect&quot; |
| UNKNOWN | &quot;unknown&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |
| FORBIDDEN | &quot;forbidden&quot; |
| BUSY | &quot;busy&quot; |
| FAULT | &quot;fault&quot; |
| PARTIAL | &quot;partial&quot; |
| NOT_FOUND | &quot;not-found&quot; |
| INTERRUPTED | &quot;interrupted&quot; |
| UNSUPPORTED | &quot;unsupported&quot; |
| CONFLICT | &quot;conflict&quot; |



