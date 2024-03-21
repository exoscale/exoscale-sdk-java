
# Export

Exported snapshot information

## Structure

`Export`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PresignedUrl` | `String` | Optional | Exported snapshot disk file pre-signed URL | String getPresignedUrl() | setPresignedUrl(String presignedUrl) |
| `Md5sum` | `String` | Optional | Exported snapshot disk file MD5 checksum | String getMd5sum() | setMd5sum(String md5sum) |

## Example (as JSON)

```json
{
  "presigned-url": "presigned-url8",
  "md5sum": "md5sum4"
}
```

