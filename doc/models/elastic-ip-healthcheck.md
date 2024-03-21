
# Elastic Ip Healthcheck

Elastic IP address healthcheck

## Structure

`ElasticIpHealthcheck`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StrikesOk` | `Long` | Optional | Number of attempts before considering the target healthy (default: 2)<br>**Constraints**: `>= 1`, `<= 20` | Long getStrikesOk() | setStrikesOk(Long strikesOk) |
| `TlsSkipVerify` | `Boolean` | Optional | Skip TLS verification | Boolean getTlsSkipVerify() | setTlsSkipVerify(Boolean tlsSkipVerify) |
| `TlsSni` | `String` | Optional | An optional domain or subdomain to check TLS against<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getTlsSni() | setTlsSni(String tlsSni) |
| `StrikesFail` | `Long` | Optional | Number of attempts before considering the target unhealthy (default: 3)<br>**Constraints**: `>= 1`, `<= 20` | Long getStrikesFail() | setStrikesFail(Long strikesFail) |
| `Mode` | [`ModeEnum`](../../doc/models/mode-enum.md) | Required | Health check mode | ModeEnum getMode() | setMode(ModeEnum mode) |
| `Port` | `long` | Required | Health check port<br>**Constraints**: `>= 1`, `<= 65535` | long getPort() | setPort(long port) |
| `Uri` | `String` | Optional | An endpoint to use for the health check, for example '/status'<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getUri() | setUri(String uri) |
| `Interval` | `Long` | Optional | Interval between the checks in seconds (default: 10)<br>**Constraints**: `>= 5`, `<= 300` | Long getInterval() | setInterval(Long interval) |
| `Timeout` | `Long` | Optional | Health check timeout value in seconds (default: 2)<br>**Constraints**: `>= 2`, `<= 60` | Long getTimeout() | setTimeout(Long timeout) |

## Example (as JSON)

```json
{
  "strikes-ok": 204,
  "tls-skip-verify": false,
  "tls-sni": "tls-sni2",
  "strikes-fail": 76,
  "mode": "https",
  "port": 186,
  "uri": "uri8"
}
```

