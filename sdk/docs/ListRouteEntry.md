

# ListRouteEntry

Route

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**destination** | **String** | The CIDR used to match on which packets the routing rule should be applied |  [optional] |
|**target** | **String** | Where the packets should be sent to |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| SUBNET | &quot;Subnet&quot; |
| VPC | &quot;Vpc&quot; |



