

# JsonSchemaMysql


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**netWriteTimeout** | **Integer** | The number of seconds to wait for a block to be written to a connection before aborting the write. |  [optional] |
|**internalTmpMemStorageEngine** | [**InternalTmpMemStorageEngineEnum**](#InternalTmpMemStorageEngineEnum) | The storage engine for in-memory internal temporary tables. |  [optional] |
|**sqlMode** | **String** | Global SQL mode. Set to empty to use MySQL server defaults. When creating a new service and not setting this field Aiven default SQL mode (strict, SQL standard compliant) will be assigned. |  [optional] |
|**informationSchemaStatsExpiry** | **Integer** | The time, in seconds, before cached statistics expire |  [optional] |
|**sortBufferSize** | **Integer** | Sort buffer size in bytes for ORDER BY optimization. Default is 262144 (256K) |  [optional] |
|**innodbThreadConcurrency** | **Integer** | Defines the maximum number of threads permitted inside of InnoDB. Default is 0 (infinite concurrency - no limit) |  [optional] |
|**innodbWriteIoThreads** | **Integer** | The number of I/O threads for write operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**innodbFtMinTokenSize** | **Integer** | Minimum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**innodbChangeBufferMaxSize** | **Integer** | Maximum size for the InnoDB change buffer, as a percentage of the total size of the buffer pool. Default is 25 |  [optional] |
|**innodbFlushNeighbors** | **Integer** | Specifies whether flushing a page from the InnoDB buffer pool also flushes other dirty pages in the same extent (default is 1): 0 - dirty pages in the same extent are not flushed, 1 - flush contiguous dirty pages in the same extent, 2 - flush dirty pages in the same extent |  [optional] |
|**tmpTableSize** | **Integer** | Limits the size of internal in-memory tables. Also set max_heap_table_size. Default is 16777216 (16M) |  [optional] |
|**slowQueryLog** | **Boolean** | Slow query log enables capturing of slow queries. Setting slow_query_log to false also truncates the mysql.slow_log table. Default is off |  [optional] |
|**connectTimeout** | **Integer** | The number of seconds that the mysqld server waits for a connect packet before responding with Bad handshake |  [optional] |
|**logOutput** | [**LogOutputEnum**](#LogOutputEnum) | The slow log output destination when slow_query_log is ON. To enable MySQL AI Insights, choose INSIGHTS. To use MySQL AI Insights and the mysql.slow_log table at the same time, choose INSIGHTS,TABLE. To only use the mysql.slow_log table, choose TABLE. To silence slow logs, choose NONE. |  [optional] |
|**netReadTimeout** | **Integer** | The number of seconds to wait for more data from a connection before aborting the read. |  [optional] |
|**innodbLockWaitTimeout** | **Integer** | The length of time in seconds an InnoDB transaction waits for a row lock before giving up. Default is 120. |  [optional] |
|**waitTimeout** | **Integer** | The number of seconds the server waits for activity on a noninteractive connection before closing it. |  [optional] |
|**innodbRollbackOnTimeout** | **Boolean** | When enabled a transaction timeout causes InnoDB to abort and roll back the entire transaction. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**groupConcatMaxLen** | **Integer** | The maximum permitted result length in bytes for the GROUP_CONCAT() function. |  [optional] |
|**netBufferLength** | **Integer** | Start sizes of connection buffer and result buffer. Default is 16384 (16K). Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**innodbPrintAllDeadlocks** | **Boolean** | When enabled, information about all deadlocks in InnoDB user transactions is recorded in the error log. Disabled by default. |  [optional] |
|**innodbOnlineAlterLogMaxSize** | **Integer** | The upper limit in bytes on the size of the temporary log files used during online DDL operations for InnoDB tables. |  [optional] |
|**interactiveTimeout** | **Integer** | The number of seconds the server waits for activity on an interactive connection before closing it. |  [optional] |
|**innodbLogBufferSize** | **Integer** | The size in bytes of the buffer that InnoDB uses to write to the log files on disk. |  [optional] |
|**maxAllowedPacket** | **Integer** | Size of the largest message in bytes that can be received by the server. Default is 67108864 (64M) |  [optional] |
|**maxHeapTableSize** | **Integer** | Limits the size of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M) |  [optional] |
|**innodbFtServerStopwordTable** | **String** | This option is used to specify your own InnoDB FULLTEXT index stopword list for all InnoDB tables. |  [optional] |
|**innodbReadIoThreads** | **Integer** | The number of I/O threads for read operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**sqlRequirePrimaryKey** | **Boolean** | Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them. |  [optional] |
|**defaultTimeZone** | **String** | Default server time zone as an offset from UTC (from -12:00 to +12:00), a time zone name, or &#39;SYSTEM&#39; to use the MySQL server default. |  [optional] |
|**longQueryTime** | **BigDecimal** | The slow_query_logs work as SQL statements that take more than long_query_time seconds to execute. Default is 10s |  [optional] |



## Enum: InternalTmpMemStorageEngineEnum

| Name | Value |
|---- | -----|
| TEMPTABLE | &quot;TempTable&quot; |
| MEMORY | &quot;MEMORY&quot; |



## Enum: LogOutputEnum

| Name | Value |
|---- | -----|
| INSIGHTS | &quot;INSIGHTS&quot; |
| INSIGHTS_TABLE | &quot;INSIGHTS,TABLE&quot; |
| NONE | &quot;NONE&quot; |
| TABLE | &quot;TABLE&quot; |



