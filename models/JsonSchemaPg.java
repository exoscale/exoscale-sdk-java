package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaPg implements Parsable {
    /**
     * The autovacuum property
     */
    private JsonSchemaPgAutovacuum autovacuum;
    /**
     * The bgWriter property
     */
    private JsonSchemaPgBgWriter bgWriter;
    /**
     * This is the amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.
     */
    private Integer deadlockTimeout;
    /**
     * Specifies the default TOAST compression method for values of compressible columns (the default is lz4).
     */
    private JsonSchemaPgDefaultToastCompression defaultToastCompression;
    /**
     * Time out sessions with open transactions after this number of milliseconds
     */
    private Integer idleInTransactionSessionTimeout;
    /**
     * Controls system-wide use of Just-in-Time Compilation (JIT).
     */
    private Boolean jit;
    /**
     * Controls the amount of detail written in the server log for each message that is logged.
     */
    private JsonSchemaPgLogErrorVerbosity logErrorVerbosity;
    /**
     * Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc.
     */
    private JsonSchemaPgLogLinePrefix logLinePrefix;
    /**
     * Log statements that take more than this number of milliseconds to run, -1 disables
     */
    private Integer logMinDurationStatement;
    /**
     * Log statements for each temporary file created larger than this number of kilobytes, -1 disables
     */
    private Integer logTempFiles;
    /**
     * PostgreSQL maximum number of files that can be open per process
     */
    private Integer maxFilesPerProcess;
    /**
     * PostgreSQL maximum locks per transaction
     */
    private Integer maxLocksPerTransaction;
    /**
     * PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers)
     */
    private Integer maxLogicalReplicationWorkers;
    /**
     * Sets the maximum number of workers that the system can support for parallel queries
     */
    private Integer maxParallelWorkers;
    /**
     * Sets the maximum number of workers that can be started by a single Gather or Gather Merge node
     */
    private Integer maxParallelWorkersPerGather;
    /**
     * PostgreSQL maximum predicate locks per transaction
     */
    private Integer maxPredLocksPerTransaction;
    /**
     * PostgreSQL maximum prepared transactions
     */
    private Integer maxPreparedTransactions;
    /**
     * PostgreSQL maximum replication slots
     */
    private Integer maxReplicationSlots;
    /**
     * Maximum depth of the stack in bytes
     */
    private Integer maxStackDepth;
    /**
     * Max standby archive delay in milliseconds
     */
    private Integer maxStandbyArchiveDelay;
    /**
     * Max standby streaming delay in milliseconds
     */
    private Integer maxStandbyStreamingDelay;
    /**
     * Sets the maximum number of background processes that the system can support
     */
    private Integer maxWorkerProcesses;
    /**
     * Sets the time interval to run pg_partman's scheduled tasks
     */
    private Integer pgPartmanBgwInterval;
    /**
     * Controls which role to use for pg_partman's scheduled background tasks.
     */
    private String pgPartmanBgwRole;
    /**
     * Enables or disables query plan monitoring
     */
    private Boolean pgStatMonitorPgsmEnableQueryPlan;
    /**
     * Sets the maximum number of buckets 
     */
    private Integer pgStatMonitorPgsmMaxBuckets;
    /**
     * Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top.
     */
    private JsonSchemaPgPgStatStatementsTrack pgStatStatementsTrack;
    /**
     * PostgreSQL temporary file limit in KiB, -1 for unlimited
     */
    private Integer tempFileLimit;
    /**
     * PostgreSQL service timezone
     */
    private String timezone;
    /**
     * Specifies the number of bytes reserved to track the currently executing command for each active session.
     */
    private Integer trackActivityQuerySize;
    /**
     * Record commit time of transactions.
     */
    private JsonSchemaPgTrackCommitTimestamp trackCommitTimestamp;
    /**
     * Enables tracking of function call counts and time used.
     */
    private JsonSchemaPgTrackFunctions trackFunctions;
    /**
     * Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms.
     */
    private JsonSchemaPgTrackIoTiming trackIoTiming;
    /**
     * The wal property
     */
    private JsonSchemaPgWal wal;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaPg
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaPg createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaPg();
    }
    /**
     * Gets the autovacuum property value. The autovacuum property
     * @return a JsonSchemaPgAutovacuum
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgAutovacuum getAutovacuum() {
        return this.autovacuum;
    }
    /**
     * Gets the bg-writer property value. The bgWriter property
     * @return a JsonSchemaPgBgWriter
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgBgWriter getBgWriter() {
        return this.bgWriter;
    }
    /**
     * Gets the deadlock_timeout property value. This is the amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeadlockTimeout() {
        return this.deadlockTimeout;
    }
    /**
     * Gets the default_toast_compression property value. Specifies the default TOAST compression method for values of compressible columns (the default is lz4).
     * @return a JsonSchemaPgDefaultToastCompression
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgDefaultToastCompression getDefaultToastCompression() {
        return this.defaultToastCompression;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(34);
        deserializerMap.put("autovacuum", (n) -> { this.setAutovacuum(n.getObjectValue(JsonSchemaPgAutovacuum::createFromDiscriminatorValue)); });
        deserializerMap.put("bg-writer", (n) -> { this.setBgWriter(n.getObjectValue(JsonSchemaPgBgWriter::createFromDiscriminatorValue)); });
        deserializerMap.put("deadlock_timeout", (n) -> { this.setDeadlockTimeout(n.getIntegerValue()); });
        deserializerMap.put("default_toast_compression", (n) -> { this.setDefaultToastCompression(n.getEnumValue(JsonSchemaPgDefaultToastCompression::forValue)); });
        deserializerMap.put("idle_in_transaction_session_timeout", (n) -> { this.setIdleInTransactionSessionTimeout(n.getIntegerValue()); });
        deserializerMap.put("jit", (n) -> { this.setJit(n.getBooleanValue()); });
        deserializerMap.put("log_error_verbosity", (n) -> { this.setLogErrorVerbosity(n.getEnumValue(JsonSchemaPgLogErrorVerbosity::forValue)); });
        deserializerMap.put("log_line_prefix", (n) -> { this.setLogLinePrefix(n.getEnumValue(JsonSchemaPgLogLinePrefix::forValue)); });
        deserializerMap.put("log_min_duration_statement", (n) -> { this.setLogMinDurationStatement(n.getIntegerValue()); });
        deserializerMap.put("log_temp_files", (n) -> { this.setLogTempFiles(n.getIntegerValue()); });
        deserializerMap.put("max_files_per_process", (n) -> { this.setMaxFilesPerProcess(n.getIntegerValue()); });
        deserializerMap.put("max_locks_per_transaction", (n) -> { this.setMaxLocksPerTransaction(n.getIntegerValue()); });
        deserializerMap.put("max_logical_replication_workers", (n) -> { this.setMaxLogicalReplicationWorkers(n.getIntegerValue()); });
        deserializerMap.put("max_parallel_workers", (n) -> { this.setMaxParallelWorkers(n.getIntegerValue()); });
        deserializerMap.put("max_parallel_workers_per_gather", (n) -> { this.setMaxParallelWorkersPerGather(n.getIntegerValue()); });
        deserializerMap.put("max_pred_locks_per_transaction", (n) -> { this.setMaxPredLocksPerTransaction(n.getIntegerValue()); });
        deserializerMap.put("max_prepared_transactions", (n) -> { this.setMaxPreparedTransactions(n.getIntegerValue()); });
        deserializerMap.put("max_replication_slots", (n) -> { this.setMaxReplicationSlots(n.getIntegerValue()); });
        deserializerMap.put("max_stack_depth", (n) -> { this.setMaxStackDepth(n.getIntegerValue()); });
        deserializerMap.put("max_standby_archive_delay", (n) -> { this.setMaxStandbyArchiveDelay(n.getIntegerValue()); });
        deserializerMap.put("max_standby_streaming_delay", (n) -> { this.setMaxStandbyStreamingDelay(n.getIntegerValue()); });
        deserializerMap.put("max_worker_processes", (n) -> { this.setMaxWorkerProcesses(n.getIntegerValue()); });
        deserializerMap.put("pg_partman_bgw.interval", (n) -> { this.setPgPartmanBgwInterval(n.getIntegerValue()); });
        deserializerMap.put("pg_partman_bgw.role", (n) -> { this.setPgPartmanBgwRole(n.getStringValue()); });
        deserializerMap.put("pg_stat_monitor.pgsm_enable_query_plan", (n) -> { this.setPgStatMonitorPgsmEnableQueryPlan(n.getBooleanValue()); });
        deserializerMap.put("pg_stat_monitor.pgsm_max_buckets", (n) -> { this.setPgStatMonitorPgsmMaxBuckets(n.getIntegerValue()); });
        deserializerMap.put("pg_stat_statements.track", (n) -> { this.setPgStatStatementsTrack(n.getEnumValue(JsonSchemaPgPgStatStatementsTrack::forValue)); });
        deserializerMap.put("temp_file_limit", (n) -> { this.setTempFileLimit(n.getIntegerValue()); });
        deserializerMap.put("timezone", (n) -> { this.setTimezone(n.getStringValue()); });
        deserializerMap.put("track_activity_query_size", (n) -> { this.setTrackActivityQuerySize(n.getIntegerValue()); });
        deserializerMap.put("track_commit_timestamp", (n) -> { this.setTrackCommitTimestamp(n.getEnumValue(JsonSchemaPgTrackCommitTimestamp::forValue)); });
        deserializerMap.put("track_functions", (n) -> { this.setTrackFunctions(n.getEnumValue(JsonSchemaPgTrackFunctions::forValue)); });
        deserializerMap.put("track_io_timing", (n) -> { this.setTrackIoTiming(n.getEnumValue(JsonSchemaPgTrackIoTiming::forValue)); });
        deserializerMap.put("wal", (n) -> { this.setWal(n.getObjectValue(JsonSchemaPgWal::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the idle_in_transaction_session_timeout property value. Time out sessions with open transactions after this number of milliseconds
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIdleInTransactionSessionTimeout() {
        return this.idleInTransactionSessionTimeout;
    }
    /**
     * Gets the jit property value. Controls system-wide use of Just-in-Time Compilation (JIT).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getJit() {
        return this.jit;
    }
    /**
     * Gets the log_error_verbosity property value. Controls the amount of detail written in the server log for each message that is logged.
     * @return a JsonSchemaPgLogErrorVerbosity
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgLogErrorVerbosity getLogErrorVerbosity() {
        return this.logErrorVerbosity;
    }
    /**
     * Gets the log_line_prefix property value. Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc.
     * @return a JsonSchemaPgLogLinePrefix
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgLogLinePrefix getLogLinePrefix() {
        return this.logLinePrefix;
    }
    /**
     * Gets the log_min_duration_statement property value. Log statements that take more than this number of milliseconds to run, -1 disables
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogMinDurationStatement() {
        return this.logMinDurationStatement;
    }
    /**
     * Gets the log_temp_files property value. Log statements for each temporary file created larger than this number of kilobytes, -1 disables
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogTempFiles() {
        return this.logTempFiles;
    }
    /**
     * Gets the max_files_per_process property value. PostgreSQL maximum number of files that can be open per process
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxFilesPerProcess() {
        return this.maxFilesPerProcess;
    }
    /**
     * Gets the max_locks_per_transaction property value. PostgreSQL maximum locks per transaction
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxLocksPerTransaction() {
        return this.maxLocksPerTransaction;
    }
    /**
     * Gets the max_logical_replication_workers property value. PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers)
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxLogicalReplicationWorkers() {
        return this.maxLogicalReplicationWorkers;
    }
    /**
     * Gets the max_parallel_workers property value. Sets the maximum number of workers that the system can support for parallel queries
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxParallelWorkers() {
        return this.maxParallelWorkers;
    }
    /**
     * Gets the max_parallel_workers_per_gather property value. Sets the maximum number of workers that can be started by a single Gather or Gather Merge node
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxParallelWorkersPerGather() {
        return this.maxParallelWorkersPerGather;
    }
    /**
     * Gets the max_pred_locks_per_transaction property value. PostgreSQL maximum predicate locks per transaction
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxPredLocksPerTransaction() {
        return this.maxPredLocksPerTransaction;
    }
    /**
     * Gets the max_prepared_transactions property value. PostgreSQL maximum prepared transactions
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxPreparedTransactions() {
        return this.maxPreparedTransactions;
    }
    /**
     * Gets the max_replication_slots property value. PostgreSQL maximum replication slots
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxReplicationSlots() {
        return this.maxReplicationSlots;
    }
    /**
     * Gets the max_stack_depth property value. Maximum depth of the stack in bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxStackDepth() {
        return this.maxStackDepth;
    }
    /**
     * Gets the max_standby_archive_delay property value. Max standby archive delay in milliseconds
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxStandbyArchiveDelay() {
        return this.maxStandbyArchiveDelay;
    }
    /**
     * Gets the max_standby_streaming_delay property value. Max standby streaming delay in milliseconds
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxStandbyStreamingDelay() {
        return this.maxStandbyStreamingDelay;
    }
    /**
     * Gets the max_worker_processes property value. Sets the maximum number of background processes that the system can support
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxWorkerProcesses() {
        return this.maxWorkerProcesses;
    }
    /**
     * Gets the pg_partman_bgw.interval property value. Sets the time interval to run pg_partman's scheduled tasks
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPgPartmanBgwInterval() {
        return this.pgPartmanBgwInterval;
    }
    /**
     * Gets the pg_partman_bgw.role property value. Controls which role to use for pg_partman's scheduled background tasks.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPgPartmanBgwRole() {
        return this.pgPartmanBgwRole;
    }
    /**
     * Gets the pg_stat_monitor.pgsm_enable_query_plan property value. Enables or disables query plan monitoring
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPgStatMonitorPgsmEnableQueryPlan() {
        return this.pgStatMonitorPgsmEnableQueryPlan;
    }
    /**
     * Gets the pg_stat_monitor.pgsm_max_buckets property value. Sets the maximum number of buckets 
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPgStatMonitorPgsmMaxBuckets() {
        return this.pgStatMonitorPgsmMaxBuckets;
    }
    /**
     * Gets the pg_stat_statements.track property value. Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top.
     * @return a JsonSchemaPgPgStatStatementsTrack
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgPgStatStatementsTrack getPgStatStatementsTrack() {
        return this.pgStatStatementsTrack;
    }
    /**
     * Gets the temp_file_limit property value. PostgreSQL temporary file limit in KiB, -1 for unlimited
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTempFileLimit() {
        return this.tempFileLimit;
    }
    /**
     * Gets the timezone property value. PostgreSQL service timezone
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimezone() {
        return this.timezone;
    }
    /**
     * Gets the track_activity_query_size property value. Specifies the number of bytes reserved to track the currently executing command for each active session.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTrackActivityQuerySize() {
        return this.trackActivityQuerySize;
    }
    /**
     * Gets the track_commit_timestamp property value. Record commit time of transactions.
     * @return a JsonSchemaPgTrackCommitTimestamp
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgTrackCommitTimestamp getTrackCommitTimestamp() {
        return this.trackCommitTimestamp;
    }
    /**
     * Gets the track_functions property value. Enables tracking of function call counts and time used.
     * @return a JsonSchemaPgTrackFunctions
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgTrackFunctions getTrackFunctions() {
        return this.trackFunctions;
    }
    /**
     * Gets the track_io_timing property value. Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms.
     * @return a JsonSchemaPgTrackIoTiming
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgTrackIoTiming getTrackIoTiming() {
        return this.trackIoTiming;
    }
    /**
     * Gets the wal property value. The wal property
     * @return a JsonSchemaPgWal
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgWal getWal() {
        return this.wal;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("autovacuum", this.getAutovacuum());
        writer.writeObjectValue("bg-writer", this.getBgWriter());
        writer.writeIntegerValue("deadlock_timeout", this.getDeadlockTimeout());
        writer.writeEnumValue("default_toast_compression", this.getDefaultToastCompression());
        writer.writeIntegerValue("idle_in_transaction_session_timeout", this.getIdleInTransactionSessionTimeout());
        writer.writeBooleanValue("jit", this.getJit());
        writer.writeEnumValue("log_error_verbosity", this.getLogErrorVerbosity());
        writer.writeEnumValue("log_line_prefix", this.getLogLinePrefix());
        writer.writeIntegerValue("log_min_duration_statement", this.getLogMinDurationStatement());
        writer.writeIntegerValue("log_temp_files", this.getLogTempFiles());
        writer.writeIntegerValue("max_files_per_process", this.getMaxFilesPerProcess());
        writer.writeIntegerValue("max_locks_per_transaction", this.getMaxLocksPerTransaction());
        writer.writeIntegerValue("max_logical_replication_workers", this.getMaxLogicalReplicationWorkers());
        writer.writeIntegerValue("max_parallel_workers", this.getMaxParallelWorkers());
        writer.writeIntegerValue("max_parallel_workers_per_gather", this.getMaxParallelWorkersPerGather());
        writer.writeIntegerValue("max_pred_locks_per_transaction", this.getMaxPredLocksPerTransaction());
        writer.writeIntegerValue("max_prepared_transactions", this.getMaxPreparedTransactions());
        writer.writeIntegerValue("max_replication_slots", this.getMaxReplicationSlots());
        writer.writeIntegerValue("max_stack_depth", this.getMaxStackDepth());
        writer.writeIntegerValue("max_standby_archive_delay", this.getMaxStandbyArchiveDelay());
        writer.writeIntegerValue("max_standby_streaming_delay", this.getMaxStandbyStreamingDelay());
        writer.writeIntegerValue("max_worker_processes", this.getMaxWorkerProcesses());
        writer.writeIntegerValue("pg_partman_bgw.interval", this.getPgPartmanBgwInterval());
        writer.writeStringValue("pg_partman_bgw.role", this.getPgPartmanBgwRole());
        writer.writeBooleanValue("pg_stat_monitor.pgsm_enable_query_plan", this.getPgStatMonitorPgsmEnableQueryPlan());
        writer.writeIntegerValue("pg_stat_monitor.pgsm_max_buckets", this.getPgStatMonitorPgsmMaxBuckets());
        writer.writeEnumValue("pg_stat_statements.track", this.getPgStatStatementsTrack());
        writer.writeIntegerValue("temp_file_limit", this.getTempFileLimit());
        writer.writeStringValue("timezone", this.getTimezone());
        writer.writeIntegerValue("track_activity_query_size", this.getTrackActivityQuerySize());
        writer.writeEnumValue("track_commit_timestamp", this.getTrackCommitTimestamp());
        writer.writeEnumValue("track_functions", this.getTrackFunctions());
        writer.writeEnumValue("track_io_timing", this.getTrackIoTiming());
        writer.writeObjectValue("wal", this.getWal());
    }
    /**
     * Sets the autovacuum property value. The autovacuum property
     * @param value Value to set for the autovacuum property.
     */
    public void setAutovacuum(@jakarta.annotation.Nullable final JsonSchemaPgAutovacuum value) {
        this.autovacuum = value;
    }
    /**
     * Sets the bg-writer property value. The bgWriter property
     * @param value Value to set for the bg-writer property.
     */
    public void setBgWriter(@jakarta.annotation.Nullable final JsonSchemaPgBgWriter value) {
        this.bgWriter = value;
    }
    /**
     * Sets the deadlock_timeout property value. This is the amount of time, in milliseconds, to wait on a lock before checking to see if there is a deadlock condition.
     * @param value Value to set for the deadlock_timeout property.
     */
    public void setDeadlockTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.deadlockTimeout = value;
    }
    /**
     * Sets the default_toast_compression property value. Specifies the default TOAST compression method for values of compressible columns (the default is lz4).
     * @param value Value to set for the default_toast_compression property.
     */
    public void setDefaultToastCompression(@jakarta.annotation.Nullable final JsonSchemaPgDefaultToastCompression value) {
        this.defaultToastCompression = value;
    }
    /**
     * Sets the idle_in_transaction_session_timeout property value. Time out sessions with open transactions after this number of milliseconds
     * @param value Value to set for the idle_in_transaction_session_timeout property.
     */
    public void setIdleInTransactionSessionTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.idleInTransactionSessionTimeout = value;
    }
    /**
     * Sets the jit property value. Controls system-wide use of Just-in-Time Compilation (JIT).
     * @param value Value to set for the jit property.
     */
    public void setJit(@jakarta.annotation.Nullable final Boolean value) {
        this.jit = value;
    }
    /**
     * Sets the log_error_verbosity property value. Controls the amount of detail written in the server log for each message that is logged.
     * @param value Value to set for the log_error_verbosity property.
     */
    public void setLogErrorVerbosity(@jakarta.annotation.Nullable final JsonSchemaPgLogErrorVerbosity value) {
        this.logErrorVerbosity = value;
    }
    /**
     * Sets the log_line_prefix property value. Choose from one of the available log-formats. These can support popular log analyzers like pgbadger, pganalyze etc.
     * @param value Value to set for the log_line_prefix property.
     */
    public void setLogLinePrefix(@jakarta.annotation.Nullable final JsonSchemaPgLogLinePrefix value) {
        this.logLinePrefix = value;
    }
    /**
     * Sets the log_min_duration_statement property value. Log statements that take more than this number of milliseconds to run, -1 disables
     * @param value Value to set for the log_min_duration_statement property.
     */
    public void setLogMinDurationStatement(@jakarta.annotation.Nullable final Integer value) {
        this.logMinDurationStatement = value;
    }
    /**
     * Sets the log_temp_files property value. Log statements for each temporary file created larger than this number of kilobytes, -1 disables
     * @param value Value to set for the log_temp_files property.
     */
    public void setLogTempFiles(@jakarta.annotation.Nullable final Integer value) {
        this.logTempFiles = value;
    }
    /**
     * Sets the max_files_per_process property value. PostgreSQL maximum number of files that can be open per process
     * @param value Value to set for the max_files_per_process property.
     */
    public void setMaxFilesPerProcess(@jakarta.annotation.Nullable final Integer value) {
        this.maxFilesPerProcess = value;
    }
    /**
     * Sets the max_locks_per_transaction property value. PostgreSQL maximum locks per transaction
     * @param value Value to set for the max_locks_per_transaction property.
     */
    public void setMaxLocksPerTransaction(@jakarta.annotation.Nullable final Integer value) {
        this.maxLocksPerTransaction = value;
    }
    /**
     * Sets the max_logical_replication_workers property value. PostgreSQL maximum logical replication workers (taken from the pool of max_parallel_workers)
     * @param value Value to set for the max_logical_replication_workers property.
     */
    public void setMaxLogicalReplicationWorkers(@jakarta.annotation.Nullable final Integer value) {
        this.maxLogicalReplicationWorkers = value;
    }
    /**
     * Sets the max_parallel_workers property value. Sets the maximum number of workers that the system can support for parallel queries
     * @param value Value to set for the max_parallel_workers property.
     */
    public void setMaxParallelWorkers(@jakarta.annotation.Nullable final Integer value) {
        this.maxParallelWorkers = value;
    }
    /**
     * Sets the max_parallel_workers_per_gather property value. Sets the maximum number of workers that can be started by a single Gather or Gather Merge node
     * @param value Value to set for the max_parallel_workers_per_gather property.
     */
    public void setMaxParallelWorkersPerGather(@jakarta.annotation.Nullable final Integer value) {
        this.maxParallelWorkersPerGather = value;
    }
    /**
     * Sets the max_pred_locks_per_transaction property value. PostgreSQL maximum predicate locks per transaction
     * @param value Value to set for the max_pred_locks_per_transaction property.
     */
    public void setMaxPredLocksPerTransaction(@jakarta.annotation.Nullable final Integer value) {
        this.maxPredLocksPerTransaction = value;
    }
    /**
     * Sets the max_prepared_transactions property value. PostgreSQL maximum prepared transactions
     * @param value Value to set for the max_prepared_transactions property.
     */
    public void setMaxPreparedTransactions(@jakarta.annotation.Nullable final Integer value) {
        this.maxPreparedTransactions = value;
    }
    /**
     * Sets the max_replication_slots property value. PostgreSQL maximum replication slots
     * @param value Value to set for the max_replication_slots property.
     */
    public void setMaxReplicationSlots(@jakarta.annotation.Nullable final Integer value) {
        this.maxReplicationSlots = value;
    }
    /**
     * Sets the max_stack_depth property value. Maximum depth of the stack in bytes
     * @param value Value to set for the max_stack_depth property.
     */
    public void setMaxStackDepth(@jakarta.annotation.Nullable final Integer value) {
        this.maxStackDepth = value;
    }
    /**
     * Sets the max_standby_archive_delay property value. Max standby archive delay in milliseconds
     * @param value Value to set for the max_standby_archive_delay property.
     */
    public void setMaxStandbyArchiveDelay(@jakarta.annotation.Nullable final Integer value) {
        this.maxStandbyArchiveDelay = value;
    }
    /**
     * Sets the max_standby_streaming_delay property value. Max standby streaming delay in milliseconds
     * @param value Value to set for the max_standby_streaming_delay property.
     */
    public void setMaxStandbyStreamingDelay(@jakarta.annotation.Nullable final Integer value) {
        this.maxStandbyStreamingDelay = value;
    }
    /**
     * Sets the max_worker_processes property value. Sets the maximum number of background processes that the system can support
     * @param value Value to set for the max_worker_processes property.
     */
    public void setMaxWorkerProcesses(@jakarta.annotation.Nullable final Integer value) {
        this.maxWorkerProcesses = value;
    }
    /**
     * Sets the pg_partman_bgw.interval property value. Sets the time interval to run pg_partman's scheduled tasks
     * @param value Value to set for the pg_partman_bgw.interval property.
     */
    public void setPgPartmanBgwInterval(@jakarta.annotation.Nullable final Integer value) {
        this.pgPartmanBgwInterval = value;
    }
    /**
     * Sets the pg_partman_bgw.role property value. Controls which role to use for pg_partman's scheduled background tasks.
     * @param value Value to set for the pg_partman_bgw.role property.
     */
    public void setPgPartmanBgwRole(@jakarta.annotation.Nullable final String value) {
        this.pgPartmanBgwRole = value;
    }
    /**
     * Sets the pg_stat_monitor.pgsm_enable_query_plan property value. Enables or disables query plan monitoring
     * @param value Value to set for the pg_stat_monitor.pgsm_enable_query_plan property.
     */
    public void setPgStatMonitorPgsmEnableQueryPlan(@jakarta.annotation.Nullable final Boolean value) {
        this.pgStatMonitorPgsmEnableQueryPlan = value;
    }
    /**
     * Sets the pg_stat_monitor.pgsm_max_buckets property value. Sets the maximum number of buckets 
     * @param value Value to set for the pg_stat_monitor.pgsm_max_buckets property.
     */
    public void setPgStatMonitorPgsmMaxBuckets(@jakarta.annotation.Nullable final Integer value) {
        this.pgStatMonitorPgsmMaxBuckets = value;
    }
    /**
     * Sets the pg_stat_statements.track property value. Controls which statements are counted. Specify top to track top-level statements (those issued directly by clients), all to also track nested statements (such as statements invoked within functions), or none to disable statement statistics collection. The default value is top.
     * @param value Value to set for the pg_stat_statements.track property.
     */
    public void setPgStatStatementsTrack(@jakarta.annotation.Nullable final JsonSchemaPgPgStatStatementsTrack value) {
        this.pgStatStatementsTrack = value;
    }
    /**
     * Sets the temp_file_limit property value. PostgreSQL temporary file limit in KiB, -1 for unlimited
     * @param value Value to set for the temp_file_limit property.
     */
    public void setTempFileLimit(@jakarta.annotation.Nullable final Integer value) {
        this.tempFileLimit = value;
    }
    /**
     * Sets the timezone property value. PostgreSQL service timezone
     * @param value Value to set for the timezone property.
     */
    public void setTimezone(@jakarta.annotation.Nullable final String value) {
        this.timezone = value;
    }
    /**
     * Sets the track_activity_query_size property value. Specifies the number of bytes reserved to track the currently executing command for each active session.
     * @param value Value to set for the track_activity_query_size property.
     */
    public void setTrackActivityQuerySize(@jakarta.annotation.Nullable final Integer value) {
        this.trackActivityQuerySize = value;
    }
    /**
     * Sets the track_commit_timestamp property value. Record commit time of transactions.
     * @param value Value to set for the track_commit_timestamp property.
     */
    public void setTrackCommitTimestamp(@jakarta.annotation.Nullable final JsonSchemaPgTrackCommitTimestamp value) {
        this.trackCommitTimestamp = value;
    }
    /**
     * Sets the track_functions property value. Enables tracking of function call counts and time used.
     * @param value Value to set for the track_functions property.
     */
    public void setTrackFunctions(@jakarta.annotation.Nullable final JsonSchemaPgTrackFunctions value) {
        this.trackFunctions = value;
    }
    /**
     * Sets the track_io_timing property value. Enables timing of database I/O calls. This parameter is off by default, because it will repeatedly query the operating system for the current time, which may cause significant overhead on some platforms.
     * @param value Value to set for the track_io_timing property.
     */
    public void setTrackIoTiming(@jakarta.annotation.Nullable final JsonSchemaPgTrackIoTiming value) {
        this.trackIoTiming = value;
    }
    /**
     * Sets the wal property value. The wal property
     * @param value Value to set for the wal property.
     */
    public void setWal(@jakarta.annotation.Nullable final JsonSchemaPgWal value) {
        this.wal = value;
    }
}
