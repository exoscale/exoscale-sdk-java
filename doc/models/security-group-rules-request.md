
# Security Group Rules Request

## Structure

`SecurityGroupRulesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FlowDirection` | [`FlowDirectionEnum`](../../doc/models/flow-direction-enum.md) | Required | Network flow direction to match | FlowDirectionEnum getFlowDirection() | setFlowDirection(FlowDirectionEnum flowDirection) |
| `Description` | `String` | Optional | Security Group rule description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Network` | `String` | Optional | CIDR-formatted network allowed | String getNetwork() | setNetwork(String network) |
| `SecurityGroup` | [`SecurityGroupResource`](../../doc/models/security-group-resource.md) | Optional | Security Group | SecurityGroupResource getSecurityGroup() | setSecurityGroup(SecurityGroupResource securityGroup) |
| `Protocol` | [`ProtocolEnum`](../../doc/models/protocol-enum.md) | Required | Network protocol | ProtocolEnum getProtocol() | setProtocol(ProtocolEnum protocol) |
| `Icmp` | [`Icmp1`](../../doc/models/icmp-1.md) | Optional | ICMP details (default: -1 (ANY)) | Icmp1 getIcmp() | setIcmp(Icmp1 icmp) |
| `StartPort` | `Long` | Optional | Start port of the range<br>**Constraints**: `>= 1`, `<= 65535` | Long getStartPort() | setStartPort(Long startPort) |
| `EndPort` | `Long` | Optional | End port of the range<br>**Constraints**: `>= 1`, `<= 65535` | Long getEndPort() | setEndPort(Long endPort) |

## Example (as JSON)

```json
{
  "flow-direction": "ingress",
  "description": "description2",
  "network": "network8",
  "security-group": {
    "id": "0000244a-0000-0000-0000-000000000000",
    "name": "name0",
    "visibility": "private"
  },
  "protocol": "icmp",
  "icmp": {
    "code": 166,
    "type": 42
  },
  "start-port": 132
}
```

