

# LoadBalancer

Load Balancer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Load Balancer description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**ip** | **String** | Load Balancer public IP |  [optional] [readonly] |
|**name** | **String** | Load Balancer name |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Load Balancer state |  [optional] [readonly] |
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Load Balancer address family |  [optional] [readonly] |
|**id** | **UUID** | Load Balancer ID |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Load Balancer creation date |  [optional] [readonly] |
|**services** | [**List&lt;LoadBalancerService&gt;**](LoadBalancerService.md) | Load Balancer Services |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CREATING | &quot;creating&quot; |
| MIGRATED | &quot;migrated&quot; |
| DELETING | &quot;deleting&quot; |
| RUNNING | &quot;running&quot; |
| MIGRATING | &quot;migrating&quot; |
| ERROR | &quot;error&quot; |



## Enum: AddressfamilyEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| INET6 | &quot;inet6&quot; |



