

# Operation

Operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Operation ID |  [optional] [readonly] |
|**reason** | [**ReasonEnum**](#ReasonEnum) | Operation failure reason |  [optional] [readonly] |
|**reference** | [**OperationReference**](OperationReference.md) |  |  [optional] |
|**message** | **String** | Operation message |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | Operation status |  [optional] [readonly] |



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



## Enum: StateEnum

| Name | Value |
|---- | -----|
| FAILURE | &quot;failure&quot; |
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| TIMEOUT | &quot;timeout&quot; |



