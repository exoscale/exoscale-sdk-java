
# Load Balancer

Load Balancer

## Structure

`LoadBalancer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Load Balancer ID | UUID getId() | setId(UUID id) |
| `Description` | `String` | Optional | Load Balancer description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Name` | `String` | Optional | Load Balancer name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `State` | [`State1Enum`](../../doc/models/state-1-enum.md) | Optional | Load Balancer state | State1Enum getState() | setState(State1Enum state) |
| `CreatedAt` | `LocalDateTime` | Optional | Load Balancer creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Ip` | `String` | Optional | Load Balancer public IP | String getIp() | setIp(String ip) |
| `Services` | [`List<LoadBalancerService>`](../../doc/models/load-balancer-service.md) | Optional | Load Balancer Services | List<LoadBalancerService> getServices() | setServices(List<LoadBalancerService> services) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "id": "00001a12-0000-0000-0000-000000000000",
  "description": "description4",
  "name": "name4",
  "state": "creating",
  "created-at": "2016-03-13T12:52:32.123Z"
}
```

