# IdRulesBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flowDirection** | [**FlowDirectionEnum**](#FlowDirectionEnum) | Network flow direction to match | 
**description** | **String** | Security Group rule description |  [optional]
**network** | **String** | CIDR-formatted network allowed |  [optional]
**securityGroup** | [**SecurityGroupResource**](SecurityGroupResource.md) |  |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Network protocol | 
**icmp** | [**SecuritygroupidrulesIcmp**](SecuritygroupidrulesIcmp.md) |  |  [optional]
**startPort** | **Long** | Start port of the range |  [optional]
**endPort** | **Long** | End port of the range |  [optional]

<a name="FlowDirectionEnum"></a>
## Enum: FlowDirectionEnum
Name | Value
---- | -----
INGRESS | &quot;ingress&quot;
EGRESS | &quot;egress&quot;

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
