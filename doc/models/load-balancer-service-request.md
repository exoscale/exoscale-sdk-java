
# Load Balancer Service Request

## Structure

`LoadBalancerServiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Load Balancer Service name<br>**Constraints**: *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Load Balancer Service description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Protocol` | [`Protocol1Enum`](../../doc/models/protocol-1-enum.md) | Optional | Network traffic protocol | Protocol1Enum getProtocol() | setProtocol(Protocol1Enum protocol) |
| `Strategy` | [`StrategyEnum`](../../doc/models/strategy-enum.md) | Optional | Load balancing strategy | StrategyEnum getStrategy() | setStrategy(StrategyEnum strategy) |
| `Port` | `Long` | Optional | Port exposed on the Load Balancer's public IP<br>**Constraints**: `>= 1`, `<= 65535` | Long getPort() | setPort(Long port) |
| `TargetPort` | `Long` | Optional | Port on which the network traffic will be forwarded to on the receiving instance<br>**Constraints**: `>= 1`, `<= 65535` | Long getTargetPort() | setTargetPort(Long targetPort) |
| `Healthcheck` | [`LoadBalancerServiceHealthcheck`](../../doc/models/load-balancer-service-healthcheck.md) | Optional | Load Balancer Service healthcheck | LoadBalancerServiceHealthcheck getHealthcheck() | setHealthcheck(LoadBalancerServiceHealthcheck healthcheck) |

## Example (as JSON)

```json
{
  "name": "name2",
  "description": "description2",
  "protocol": "tcp",
  "strategy": "round-robin",
  "port": 78
}
```

