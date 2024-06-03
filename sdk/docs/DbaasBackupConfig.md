

# DbaasBackupConfig

DBaaS plan backup config

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxCount** | **Long** | Maximum number of backups to keep. Zero when no backups are created. |  [optional] [readonly] |
|**interval** | **Long** | The interval, in hours, at which backups are generated.                                             For some services, like PostgreSQL, this is the interval                                             at which full snapshots are taken and continuous incremental                                             backup stream is maintained in addition to that. |  [optional] [readonly] |
|**recoveryMode** | **String** | Mechanism how backups can be restored. &#39;regular&#39;                                             means a backup is restored as is so that the system                                             is restored to the state it was when the backup was generated.                                             &#39;pitr&#39; means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot. |  [optional] [readonly] |
|**frequentIntervalMinutes** | **Long** | Interval of taking a frequent backup in service types supporting different backup schedules |  [optional] [readonly] |
|**frequentOldestAgeMinutes** | **Long** | Maximum age of the oldest frequent backup in service types supporting different backup schedules |  [optional] [readonly] |
|**infrequentIntervalMinutes** | **Long** | Interval of taking a frequent backup in service types supporting different backup schedules |  [optional] [readonly] |
|**infrequentOldestAgeMinutes** | **Long** | Maximum age of the oldest infrequent backup in service types supporting different backup schedules |  [optional] [readonly] |



