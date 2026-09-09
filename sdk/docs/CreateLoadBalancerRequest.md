

# CreateLoadBalancerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Load Balancer description |  [optional] |
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Load Balancer address family (default: :inet4) |  [optional] |
|**name** | **String** | Load Balancer name |  |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: AddressfamilyEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| INET6 | &quot;inet6&quot; |



