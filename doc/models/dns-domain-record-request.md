
# Dns Domain Record Request

## Structure

`DnsDomainRecordRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | DNS domain record name | String getName() | setName(String name) |
| `Type` | [`Type6Enum`](../../doc/models/type-6-enum.md) | Required | DNS domain record type | Type6Enum getType() | setType(Type6Enum type) |
| `Content` | `String` | Required | DNS domain record content | String getContent() | setContent(String content) |
| `Ttl` | `Long` | Optional | DNS domain record TTL<br>**Constraints**: `>= 0` | Long getTtl() | setTtl(Long ttl) |
| `Priority` | `Long` | Optional | DNS domain record priority<br>**Constraints**: `>= 0` | Long getPriority() | setPriority(Long priority) |

## Example (as JSON)

```json
{
  "name": "name6",
  "type": "CAA",
  "content": "content0",
  "ttl": 210,
  "priority": 68
}
```

