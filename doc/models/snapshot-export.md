
# Snapshot Export

Snapshot export information. This data is transient.

## Structure

`SnapshotExport`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Snapshot export ID | UUID getId() | setId(UUID id) |
| `PresignedUrl` | `String` | Optional | Snapshot export presigned url | String getPresignedUrl() | setPresignedUrl(String presignedUrl) |
| `Md5sum` | `String` | Optional | Snapshot export md5 checksum | String getMd5sum() | setMd5sum(String md5sum) |

## Example (as JSON)

```json
{
  "id": "000005ce-0000-0000-0000-000000000000",
  "presigned-url": "presigned-url0",
  "md5sum": "md5sum6"
}
```

