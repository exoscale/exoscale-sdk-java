

# JsonSchemaMysql


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**netWriteTimeout** | **Integer** | The number of seconds to wait for a block to be written to a connection before aborting the write. |  [optional] |
|**optimizerSwitch** | **String** | Comma-separated list of optimizer flag assignments in the form flag&#x3D;on|off|default, or the single value &#39;default&#39; to reset all flags. Flags not listed keep their current values. Controls query optimizer behaviors such as index merge, hash join and semijoin strategies. |  [optional] |
|**tablespaceDefinitionCache** | **Integer** | The number of tablespace definition objects the data dictionary object cache can hold. Each InnoDB table stored in its own file is a separate tablespace, so raise it above the number of tables on the service to keep their tablespace definitions in memory. Each cached definition uses a small amount of memory, and the cache never holds more than the service&#39;s own tables, so a high value costs nothing extra on a service with few tables. Default is 256. |  [optional] |
|**innodbFtMaxTokenSize** | **Integer** | Maximum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**internalTmpMemStorageEngine** | [**InternalTmpMemStorageEngineEnum**](#InternalTmpMemStorageEngineEnum) | The storage engine for in-memory internal temporary tables. |  [optional] |
|**innodbIoCapacityMax** | **Integer** | The maximum number of I/O operations per second (IOPS) that InnoDB background tasks may perform when flushing falls behind. Defaults to twice innodb_io_capacity (minimum 2000). This must be greater than or equal to innodb_io_capacity. |  [optional] |
|**sqlMode** | **String** | Global SQL mode. Set to empty to use MySQL server defaults. When creating a new service and not setting this field Aiven default SQL mode (strict, SQL standard compliant) will be assigned. |  [optional] |
|**informationSchemaStatsExpiry** | **Integer** | The time, in seconds, before cached statistics expire |  [optional] |
|**sortBufferSize** | **Integer** | Sort buffer size in bytes for ORDER BY optimization. Default is 262144 (256K) |  [optional] |
|**maxExecutionTime** | **Integer** | Execution timeout in milliseconds for read-only top-level SELECT statements. 0 (the default) means no timeout. |  [optional] |
|**innodbFtCacheSize** | **Integer** | The size in bytes of the InnoDB FULLTEXT index cache for each table. Pending index updates are flushed to disk when the cache reaches this limit. innodb_ft_total_cache_size controls the combined cache limit for all tables. Default is 8000000. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**innodbFtNumWordOptimize** | **Integer** | Number of words processed during each OPTIMIZE TABLE operation on an InnoDB FULLTEXT index. Default is 2000. |  [optional] |
|**innodbThreadConcurrency** | **Integer** | Defines the maximum number of threads permitted inside of InnoDB. Default is 0 (infinite concurrency - no limit) |  [optional] |
|**innodbWriteIoThreads** | **Integer** | The number of I/O threads for write operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**innodbFtMinTokenSize** | **Integer** | Minimum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**innodbChangeBufferMaxSize** | **Integer** | Maximum size for the InnoDB change buffer, as a percentage of the total size of the buffer pool. Default is 25 |  [optional] |
|**lowerCaseTableNames** | [**LowerCaseTableNamesEnum**](#LowerCaseTableNamesEnum) | Sets how table and database names are stored and compared. 0 &#x3D; case-sensitive (default), 1 &#x3D; names stored lowercase, comparisons are case-insensitive. This option can only be set when creating the service and cannot be changed later. See https://dev.mysql.com/doc/refman/8.0/en/identifier-case-sensitivity.html for details. |  [optional] |
|**innodbAdaptiveHashIndex** | **Boolean** | Whether InnoDB adaptive hash indexing is enabled. The optimal setting is workload-dependent: it speeds up lookups for some workloads but its internal latch can become a contention point under high concurrency, in which case disabling it can improve throughput. |  [optional] |
|**innodbFlushNeighbors** | **Integer** | Specifies whether flushing a page from the InnoDB buffer pool also flushes other dirty pages in the same extent (default is 1): 0 - dirty pages in the same extent are not flushed, 1 - flush contiguous dirty pages in the same extent, 2 - flush dirty pages in the same extent |  [optional] |
|**optimizerPruneLevel** | **Integer** | Controls the heuristics applied during query optimization to prune less-promising partial plans from the optimizer search space. 0 disables heuristics (exhaustive search); 1 prunes plans based on the number of rows retrieved. |  [optional] |
|**tmpTableSize** | **Integer** | Limits the size of internal in-memory tables. Also set max_heap_table_size. Default is 16777216 (16M) |  [optional] |
|**slowQueryLog** | **Boolean** | Slow query log enables capturing of slow queries. Setting slow_query_log to false also truncates the mysql.slow_log table. Default is off |  [optional] |
|**connectTimeout** | **Integer** | The number of seconds that the mysqld server waits for a connect packet before responding with Bad handshake |  [optional] |
|**logOutput** | [**LogOutputEnum**](#LogOutputEnum) | The slow log output destination when slow_query_log is ON. To enable MySQL AI Insights, choose INSIGHTS. To use MySQL AI Insights and the mysql.slow_log table at the same time, choose INSIGHTS,TABLE. To only use the mysql.slow_log table, choose TABLE. To silence slow logs, choose NONE. |  [optional] |
|**maxSeeksForKey** | **Integer** | Limit on the assumed maximum number of index seeks when looking up rows based on a key. Lowering this value causes the optimizer to prefer index lookups over table scans. |  [optional] |
|**netReadTimeout** | **Integer** | The number of seconds to wait for more data from a connection before aborting the read. |  [optional] |
|**relayLogSpaceLimit** | **Integer** | The maximum amount of space in bytes to use for all relay logs while replicating from an external migration source. When the limit is reached, the replication I/O thread stops fetching relay log events until the SQL thread has caught up. Raise this to give a large migration a bigger relay-log budget; ensure the service disk is sized accordingly. The setting applies only on the node replicating from the external source; standby nodes always use the Aiven-managed default (the smaller of 5 GiB and 30% of the service disk), which is also used when this option is left unset. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**innodbFtUserStopwordTable** | **String** | This option is used to specify your own InnoDB FULLTEXT index stopword list for specific InnoDB tables. |  [optional] |
|**innodbMaxPurgeLag** | **Integer** | Number of outstanding transactions the InnoDB purge operation may fall behind by before INSERT, UPDATE and DELETE are delayed to let it catch up. The delay applies per row and grows with the lag, and it is capped by innodb_max_purge_lag_delay, which has to be set as well for this option to have any effect. Default is 0, which never delays anything. |  [optional] |
|**innodbOptimizeFulltextOnly** | **Boolean** | When enabled, OPTIMIZE TABLE on InnoDB tables only updates the FULLTEXT index instead of rebuilding the table. Intended to be enabled temporarily during FULLTEXT index maintenance and disabled afterwards; while enabled, OPTIMIZE TABLE does not reclaim table space. |  [optional] |
|**innodbFtEnableStopword** | **Boolean** | Whether stopword processing is applied when creating or rebuilding an InnoDB FULLTEXT index. Enabled by default. |  [optional] |
|**eqRangeIndexDiveLimit** | **Integer** | The number of equality ranges in a query at or above which the optimizer switches from index dives to index statistics when estimating the number of qualifying rows. 0 means always use index dives. Default is 200. |  [optional] |
|**endMarkersInJson** | **Boolean** | Whether optimizer JSON output such as EXPLAIN FORMAT&#x3D;JSON adds end markers that repeat a structure&#39;s key near its closing bracket, making large JSON structures easier to read. |  [optional] |
|**eventScheduler** | [**EventSchedulerEnum**](#EventSchedulerEnum) | Whether the event scheduler runs the events created with CREATE EVENT. Set OFF to stop every event on the service without dropping it, and ON to start them again. A change applies at once, without a restart. Events take effect only on the primary node. After a failover, they are re-enabled on the new primary. Default is ON. |  [optional] |
|**innodbMaxDirtyPagesPct** | **BigDecimal** | Percentage of dirty pages in the InnoDB buffer pool at which InnoDB starts flushing aggressively. Lowering it spreads write I/O more evenly and shortens crash recovery, at the cost of flushing pages that might have been modified again. Must stay at or above innodb_max_dirty_pages_pct_lwm. Default is 90. |  [optional] |
|**innodbLockWaitTimeout** | **Integer** | The length of time in seconds an InnoDB transaction waits for a row lock before giving up. Default is 120. |  [optional] |
|**innodbIoCapacity** | **Integer** | The number of I/O operations per second (IOPS) available to InnoDB background tasks, such as flushing pages from the buffer pool and merging data from the change buffer. Set this to a value appropriate for the underlying storage; it must not exceed innodb_io_capacity_max. |  [optional] |
|**maxUserConnections** | **Integer** | The maximum number of simultaneous connections permitted to any single user account. 0, the default, means no per-account limit. Any other value must be at least 10 below max_connections, so that monitoring and your own admin sessions can still connect when an application saturates its own limit. Aiven&#39;s replication and management connections are unaffected however low you set this. |  [optional] |
|**waitTimeout** | **Integer** | The number of seconds the server waits for activity on a noninteractive connection before closing it. |  [optional] |
|**innodbRollbackOnTimeout** | **Boolean** | When enabled a transaction timeout causes InnoDB to abort and roll back the entire transaction. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**groupConcatMaxLen** | **Integer** | The maximum permitted result length in bytes for the GROUP_CONCAT() function. |  [optional] |
|**netBufferLength** | **Integer** | Start sizes of connection buffer and result buffer. Default is 16384 (16K). Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**optimizerSearchDepth** | **Integer** | Maximum depth of search performed by the query optimizer when choosing a join order. Larger values produce better plans for joins over many tables but take longer to compile; 0 lets the optimizer choose the depth automatically. |  [optional] |
|**innodbSortBufferSize** | **Integer** | The size in bytes of the sort buffer used when creating InnoDB indexes. Also controls the read and write buffer sizes for the temporary log used during online DDL operations. Default is 1048576 (1 MiB). Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**innodbPrintAllDeadlocks** | **Boolean** | When enabled, information about all deadlocks in InnoDB user transactions is recorded in the error log. Disabled by default. |  [optional] |
|**innodbOnlineAlterLogMaxSize** | **Integer** | The upper limit in bytes on the size of the temporary log files used during online DDL operations for InnoDB tables. |  [optional] |
|**innodbFtResultCacheLimit** | **Integer** | Maximum memory in bytes used per query for the InnoDB FULLTEXT search query result cache. Aiven sizes this automatically based on the service plan&#39;s memory; setting a value overrides the calculated default. |  [optional] |
|**innodbFtTotalCacheSize** | **Integer** | The combined memory limit in bytes for InnoDB FULLTEXT index caches across all tables. When an index operation reaches this limit, InnoDB forces cached index updates to disk to reduce memory usage. Values above 5% of plan RAM are rejected. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**schemaDefinitionCache** | **Integer** | The number of schema definition objects the data dictionary object cache can hold. Raise it above the number of schemas on the service to keep their definitions in memory. Each cached definition uses a small amount of memory, and the cache never holds more than the service&#39;s own schemas, so a high value costs nothing extra on a service with few schemas. Default is 256. |  [optional] |
|**interactiveTimeout** | **Integer** | The number of seconds the server waits for activity on an interactive connection before closing it. |  [optional] |
|**innodbLogBufferSize** | **Integer** | The size in bytes of the buffer that InnoDB uses to write to the log files on disk. |  [optional] |
|**maxAllowedPacket** | **Integer** | Size of the largest message in bytes that can be received by the server. Default is 67108864 (64M) |  [optional] |
|**innodbMaxPurgeLagDelay** | **Integer** | Cap in microseconds on the per-row delay innodb_max_purge_lag applies to INSERT, UPDATE and DELETE. MySQL clamps the delay to this value unconditionally, so while this is 0 no delay is ever applied and innodb_max_purge_lag on its own does nothing. Both options must be non-zero for either to take effect. Default is 0. |  [optional] |
|**divPrecisionIncrement** | **Integer** | Number of digits by which to increase the scale of the result of division operations performed with the / operator. Default is 4. |  [optional] |
|**maxHeapTableSize** | **Integer** | Limits the size of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M) |  [optional] |
|**innodbFtSortPllDegree** | **Integer** | The number of parallel threads used to tokenize and index text when building an InnoDB FULLTEXT index. Default is 2. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**innodbFtServerStopwordTable** | **String** | This option is used to specify your own InnoDB FULLTEXT index stopword list for all InnoDB tables. |  [optional] |
|**innodbMaxDirtyPagesPctLwm** | **BigDecimal** | Percentage of dirty pages in the InnoDB buffer pool at which InnoDB starts pre-flushing, to keep the dirty page ratio from reaching innodb_max_dirty_pages_pct. 0 turns pre-flushing off. Cannot be set above innodb_max_dirty_pages_pct. Default is 10. |  [optional] |
|**automaticSpPrivileges** | **Boolean** | When enabled, the server automatically grants the EXECUTE and ALTER ROUTINE privileges to the creator of a stored routine and drops them when the routine is dropped. |  [optional] |
|**maxConnections** | **Integer** | The maximum permitted number of simultaneous client connections. Lower this to reserve memory for other work. The value cannot exceed the limit provided by your service plan. Upgrading the plan does not raise a value you have set explicitly, so increase it yourself after an upgrade. |  [optional] |
|**collationServer** | [**CollationServerEnum**](#CollationServerEnum) | The default collation for databases created without one, which their new tables then inherit. Only collations of the utf8mb4 character set are accepted. Databases Aiven creates, defaultdb and those added through the API or Console, keep utf8mb4_0900_ai_ci. Changing it leaves existing databases as they are. A change applies to new connections at once. After the next server restart, for example at maintenance, an upgrade, a plan change or a node replacement, sessions reset with COM_RESET_CONNECTION also compare strings with this collation, which a change without a restart does not do. Every 0900 collation except utf8mb4_0900_ai_ci has an id above 255, so after that restart MySQL announces a wrong character set to connecting clients. Clients that take their character set from the server, such as PHP mysqli and PDO without a charset option and MySQL Connector/NET (MySql.Data) without CharSet, must then set utf8mb4 themselves. Default is utf8mb4_0900_ai_ci. |  [optional] |
|**innodbReadIoThreads** | **Integer** | The number of I/O threads for read operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**sqlRequirePrimaryKey** | **Boolean** | Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them. |  [optional] |
|**performanceSchemaEventsStatementsHistorySize** | **Integer** | The number of rows per thread in the events_statements_history table. Changing this parameter will lead to a restart of the MySQL service. |  [optional] |
|**defaultTimeZone** | **String** | Default server time zone as an offset from UTC (from -12:00 to +12:00), a time zone name, or &#39;SYSTEM&#39; to use the MySQL server default. |  [optional] |
|**longQueryTime** | **BigDecimal** | The slow_query_logs work as SQL statements that take more than long_query_time seconds to execute. Default is 10s |  [optional] |



## Enum: InternalTmpMemStorageEngineEnum

| Name | Value |
|---- | -----|
| TEMPTABLE | &quot;TempTable&quot; |
| MEMORY | &quot;MEMORY&quot; |



## Enum: LowerCaseTableNamesEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: LogOutputEnum

| Name | Value |
|---- | -----|
| INSIGHTS | &quot;INSIGHTS&quot; |
| INSIGHTS_TABLE | &quot;INSIGHTS,TABLE&quot; |
| NONE | &quot;NONE&quot; |
| TABLE | &quot;TABLE&quot; |



## Enum: EventSchedulerEnum

| Name | Value |
|---- | -----|
| ON | &quot;ON&quot; |
| OFF | &quot;OFF&quot; |



## Enum: CollationServerEnum

| Name | Value |
|---- | -----|
| _0900_AI_CI | &quot;utf8mb4_0900_ai_ci&quot; |
| _0900_AS_CI | &quot;utf8mb4_0900_as_ci&quot; |
| _0900_AS_CS | &quot;utf8mb4_0900_as_cs&quot; |
| _0900_BIN | &quot;utf8mb4_0900_bin&quot; |
| BG_0900_AI_CI | &quot;utf8mb4_bg_0900_ai_ci&quot; |
| BG_0900_AS_CS | &quot;utf8mb4_bg_0900_as_cs&quot; |
| BIN | &quot;utf8mb4_bin&quot; |
| BS_0900_AI_CI | &quot;utf8mb4_bs_0900_ai_ci&quot; |
| BS_0900_AS_CS | &quot;utf8mb4_bs_0900_as_cs&quot; |
| CROATIAN_CI | &quot;utf8mb4_croatian_ci&quot; |
| CS_0900_AI_CI | &quot;utf8mb4_cs_0900_ai_ci&quot; |
| CS_0900_AS_CS | &quot;utf8mb4_cs_0900_as_cs&quot; |
| CZECH_CI | &quot;utf8mb4_czech_ci&quot; |
| DANISH_CI | &quot;utf8mb4_danish_ci&quot; |
| DA_0900_AI_CI | &quot;utf8mb4_da_0900_ai_ci&quot; |
| DA_0900_AS_CS | &quot;utf8mb4_da_0900_as_cs&quot; |
| DE_PB_0900_AI_CI | &quot;utf8mb4_de_pb_0900_ai_ci&quot; |
| DE_PB_0900_AS_CS | &quot;utf8mb4_de_pb_0900_as_cs&quot; |
| EO_0900_AI_CI | &quot;utf8mb4_eo_0900_ai_ci&quot; |
| EO_0900_AS_CS | &quot;utf8mb4_eo_0900_as_cs&quot; |
| ESPERANTO_CI | &quot;utf8mb4_esperanto_ci&quot; |
| ESTONIAN_CI | &quot;utf8mb4_estonian_ci&quot; |
| ES_0900_AI_CI | &quot;utf8mb4_es_0900_ai_ci&quot; |
| ES_0900_AS_CS | &quot;utf8mb4_es_0900_as_cs&quot; |
| ES_TRAD_0900_AI_CI | &quot;utf8mb4_es_trad_0900_ai_ci&quot; |
| ES_TRAD_0900_AS_CS | &quot;utf8mb4_es_trad_0900_as_cs&quot; |
| ET_0900_AI_CI | &quot;utf8mb4_et_0900_ai_ci&quot; |
| ET_0900_AS_CS | &quot;utf8mb4_et_0900_as_cs&quot; |
| GENERAL_CI | &quot;utf8mb4_general_ci&quot; |
| GERMAN2_CI | &quot;utf8mb4_german2_ci&quot; |
| GL_0900_AI_CI | &quot;utf8mb4_gl_0900_ai_ci&quot; |
| GL_0900_AS_CS | &quot;utf8mb4_gl_0900_as_cs&quot; |
| HR_0900_AI_CI | &quot;utf8mb4_hr_0900_ai_ci&quot; |
| HR_0900_AS_CS | &quot;utf8mb4_hr_0900_as_cs&quot; |
| HUNGARIAN_CI | &quot;utf8mb4_hungarian_ci&quot; |
| HU_0900_AI_CI | &quot;utf8mb4_hu_0900_ai_ci&quot; |
| HU_0900_AS_CS | &quot;utf8mb4_hu_0900_as_cs&quot; |
| ICELANDIC_CI | &quot;utf8mb4_icelandic_ci&quot; |
| IS_0900_AI_CI | &quot;utf8mb4_is_0900_ai_ci&quot; |
| IS_0900_AS_CS | &quot;utf8mb4_is_0900_as_cs&quot; |
| JA_0900_AS_CS | &quot;utf8mb4_ja_0900_as_cs&quot; |
| JA_0900_AS_CS_KS | &quot;utf8mb4_ja_0900_as_cs_ks&quot; |
| LATVIAN_CI | &quot;utf8mb4_latvian_ci&quot; |
| LA_0900_AI_CI | &quot;utf8mb4_la_0900_ai_ci&quot; |
| LA_0900_AS_CS | &quot;utf8mb4_la_0900_as_cs&quot; |
| LITHUANIAN_CI | &quot;utf8mb4_lithuanian_ci&quot; |
| LT_0900_AI_CI | &quot;utf8mb4_lt_0900_ai_ci&quot; |
| LT_0900_AS_CS | &quot;utf8mb4_lt_0900_as_cs&quot; |
| LV_0900_AI_CI | &quot;utf8mb4_lv_0900_ai_ci&quot; |
| LV_0900_AS_CS | &quot;utf8mb4_lv_0900_as_cs&quot; |
| MN_CYRL_0900_AI_CI | &quot;utf8mb4_mn_cyrl_0900_ai_ci&quot; |
| MN_CYRL_0900_AS_CS | &quot;utf8mb4_mn_cyrl_0900_as_cs&quot; |
| NB_0900_AI_CI | &quot;utf8mb4_nb_0900_ai_ci&quot; |
| NB_0900_AS_CS | &quot;utf8mb4_nb_0900_as_cs&quot; |
| NN_0900_AI_CI | &quot;utf8mb4_nn_0900_ai_ci&quot; |
| NN_0900_AS_CS | &quot;utf8mb4_nn_0900_as_cs&quot; |
| PERSIAN_CI | &quot;utf8mb4_persian_ci&quot; |
| PL_0900_AI_CI | &quot;utf8mb4_pl_0900_ai_ci&quot; |
| PL_0900_AS_CS | &quot;utf8mb4_pl_0900_as_cs&quot; |
| POLISH_CI | &quot;utf8mb4_polish_ci&quot; |
| ROMANIAN_CI | &quot;utf8mb4_romanian_ci&quot; |
| ROMAN_CI | &quot;utf8mb4_roman_ci&quot; |
| RO_0900_AI_CI | &quot;utf8mb4_ro_0900_ai_ci&quot; |
| RO_0900_AS_CS | &quot;utf8mb4_ro_0900_as_cs&quot; |
| RU_0900_AI_CI | &quot;utf8mb4_ru_0900_ai_ci&quot; |
| RU_0900_AS_CS | &quot;utf8mb4_ru_0900_as_cs&quot; |
| SINHALA_CI | &quot;utf8mb4_sinhala_ci&quot; |
| SK_0900_AI_CI | &quot;utf8mb4_sk_0900_ai_ci&quot; |
| SK_0900_AS_CS | &quot;utf8mb4_sk_0900_as_cs&quot; |
| SLOVAK_CI | &quot;utf8mb4_slovak_ci&quot; |
| SLOVENIAN_CI | &quot;utf8mb4_slovenian_ci&quot; |
| SL_0900_AI_CI | &quot;utf8mb4_sl_0900_ai_ci&quot; |
| SL_0900_AS_CS | &quot;utf8mb4_sl_0900_as_cs&quot; |
| SPANISH2_CI | &quot;utf8mb4_spanish2_ci&quot; |
| SPANISH_CI | &quot;utf8mb4_spanish_ci&quot; |
| SR_LATN_0900_AI_CI | &quot;utf8mb4_sr_latn_0900_ai_ci&quot; |
| SR_LATN_0900_AS_CS | &quot;utf8mb4_sr_latn_0900_as_cs&quot; |
| SV_0900_AI_CI | &quot;utf8mb4_sv_0900_ai_ci&quot; |
| SV_0900_AS_CS | &quot;utf8mb4_sv_0900_as_cs&quot; |
| SWEDISH_CI | &quot;utf8mb4_swedish_ci&quot; |
| TR_0900_AI_CI | &quot;utf8mb4_tr_0900_ai_ci&quot; |
| TR_0900_AS_CS | &quot;utf8mb4_tr_0900_as_cs&quot; |
| TURKISH_CI | &quot;utf8mb4_turkish_ci&quot; |
| UNICODE_520_CI | &quot;utf8mb4_unicode_520_ci&quot; |
| UNICODE_CI | &quot;utf8mb4_unicode_ci&quot; |
| VIETNAMESE_CI | &quot;utf8mb4_vietnamese_ci&quot; |
| VI_0900_AI_CI | &quot;utf8mb4_vi_0900_ai_ci&quot; |
| VI_0900_AS_CS | &quot;utf8mb4_vi_0900_as_cs&quot; |
| ZH_0900_AS_CS | &quot;utf8mb4_zh_0900_as_cs&quot; |



