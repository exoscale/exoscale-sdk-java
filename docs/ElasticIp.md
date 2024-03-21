# ElasticIp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Elastic IP ID |  [optional]
**ip** | **String** | Elastic IP address |  [optional]
**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Elastic IP address family |  [optional]
**cidr** | **String** | Elastic IP cidr |  [optional]
**description** | **String** | Elastic IP description |  [optional]
**healthcheck** | [**ElasticIpHealthcheck**](ElasticIpHealthcheck.md) |  |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]

<a name="AddressfamilyEnum"></a>
## Enum: AddressfamilyEnum
Name | Value
---- | -----
INET4 | &quot;inet4&quot;
INET6 | &quot;inet6&quot;
