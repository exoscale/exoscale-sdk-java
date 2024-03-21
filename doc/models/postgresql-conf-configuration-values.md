
# Postgresql Conf Configuration Values

## Structure

`PostgresqlConfConfigurationValues`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TrackActivityQuerySize` | `Integer` | Optional | Specifies the number of bytes reserved to track the currently executing command for each active session.<br>**Constraints**: `>= 1024`, `<= 10240` | Integer getTrackActivityQuerySize() | setTrackActivityQuerySize(Integer trackActivityQuerySize) |
| `Timezone` | `String` | Optional | PostgreSQL service timezone<br>**Constraints**: *Maximum Length*: `64` | String getTimezone() | setTimezone(String timezone) |
| `TrackIoTiming` | [`TrackIoTimingEnum`](../../doc/models/track-io-timing-enum.md) | Optional | Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms. | TrackIoTimingEnum getTrackIoTiming() | setTrackIoTiming(TrackIoTimingEnum trackIoTiming) |
| `PgStatMonitorPgsmEnableQueryPlan` | `Boolean` | Optional | Enables or disables query plan monitoring | Boolean getPgStatMonitorPgsmEnableQueryPlan() | setPgStatMonitorPgsmEnableQueryPlan(Boolean pgStatMonitorPgsmEnableQueryPlan) |
| `MaxFilesPerProcess` | `Integer` | Optional | PostgreSQL maximum number of files that can be open per process<br>**Constraints**: `>= 1000`, `<= 4096` | Integer getMaxFilesPerProcess() | setMaxFilesPerProcess(Integer maxFilesPerProcess) |
| `PgStatMonitorPgsmMaxBuckets` | `Integer` | Optional | Sets the maximum number of buckets<br>**Constraints**: `>= 1`, `<= 10` | Integer getPgStatMonitorPgsmMaxBuckets() | setPgStatMonitorPgsmMaxBuckets(Integer pgStatMonitorPgsmMaxBuckets) |
| `Wal` | [`WriteAheadLogWALSettings`](../../doc/models/write-ahead-log-wal-settings.md) | Optional | - | WriteAheadLogWALSettings getWal() | setWal(WriteAheadLogWALSettings wal) |
| `DefaultToastCompression` | [`DefaultToastCompressionEnum`](../../doc/models/default-toast-compression-enum.md) | Optional | Specifies the default TOAST compression method for values of compressible columns (the default is lz4). | DefaultToastCompressionEnum getDefaultToastCompression() | setDefaultToastCompression(DefaultToastCompressionEnum defaultToastCompression) |
| `DeadlockTimeout` | `Integer` | Optional | This is the amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.<br>**Constraints**: `>= 500`, `<= 1800000` | Integer getDeadlockTimeout() | setDeadlockTimeout(Integer deadlockTimeout) |
| `IdleInTransactionSessionTimeout` | `Integer` | Optional | Time out sessions with open transactions after this number of milliseconds<br>**Constraints**: `>= 0`, `<= 604800000` | Integer getIdleInTransactionSessionTimeout() | setIdleInTransactionSessionTimeout(Integer idleInTransactionSessionTimeout) |
| `MaxPredLocksPerTransaction` | `Integer` | Optional | PostgreSQL maximum predicate locks per transaction<br>**Constraints**: `>= 64`, `<= 5120` | Integer getMaxPredLocksPerTransaction() | setMaxPredLocksPerTransaction(Integer maxPredLocksPerTransaction) |
| `MaxReplicationSlots` | `Integer` | Optional | PostgreSQL maximum replication slots<br>**Constraints**: `>= 8`, `<= 64` | Integer getMaxReplicationSlots() | setMaxReplicationSlots(Integer maxReplicationSlots) |
| `Autovacuum` | [`AutovacuumSettings`](../../doc/models/autovacuum-settings.md) | Optional | - | AutovacuumSettings getAutovacuum() | setAutovacuum(AutovacuumSettings autovacuum) |
| `MaxParallelWorkersPerGather` | `Integer` | Optional | Sets the maximum number of workers that can be started by a single Gather or Gather Merge node<br>**Constraints**: `>= 0`, `<= 96` | Integer getMaxParallelWorkersPerGather() | setMaxParallelWorkersPerGather(Integer maxParallelWorkersPerGather) |
| `PgPartmanBgwInterval` | `Integer` | Optional | Sets the time interval to run pg_partman's scheduled tasks<br>**Constraints**: `>= 3600`, `<= 604800` | Integer getPgPartmanBgwInterval() | setPgPartmanBgwInterval(Integer pgPartmanBgwInterval) |
| `LogLinePrefix` | [`LogLinePrefixEnum`](../../doc/models/log-line-prefix-enum.md) | Optional | Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc. | LogLinePrefixEnum getLogLinePrefix() | setLogLinePrefix(LogLinePrefixEnum logLinePrefix) |
| `LogTempFiles` | `Integer` | Optional | Log statements for each temporary file created larger than this number of kilobytes, -1 disables<br>**Constraints**: `>= -1`, `<= 2147483647` | Integer getLogTempFiles() | setLogTempFiles(Integer logTempFiles) |
| `MaxLocksPerTransaction` | `Integer` | Optional | PostgreSQL maximum locks per transaction<br>**Constraints**: `>= 64`, `<= 6400` | Integer getMaxLocksPerTransaction() | setMaxLocksPerTransaction(Integer maxLocksPerTransaction) |
| `TrackCommitTimestamp` | [`TrackCommitTimestampEnum`](../../doc/models/track-commit-timestamp-enum.md) | Optional | Record commit time of transactions. | TrackCommitTimestampEnum getTrackCommitTimestamp() | setTrackCommitTimestamp(TrackCommitTimestampEnum trackCommitTimestamp) |
| `TrackFunctions` | [`TrackFunctionsEnum`](../../doc/models/track-functions-enum.md) | Optional | Enables tracking of function call counts and time used. | TrackFunctionsEnum getTrackFunctions() | setTrackFunctions(TrackFunctionsEnum trackFunctions) |
| `MaxStackDepth` | `Integer` | Optional | Maximum depth of the stack in bytes<br>**Constraints**: `>= 2097152`, `<= 6291456` | Integer getMaxStackDepth() | setMaxStackDepth(Integer maxStackDepth) |
| `MaxParallelWorkers` | `Integer` | Optional | Sets the maximum number of workers that the system can support for parallel queries<br>**Constraints**: `>= 0`, `<= 96` | Integer getMaxParallelWorkers() | setMaxParallelWorkers(Integer maxParallelWorkers) |
| `PgPartmanBgwRole` | `String` | Optional | Controls which role to use for pg_partman's scheduled background tasks.<br>**Constraints**: *Maximum Length*: `64`, *Pattern*: `^[_A-Za-z0-9][-._A-Za-z0-9]{0,63}$` | String getPgPartmanBgwRole() | setPgPartmanBgwRole(String pgPartmanBgwRole) |
| `MaxLogicalReplicationWorkers` | `Integer` | Optional | PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers)<br>**Constraints**: `>= 4`, `<= 64` | Integer getMaxLogicalReplicationWorkers() | setMaxLogicalReplicationWorkers(Integer maxLogicalReplicationWorkers) |
| `MaxPreparedTransactions` | `Integer` | Optional | PostgreSQL maximum prepared transactions<br>**Constraints**: `>= 0`, `<= 10000` | Integer getMaxPreparedTransactions() | setMaxPreparedTransactions(Integer maxPreparedTransactions) |
| `MaxWorkerProcesses` | `Integer` | Optional | Sets the maximum number of background processes that the system can support<br>**Constraints**: `>= 8`, `<= 96` | Integer getMaxWorkerProcesses() | setMaxWorkerProcesses(Integer maxWorkerProcesses) |
| `PgStatStatementsTrack` | [`PgStatStatementsTrackEnum`](../../doc/models/pg-stat-statements-track-enum.md) | Optional | Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top. | PgStatStatementsTrackEnum getPgStatStatementsTrack() | setPgStatStatementsTrack(PgStatStatementsTrackEnum pgStatStatementsTrack) |
| `TempFileLimit` | `Integer` | Optional | PostgreSQL temporary file limit in KiB, -1 for unlimited<br>**Constraints**: `>= -1`, `<= 2147483647` | Integer getTempFileLimit() | setTempFileLimit(Integer tempFileLimit) |
| `LogErrorVerbosity` | [`LogErrorVerbosityEnum`](../../doc/models/log-error-verbosity-enum.md) | Optional | Controls the amount of detail written in the server log for each message that is logged. | LogErrorVerbosityEnum getLogErrorVerbosity() | setLogErrorVerbosity(LogErrorVerbosityEnum logErrorVerbosity) |
| `LogMinDurationStatement` | `Integer` | Optional | Log statements that take more than this number of milliseconds to run, -1 disables<br>**Constraints**: `>= -1`, `<= 86400000` | Integer getLogMinDurationStatement() | setLogMinDurationStatement(Integer logMinDurationStatement) |
| `MaxStandbyStreamingDelay` | `Integer` | Optional | Max standby streaming delay in milliseconds<br>**Constraints**: `>= 1`, `<= 43200000` | Integer getMaxStandbyStreamingDelay() | setMaxStandbyStreamingDelay(Integer maxStandbyStreamingDelay) |
| `Jit` | `Boolean` | Optional | Controls system-wide use of Just-in-Time Compilation (JIT). | Boolean getJit() | setJit(Boolean jit) |
| `MaxStandbyArchiveDelay` | `Integer` | Optional | Max standby archive delay in milliseconds<br>**Constraints**: `>= 1`, `<= 43200000` | Integer getMaxStandbyArchiveDelay() | setMaxStandbyArchiveDelay(Integer maxStandbyArchiveDelay) |
| `BgWriter` | [`BackgroundBGWriterSettings`](../../doc/models/background-bg-writer-settings.md) | Optional | - | BackgroundBGWriterSettings getBgWriter() | setBgWriter(BackgroundBGWriterSettings bgWriter) |

## Example (as JSON)

```json
{
  "track_activity_query_size": 1024,
  "timezone": "Europe/Helsinki",
  "track_io_timing": "off",
  "pg_stat_monitor.pgsm_enable_query_plan": false,
  "pg_stat_monitor.pgsm_max_buckets": 10,
  "default_toast_compression": "lz4",
  "deadlock_timeout": 1000,
  "pg_partman_bgw.interval": 3600,
  "track_commit_timestamp": "off",
  "pg_partman_bgw.role": "myrolename",
  "temp_file_limit": 5000000,
  "jit": true,
  "max_files_per_process": 14
}
```

