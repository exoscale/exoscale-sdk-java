

# CreateElasticIpRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Elastic IP address family (default: :inet4) |  [optional] |
|**description** | **String** | Elastic IP description |  [optional] |
|**healthcheck** | [**ElasticIpHealthcheck**](ElasticIpHealthcheck.md) |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: AddressfamilyEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| INET6 | &quot;inet6&quot; |


