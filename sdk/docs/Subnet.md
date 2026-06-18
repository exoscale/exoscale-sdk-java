

# Subnet

Subnet

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Subnet ID |  [optional] |
|**name** | **String** | Subnet name |  [optional] |
|**description** | **String** | Subnet description |  [optional] |
|**createdAt** | **OffsetDateTime** | Subnet creation date |  [optional] |
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Subnet address family |  [optional] |
|**addressSpace** | [**AddressSpaceEnum**](#AddressSpaceEnum) | Subnet address space |  [optional] |
|**ipv4Block** | **String** | Subnet ipv4 CIDR |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: AddressfamilyEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| DUAL | &quot;dual&quot; |



## Enum: AddressSpaceEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |



