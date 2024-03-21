package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaOpensearch implements Parsable {
    /**
     * Explicitly allow or block automatic creation of indices. Defaults to true
     */
    private Boolean actionAutoCreateIndexEnabled;
    /**
     * The action_destructive_requires_name property
     */
    private Boolean actionDestructiveRequiresName;
    /**
     * The auth_failure_listeners property
     */
    private JsonSchemaOpensearchAuthFailureListeners authFailureListeners;
    /**
     * Controls the number of shards allowed in the cluster per data node
     */
    private Integer clusterMaxShardsPerNode;
    /**
     * How many concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen on a node. Defaults to 2.
     */
    private Integer clusterRoutingAllocationNodeConcurrentRecoveries;
    /**
     * The emailSender property
     */
    private JsonSchemaOpensearchEmailSender emailSender;
    /**
     * Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes.
     */
    private Integer httpMaxContentLength;
    /**
     * The max size of allowed headers, in bytes
     */
    private Integer httpMaxHeaderSize;
    /**
     * The max length of an HTTP URL, in bytes
     */
    private Integer httpMaxInitialLineLength;
    /**
     * Relative amount. Maximum amount of heap memory used for field data cache. This is an expert setting; decreasing the value too much will increase overhead of loading field data; too much memory used for field data cache will decrease amount of heap available for other operations.
     */
    private Integer indicesFielddataCacheSize;
    /**
     * Percentage value. Default is 10%. Total amount of heap used for indexing buffer, before writing segments to disk. This is an expert setting. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance.
     */
    private Integer indicesMemoryIndexBufferSize;
    /**
     * Percentage value. Default is 10%. Maximum amount of heap used for query cache. This is an expert setting. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other OpenSearch functionality.
     */
    private Integer indicesQueriesCacheSize;
    /**
     * Maximum number of clauses Lucene BooleanQuery can have. The default value (1024) is relatively high, and increasing it may cause performance issues. Investigate other approaches first before increasing this value.
     */
    private Integer indicesQueryBoolMaxClauseCount;
    /**
     * Limits total inbound and outbound recovery traffic for each node. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Defaults to 40mb
     */
    private Integer indicesRecoveryMaxBytesPerSec;
    /**
     * Number of file chunks sent in parallel for each recovery. Defaults to 2.
     */
    private Integer indicesRecoveryMaxConcurrentFileChunks;
    /**
     * The ismHistory property
     */
    private JsonSchemaOpensearchIsmHistory ismHistory;
    /**
     * Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default is false
     */
    private Boolean overrideMainResponseVersion;
    /**
     * Whitelisted addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.
     */
    private java.util.List<String> reindexRemoteWhitelist;
    /**
     * Script compilation circuit breaker limits the number of inline script compilations within a period of time. Default is use-context
     */
    private String scriptMaxCompilationsRate;
    /**
     * Maximum number of aggregation buckets allowed in a single response. OpenSearch default value is used when this is not defined.
     */
    private Integer searchMaxBuckets;
    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    private Integer threadPoolAnalyzeQueueSize;
    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    private Integer threadPoolAnalyzeSize;
    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    private Integer threadPoolForceMergeSize;
    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    private Integer threadPoolGetQueueSize;
    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    private Integer threadPoolGetSize;
    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    private Integer threadPoolSearchQueueSize;
    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    private Integer threadPoolSearchSize;
    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    private Integer threadPoolSearchThrottledQueueSize;
    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    private Integer threadPoolSearchThrottledSize;
    /**
     * Size for the thread pool queue. See documentation for exact details.
     */
    private Integer threadPoolWriteQueueSize;
    /**
     * Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     */
    private Integer threadPoolWriteSize;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaOpensearch
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaOpensearch createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaOpensearch();
    }
    /**
     * Gets the action_auto_create_index_enabled property value. Explicitly allow or block automatic creation of indices. Defaults to true
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActionAutoCreateIndexEnabled() {
        return this.actionAutoCreateIndexEnabled;
    }
    /**
     * Gets the action_destructive_requires_name property value. The action_destructive_requires_name property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActionDestructiveRequiresName() {
        return this.actionDestructiveRequiresName;
    }
    /**
     * Gets the auth_failure_listeners property value. The auth_failure_listeners property
     * @return a JsonSchemaOpensearchAuthFailureListeners
     */
    @jakarta.annotation.Nullable
    public JsonSchemaOpensearchAuthFailureListeners getAuthFailureListeners() {
        return this.authFailureListeners;
    }
    /**
     * Gets the cluster_max_shards_per_node property value. Controls the number of shards allowed in the cluster per data node
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getClusterMaxShardsPerNode() {
        return this.clusterMaxShardsPerNode;
    }
    /**
     * Gets the cluster_routing_allocation_node_concurrent_recoveries property value. How many concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen on a node. Defaults to 2.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getClusterRoutingAllocationNodeConcurrentRecoveries() {
        return this.clusterRoutingAllocationNodeConcurrentRecoveries;
    }
    /**
     * Gets the email-sender property value. The emailSender property
     * @return a JsonSchemaOpensearchEmailSender
     */
    @jakarta.annotation.Nullable
    public JsonSchemaOpensearchEmailSender getEmailSender() {
        return this.emailSender;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(31);
        deserializerMap.put("action_auto_create_index_enabled", (n) -> { this.setActionAutoCreateIndexEnabled(n.getBooleanValue()); });
        deserializerMap.put("action_destructive_requires_name", (n) -> { this.setActionDestructiveRequiresName(n.getBooleanValue()); });
        deserializerMap.put("auth_failure_listeners", (n) -> { this.setAuthFailureListeners(n.getObjectValue(JsonSchemaOpensearchAuthFailureListeners::createFromDiscriminatorValue)); });
        deserializerMap.put("cluster_max_shards_per_node", (n) -> { this.setClusterMaxShardsPerNode(n.getIntegerValue()); });
        deserializerMap.put("cluster_routing_allocation_node_concurrent_recoveries", (n) -> { this.setClusterRoutingAllocationNodeConcurrentRecoveries(n.getIntegerValue()); });
        deserializerMap.put("email-sender", (n) -> { this.setEmailSender(n.getObjectValue(JsonSchemaOpensearchEmailSender::createFromDiscriminatorValue)); });
        deserializerMap.put("http_max_content_length", (n) -> { this.setHttpMaxContentLength(n.getIntegerValue()); });
        deserializerMap.put("http_max_header_size", (n) -> { this.setHttpMaxHeaderSize(n.getIntegerValue()); });
        deserializerMap.put("http_max_initial_line_length", (n) -> { this.setHttpMaxInitialLineLength(n.getIntegerValue()); });
        deserializerMap.put("indices_fielddata_cache_size", (n) -> { this.setIndicesFielddataCacheSize(n.getIntegerValue()); });
        deserializerMap.put("indices_memory_index_buffer_size", (n) -> { this.setIndicesMemoryIndexBufferSize(n.getIntegerValue()); });
        deserializerMap.put("indices_queries_cache_size", (n) -> { this.setIndicesQueriesCacheSize(n.getIntegerValue()); });
        deserializerMap.put("indices_query_bool_max_clause_count", (n) -> { this.setIndicesQueryBoolMaxClauseCount(n.getIntegerValue()); });
        deserializerMap.put("indices_recovery_max_bytes_per_sec", (n) -> { this.setIndicesRecoveryMaxBytesPerSec(n.getIntegerValue()); });
        deserializerMap.put("indices_recovery_max_concurrent_file_chunks", (n) -> { this.setIndicesRecoveryMaxConcurrentFileChunks(n.getIntegerValue()); });
        deserializerMap.put("ism-history", (n) -> { this.setIsmHistory(n.getObjectValue(JsonSchemaOpensearchIsmHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("override_main_response_version", (n) -> { this.setOverrideMainResponseVersion(n.getBooleanValue()); });
        deserializerMap.put("reindex_remote_whitelist", (n) -> { this.setReindexRemoteWhitelist(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("script_max_compilations_rate", (n) -> { this.setScriptMaxCompilationsRate(n.getStringValue()); });
        deserializerMap.put("search_max_buckets", (n) -> { this.setSearchMaxBuckets(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_analyze_queue_size", (n) -> { this.setThreadPoolAnalyzeQueueSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_analyze_size", (n) -> { this.setThreadPoolAnalyzeSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_force_merge_size", (n) -> { this.setThreadPoolForceMergeSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_get_queue_size", (n) -> { this.setThreadPoolGetQueueSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_get_size", (n) -> { this.setThreadPoolGetSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_search_queue_size", (n) -> { this.setThreadPoolSearchQueueSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_search_size", (n) -> { this.setThreadPoolSearchSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_search_throttled_queue_size", (n) -> { this.setThreadPoolSearchThrottledQueueSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_search_throttled_size", (n) -> { this.setThreadPoolSearchThrottledSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_write_queue_size", (n) -> { this.setThreadPoolWriteQueueSize(n.getIntegerValue()); });
        deserializerMap.put("thread_pool_write_size", (n) -> { this.setThreadPoolWriteSize(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the http_max_content_length property value. Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getHttpMaxContentLength() {
        return this.httpMaxContentLength;
    }
    /**
     * Gets the http_max_header_size property value. The max size of allowed headers, in bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getHttpMaxHeaderSize() {
        return this.httpMaxHeaderSize;
    }
    /**
     * Gets the http_max_initial_line_length property value. The max length of an HTTP URL, in bytes
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getHttpMaxInitialLineLength() {
        return this.httpMaxInitialLineLength;
    }
    /**
     * Gets the indices_fielddata_cache_size property value. Relative amount. Maximum amount of heap memory used for field data cache. This is an expert setting; decreasing the value too much will increase overhead of loading field data; too much memory used for field data cache will decrease amount of heap available for other operations.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndicesFielddataCacheSize() {
        return this.indicesFielddataCacheSize;
    }
    /**
     * Gets the indices_memory_index_buffer_size property value. Percentage value. Default is 10%. Total amount of heap used for indexing buffer, before writing segments to disk. This is an expert setting. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndicesMemoryIndexBufferSize() {
        return this.indicesMemoryIndexBufferSize;
    }
    /**
     * Gets the indices_queries_cache_size property value. Percentage value. Default is 10%. Maximum amount of heap used for query cache. This is an expert setting. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other OpenSearch functionality.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndicesQueriesCacheSize() {
        return this.indicesQueriesCacheSize;
    }
    /**
     * Gets the indices_query_bool_max_clause_count property value. Maximum number of clauses Lucene BooleanQuery can have. The default value (1024) is relatively high, and increasing it may cause performance issues. Investigate other approaches first before increasing this value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndicesQueryBoolMaxClauseCount() {
        return this.indicesQueryBoolMaxClauseCount;
    }
    /**
     * Gets the indices_recovery_max_bytes_per_sec property value. Limits total inbound and outbound recovery traffic for each node. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Defaults to 40mb
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndicesRecoveryMaxBytesPerSec() {
        return this.indicesRecoveryMaxBytesPerSec;
    }
    /**
     * Gets the indices_recovery_max_concurrent_file_chunks property value. Number of file chunks sent in parallel for each recovery. Defaults to 2.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndicesRecoveryMaxConcurrentFileChunks() {
        return this.indicesRecoveryMaxConcurrentFileChunks;
    }
    /**
     * Gets the ism-history property value. The ismHistory property
     * @return a JsonSchemaOpensearchIsmHistory
     */
    @jakarta.annotation.Nullable
    public JsonSchemaOpensearchIsmHistory getIsmHistory() {
        return this.ismHistory;
    }
    /**
     * Gets the override_main_response_version property value. Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default is false
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOverrideMainResponseVersion() {
        return this.overrideMainResponseVersion;
    }
    /**
     * Gets the reindex_remote_whitelist property value. Whitelisted addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getReindexRemoteWhitelist() {
        return this.reindexRemoteWhitelist;
    }
    /**
     * Gets the script_max_compilations_rate property value. Script compilation circuit breaker limits the number of inline script compilations within a period of time. Default is use-context
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScriptMaxCompilationsRate() {
        return this.scriptMaxCompilationsRate;
    }
    /**
     * Gets the search_max_buckets property value. Maximum number of aggregation buckets allowed in a single response. OpenSearch default value is used when this is not defined.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSearchMaxBuckets() {
        return this.searchMaxBuckets;
    }
    /**
     * Gets the thread_pool_analyze_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolAnalyzeQueueSize() {
        return this.threadPoolAnalyzeQueueSize;
    }
    /**
     * Gets the thread_pool_analyze_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolAnalyzeSize() {
        return this.threadPoolAnalyzeSize;
    }
    /**
     * Gets the thread_pool_force_merge_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolForceMergeSize() {
        return this.threadPoolForceMergeSize;
    }
    /**
     * Gets the thread_pool_get_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolGetQueueSize() {
        return this.threadPoolGetQueueSize;
    }
    /**
     * Gets the thread_pool_get_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolGetSize() {
        return this.threadPoolGetSize;
    }
    /**
     * Gets the thread_pool_search_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolSearchQueueSize() {
        return this.threadPoolSearchQueueSize;
    }
    /**
     * Gets the thread_pool_search_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolSearchSize() {
        return this.threadPoolSearchSize;
    }
    /**
     * Gets the thread_pool_search_throttled_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolSearchThrottledQueueSize() {
        return this.threadPoolSearchThrottledQueueSize;
    }
    /**
     * Gets the thread_pool_search_throttled_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolSearchThrottledSize() {
        return this.threadPoolSearchThrottledSize;
    }
    /**
     * Gets the thread_pool_write_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolWriteQueueSize() {
        return this.threadPoolWriteQueueSize;
    }
    /**
     * Gets the thread_pool_write_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getThreadPoolWriteSize() {
        return this.threadPoolWriteSize;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("action_auto_create_index_enabled", this.getActionAutoCreateIndexEnabled());
        writer.writeBooleanValue("action_destructive_requires_name", this.getActionDestructiveRequiresName());
        writer.writeObjectValue("auth_failure_listeners", this.getAuthFailureListeners());
        writer.writeIntegerValue("cluster_max_shards_per_node", this.getClusterMaxShardsPerNode());
        writer.writeIntegerValue("cluster_routing_allocation_node_concurrent_recoveries", this.getClusterRoutingAllocationNodeConcurrentRecoveries());
        writer.writeObjectValue("email-sender", this.getEmailSender());
        writer.writeIntegerValue("http_max_content_length", this.getHttpMaxContentLength());
        writer.writeIntegerValue("http_max_header_size", this.getHttpMaxHeaderSize());
        writer.writeIntegerValue("http_max_initial_line_length", this.getHttpMaxInitialLineLength());
        writer.writeIntegerValue("indices_fielddata_cache_size", this.getIndicesFielddataCacheSize());
        writer.writeIntegerValue("indices_memory_index_buffer_size", this.getIndicesMemoryIndexBufferSize());
        writer.writeIntegerValue("indices_queries_cache_size", this.getIndicesQueriesCacheSize());
        writer.writeIntegerValue("indices_query_bool_max_clause_count", this.getIndicesQueryBoolMaxClauseCount());
        writer.writeIntegerValue("indices_recovery_max_bytes_per_sec", this.getIndicesRecoveryMaxBytesPerSec());
        writer.writeIntegerValue("indices_recovery_max_concurrent_file_chunks", this.getIndicesRecoveryMaxConcurrentFileChunks());
        writer.writeObjectValue("ism-history", this.getIsmHistory());
        writer.writeBooleanValue("override_main_response_version", this.getOverrideMainResponseVersion());
        writer.writeCollectionOfPrimitiveValues("reindex_remote_whitelist", this.getReindexRemoteWhitelist());
        writer.writeStringValue("script_max_compilations_rate", this.getScriptMaxCompilationsRate());
        writer.writeIntegerValue("search_max_buckets", this.getSearchMaxBuckets());
        writer.writeIntegerValue("thread_pool_analyze_queue_size", this.getThreadPoolAnalyzeQueueSize());
        writer.writeIntegerValue("thread_pool_analyze_size", this.getThreadPoolAnalyzeSize());
        writer.writeIntegerValue("thread_pool_force_merge_size", this.getThreadPoolForceMergeSize());
        writer.writeIntegerValue("thread_pool_get_queue_size", this.getThreadPoolGetQueueSize());
        writer.writeIntegerValue("thread_pool_get_size", this.getThreadPoolGetSize());
        writer.writeIntegerValue("thread_pool_search_queue_size", this.getThreadPoolSearchQueueSize());
        writer.writeIntegerValue("thread_pool_search_size", this.getThreadPoolSearchSize());
        writer.writeIntegerValue("thread_pool_search_throttled_queue_size", this.getThreadPoolSearchThrottledQueueSize());
        writer.writeIntegerValue("thread_pool_search_throttled_size", this.getThreadPoolSearchThrottledSize());
        writer.writeIntegerValue("thread_pool_write_queue_size", this.getThreadPoolWriteQueueSize());
        writer.writeIntegerValue("thread_pool_write_size", this.getThreadPoolWriteSize());
    }
    /**
     * Sets the action_auto_create_index_enabled property value. Explicitly allow or block automatic creation of indices. Defaults to true
     * @param value Value to set for the action_auto_create_index_enabled property.
     */
    public void setActionAutoCreateIndexEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.actionAutoCreateIndexEnabled = value;
    }
    /**
     * Sets the action_destructive_requires_name property value. The action_destructive_requires_name property
     * @param value Value to set for the action_destructive_requires_name property.
     */
    public void setActionDestructiveRequiresName(@jakarta.annotation.Nullable final Boolean value) {
        this.actionDestructiveRequiresName = value;
    }
    /**
     * Sets the auth_failure_listeners property value. The auth_failure_listeners property
     * @param value Value to set for the auth_failure_listeners property.
     */
    public void setAuthFailureListeners(@jakarta.annotation.Nullable final JsonSchemaOpensearchAuthFailureListeners value) {
        this.authFailureListeners = value;
    }
    /**
     * Sets the cluster_max_shards_per_node property value. Controls the number of shards allowed in the cluster per data node
     * @param value Value to set for the cluster_max_shards_per_node property.
     */
    public void setClusterMaxShardsPerNode(@jakarta.annotation.Nullable final Integer value) {
        this.clusterMaxShardsPerNode = value;
    }
    /**
     * Sets the cluster_routing_allocation_node_concurrent_recoveries property value. How many concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen on a node. Defaults to 2.
     * @param value Value to set for the cluster_routing_allocation_node_concurrent_recoveries property.
     */
    public void setClusterRoutingAllocationNodeConcurrentRecoveries(@jakarta.annotation.Nullable final Integer value) {
        this.clusterRoutingAllocationNodeConcurrentRecoveries = value;
    }
    /**
     * Sets the email-sender property value. The emailSender property
     * @param value Value to set for the email-sender property.
     */
    public void setEmailSender(@jakarta.annotation.Nullable final JsonSchemaOpensearchEmailSender value) {
        this.emailSender = value;
    }
    /**
     * Sets the http_max_content_length property value. Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes.
     * @param value Value to set for the http_max_content_length property.
     */
    public void setHttpMaxContentLength(@jakarta.annotation.Nullable final Integer value) {
        this.httpMaxContentLength = value;
    }
    /**
     * Sets the http_max_header_size property value. The max size of allowed headers, in bytes
     * @param value Value to set for the http_max_header_size property.
     */
    public void setHttpMaxHeaderSize(@jakarta.annotation.Nullable final Integer value) {
        this.httpMaxHeaderSize = value;
    }
    /**
     * Sets the http_max_initial_line_length property value. The max length of an HTTP URL, in bytes
     * @param value Value to set for the http_max_initial_line_length property.
     */
    public void setHttpMaxInitialLineLength(@jakarta.annotation.Nullable final Integer value) {
        this.httpMaxInitialLineLength = value;
    }
    /**
     * Sets the indices_fielddata_cache_size property value. Relative amount. Maximum amount of heap memory used for field data cache. This is an expert setting; decreasing the value too much will increase overhead of loading field data; too much memory used for field data cache will decrease amount of heap available for other operations.
     * @param value Value to set for the indices_fielddata_cache_size property.
     */
    public void setIndicesFielddataCacheSize(@jakarta.annotation.Nullable final Integer value) {
        this.indicesFielddataCacheSize = value;
    }
    /**
     * Sets the indices_memory_index_buffer_size property value. Percentage value. Default is 10%. Total amount of heap used for indexing buffer, before writing segments to disk. This is an expert setting. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance.
     * @param value Value to set for the indices_memory_index_buffer_size property.
     */
    public void setIndicesMemoryIndexBufferSize(@jakarta.annotation.Nullable final Integer value) {
        this.indicesMemoryIndexBufferSize = value;
    }
    /**
     * Sets the indices_queries_cache_size property value. Percentage value. Default is 10%. Maximum amount of heap used for query cache. This is an expert setting. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other OpenSearch functionality.
     * @param value Value to set for the indices_queries_cache_size property.
     */
    public void setIndicesQueriesCacheSize(@jakarta.annotation.Nullable final Integer value) {
        this.indicesQueriesCacheSize = value;
    }
    /**
     * Sets the indices_query_bool_max_clause_count property value. Maximum number of clauses Lucene BooleanQuery can have. The default value (1024) is relatively high, and increasing it may cause performance issues. Investigate other approaches first before increasing this value.
     * @param value Value to set for the indices_query_bool_max_clause_count property.
     */
    public void setIndicesQueryBoolMaxClauseCount(@jakarta.annotation.Nullable final Integer value) {
        this.indicesQueryBoolMaxClauseCount = value;
    }
    /**
     * Sets the indices_recovery_max_bytes_per_sec property value. Limits total inbound and outbound recovery traffic for each node. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Defaults to 40mb
     * @param value Value to set for the indices_recovery_max_bytes_per_sec property.
     */
    public void setIndicesRecoveryMaxBytesPerSec(@jakarta.annotation.Nullable final Integer value) {
        this.indicesRecoveryMaxBytesPerSec = value;
    }
    /**
     * Sets the indices_recovery_max_concurrent_file_chunks property value. Number of file chunks sent in parallel for each recovery. Defaults to 2.
     * @param value Value to set for the indices_recovery_max_concurrent_file_chunks property.
     */
    public void setIndicesRecoveryMaxConcurrentFileChunks(@jakarta.annotation.Nullable final Integer value) {
        this.indicesRecoveryMaxConcurrentFileChunks = value;
    }
    /**
     * Sets the ism-history property value. The ismHistory property
     * @param value Value to set for the ism-history property.
     */
    public void setIsmHistory(@jakarta.annotation.Nullable final JsonSchemaOpensearchIsmHistory value) {
        this.ismHistory = value;
    }
    /**
     * Sets the override_main_response_version property value. Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default is false
     * @param value Value to set for the override_main_response_version property.
     */
    public void setOverrideMainResponseVersion(@jakarta.annotation.Nullable final Boolean value) {
        this.overrideMainResponseVersion = value;
    }
    /**
     * Sets the reindex_remote_whitelist property value. Whitelisted addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.
     * @param value Value to set for the reindex_remote_whitelist property.
     */
    public void setReindexRemoteWhitelist(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.reindexRemoteWhitelist = value;
    }
    /**
     * Sets the script_max_compilations_rate property value. Script compilation circuit breaker limits the number of inline script compilations within a period of time. Default is use-context
     * @param value Value to set for the script_max_compilations_rate property.
     */
    public void setScriptMaxCompilationsRate(@jakarta.annotation.Nullable final String value) {
        this.scriptMaxCompilationsRate = value;
    }
    /**
     * Sets the search_max_buckets property value. Maximum number of aggregation buckets allowed in a single response. OpenSearch default value is used when this is not defined.
     * @param value Value to set for the search_max_buckets property.
     */
    public void setSearchMaxBuckets(@jakarta.annotation.Nullable final Integer value) {
        this.searchMaxBuckets = value;
    }
    /**
     * Sets the thread_pool_analyze_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @param value Value to set for the thread_pool_analyze_queue_size property.
     */
    public void setThreadPoolAnalyzeQueueSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolAnalyzeQueueSize = value;
    }
    /**
     * Sets the thread_pool_analyze_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @param value Value to set for the thread_pool_analyze_size property.
     */
    public void setThreadPoolAnalyzeSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolAnalyzeSize = value;
    }
    /**
     * Sets the thread_pool_force_merge_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @param value Value to set for the thread_pool_force_merge_size property.
     */
    public void setThreadPoolForceMergeSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolForceMergeSize = value;
    }
    /**
     * Sets the thread_pool_get_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @param value Value to set for the thread_pool_get_queue_size property.
     */
    public void setThreadPoolGetQueueSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolGetQueueSize = value;
    }
    /**
     * Sets the thread_pool_get_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @param value Value to set for the thread_pool_get_size property.
     */
    public void setThreadPoolGetSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolGetSize = value;
    }
    /**
     * Sets the thread_pool_search_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @param value Value to set for the thread_pool_search_queue_size property.
     */
    public void setThreadPoolSearchQueueSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolSearchQueueSize = value;
    }
    /**
     * Sets the thread_pool_search_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @param value Value to set for the thread_pool_search_size property.
     */
    public void setThreadPoolSearchSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolSearchSize = value;
    }
    /**
     * Sets the thread_pool_search_throttled_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @param value Value to set for the thread_pool_search_throttled_queue_size property.
     */
    public void setThreadPoolSearchThrottledQueueSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolSearchThrottledQueueSize = value;
    }
    /**
     * Sets the thread_pool_search_throttled_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @param value Value to set for the thread_pool_search_throttled_size property.
     */
    public void setThreadPoolSearchThrottledSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolSearchThrottledSize = value;
    }
    /**
     * Sets the thread_pool_write_queue_size property value. Size for the thread pool queue. See documentation for exact details.
     * @param value Value to set for the thread_pool_write_queue_size property.
     */
    public void setThreadPoolWriteQueueSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolWriteQueueSize = value;
    }
    /**
     * Sets the thread_pool_write_size property value. Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.
     * @param value Value to set for the thread_pool_write_size property.
     */
    public void setThreadPoolWriteSize(@jakarta.annotation.Nullable final Integer value) {
        this.threadPoolWriteSize = value;
    }
}
