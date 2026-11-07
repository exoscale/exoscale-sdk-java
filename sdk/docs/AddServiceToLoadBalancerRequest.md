

# AddServiceToLoadBalancerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Load Balancer Service description |  [optional] |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Network traffic protocol |  |
|**name** | **String** | Load Balancer Service name |  |
|**targetPort** | **Long** | Port on which the network traffic will be forwarded to on the receiving instance |  |
|**port** | **Long** | Port exposed on the Load Balancer&#39;s public IP |  |
|**instancePool** | [**InstancePool**](InstancePool.md) |  |  [optional] |
|**strategy** | [**StrategyEnum**](#StrategyEnum) | Load balancing strategy |  |
|**healthcheck** | [**LoadBalancerServiceHealthcheck**](LoadBalancerServiceHealthcheck.md) |  |  |
|**labelSelector** | [**LoadBalancerServiceLabelSelector**](LoadBalancerServiceLabelSelector.md) |  |  [optional] |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| TCP | &quot;tcp&quot; |
| UDP | &quot;udp&quot; |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| ROUND_ROBIN | &quot;round-robin&quot; |
| MAGLEV_HASH | &quot;maglev-hash&quot; |
| SOURCE_HASH | &quot;source-hash&quot; |



