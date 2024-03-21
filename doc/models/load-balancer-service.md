
# Load Balancer Service

Load Balancer Service

## Structure

`LoadBalancerService`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Load Balancer Service description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Protocol` | [`Protocol1Enum`](../../doc/models/protocol-1-enum.md) | Optional | Network traffic protocol | Protocol1Enum getProtocol() | setProtocol(Protocol1Enum protocol) |
| `Name` | `String` | Optional | Load Balancer Service name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `State` | [`State2Enum`](../../doc/models/state-2-enum.md) | Optional | Load Balancer Service state | State2Enum getState() | setState(State2Enum state) |
| `TargetPort` | `Long` | Optional | Port on which the network traffic will be forwarded to on the receiving instance<br>**Constraints**: `> 0` | Long getTargetPort() | setTargetPort(Long targetPort) |
| `Port` | `Long` | Optional | Port exposed on the Load Balancer's public IP<br>**Constraints**: `> 0` | Long getPort() | setPort(Long port) |
| `InstancePool` | [`InstancePool`](../../doc/models/instance-pool.md) | Optional | Instance Pool | InstancePool getInstancePool() | setInstancePool(InstancePool instancePool) |
| `Strategy` | [`StrategyEnum`](../../doc/models/strategy-enum.md) | Optional | Load balancing strategy | StrategyEnum getStrategy() | setStrategy(StrategyEnum strategy) |
| `Healthcheck` | [`LoadBalancerServiceHealthcheck`](../../doc/models/load-balancer-service-healthcheck.md) | Optional | Load Balancer Service healthcheck | LoadBalancerServiceHealthcheck getHealthcheck() | setHealthcheck(LoadBalancerServiceHealthcheck healthcheck) |
| `Id` | `UUID` | Optional | Load Balancer Service ID | UUID getId() | setId(UUID id) |
| `HealthcheckStatus` | [`List<LoadBalancerServerStatus>`](../../doc/models/load-balancer-server-status.md) | Optional | Healthcheck status per backend server | List<LoadBalancerServerStatus> getHealthcheckStatus() | setHealthcheckStatus(List<LoadBalancerServerStatus> healthcheckStatus) |

## Example (as JSON)

```json
{
  "description": "description2",
  "protocol": "tcp",
  "name": "name8",
  "state": "deleting",
  "target-port": 244
}
```

