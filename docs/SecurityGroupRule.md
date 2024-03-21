# SecurityGroupRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Security Group rule description |  [optional]
**startPort** | **Long** | Start port of the range |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Network protocol |  [optional]
**icmp** | [**SecuritygroupruleIcmp**](SecuritygroupruleIcmp.md) |  |  [optional]
**endPort** | **Long** | End port of the range |  [optional]
**securityGroup** | [**SecurityGroupResource**](SecurityGroupResource.md) |  |  [optional]
**id** | [**UUID**](UUID.md) | Security Group rule ID |  [optional]
**network** | **String** | CIDR-formatted network allowed |  [optional]
**flowDirection** | [**FlowDirectionEnum**](#FlowDirectionEnum) | Network flow direction to match |  [optional]

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
TCP | &quot;tcp&quot;
ESP | &quot;esp&quot;
ICMP | &quot;icmp&quot;
UDP | &quot;udp&quot;
GRE | &quot;gre&quot;
AH | &quot;ah&quot;
IPIP | &quot;ipip&quot;
ICMPV6 | &quot;icmpv6&quot;

<a name="FlowDirectionEnum"></a>
## Enum: FlowDirectionEnum
Name | Value
---- | -----
INGRESS | &quot;ingress&quot;
EGRESS | &quot;egress&quot;
