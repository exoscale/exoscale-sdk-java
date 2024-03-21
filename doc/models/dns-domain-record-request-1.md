
# Dns Domain Record Request 1

## Structure

`DnsDomainRecordRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | DNS domain record name | String getName() | setName(String name) |
| `Content` | `String` | Optional | DNS domain record content | String getContent() | setContent(String content) |
| `Ttl` | `Long` | Optional | DNS domain record TTL<br>**Constraints**: `> 0` | Long getTtl() | setTtl(Long ttl) |
| `Priority` | `Long` | Optional | DNS domain record priority<br>**Constraints**: `> 0` | Long getPriority() | setPriority(Long priority) |

## Example (as JSON)

```json
{
  "name": "name4",
  "content": "content8",
  "ttl": 176,
  "priority": 102
}
```

