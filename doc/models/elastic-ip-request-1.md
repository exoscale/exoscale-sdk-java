
# Elastic Ip Request 1

## Structure

`ElasticIpRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Elastic IP description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Healthcheck` | [`ElasticIpHealthcheck`](../../doc/models/elastic-ip-healthcheck.md) | Optional | Elastic IP address healthcheck | ElasticIpHealthcheck getHealthcheck() | setHealthcheck(ElasticIpHealthcheck healthcheck) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "description": "description8",
  "healthcheck": {
    "strikes-ok": 196,
    "tls-skip-verify": false,
    "tls-sni": "tls-sni2",
    "strikes-fail": 68,
    "mode": "http",
    "port": 178,
    "uri": "uri8"
  },
  "labels": {
    "key0": "labels6",
    "key1": "labels7",
    "key2": "labels8"
  }
}
```

