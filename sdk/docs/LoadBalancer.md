

# LoadBalancer

Load Balancer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Load Balancer ID |  [optional] [readonly] |
|**description** | **String** | Load Balancer description |  [optional] |
|**name** | **String** | Load Balancer name |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Load Balancer state |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Load Balancer creation date |  [optional] [readonly] |
|**ip** | **String** | Load Balancer public IP |  [optional] [readonly] |
|**services** | [**List&lt;LoadBalancerService&gt;**](LoadBalancerService.md) | Load Balancer Services |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CREATING | &quot;creating&quot; |
| MIGRATED | &quot;migrated&quot; |
| DELETING | &quot;deleting&quot; |
| RUNNING | &quot;running&quot; |
| MIGRATING | &quot;migrating&quot; |
| ERROR | &quot;error&quot; |



