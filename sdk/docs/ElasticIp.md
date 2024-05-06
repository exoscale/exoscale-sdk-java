

# ElasticIp

Elastic IP

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Elastic IP ID |  [optional] [readonly] |
|**ip** | **String** | Elastic IP address |  [optional] [readonly] |
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Elastic IP address family |  [optional] [readonly] |
|**cidr** | **String** | Elastic IP cidr |  [optional] [readonly] |
|**description** | **String** | Elastic IP description |  [optional] |
|**healthcheck** | [**ElasticIpHealthcheck**](ElasticIpHealthcheck.md) |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: AddressfamilyEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| INET6 | &quot;inet6&quot; |



