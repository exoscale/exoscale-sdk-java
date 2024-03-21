
# Dns Domain Record Response

## Structure

`DnsDomainRecordResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DnsDomainRecords` | [`List<DnsDomainRecord>`](../../doc/models/dns-domain-record.md) | Optional | - | List<DnsDomainRecord> getDnsDomainRecords() | setDnsDomainRecords(List<DnsDomainRecord> dnsDomainRecords) |

## Example (as JSON)

```json
{
  "dns-domain-records": [
    {
      "id": "00002300-0000-0000-0000-000000000000",
      "priority": 98,
      "content": "content4",
      "type": "NAPTR",
      "ttl": 120
    }
  ]
}
```

