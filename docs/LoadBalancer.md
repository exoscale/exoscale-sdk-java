# LoadBalancer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Load Balancer ID |  [optional]
**description** | **String** | Load Balancer description |  [optional]
**name** | **String** | Load Balancer name |  [optional]
**state** | [**StateEnum**](#StateEnum) | Load Balancer state |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Load Balancer creation date |  [optional]
**ip** | **String** | Load Balancer public IP |  [optional]
**services** | [**List&lt;LoadBalancerService&gt;**](LoadBalancerService.md) | Load Balancer Services |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
CREATING | &quot;creating&quot;
MIGRATED | &quot;migrated&quot;
DELETING | &quot;deleting&quot;
RUNNING | &quot;running&quot;
MIGRATING | &quot;migrating&quot;
ERROR | &quot;error&quot;
