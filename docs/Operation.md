# Operation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Operation ID |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | Operation failure reason |  [optional]
**reference** | [**OperationReference**](OperationReference.md) |  |  [optional]
**message** | **String** | Operation message |  [optional]
**state** | [**StateEnum**](#StateEnum) | Operation status |  [optional]

<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
INCORRECT | &quot;incorrect&quot;
UNKNOWN | &quot;unknown&quot;
UNAVAILABLE | &quot;unavailable&quot;
FORBIDDEN | &quot;forbidden&quot;
BUSY | &quot;busy&quot;
FAULT | &quot;fault&quot;
PARTIAL | &quot;partial&quot;
NOT_FOUND | &quot;not-found&quot;
INTERRUPTED | &quot;interrupted&quot;
UNSUPPORTED | &quot;unsupported&quot;
CONFLICT | &quot;conflict&quot;

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
FAILURE | &quot;failure&quot;
PENDING | &quot;pending&quot;
SUCCESS | &quot;success&quot;
TIMEOUT | &quot;timeout&quot;
