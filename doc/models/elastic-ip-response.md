
# Elastic Ip Response

## Structure

`ElasticIpResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ElasticIps` | [`List<ElasticIp>`](../../doc/models/elastic-ip.md) | Optional | - | List<ElasticIp> getElasticIps() | setElasticIps(List<ElasticIp> elasticIps) |

## Example (as JSON)

```json
{
  "elastic-ips": [
    {
      "id": "00001d2e-0000-0000-0000-000000000000",
      "ip": "ip4",
      "addressfamily": "inet4",
      "cidr": "cidr0",
      "description": "description0"
    }
  ]
}
```

