
# Backup Schedule

Backup schedule

## Structure

`BackupSchedule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BackupHour` | `Long` | Optional | The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.<br>**Constraints**: `>= 0`, `<= 23` | Long getBackupHour() | setBackupHour(Long backupHour) |
| `BackupMinute` | `Long` | Optional | The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.<br>**Constraints**: `>= 0`, `<= 59` | Long getBackupMinute() | setBackupMinute(Long backupMinute) |

## Example (as JSON)

```json
{
  "backup-hour": 10,
  "backup-minute": 134
}
```

