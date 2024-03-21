
# Load Balancer Service Healthcheck

Load Balancer Service healthcheck

## Structure

`LoadBalancerServiceHealthcheck`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mode` | [`Mode1Enum`](../../doc/models/mode-1-enum.md) | Optional | Healthcheck mode | Mode1Enum getMode() | setMode(Mode1Enum mode) |
| `Interval` | `Long` | Optional | Healthcheck interval (default: 10). Must be greater than or equal to Timeout<br>**Constraints**: `>= 5`, `<= 300` | Long getInterval() | setInterval(Long interval) |
| `Uri` | `String` | Optional | An endpoint to use for the HTTP healthcheck, e.g. '/status'<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getUri() | setUri(String uri) |
| `Port` | `Long` | Optional | Healthcheck port<br>**Constraints**: `>= 1`, `<= 65535` | Long getPort() | setPort(Long port) |
| `Timeout` | `Long` | Optional | Healthcheck timeout value (default: 2). Must be lower than or equal to Interval<br>**Constraints**: `>= 2`, `<= 60` | Long getTimeout() | setTimeout(Long timeout) |
| `Retries` | `Long` | Optional | Number of retries before considering a Service failed<br>**Constraints**: `>= 1`, `<= 20` | Long getRetries() | setRetries(Long retries) |
| `TlsSni` | `String` | Optional | SNI domain for HTTPS healthchecks<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getTlsSni() | setTlsSni(String tlsSni) |

## Example (as JSON)

```json
{
  "mode": "tcp",
  "interval": 158,
  "uri": "uri6",
  "port": 26,
  "timeout": 26
}
```

