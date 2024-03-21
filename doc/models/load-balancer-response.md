
# Load Balancer Response

## Structure

`LoadBalancerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LoadBalancers` | [`List<LoadBalancer>`](../../doc/models/load-balancer.md) | Optional | - | List<LoadBalancer> getLoadBalancers() | setLoadBalancers(List<LoadBalancer> loadBalancers) |

## Example (as JSON)

```json
{
  "load-balancers": [
    {
      "id": "00001790-0000-0000-0000-000000000000",
      "description": "description2",
      "name": "name2",
      "state": "migrating",
      "created-at": "2016-03-13T12:52:32.123Z"
    },
    {
      "id": "00001790-0000-0000-0000-000000000000",
      "description": "description2",
      "name": "name2",
      "state": "migrating",
      "created-at": "2016-03-13T12:52:32.123Z"
    }
  ]
}
```

