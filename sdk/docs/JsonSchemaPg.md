

# JsonSchemaPg


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trackActivityQuerySize** | **Integer** | Specifies the number of bytes reserved to track the currently executing command for each active session. Changing this parameter causes a service restart. |  [optional] |
|**timezone** | **String** | PostgreSQL service timezone |  [optional] |
|**trackIoTiming** | [**TrackIoTimingEnum**](#TrackIoTimingEnum) | Enables timing of database I/O calls. The default is &#x60;off&#x60;. When on, it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms. |  [optional] |
|**pgStatMonitorPgsmEnableQueryPlan** | **Boolean** | Enables or disables query plan monitoring. Changing this parameter causes a service restart. Only available for PostgreSQL 13+. |  [optional] |
|**maxFilesPerProcess** | **Integer** | PostgreSQL maximum number of files that can be open per process. The default is &#x60;1000&#x60; (upstream default). Changing this parameter causes a service restart. |  [optional] |
|**pgStatMonitorPgsmMaxBuckets** | **Integer** | Sets the maximum number of buckets. Changing this parameter causes a service restart. Only available for PostgreSQL 13+. |  [optional] |
|**ioMaxConcurrency** | **Integer** | EXPERIMENTAL: Controls the maximum number of I/O operations that one process can execute simultaneously. Version 18 and up only. Changing this parameter causes a service restart. |  [optional] |
|**wal** | [**WriteAheadLogWALSettings**](WriteAheadLogWALSettings.md) |  |  [optional] |
|**defaultToastCompression** | [**DefaultToastCompressionEnum**](#DefaultToastCompressionEnum) | Specifies the default TOAST compression method for values of compressible columns. The default is &#x60;lz4&#x60;. Only available for PostgreSQL 14+. |  [optional] |
|**deadlockTimeout** | **Integer** | This is the amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition. The default is &#x60;1000&#x60; (upstream default). |  [optional] |
|**idleInTransactionSessionTimeout** | **Integer** | Time out sessions with open transactions after this number of milliseconds |  [optional] |
|**maxPredLocksPerTransaction** | **Integer** | PostgreSQL maximum predicate locks per transaction. The default is &#x60;64&#x60; (upstream default). Changing this parameter causes a service restart. |  [optional] |
|**maxReplicationSlots** | **Integer** | PostgreSQL maximum replication slots. The default is &#x60;20&#x60;. Changing this parameter causes a service restart. |  [optional] |
|**maxSyncWorkersPerSubscription** | **Integer** | Maximum number of synchronization workers per subscription. The default is &#x60;2&#x60;. |  [optional] |
|**autovacuum** | [**AutovacuumSettings**](AutovacuumSettings.md) |  |  [optional] |
|**maxParallelWorkersPerGather** | **Integer** | Sets the maximum number of workers that can be started by a single Gather or Gather Merge node. The default is &#x60;2&#x60; (upstream default). |  [optional] |
|**ioCombineLimit** | **Integer** | EXPERIMENTAL: Controls the largest I/O size in operations that combine I/O in 8kB units. Version 17 and up only. |  [optional] |
|**passwordEncryption** | [**PasswordEncryptionEnum**](#PasswordEncryptionEnum) | Chooses the algorithm for encrypting passwords. |  [optional] |
|**ioWorkers** | **Integer** | EXPERIMENTAL: Number of IO worker processes, for io_method&#x3D;worker. Version 18 and up only. Changing this parameter causes a service restart. |  [optional] |
|**pgPartmanBgwInterval** | **Integer** | Sets the time interval in seconds to run pg_partman&#39;s scheduled tasks. The default is &#x60;3600&#x60;. |  [optional] |
|**logLinePrefix** | [**LogLinePrefixEnum**](#LogLinePrefixEnum) | Choose from one of the available log formats. |  [optional] |
|**logTempFiles** | **Integer** | Log statements for each temporary file created larger than this number of kilobytes, -1 disables |  [optional] |
|**maxLocksPerTransaction** | **Integer** | PostgreSQL maximum locks per transaction. Changing this parameter causes a service restart. |  [optional] |
|**trackCommitTimestamp** | [**TrackCommitTimestampEnum**](#TrackCommitTimestampEnum) | Record commit time of transactions. Changing this parameter causes a service restart. |  [optional] |
|**trackFunctions** | [**TrackFunctionsEnum**](#TrackFunctionsEnum) | Enables tracking of function call counts and time used. |  [optional] |
|**ioMaxCombineLimit** | **Integer** | EXPERIMENTAL: Controls the largest I/O size in operations that combine I/O in 8kB units, and silently limits the user-settable parameter io_combine_limit. Version 18 and up only. Changing this parameter causes a service restart. |  [optional] |
|**ioMethod** | [**IoMethodEnum**](#IoMethodEnum) | EXPERIMENTAL: Controls the maximum number of I/O operations that one process can execute simultaneously. Version 18 and up only. Changing this parameter causes a service restart. |  [optional] |
|**maxStackDepth** | **Integer** | Maximum depth of the stack in bytes. The default is &#x60;2097152&#x60; (upstream default). |  [optional] |
|**maxParallelWorkers** | **Integer** | Sets the maximum number of workers that the system can support for parallel queries. The default is &#x60;8&#x60; (upstream default). |  [optional] |
|**pgPartmanBgwRole** | **String** | Controls which role to use for pg_partman&#39;s scheduled background tasks. |  [optional] |
|**maxLogicalReplicationWorkers** | **Integer** | PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers). The default is &#x60;4&#x60; (upstream default). Changing this parameter causes a service restart. |  [optional] |
|**maxPreparedTransactions** | **Integer** | PostgreSQL maximum prepared transactions. The default is &#x60;0&#x60;. Changing this parameter causes a service restart. |  [optional] |
|**maxWorkerProcesses** | **Integer** | Sets the maximum number of background processes that the system can support. The default is &#x60;8&#x60;. Changing this parameter causes a service restart. |  [optional] |
|**pgStatStatementsTrack** | [**PgStatStatementsTrackEnum**](#PgStatStatementsTrackEnum) | Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default is &#x60;top&#x60;. |  [optional] |
|**tempFileLimit** | **Integer** | PostgreSQL temporary file limit in KiB, -1 for unlimited |  [optional] |
|**logErrorVerbosity** | [**LogErrorVerbosityEnum**](#LogErrorVerbosityEnum) | Controls the amount of detail written in the server log for each message that is logged. |  [optional] |
|**logMinDurationStatement** | **Integer** | Log statements that take more than this number of milliseconds to run, -1 disables |  [optional] |
|**maxStandbyStreamingDelay** | **Integer** | Max standby streaming delay in milliseconds. The default is &#x60;30000&#x60; (upstream default). |  [optional] |
|**jit** | **Boolean** | Controls system-wide use of Just-in-Time Compilation (JIT). |  [optional] |
|**maxStandbyArchiveDelay** | **Integer** | Max standby archive delay in milliseconds. The default is &#x60;30000&#x60; (upstream default). |  [optional] |
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



## Enum: PasswordEncryptionEnum

| Name | Value |
|---- | -----|
| MD5 | &quot;md5&quot; |
| SCRAM_SHA_256 | &quot;scram-sha-256&quot; |



## Enum: LogLinePrefixEnum

| Name | Value |
|---- | -----|
| PID_P_USER_U_DB_D_APP_A_CLIENT_H_ | &quot;&#39;pid&#x3D;%p,user&#x3D;%u,db&#x3D;%d,app&#x3D;%a,client&#x3D;%h &#39;&quot; |
| PID_P_USER_U_DB_D_APP_A_CLIENT_H_TXID_X_QID_Q_ | &quot;&#39;pid&#x3D;%p,user&#x3D;%u,db&#x3D;%d,app&#x3D;%a,client&#x3D;%h,txid&#x3D;%x,qid&#x3D;%Q &#39;&quot; |
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



## Enum: IoMethodEnum

| Name | Value |
|---- | -----|
| WORKER | &quot;worker&quot; |
| SYNC | &quot;sync&quot; |
| IO_URING | &quot;io_uring&quot; |



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



