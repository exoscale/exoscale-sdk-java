# LoadBalancerServerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**publicIp** | **String** | Backend server public IP |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the instance&#x27;s healthcheck |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
FAILURE | &quot;failure&quot;
SUCCESS | &quot;success&quot;
