
# Dns Domain

DNS domain

## Structure

`DnsDomain`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | DNS domain ID | UUID getId() | setId(UUID id) |
| `CreatedAt` | `LocalDateTime` | Optional | DNS domain creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UnicodeName` | `String` | Optional | DNS domain unicode name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getUnicodeName() | setUnicodeName(String unicodeName) |

## Example (as JSON)

```json
{
  "id": "000024d4-0000-0000-0000-000000000000",
  "created-at": "2016-03-13T12:52:32.123Z",
  "unicode-name": "unicode-name2"
}
```

