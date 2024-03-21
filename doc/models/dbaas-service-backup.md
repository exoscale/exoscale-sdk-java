
# Dbaas Service Backup

List of backups for the service

## Structure

`DbaasServiceBackup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BackupName` | `String` | Required | Internal name of this backup | String getBackupName() | setBackupName(String backupName) |
| `BackupTime` | `LocalDateTime` | Required | Backup timestamp (ISO 8601) | LocalDateTime getBackupTime() | setBackupTime(LocalDateTime backupTime) |
| `DataSize` | `long` | Required | Backup's original size before compression<br>**Constraints**: `>= 0` | long getDataSize() | setDataSize(long dataSize) |

## Example (as JSON)

```json
{
  "backup-name": "backup-name6",
  "backup-time": "2016-03-13T12:52:32.123Z",
  "data-size": 28
}
```

