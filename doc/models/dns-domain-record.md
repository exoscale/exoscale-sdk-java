
# Dns Domain Record

DNS domain record

## Structure

`DnsDomainRecord`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | DNS domain record ID | UUID getId() | setId(UUID id) |
| `Priority` | `Long` | Optional | DNS domain record priority<br>**Constraints**: `>= 0` | Long getPriority() | setPriority(Long priority) |
| `Content` | `String` | Optional | DNS domain record content | String getContent() | setContent(String content) |
| `Type` | [`Type5Enum`](../../doc/models/type-5-enum.md) | Optional | DNS domain record type | Type5Enum getType() | setType(Type5Enum type) |
| `Ttl` | `Long` | Optional | DNS domain record TTL<br>**Constraints**: `>= 0` | Long getTtl() | setTtl(Long ttl) |
| `Name` | `String` | Optional | DNS domain record name | String getName() | setName(String name) |
| `CreatedAt` | `LocalDateTime` | Optional | DNS domain record creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | DNS domain record update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "id": "00000b16-0000-0000-0000-000000000000",
  "priority": 136,
  "content": "content2",
  "type": "SSHFP",
  "ttl": 142
}
```

