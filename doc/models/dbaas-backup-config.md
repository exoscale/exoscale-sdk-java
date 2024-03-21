
# Dbaas Backup Config

DBaaS plan backup config

## Structure

`DbaasBackupConfig`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MaxCount` | `Long` | Optional | Maximum number of backups to keep. Zero when no backups are created.<br>**Constraints**: `>= 0` | Long getMaxCount() | setMaxCount(Long maxCount) |
| `Interval` | `Long` | Optional | The interval, in hours, at which backups are generated.<br>For some services, like PostgreSQL, this is the interval<br>at which full snapshots are taken and continuous incremental<br>backup stream is maintained in addition to that.<br>**Constraints**: `> 0` | Long getInterval() | setInterval(Long interval) |
| `RecoveryMode` | `String` | Optional | Mechanism how backups can be restored. 'regular'<br>means a backup is restored as is so that the system<br>is restored to the state it was when the backup was generated.<br>'pitr' means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot. | String getRecoveryMode() | setRecoveryMode(String recoveryMode) |
| `FrequentIntervalMinutes` | `Long` | Optional | Interval of taking a frequent backup in service types supporting different backup schedules<br>**Constraints**: `>= 0` | Long getFrequentIntervalMinutes() | setFrequentIntervalMinutes(Long frequentIntervalMinutes) |
| `FrequentOldestAgeMinutes` | `Long` | Optional | Maximum age of the oldest frequent backup in service types supporting different backup schedules<br>**Constraints**: `>= 0` | Long getFrequentOldestAgeMinutes() | setFrequentOldestAgeMinutes(Long frequentOldestAgeMinutes) |
| `InfrequentIntervalMinutes` | `Long` | Optional | Interval of taking a frequent backup in service types supporting different backup schedules<br>**Constraints**: `>= 0` | Long getInfrequentIntervalMinutes() | setInfrequentIntervalMinutes(Long infrequentIntervalMinutes) |
| `InfrequentOldestAgeMinutes` | `Long` | Optional | Maximum age of the oldest infrequent backup in service types supporting different backup schedules<br>**Constraints**: `>= 0` | Long getInfrequentOldestAgeMinutes() | setInfrequentOldestAgeMinutes(Long infrequentOldestAgeMinutes) |

## Example (as JSON)

```json
{
  "max-count": 22,
  "interval": 70,
  "recovery-mode": "recovery-mode4",
  "frequent-interval-minutes": 46,
  "frequent-oldest-age-minutes": 8
}
```

