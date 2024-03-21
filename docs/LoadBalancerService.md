# LoadBalancerService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Load Balancer Service description |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Network traffic protocol |  [optional]
**name** | **String** | Load Balancer Service name |  [optional]
**state** | [**StateEnum**](#StateEnum) | Load Balancer Service state |  [optional]
**targetPort** | **Long** | Port on which the network traffic will be forwarded to on the receiving instance |  [optional]
**port** | **Long** | Port exposed on the Load Balancer&#x27;s public IP |  [optional]
**instancePool** | [**InstancePool**](InstancePool.md) |  |  [optional]
**strategy** | [**StrategyEnum**](#StrategyEnum) | Load balancing strategy |  [optional]
**healthcheck** | [**LoadBalancerServiceHealthcheck**](LoadBalancerServiceHealthcheck.md) |  |  [optional]
**id** | [**UUID**](UUID.md) | Load Balancer Service ID |  [optional]
**healthcheckStatus** | [**List&lt;LoadBalancerServerStatus&gt;**](LoadBalancerServerStatus.md) | Healthcheck status per backend server |  [optional]

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
TCP | &quot;tcp&quot;
UDP | &quot;udp&quot;

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
CREATING | &quot;creating&quot;
DELETING | &quot;deleting&quot;
RUNNING | &quot;running&quot;
UPDATING | &quot;updating&quot;
ERROR | &quot;error&quot;

<a name="StrategyEnum"></a>
## Enum: StrategyEnum
Name | Value
---- | -----
ROUND_ROBIN | &quot;round-robin&quot;
SOURCE_HASH | &quot;source-hash&quot;
