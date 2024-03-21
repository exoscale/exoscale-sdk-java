
# Sos Bucket Usage

SOS Bucket usage

## Structure

`SosBucketUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | SOS Bucket name | String getName() | setName(String name) |
| `CreatedAt` | `LocalDateTime` | Optional | SOS Bucket creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `ZoneName` | [`ZoneNameEnum`](../../doc/models/zone-name-enum.md) | Optional | - | ZoneNameEnum getZoneName() | setZoneName(ZoneNameEnum zoneName) |
| `Size` | `Long` | Optional | SOS Bucket size in B<br>**Constraints**: `>= 0` | Long getSize() | setSize(Long size) |

## Example (as JSON)

```json
{
  "name": "name0",
  "created-at": "2016-03-13T12:52:32.123Z",
  "zone-name": "de-muc-1",
  "size": 252
}
```

