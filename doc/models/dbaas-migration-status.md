
# Dbaas Migration Status

## Structure

`DbaasMigrationStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | `String` | Optional | Error message in case that migration has failed | String getError() | setError(String error) |
| `MasterLastIoSecondsAgo` | `Long` | Optional | Redis only: how many seconds since last I/O with redis master | Long getMasterLastIoSecondsAgo() | setMasterLastIoSecondsAgo(Long masterLastIoSecondsAgo) |
| `MasterLinkStatus` | [`EnumMasterLinkStatusEnum`](../../doc/models/enum-master-link-status-enum.md) | Optional | - | EnumMasterLinkStatusEnum getMasterLinkStatus() | setMasterLinkStatus(EnumMasterLinkStatusEnum masterLinkStatus) |
| `Method` | `String` | Optional | Migration method. Empty in case of multiple methods or error | String getMethod() | setMethod(String method) |
| `Status` | `String` | Optional | Migration status | String getStatus() | setStatus(String status) |
| `Details` | [`List<Detail>`](../../doc/models/detail.md) | Optional | Migration status per database | List<Detail> getDetails() | setDetails(List<Detail> details) |

## Example (as JSON)

```json
{
  "error": "error8",
  "master-last-io-seconds-ago": 224,
  "master-link-status": "up",
  "method": "method8",
  "status": "status6"
}
```

