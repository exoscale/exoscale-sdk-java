
# Elastic Ip

Elastic IP

## Structure

`ElasticIp`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Elastic IP ID | UUID getId() | setId(UUID id) |
| `Ip` | `String` | Optional | Elastic IP address | String getIp() | setIp(String ip) |
| `Addressfamily` | [`AddressfamilyEnum`](../../doc/models/addressfamily-enum.md) | Optional | Elastic IP address family | AddressfamilyEnum getAddressfamily() | setAddressfamily(AddressfamilyEnum addressfamily) |
| `Cidr` | `String` | Optional | Elastic IP cidr | String getCidr() | setCidr(String cidr) |
| `Description` | `String` | Optional | Elastic IP description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Healthcheck` | [`ElasticIpHealthcheck`](../../doc/models/elastic-ip-healthcheck.md) | Optional | Elastic IP address healthcheck | ElasticIpHealthcheck getHealthcheck() | setHealthcheck(ElasticIpHealthcheck healthcheck) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "id": "00000b7c-0000-0000-0000-000000000000",
  "ip": "ip4",
  "addressfamily": "inet4",
  "cidr": "cidr0",
  "description": "description0"
}
```

