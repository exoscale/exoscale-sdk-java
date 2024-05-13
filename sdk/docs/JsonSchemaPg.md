

# JsonSchemaPg


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trackActivityQuerySize** | **Integer** | Specifies the number of bytes reserved to track the currently executing command for each active session. |  [optional] |
|**timezone** | **String** | PostgreSQL service timezone |  [optional] |
|**trackIoTiming** | [**TrackIoTimingEnum**](#TrackIoTimingEnum) | Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms. |  [optional] |
|**pgStatMonitorPgsmEnableQueryPlan** | **Boolean** | Enables or disables query plan monitoring |  [optional] |
|**maxFilesPerProcess** | **Integer** | PostgreSQL maximum number of files that can be open per process |  [optional] |
|**pgStatMonitorPgsmMaxBuckets** | **Integer** | Sets the maximum number of buckets  |  [optional] |
|**wal** | [**WriteAheadLogWALSettings**](WriteAheadLogWALSettings.md) |  |  [optional] |
|**defaultToastCompression** | [**DefaultToastCompressionEnum**](#DefaultToastCompressionEnum) | Specifies the default TOAST compression method for values of compressible columns (the default is lz4). |  [optional] |
|**deadlockTimeout** | **Integer** | This is the amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition. |  [optional] |
|**idleInTransactionSessionTimeout** | **Integer** | Time out sessions with open transactions after this number of milliseconds |  [optional] |
|**maxPredLocksPerTransaction** | **Integer** | PostgreSQL maximum predicate locks per transaction |  [optional] |
|**maxReplicationSlots** | **Integer** | PostgreSQL maximum replication slots |  [optional] |
|**autovacuum** | [**AutovacuumSettings**](AutovacuumSettings.md) |  |  [optional] |
|**maxParallelWorkersPerGather** | **Integer** | Sets the maximum number of workers that can be started by a single Gather or Gather Merge node |  [optional] |
|**pgPartmanBgwInterval** | **Integer** | Sets the time interval to run pg_partman&#39;s scheduled tasks |  [optional] |
|**logLinePrefix** | [**LogLinePrefixEnum**](#LogLinePrefixEnum) | Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc. |  [optional] |
|**logTempFiles** | **Integer** | Log statements for each temporary file created larger than this number of kilobytes, -1 disables |  [optional] |
|**maxLocksPerTransaction** | **Integer** | PostgreSQL maximum locks per transaction |  [optional] |
|**trackCommitTimestamp** | [**TrackCommitTimestampEnum**](#TrackCommitTimestampEnum) | Record commit time of transactions. |  [optional] |
|**trackFunctions** | [**TrackFunctionsEnum**](#TrackFunctionsEnum) | Enables tracking of function call counts and time used. |  [optional] |
|**maxStackDepth** | **Integer** | Maximum depth of the stack in bytes |  [optional] |
|**maxParallelWorkers** | **Integer** | Sets the maximum number of workers that the system can support for parallel queries |  [optional] |
|**pgPartmanBgwRole** | **String** | Controls which role to use for pg_partman&#39;s scheduled background tasks. |  [optional] |
|**maxLogicalReplicationWorkers** | **Integer** | PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers) |  [optional] |
|**maxPreparedTransactions** | **Integer** | PostgreSQL maximum prepared transactions |  [optional] |
|**maxWorkerProcesses** | **Integer** | Sets the maximum number of background processes that the system can support |  [optional] |
|**pgStatStatementsTrack** | [**PgStatStatementsTrackEnum**](#PgStatStatementsTrackEnum) | Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top. |  [optional] |
|**walSenderTimeout** | [**WALSenderTimeoutSettings**](WALSenderTimeoutSettings.md) |  |  [optional] |
|**tempFileLimit** | **Integer** | PostgreSQL temporary file limit in KiB, -1 for unlimited |  [optional] |
|**logErrorVerbosity** | [**LogErrorVerbosityEnum**](#LogErrorVerbosityEnum) | Controls the amount of detail written in the server log for each message that is logged. |  [optional] |
|**logMinDurationStatement** | **Integer** | Log statements that take more than this number of milliseconds to run, -1 disables |  [optional] |
|**maxStandbyStreamingDelay** | **Integer** | Max standby streaming delay in milliseconds |  [optional] |
|**jit** | **Boolean** | Controls system-wide use of Just-in-Time Compilation (JIT). |  [optional] |
|**maxStandbyArchiveDelay** | **Integer** | Max standby archive delay in milliseconds |  [optional] |
|**bgWriter** | [**BackgroundBGWriterSettings**](BackgroundBGWriterSettings.md) |  |  [optional] |



## Enum: TrackIoTimingEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| ON | &quot;on&quot; |



## Enum: DefaultToastCompressionEnum

| Name | Value |
|---- | -----|
| LZ4 | &quot;lz4&quot; |
| PGLZ | &quot;pglz&quot; |



## Enum: LogLinePrefixEnum

| Name | Value |
|---- | -----|
| PID_P_USER_U_DB_D_APP_A_CLIENT_H_ | &quot;&#39;pid&#x3D;%p,user&#x3D;%u,db&#x3D;%d,app&#x3D;%a,client&#x3D;%h &#39;&quot; |
| _T_P_L_1_USER_U_DB_D_APP_A_CLIENT_H_ | &quot;&#39;%t [%p]: [%l-1] user&#x3D;%u,db&#x3D;%d,app&#x3D;%a,client&#x3D;%h &#39;&quot; |
| _M_P_Q_USER_U_DB_D_APP_A_ | &quot;&#39;%m [%p] %q[user&#x3D;%u,db&#x3D;%d,app&#x3D;%a] &#39;&quot; |



## Enum: TrackCommitTimestampEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| ON | &quot;on&quot; |



## Enum: TrackFunctionsEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| PL | &quot;pl&quot; |
| NONE | &quot;none&quot; |



## Enum: PgStatStatementsTrackEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| TOP | &quot;top&quot; |
| NONE | &quot;none&quot; |



## Enum: LogErrorVerbosityEnum

| Name | Value |
|---- | -----|
| TERSE | &quot;TERSE&quot; |
| DEFAULT | &quot;DEFAULT&quot; |
| VERBOSE | &quot;VERBOSE&quot; |



