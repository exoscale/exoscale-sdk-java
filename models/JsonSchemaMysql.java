package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaMysql implements Parsable {
    /**
     * The number of seconds that the mysqld server waits for a connect packet before responding with Bad handshake
     */
    private Integer connectTimeout;
    /**
     * Default server time zone as an offset from UTC (from -12:00 to +12:00), a time zone name, or 'SYSTEM' to use the MySQL server default.
     */
    private String defaultTimeZone;
    /**
     * The maximum permitted result length in bytes for the GROUP_CONCAT() function.
     */
    private Integer groupConcatMaxLen;
    /**
     * The time, in seconds, before cached statistics expire
     */
    private Integer informationSchemaStatsExpiry;
    /**
     * Maximum size for the InnoDB change buffer, as a percentage of the total size of the buffer pool. Default is 25
     */
    private Integer innodbChangeBufferMaxSize;
    /**
     * Specifies whether flushing a page from the InnoDB buffer pool also flushes other dirty pages in the same extent (default is 1): 0 - dirty pages in the same extent are not flushed,  1 - flush contiguous dirty pages in the same extent,  2 - flush dirty pages in the same extent
     */
    private Integer innodbFlushNeighbors;
    /**
     * Minimum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service.
     */
    private Integer innodbFtMinTokenSize;
    /**
     * This option is used to specify your own InnoDB FULLTEXT index stopword list for all InnoDB tables.
     */
    private String innodbFtServerStopwordTable;
    /**
     * The length of time in seconds an InnoDB transaction waits for a row lock before giving up. Default is 120.
     */
    private Integer innodbLockWaitTimeout;
    /**
     * The size in bytes of the buffer that InnoDB uses to write to the log files on disk.
     */
    private Integer innodbLogBufferSize;
    /**
     * The upper limit in bytes on the size of the temporary log files used during online DDL operations for InnoDB tables.
     */
    private Integer innodbOnlineAlterLogMaxSize;
    /**
     * When enabled, information about all deadlocks in InnoDB user transactions is recorded in the error log. Disabled by default.
     */
    private Boolean innodbPrintAllDeadlocks;
    /**
     * The number of I/O threads for read operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
     */
    private Integer innodbReadIoThreads;
    /**
     * When enabled a transaction timeout causes InnoDB to abort and roll back the entire transaction. Changing this parameter will lead to a restart of the MySQL service.
     */
    private Boolean innodbRollbackOnTimeout;
    /**
     * Defines the maximum number of threads permitted inside of InnoDB. Default is 0 (infinite concurrency - no limit)
     */
    private Integer innodbThreadConcurrency;
    /**
     * The number of I/O threads for write operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
     */
    private Integer innodbWriteIoThreads;
    /**
     * The number of seconds the server waits for activity on an interactive connection before closing it.
     */
    private Integer interactiveTimeout;
    /**
     * The storage engine for in-memory internal temporary tables.
     */
    private JsonSchemaMysqlInternalTmpMemStorageEngine internalTmpMemStorageEngine;
    /**
     * The slow_query_logs work as SQL statements that take more than long_query_time seconds to execute. Default is 10s
     */
    private Double longQueryTime;
    /**
     * Size of the largest message in bytes that can be received by the server. Default is 67108864 (64M)
     */
    private Integer maxAllowedPacket;
    /**
     * Limits the size of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M)
     */
    private Integer maxHeapTableSize;
    /**
     * Start sizes of connection buffer and result buffer. Default is 16384 (16K). Changing this parameter will lead to a restart of the MySQL service.
     */
    private Integer netBufferLength;
    /**
     * The number of seconds to wait for more data from a connection before aborting the read.
     */
    private Integer netReadTimeout;
    /**
     * The number of seconds to wait for a block to be written to a connection before aborting the write.
     */
    private Integer netWriteTimeout;
    /**
     * Slow query log enables capturing of slow queries. Setting slow_query_log to false also truncates the mysql.slow_log table. Default is off
     */
    private Boolean slowQueryLog;
    /**
     * Sort buffer size in bytes for ORDER BY optimization. Default is 262144 (256K)
     */
    private Integer sortBufferSize;
    /**
     * Global SQL mode. Set to empty to use MySQL server defaults. When creating a new service and not setting this field Aiven default SQL mode (strict, SQL standard compliant) will be assigned.
     */
    private String sqlMode;
    /**
     * Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
     */
    private Boolean sqlRequirePrimaryKey;
    /**
     * Limits the size of internal in-memory tables. Also set max_heap_table_size. Default is 16777216 (16M)
     */
    private Integer tmpTableSize;
    /**
     * The number of seconds the server waits for activity on a noninteractive connection before closing it.
     */
    private Integer waitTimeout;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaMysql
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaMysql createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaMysql();
    }
    /**
     * Gets the connect_timeout property value. The number of seconds that the mysqld server waits for a connect packet before responding with Bad handshake
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConnectTimeout() {
        return this.connectTimeout;
    }
    /**
     * Gets the default_time_zone property value. Default server time zone as an offset from UTC (from -12:00 to +12:00), a time zone name, or 'SYSTEM' to use the MySQL server default.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultTimeZone() {
        return this.defaultTimeZone;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(30);
        deserializerMap.put("connect_timeout", (n) -> { this.setConnectTimeout(n.getIntegerValue()); });
        deserializerMap.put("default_time_zone", (n) -> { this.setDefaultTimeZone(n.getStringValue()); });
        deserializerMap.put("group_concat_max_len", (n) -> { this.setGroupConcatMaxLen(n.getIntegerValue()); });
        deserializerMap.put("information_schema_stats_expiry", (n) -> { this.setInformationSchemaStatsExpiry(n.getIntegerValue()); });
        deserializerMap.put("innodb_change_buffer_max_size", (n) -> { this.setInnodbChangeBufferMaxSize(n.getIntegerValue()); });
        deserializerMap.put("innodb_flush_neighbors", (n) -> { this.setInnodbFlushNeighbors(n.getIntegerValue()); });
        deserializerMap.put("innodb_ft_min_token_size", (n) -> { this.setInnodbFtMinTokenSize(n.getIntegerValue()); });
        deserializerMap.put("innodb_ft_server_stopword_table", (n) -> { this.setInnodbFtServerStopwordTable(n.getStringValue()); });
        deserializerMap.put("innodb_lock_wait_timeout", (n) -> { this.setInnodbLockWaitTimeout(n.getIntegerValue()); });
        deserializerMap.put("innodb_log_buffer_size", (n) -> { this.setInnodbLogBufferSize(n.getIntegerValue()); });
        deserializerMap.put("innodb_online_alter_log_max_size", (n) -> { this.setInnodbOnlineAlterLogMaxSize(n.getIntegerValue()); });
        deserializerMap.put("innodb_print_all_deadlocks", (n) -> { this.setInnodbPrintAllDeadlocks(n.getBooleanValue()); });
        deserializerMap.put("innodb_read_io_threads", (n) -> { this.setInnodbReadIoThreads(n.getIntegerValue()); });
        deserializerMap.put("innodb_rollback_on_timeout", (n) -> { this.setInnodbRollbackOnTimeout(n.getBooleanValue()); });
        deserializerMap.put("innodb_thread_concurrency", (n) -> { this.setInnodbThreadConcurrency(n.getIntegerValue()); });
        deserializerMap.put("innodb_write_io_threads", (n) -> { this.setInnodbWriteIoThreads(n.getIntegerValue()); });
        deserializerMap.put("interactive_timeout", (n) -> { this.setInteractiveTimeout(n.getIntegerValue()); });
        deserializerMap.put("internal_tmp_mem_storage_engine", (n) -> { this.setInternalTmpMemStorageEngine(n.getEnumValue(JsonSchemaMysqlInternalTmpMemStorageEngine::forValue)); });
        deserializerMap.put("long_query_time", (n) -> { this.setLongQueryTime(n.getDoubleValue()); });
        deserializerMap.put("max_allowed_packet", (n) -> { this.setMaxAllowedPacket(n.getIntegerValue()); });
        deserializerMap.put("max_heap_table_size", (n) -> { this.setMaxHeapTableSize(n.getIntegerValue()); });
        deserializerMap.put("net_buffer_length", (n) -> { this.setNetBufferLength(n.getIntegerValue()); });
        deserializerMap.put("net_read_timeout", (n) -> { this.setNetReadTimeout(n.getIntegerValue()); });
        deserializerMap.put("net_write_timeout", (n) -> { this.setNetWriteTimeout(n.getIntegerValue()); });
        deserializerMap.put("slow_query_log", (n) -> { this.setSlowQueryLog(n.getBooleanValue()); });
        deserializerMap.put("sort_buffer_size", (n) -> { this.setSortBufferSize(n.getIntegerValue()); });
        deserializerMap.put("sql_mode", (n) -> { this.setSqlMode(n.getStringValue()); });
        deserializerMap.put("sql_require_primary_key", (n) -> { this.setSqlRequirePrimaryKey(n.getBooleanValue()); });
        deserializerMap.put("tmp_table_size", (n) -> { this.setTmpTableSize(n.getIntegerValue()); });
        deserializerMap.put("wait_timeout", (n) -> { this.setWaitTimeout(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the group_concat_max_len property value. The maximum permitted result length in bytes for the GROUP_CONCAT() function.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getGroupConcatMaxLen() {
        return this.groupConcatMaxLen;
    }
    /**
     * Gets the information_schema_stats_expiry property value. The time, in seconds, before cached statistics expire
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInformationSchemaStatsExpiry() {
        return this.informationSchemaStatsExpiry;
    }
    /**
     * Gets the innodb_change_buffer_max_size property value. Maximum size for the InnoDB change buffer, as a percentage of the total size of the buffer pool. Default is 25
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInnodbChangeBufferMaxSize() {
        return this.innodbChangeBufferMaxSize;
    }
    /**
     * Gets the innodb_flush_neighbors property value. Specifies whether flushing a page from the InnoDB buffer pool also flushes other dirty pages in the same extent (default is 1): 0 - dirty pages in the same extent are not flushed,  1 - flush contiguous dirty pages in the same extent,  2 - flush dirty pages in the same extent
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInnodbFlushNeighbors() {
        return this.innodbFlushNeighbors;
    }
    /**
     * Gets the innodb_ft_min_token_size property value. Minimum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInnodbFtMinTokenSize() {
        return this.innodbFtMinTokenSize;
    }
    /**
     * Gets the innodb_ft_server_stopword_table property value. This option is used to specify your own InnoDB FULLTEXT index stopword list for all InnoDB tables.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInnodbFtServerStopwordTable() {
        return this.innodbFtServerStopwordTable;
    }
    /**
     * Gets the innodb_lock_wait_timeout property value. The length of time in seconds an InnoDB transaction waits for a row lock before giving up. Default is 120.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInnodbLockWaitTimeout() {
        return this.innodbLockWaitTimeout;
    }
    /**
     * Gets the innodb_log_buffer_size property value. The size in bytes of the buffer that InnoDB uses to write to the log files on disk.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInnodbLogBufferSize() {
        return this.innodbLogBufferSize;
    }
    /**
     * Gets the innodb_online_alter_log_max_size property value. The upper limit in bytes on the size of the temporary log files used during online DDL operations for InnoDB tables.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInnodbOnlineAlterLogMaxSize() {
        return this.innodbOnlineAlterLogMaxSize;
    }
    /**
     * Gets the innodb_print_all_deadlocks property value. When enabled, information about all deadlocks in InnoDB user transactions is recorded in the error log. Disabled by default.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInnodbPrintAllDeadlocks() {
        return this.innodbPrintAllDeadlocks;
    }
    /**
     * Gets the innodb_read_io_threads property value. The number of I/O threads for read operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInnodbReadIoThreads() {
        return this.innodbReadIoThreads;
    }
    /**
     * Gets the innodb_rollback_on_timeout property value. When enabled a transaction timeout causes InnoDB to abort and roll back the entire transaction. Changing this parameter will lead to a restart of the MySQL service.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInnodbRollbackOnTimeout() {
        return this.innodbRollbackOnTimeout;
    }
    /**
     * Gets the innodb_thread_concurrency property value. Defines the maximum number of threads permitted inside of InnoDB. Default is 0 (infinite concurrency - no limit)
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInnodbThreadConcurrency() {
        return this.innodbThreadConcurrency;
    }
    /**
     * Gets the innodb_write_io_threads property value. The number of I/O threads for write operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInnodbWriteIoThreads() {
        return this.innodbWriteIoThreads;
    }
    /**
     * Gets the interactive_timeout property value. The number of seconds the server waits for activity on an interactive connection before closing it.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInteractiveTimeout() {
        return this.interactiveTimeout;
    }
    /**
     * Gets the internal_tmp_mem_storage_engine property value. The storage engine for in-memory internal temporary tables.
     * @return a JsonSchemaMysqlInternalTmpMemStorageEngine
     */
    @jakarta.annotation.Nullable
    public JsonSchemaMysqlInternalTmpMemStorageEngine getInternalTmpMemStorageEngine() {
        return this.internalTmpMemStorageEngine;
    }
    /**
     * Gets the long_query_time property value. The slow_query_logs work as SQL statements that take more than long_query_time seconds to execute. Default is 10s
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getLongQueryTime() {
        return this.longQueryTime;
    }
    /**
     * Gets the max_allowed_packet property value. Size of the largest message in bytes that can be received by the server. Default is 67108864 (64M)
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxAllowedPacket() {
        return this.maxAllowedPacket;
    }
    /**
     * Gets the max_heap_table_size property value. Limits the size of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M)
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxHeapTableSize() {
        return this.maxHeapTableSize;
    }
    /**
     * Gets the net_buffer_length property value. Start sizes of connection buffer and result buffer. Default is 16384 (16K). Changing this parameter will lead to a restart of the MySQL service.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNetBufferLength() {
        return this.netBufferLength;
    }
    /**
     * Gets the net_read_timeout property value. The number of seconds to wait for more data from a connection before aborting the read.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNetReadTimeout() {
        return this.netReadTimeout;
    }
    /**
     * Gets the net_write_timeout property value. The number of seconds to wait for a block to be written to a connection before aborting the write.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNetWriteTimeout() {
        return this.netWriteTimeout;
    }
    /**
     * Gets the slow_query_log property value. Slow query log enables capturing of slow queries. Setting slow_query_log to false also truncates the mysql.slow_log table. Default is off
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSlowQueryLog() {
        return this.slowQueryLog;
    }
    /**
     * Gets the sort_buffer_size property value. Sort buffer size in bytes for ORDER BY optimization. Default is 262144 (256K)
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSortBufferSize() {
        return this.sortBufferSize;
    }
    /**
     * Gets the sql_mode property value. Global SQL mode. Set to empty to use MySQL server defaults. When creating a new service and not setting this field Aiven default SQL mode (strict, SQL standard compliant) will be assigned.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSqlMode() {
        return this.sqlMode;
    }
    /**
     * Gets the sql_require_primary_key property value. Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSqlRequirePrimaryKey() {
        return this.sqlRequirePrimaryKey;
    }
    /**
     * Gets the tmp_table_size property value. Limits the size of internal in-memory tables. Also set max_heap_table_size. Default is 16777216 (16M)
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTmpTableSize() {
        return this.tmpTableSize;
    }
    /**
     * Gets the wait_timeout property value. The number of seconds the server waits for activity on a noninteractive connection before closing it.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWaitTimeout() {
        return this.waitTimeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("connect_timeout", this.getConnectTimeout());
        writer.writeStringValue("default_time_zone", this.getDefaultTimeZone());
        writer.writeIntegerValue("group_concat_max_len", this.getGroupConcatMaxLen());
        writer.writeIntegerValue("information_schema_stats_expiry", this.getInformationSchemaStatsExpiry());
        writer.writeIntegerValue("innodb_change_buffer_max_size", this.getInnodbChangeBufferMaxSize());
        writer.writeIntegerValue("innodb_flush_neighbors", this.getInnodbFlushNeighbors());
        writer.writeIntegerValue("innodb_ft_min_token_size", this.getInnodbFtMinTokenSize());
        writer.writeStringValue("innodb_ft_server_stopword_table", this.getInnodbFtServerStopwordTable());
        writer.writeIntegerValue("innodb_lock_wait_timeout", this.getInnodbLockWaitTimeout());
        writer.writeIntegerValue("innodb_log_buffer_size", this.getInnodbLogBufferSize());
        writer.writeIntegerValue("innodb_online_alter_log_max_size", this.getInnodbOnlineAlterLogMaxSize());
        writer.writeBooleanValue("innodb_print_all_deadlocks", this.getInnodbPrintAllDeadlocks());
        writer.writeIntegerValue("innodb_read_io_threads", this.getInnodbReadIoThreads());
        writer.writeBooleanValue("innodb_rollback_on_timeout", this.getInnodbRollbackOnTimeout());
        writer.writeIntegerValue("innodb_thread_concurrency", this.getInnodbThreadConcurrency());
        writer.writeIntegerValue("innodb_write_io_threads", this.getInnodbWriteIoThreads());
        writer.writeIntegerValue("interactive_timeout", this.getInteractiveTimeout());
        writer.writeEnumValue("internal_tmp_mem_storage_engine", this.getInternalTmpMemStorageEngine());
        writer.writeDoubleValue("long_query_time", this.getLongQueryTime());
        writer.writeIntegerValue("max_allowed_packet", this.getMaxAllowedPacket());
        writer.writeIntegerValue("max_heap_table_size", this.getMaxHeapTableSize());
        writer.writeIntegerValue("net_buffer_length", this.getNetBufferLength());
        writer.writeIntegerValue("net_read_timeout", this.getNetReadTimeout());
        writer.writeIntegerValue("net_write_timeout", this.getNetWriteTimeout());
        writer.writeBooleanValue("slow_query_log", this.getSlowQueryLog());
        writer.writeIntegerValue("sort_buffer_size", this.getSortBufferSize());
        writer.writeStringValue("sql_mode", this.getSqlMode());
        writer.writeBooleanValue("sql_require_primary_key", this.getSqlRequirePrimaryKey());
        writer.writeIntegerValue("tmp_table_size", this.getTmpTableSize());
        writer.writeIntegerValue("wait_timeout", this.getWaitTimeout());
    }
    /**
     * Sets the connect_timeout property value. The number of seconds that the mysqld server waits for a connect packet before responding with Bad handshake
     * @param value Value to set for the connect_timeout property.
     */
    public void setConnectTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.connectTimeout = value;
    }
    /**
     * Sets the default_time_zone property value. Default server time zone as an offset from UTC (from -12:00 to +12:00), a time zone name, or 'SYSTEM' to use the MySQL server default.
     * @param value Value to set for the default_time_zone property.
     */
    public void setDefaultTimeZone(@jakarta.annotation.Nullable final String value) {
        this.defaultTimeZone = value;
    }
    /**
     * Sets the group_concat_max_len property value. The maximum permitted result length in bytes for the GROUP_CONCAT() function.
     * @param value Value to set for the group_concat_max_len property.
     */
    public void setGroupConcatMaxLen(@jakarta.annotation.Nullable final Integer value) {
        this.groupConcatMaxLen = value;
    }
    /**
     * Sets the information_schema_stats_expiry property value. The time, in seconds, before cached statistics expire
     * @param value Value to set for the information_schema_stats_expiry property.
     */
    public void setInformationSchemaStatsExpiry(@jakarta.annotation.Nullable final Integer value) {
        this.informationSchemaStatsExpiry = value;
    }
    /**
     * Sets the innodb_change_buffer_max_size property value. Maximum size for the InnoDB change buffer, as a percentage of the total size of the buffer pool. Default is 25
     * @param value Value to set for the innodb_change_buffer_max_size property.
     */
    public void setInnodbChangeBufferMaxSize(@jakarta.annotation.Nullable final Integer value) {
        this.innodbChangeBufferMaxSize = value;
    }
    /**
     * Sets the innodb_flush_neighbors property value. Specifies whether flushing a page from the InnoDB buffer pool also flushes other dirty pages in the same extent (default is 1): 0 - dirty pages in the same extent are not flushed,  1 - flush contiguous dirty pages in the same extent,  2 - flush dirty pages in the same extent
     * @param value Value to set for the innodb_flush_neighbors property.
     */
    public void setInnodbFlushNeighbors(@jakarta.annotation.Nullable final Integer value) {
        this.innodbFlushNeighbors = value;
    }
    /**
     * Sets the innodb_ft_min_token_size property value. Minimum length of words that are stored in an InnoDB FULLTEXT index. Changing this parameter will lead to a restart of the MySQL service.
     * @param value Value to set for the innodb_ft_min_token_size property.
     */
    public void setInnodbFtMinTokenSize(@jakarta.annotation.Nullable final Integer value) {
        this.innodbFtMinTokenSize = value;
    }
    /**
     * Sets the innodb_ft_server_stopword_table property value. This option is used to specify your own InnoDB FULLTEXT index stopword list for all InnoDB tables.
     * @param value Value to set for the innodb_ft_server_stopword_table property.
     */
    public void setInnodbFtServerStopwordTable(@jakarta.annotation.Nullable final String value) {
        this.innodbFtServerStopwordTable = value;
    }
    /**
     * Sets the innodb_lock_wait_timeout property value. The length of time in seconds an InnoDB transaction waits for a row lock before giving up. Default is 120.
     * @param value Value to set for the innodb_lock_wait_timeout property.
     */
    public void setInnodbLockWaitTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.innodbLockWaitTimeout = value;
    }
    /**
     * Sets the innodb_log_buffer_size property value. The size in bytes of the buffer that InnoDB uses to write to the log files on disk.
     * @param value Value to set for the innodb_log_buffer_size property.
     */
    public void setInnodbLogBufferSize(@jakarta.annotation.Nullable final Integer value) {
        this.innodbLogBufferSize = value;
    }
    /**
     * Sets the innodb_online_alter_log_max_size property value. The upper limit in bytes on the size of the temporary log files used during online DDL operations for InnoDB tables.
     * @param value Value to set for the innodb_online_alter_log_max_size property.
     */
    public void setInnodbOnlineAlterLogMaxSize(@jakarta.annotation.Nullable final Integer value) {
        this.innodbOnlineAlterLogMaxSize = value;
    }
    /**
     * Sets the innodb_print_all_deadlocks property value. When enabled, information about all deadlocks in InnoDB user transactions is recorded in the error log. Disabled by default.
     * @param value Value to set for the innodb_print_all_deadlocks property.
     */
    public void setInnodbPrintAllDeadlocks(@jakarta.annotation.Nullable final Boolean value) {
        this.innodbPrintAllDeadlocks = value;
    }
    /**
     * Sets the innodb_read_io_threads property value. The number of I/O threads for read operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
     * @param value Value to set for the innodb_read_io_threads property.
     */
    public void setInnodbReadIoThreads(@jakarta.annotation.Nullable final Integer value) {
        this.innodbReadIoThreads = value;
    }
    /**
     * Sets the innodb_rollback_on_timeout property value. When enabled a transaction timeout causes InnoDB to abort and roll back the entire transaction. Changing this parameter will lead to a restart of the MySQL service.
     * @param value Value to set for the innodb_rollback_on_timeout property.
     */
    public void setInnodbRollbackOnTimeout(@jakarta.annotation.Nullable final Boolean value) {
        this.innodbRollbackOnTimeout = value;
    }
    /**
     * Sets the innodb_thread_concurrency property value. Defines the maximum number of threads permitted inside of InnoDB. Default is 0 (infinite concurrency - no limit)
     * @param value Value to set for the innodb_thread_concurrency property.
     */
    public void setInnodbThreadConcurrency(@jakarta.annotation.Nullable final Integer value) {
        this.innodbThreadConcurrency = value;
    }
    /**
     * Sets the innodb_write_io_threads property value. The number of I/O threads for write operations in InnoDB. Default is 4. Changing this parameter will lead to a restart of the MySQL service.
     * @param value Value to set for the innodb_write_io_threads property.
     */
    public void setInnodbWriteIoThreads(@jakarta.annotation.Nullable final Integer value) {
        this.innodbWriteIoThreads = value;
    }
    /**
     * Sets the interactive_timeout property value. The number of seconds the server waits for activity on an interactive connection before closing it.
     * @param value Value to set for the interactive_timeout property.
     */
    public void setInteractiveTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.interactiveTimeout = value;
    }
    /**
     * Sets the internal_tmp_mem_storage_engine property value. The storage engine for in-memory internal temporary tables.
     * @param value Value to set for the internal_tmp_mem_storage_engine property.
     */
    public void setInternalTmpMemStorageEngine(@jakarta.annotation.Nullable final JsonSchemaMysqlInternalTmpMemStorageEngine value) {
        this.internalTmpMemStorageEngine = value;
    }
    /**
     * Sets the long_query_time property value. The slow_query_logs work as SQL statements that take more than long_query_time seconds to execute. Default is 10s
     * @param value Value to set for the long_query_time property.
     */
    public void setLongQueryTime(@jakarta.annotation.Nullable final Double value) {
        this.longQueryTime = value;
    }
    /**
     * Sets the max_allowed_packet property value. Size of the largest message in bytes that can be received by the server. Default is 67108864 (64M)
     * @param value Value to set for the max_allowed_packet property.
     */
    public void setMaxAllowedPacket(@jakarta.annotation.Nullable final Integer value) {
        this.maxAllowedPacket = value;
    }
    /**
     * Sets the max_heap_table_size property value. Limits the size of internal in-memory tables. Also set tmp_table_size. Default is 16777216 (16M)
     * @param value Value to set for the max_heap_table_size property.
     */
    public void setMaxHeapTableSize(@jakarta.annotation.Nullable final Integer value) {
        this.maxHeapTableSize = value;
    }
    /**
     * Sets the net_buffer_length property value. Start sizes of connection buffer and result buffer. Default is 16384 (16K). Changing this parameter will lead to a restart of the MySQL service.
     * @param value Value to set for the net_buffer_length property.
     */
    public void setNetBufferLength(@jakarta.annotation.Nullable final Integer value) {
        this.netBufferLength = value;
    }
    /**
     * Sets the net_read_timeout property value. The number of seconds to wait for more data from a connection before aborting the read.
     * @param value Value to set for the net_read_timeout property.
     */
    public void setNetReadTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.netReadTimeout = value;
    }
    /**
     * Sets the net_write_timeout property value. The number of seconds to wait for a block to be written to a connection before aborting the write.
     * @param value Value to set for the net_write_timeout property.
     */
    public void setNetWriteTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.netWriteTimeout = value;
    }
    /**
     * Sets the slow_query_log property value. Slow query log enables capturing of slow queries. Setting slow_query_log to false also truncates the mysql.slow_log table. Default is off
     * @param value Value to set for the slow_query_log property.
     */
    public void setSlowQueryLog(@jakarta.annotation.Nullable final Boolean value) {
        this.slowQueryLog = value;
    }
    /**
     * Sets the sort_buffer_size property value. Sort buffer size in bytes for ORDER BY optimization. Default is 262144 (256K)
     * @param value Value to set for the sort_buffer_size property.
     */
    public void setSortBufferSize(@jakarta.annotation.Nullable final Integer value) {
        this.sortBufferSize = value;
    }
    /**
     * Sets the sql_mode property value. Global SQL mode. Set to empty to use MySQL server defaults. When creating a new service and not setting this field Aiven default SQL mode (strict, SQL standard compliant) will be assigned.
     * @param value Value to set for the sql_mode property.
     */
    public void setSqlMode(@jakarta.annotation.Nullable final String value) {
        this.sqlMode = value;
    }
    /**
     * Sets the sql_require_primary_key property value. Require primary key to be defined for new tables or old tables modified with ALTER TABLE and fail if missing. It is recommended to always have primary keys because various functionality may break if any large table is missing them.
     * @param value Value to set for the sql_require_primary_key property.
     */
    public void setSqlRequirePrimaryKey(@jakarta.annotation.Nullable final Boolean value) {
        this.sqlRequirePrimaryKey = value;
    }
    /**
     * Sets the tmp_table_size property value. Limits the size of internal in-memory tables. Also set max_heap_table_size. Default is 16777216 (16M)
     * @param value Value to set for the tmp_table_size property.
     */
    public void setTmpTableSize(@jakarta.annotation.Nullable final Integer value) {
        this.tmpTableSize = value;
    }
    /**
     * Sets the wait_timeout property value. The number of seconds the server waits for activity on a noninteractive connection before closing it.
     * @param value Value to set for the wait_timeout property.
     */
    public void setWaitTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.waitTimeout = value;
    }
}
