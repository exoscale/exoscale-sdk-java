
# Security Group Rule

Security Group rule

## Structure

`SecurityGroupRule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Security Group rule description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `StartPort` | `Long` | Optional | Start port of the range<br>**Constraints**: `>= 1`, `<= 65535` | Long getStartPort() | setStartPort(Long startPort) |
| `Protocol` | [`ProtocolEnum`](../../doc/models/protocol-enum.md) | Optional | Network protocol | ProtocolEnum getProtocol() | setProtocol(ProtocolEnum protocol) |
| `Icmp` | [`Icmp`](../../doc/models/icmp.md) | Optional | ICMP details | Icmp getIcmp() | setIcmp(Icmp icmp) |
| `EndPort` | `Long` | Optional | End port of the range<br>**Constraints**: `>= 1`, `<= 65535` | Long getEndPort() | setEndPort(Long endPort) |
| `SecurityGroup` | [`SecurityGroupResource`](../../doc/models/security-group-resource.md) | Optional | Security Group | SecurityGroupResource getSecurityGroup() | setSecurityGroup(SecurityGroupResource securityGroup) |
| `Id` | `UUID` | Optional | Security Group rule ID | UUID getId() | setId(UUID id) |
| `Network` | `String` | Optional | CIDR-formatted network allowed | String getNetwork() | setNetwork(String network) |
| `FlowDirection` | [`FlowDirectionEnum`](../../doc/models/flow-direction-enum.md) | Optional | Network flow direction to match | FlowDirectionEnum getFlowDirection() | setFlowDirection(FlowDirectionEnum flowDirection) |

## Example (as JSON)

```json
{
  "description": "description0",
  "start-port": 58,
  "protocol": "tcp",
  "icmp": {
    "code": 166,
    "type": 42
  },
  "end-port": 194
}
```

