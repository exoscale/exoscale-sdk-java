

# ListSubnetEntry

Subnet

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**addressfamily** | [**AddressfamilyEnum**](#AddressfamilyEnum) | Whether the subnet supports IPv4 and/or IPv6 |  [optional] |
|**addressSpace** | [**AddressSpaceEnum**](#AddressSpaceEnum) | Whether the subnet is private or public |  [optional] |
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



