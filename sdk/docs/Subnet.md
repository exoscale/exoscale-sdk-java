

# Subnet

Subnet

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**ipv4Block** | **String** | Subnet ipv4 CIDR |  [optional] |
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Whether the subnet support IPv4 and/or IPv6 |  [optional] |
|**addressSpace** | [**AddressSpaceEnum**](#AddressSpaceEnum) | Whether the subnet is private or public |  [optional] |
|**instances** | [**List&lt;SubnetInstancesInner&gt;**](SubnetInstancesInner.md) | Instances attached to the subnet |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |



## Enum: AddressfamilyEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| DUAL | &quot;dual&quot; |



## Enum: AddressSpaceEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |



