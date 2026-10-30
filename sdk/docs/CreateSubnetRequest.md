

# CreateSubnetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Subnet name, up to 255 characters. Must be unique between the subnet of the parent VPC |  |
|**description** | **String** |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Whether the subnet supports IPv4 and/or IPv6 |  |
|**addressSpace** | [**AddressSpaceEnum**](#AddressSpaceEnum) | Whether the subnet is private or public |  |
|**ipv4Block** | **String** | Subnet ipv4 CIDR. Must not overlap with other CIDRs of this VPC |  [optional] |



## Enum: AddressfamilyEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |



## Enum: AddressSpaceEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |



