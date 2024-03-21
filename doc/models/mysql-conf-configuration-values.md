
# Mysql Conf Configuration Values

## Structure

`MysqlConfConfigurationValues`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NetWriteTimeout` | `Integer` | Optional | The number of seconds to wait for a block to be written to a connection before aborting the write.<br>**Constraints**: `>= 1`, `<= 3600` | Integer getNetWriteTimeout() | setNetWriteTimeout(Integer netWriteTimeout) |
| `InternalTmpMemStorageEngine` | [`InternalTmpMemStorageEngineEnum`](../../doc/models/internal-tmp-mem-storage-engine-enum.md) | Optional | The storage engine for in-memory internal temporary tables. | InternalTmpMemStorageEngineEnum getInternalTmpMemStorageEngine() | setInternalTmpMemStorageEngine(InternalTmpMemStorageEngineEnum internalTmpMemStorageEngine) |
| `SqlMode` | `String` | Optional | Global SQL mode. Set to empty to use MySQL server defaults. When creating a new service and not setting this field Aiven default SQL mode (strict, SQL standard compliant) will be assigned.<br>**Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[A-Z_]*(,[A-Z_]+)*$` | String getSqlMode() | setSqlMode(String sqlMode) |
| `InformationSchemaStatsExpiry` | `Integer` | Optional | The time, in seconds, before cached statistics expire<br>**Constraints**: `>= 900`, `<= 31536000` | Integer getInformationSchemaStatsExpiry() | setInformationSchemaStatsExpiry(Integer informationSchemaStatsExpiry) |
| `SortBufferSize` | `Integer` | Optional | Sort buffer size in bytes for ORDER BY optimization. Default is 262144 (256K)<br>**Constraints**: `>= 32768`, `<= 1073741824` | Integer getSortBufferSize() | setSortBufferSize(Integer sortBufferSize) |
| `InnodbThreadConcurrency` | `Integer` | Optional | Defines the maximum number of threads permitted inside of InnoDB. Default is 0 (infinite concurrency - no limit)<br>**Constraints**: `>= 0`, `<= 1000` | Integer getInnodbThreadConcurrency() | setInnodbThreadConcurrency(Integer innodbThreadConcurrency) |
| `InnodbWriteIoThreads` | `Integer` | Optional | The number of I/O threads for write operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.<br>**Constraints**: `>= 1`, `<= 64` | Integer getInnodbWriteIoThreads() | setInnodbWriteIoThreads(Integer innodbWriteIoThreads) |
| `InnodbFtMinTokenSize` | `Integer` | Optional | Minimum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service.<br>**Constraints**: `>= 0`, `<= 16` | Integer getInnodbFtMinTokenSize() | setInnodbFtMinTokenSize(Integer innodbFtMinTokenSize) |
| `InnodbChangeBufferMaxSize` | `Integer` | Optional | Maximum size for the InnoDB change buffer, as a percentage of the total size of the buffer pool. Default is 25<br>**Constraints**: `>= 0`, `<= 50` | Integer getInnodbChangeBufferMaxSize() | setInnodbChangeBufferMaxSize(Integer innodbChangeBufferMaxSize) |
| `InnodbFlushNeighbors` | `Integer` | Optional | Specifies whether flushing a page from the InnoDB buffer pool also flushes other dirty pages in the same extent (default is 1): 0 - dirty pages in the same extent are not flushed,  1 - flush contiguous dirty pages in the same extent,  2 - flush dirty pages in the same extent<br>**Constraints**: `>= 0`, `<= 2` | Integer getInnodbFlushNeighbors() | setInnodbFlushNeighbors(Integer innodbFlushNeighbors) |
| `TmpTableSize` | `Integer` | Optional | Limits the size of internal in-memory tables. Also set max_heap_table_size. Default is 16777216 (16M)<br>**Constraints**: `>= 1048576`, `<= 1073741824` | Integer getTmpTableSize() | setTmpTableSize(Integer tmpTableSize) |
| `SlowQueryLog` | `Boolean` | Optional | Slow query log enables capturing of slow queries. Setting slow_query_log to false also truncates the mysql.slow_log table. Default is off | Boolean getSlowQueryLog() | setSlowQueryLog(Boolean slowQueryLog) |
| `ConnectTimeout` | `Integer` | Optional | The number of seconds that the mysqld server waits for a connect packet before responding with Bad handshake<br>**Constraints**: `>= 2`, `<= 3600` | Integer getConnectTimeout() | setConnectTimeout(Integer connectTimeout) |
| `NetReadTimeout` | `Integer` | Optional | The number of seconds to wait for more data from a connection before aborting the read.<br>**Constraints**: `>= 1`, `<= 3600` | Integer getNetReadTimeout() | setNetReadTimeout(Integer netReadTimeout) |
| `InnodbLockWaitTimeout` | `Integer` | Optional | The length of time in seconds an InnoDB transaction waits for a row lock before giving up. Default is 120.<br>**Constraints**: `>= 1`, `<= 3600` | Integer getInnodbLockWaitTimeout() | setInnodbLockWaitTimeout(Integer innodbLockWaitTimeout) |
| `WaitTimeout` | `Integer` | Optional | The number of seconds the server waits for activity on a noninteractive connection before closing it.<br>**Constraints**: `>= 1`, `<= 2147483` | Integer getWaitTimeout() | setWaitTimeout(Integer waitTimeout) |
| `InnodbRollbackOnTimeout` | `Boolean` | Optional | When enabled a transaction timeout causes InnoDB to abort and roll back the entire transaction. Changing this parameter will lead to a restart of the MySQL service. | Boolean getInnodbRollbackOnTimeout() | setInnodbRollbackOnTimeout(Boolean innodbRollbackOnTimeout) |
| `GroupConcatMaxLen` | `Integer` | Optional | The maximum permitted result length in bytes for the GROUP_CONCAT() function.<br>**Constraints**: `>= 4`, `<= 1.844674407370955E+19` | Integer getGroupConcatMaxLen() | setGroupConcatMaxLen(Integer groupConcatMaxLen) |
| `NetBufferLength` | `Integer` | Optional | Start sizes of connection buffer and result buffer. Default is 16384 (16K). Changing this parameter will lead to a restart of the MySQL service.<br>**Constraints**: `>= 1024`, `<= 1048576` | Integer getNetBufferLength() | setNetBufferLength(Integer netBufferLength) |
| `InnodbPrintAllDeadlocks` | `Boolean` | Optional | When enabled, information about all deadlocks in InnoDB user transactions is recorded in the error log. Disabled by default. | Boolean getInnodbPrintAllDeadlocks() | setInnodbPrintAllDeadlocks(Boolean innodbPrintAllDeadlocks) |
| `InnodbOnlineAlterLogMaxSize` | `Integer` | Optional | The upper limit in bytes on the size of the temporary log files used during online DDL operations for InnoDB tables.<br>**Constraints**: `>= 65536`, `<= 1099511627776` | Integer getInnodbOnlineAlterLogMaxSize() | setInnodbOnlineAlterLogMaxSize(Integer innodbOnlineAlterLogMaxSize) |
| `InteractiveTimeout` | `Integer` | Optional | The number of seconds the server waits for activity on an interactive connection before closing it.<br>**Constraints**: `>= 30`, `<= 604800` | Integer getInteractiveTimeout() | setInteractiveTimeout(Integer interactiveTimeout) |
| `InnodbLogBufferSize` | `Integer` | Optional | The size in bytes of the buffer that InnoDB uses to write to the log files on disk.<br>**Constraints**: `>= 1048576`, `<= 4294967295` | Integer getInnodbLogBufferSize() | setInnodbLogBufferSize(Integer innodbLogBufferSize) |
| `MaxAllowedPacket` | `Integer` | Optional | Size of the largest message in bytes that can be received by the server. Default is 67108864 (64M)<br>**Constraints**: `>= 102400`, `<= 1073741824` | Integer getMaxAllowedPacket() | setMaxAllowedPacket(Integer maxAllowedPacket) |
| `MaxHeapTableSize` | `Integer` | Optional | Limits the size of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M)<br>**Constraints**: `>= 1048576`, `<= 1073741824` | Integer getMaxHeapTableSize() | setMaxHeapTableSize(Integer maxHeapTableSize) |
| `InnodbFtServerStopwordTable` | `String` | Optional | This option is used to specify your own InnoDB FULLTEXT index stopword list for all InnoDB tables.<br>**Constraints**: *Maximum Length*: `1024`, *Pattern*: `^.+/.+$` | String getInnodbFtServerStopwordTable() | setInnodbFtServerStopwordTable(String innodbFtServerStopwordTable) |
| `InnodbReadIoThreads` | `Integer` | Optional | The number of I/O threads for read operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.<br>**Constraints**: `>= 1`, `<= 64` | Integer getInnodbReadIoThreads() | setInnodbReadIoThreads(Integer innodbReadIoThreads) |
| `SqlRequirePrimaryKey` | `Boolean` | Optional | Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them. | Boolean getSqlRequirePrimaryKey() | setSqlRequirePrimaryKey(Boolean sqlRequirePrimaryKey) |
| `DefaultTimeZone` | `String` | Optional | Default server time zone as an offset from UTC (from -12:00 to +12:00), a time zone name, or 'SYSTEM' to use the MySQL server default.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `100` | String getDefaultTimeZone() | setDefaultTimeZone(String defaultTimeZone) |
| `LongQueryTime` | `Double` | Optional | The slow_query_logs work as SQL statements that take more than long_query_time seconds to execute. Default is 10s<br>**Constraints**: `>= 0`, `<= 3600` | Double getLongQueryTime() | setLongQueryTime(Double longQueryTime) |

## Example (as JSON)

```json
{
  "net_write_timeout": 30,
  "internal_tmp_mem_storage_engine": "TempTable",
  "sql_mode": "ANSI,TRADITIONAL",
  "information_schema_stats_expiry": 86400,
  "sort_buffer_size": 262144,
  "innodb_thread_concurrency": 10,
  "innodb_write_io_threads": 10,
  "innodb_ft_min_token_size": 3,
  "innodb_change_buffer_max_size": 30,
  "innodb_flush_neighbors": 0,
  "tmp_table_size": 16777216,
  "slow_query_log": true,
  "connect_timeout": 10,
  "net_read_timeout": 30,
  "innodb_lock_wait_timeout": 50,
  "wait_timeout": 28800,
  "innodb_rollback_on_timeout": true,
  "group_concat_max_len": 1024,
  "net_buffer_length": 16384,
  "innodb_print_all_deadlocks": true,
  "innodb_online_alter_log_max_size": 134217728,
  "interactive_timeout": 3600,
  "innodb_log_buffer_size": 16777216,
  "max_allowed_packet": 67108864,
  "max_heap_table_size": 16777216,
  "innodb_ft_server_stopword_table": "db_name/table_name",
  "innodb_read_io_threads": 10,
  "sql_require_primary_key": true,
  "default_time_zone": "+03:00",
  "long_query_time": 10
}
```

