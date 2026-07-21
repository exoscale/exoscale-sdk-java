

# Subnet

Subnet

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Subnet description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**name** | **String** | Subnet name |  [optional] |
|**ipv4Block** | **String** | Subnet ipv4 CIDR |  [optional] |
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Subnet address family |  [optional] |
|**addressSpace** | [**AddressSpaceEnum**](#AddressSpaceEnum) | Subnet address space |  [optional] |
|**instances** | [**List&lt;SubnetInstancesInner&gt;**](SubnetInstancesInner.md) | Instances attached to the subnet |  [optional] |
|**id** | **UUID** | Subnet ID |  [optional] |
|**createdAt** | **OffsetDateTime** | Subnet creation date |  [optional] |



## Enum: AddressfamilyEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| DUAL | &quot;dual&quot; |



## Enum: AddressSpaceEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |



