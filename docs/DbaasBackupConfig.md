# DbaasBackupConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxCount** | **Long** | Maximum number of backups to keep. Zero when no backups are created. |  [optional]
**interval** | **Long** | The interval, in hours, at which backups are generated.                                             For some services, like PostgreSQL, this is the interval                                             at which full snapshots are taken and continuous incremental                                             backup stream is maintained in addition to that. |  [optional]
**recoveryMode** | **String** | Mechanism how backups can be restored. &#x27;regular&#x27;                                             means a backup is restored as is so that the system                                             is restored to the state it was when the backup was generated.                                             &#x27;pitr&#x27; means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot. |  [optional]
**frequentIntervalMinutes** | **Long** | Interval of taking a frequent backup in service types supporting different backup schedules |  [optional]
**frequentOldestAgeMinutes** | **Long** | Maximum age of the oldest frequent backup in service types supporting different backup schedules |  [optional]
**infrequentIntervalMinutes** | **Long** | Interval of taking a frequent backup in service types supporting different backup schedules |  [optional]
**infrequentOldestAgeMinutes** | **Long** | Maximum age of the oldest infrequent backup in service types supporting different backup schedules |  [optional]
