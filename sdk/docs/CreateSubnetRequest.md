

# CreateSubnetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Subnet name |  |
|**description** | **String** | Subnet description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Subnet address family |  |
|**addressSpace** | [**AddressSpaceEnum**](#AddressSpaceEnum) | Subnet address space |  |
|**ipv4Block** | **String** | Subnet ipv4 CIDR |  [optional] |



## Enum: AddressfamilyEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |



## Enum: AddressSpaceEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |



