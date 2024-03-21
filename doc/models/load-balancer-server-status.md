
# Load Balancer Server Status

Load Balancer Service status

## Structure

`LoadBalancerServerStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PublicIp` | `String` | Optional | Backend server public IP | String getPublicIp() | setPublicIp(String publicIp) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | Status of the instance's healthcheck | StatusEnum getStatus() | setStatus(StatusEnum status) |

## Example (as JSON)

```json
{
  "public-ip": "public-ip0",
  "status": "failure"
}
```

