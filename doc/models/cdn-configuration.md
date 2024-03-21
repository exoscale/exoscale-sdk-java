
# Cdn Configuration

CDN configuration

## Structure

`CdnConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bucket` | `String` | Optional | CDN configuration bucket name | String getBucket() | setBucket(String bucket) |
| `Status` | [`Status1Enum`](../../doc/models/status-1-enum.md) | Optional | CDN configuration status | Status1Enum getStatus() | setStatus(Status1Enum status) |
| `Fqdn` | `String` | Optional | FQDN that serves the bucket contents | String getFqdn() | setFqdn(String fqdn) |

## Example (as JSON)

```json
{
  "bucket": "bucket8",
  "status": "pending",
  "fqdn": "fqdn2"
}
```

