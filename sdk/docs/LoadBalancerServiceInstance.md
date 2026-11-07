

# LoadBalancerServiceInstance

Instance the network traffic is forwarded to

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Instance ID |  [optional] |
|**publicIp** | **String** | Instance IP the network traffic is forwarded to |  [optional] |
|**healthcheckStatus** | [**HealthcheckStatusEnum**](#HealthcheckStatusEnum) | Status of the instance&#39;s healthcheck |  [optional] |



## Enum: HealthcheckStatusEnum

| Name | Value |
|---- | -----|
| FAILURE | &quot;failure&quot; |
| SUCCESS | &quot;success&quot; |



