
# Elastic Ip Request

## Structure

`ElasticIpRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Addressfamily` | [`Addressfamily1Enum`](../../doc/models/addressfamily-1-enum.md) | Optional | Elastic IP address family (default: :inet4) | Addressfamily1Enum getAddressfamily() | setAddressfamily(Addressfamily1Enum addressfamily) |
| `Description` | `String` | Optional | Elastic IP description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Healthcheck` | [`ElasticIpHealthcheck`](../../doc/models/elastic-ip-healthcheck.md) | Optional | Elastic IP address healthcheck | ElasticIpHealthcheck getHealthcheck() | setHealthcheck(ElasticIpHealthcheck healthcheck) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "addressfamily": "inet4",
  "description": "description4",
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
    "key0": "labels2",
    "key1": "labels1",
    "key2": "labels0"
  }
}
```

