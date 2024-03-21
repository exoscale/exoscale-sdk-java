
# Open Search Settings

## Structure

`OpenSearchSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ThreadPoolSearchThrottledSize` | `Integer` | Optional | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.<br>**Constraints**: `>= 1`, `<= 128` | Integer getThreadPoolSearchThrottledSize() | setThreadPoolSearchThrottledSize(Integer threadPoolSearchThrottledSize) |
| `ThreadPoolAnalyzeSize` | `Integer` | Optional | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.<br>**Constraints**: `>= 1`, `<= 128` | Integer getThreadPoolAnalyzeSize() | setThreadPoolAnalyzeSize(Integer threadPoolAnalyzeSize) |
| `ThreadPoolGetSize` | `Integer` | Optional | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.<br>**Constraints**: `>= 1`, `<= 128` | Integer getThreadPoolGetSize() | setThreadPoolGetSize(Integer threadPoolGetSize) |
| `ThreadPoolGetQueueSize` | `Integer` | Optional | Size for the thread pool queue. See documentation for exact details.<br>**Constraints**: `>= 10`, `<= 2000` | Integer getThreadPoolGetQueueSize() | setThreadPoolGetQueueSize(Integer threadPoolGetQueueSize) |
| `IndicesRecoveryMaxConcurrentFileChunks` | `Integer` | Optional | Number of file chunks sent in parallel for each recovery. Defaults to 2.<br>**Constraints**: `>= 2`, `<= 5` | Integer getIndicesRecoveryMaxConcurrentFileChunks() | setIndicesRecoveryMaxConcurrentFileChunks(Integer indicesRecoveryMaxConcurrentFileChunks) |
| `IndicesQueriesCacheSize` | `Integer` | Optional | Percentage value. Default is 10%. Maximum amount of heap used for query cache. This is an expert setting. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other OpenSearch functionality.<br>**Constraints**: `>= 3`, `<= 40` | Integer getIndicesQueriesCacheSize() | setIndicesQueriesCacheSize(Integer indicesQueriesCacheSize) |
| `ThreadPoolSearchSize` | `Integer` | Optional | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.<br>**Constraints**: `>= 1`, `<= 128` | Integer getThreadPoolSearchSize() | setThreadPoolSearchSize(Integer threadPoolSearchSize) |
| `IndicesRecoveryMaxBytesPerSec` | `Integer` | Optional | Limits total inbound and outbound recovery traffic for each node. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Defaults to 40mb<br>**Constraints**: `>= 40`, `<= 400` | Integer getIndicesRecoveryMaxBytesPerSec() | setIndicesRecoveryMaxBytesPerSec(Integer indicesRecoveryMaxBytesPerSec) |
| `HttpMaxInitialLineLength` | `Integer` | Optional | The max length of an HTTP URL, in bytes<br>**Constraints**: `>= 1024`, `<= 65536` | Integer getHttpMaxInitialLineLength() | setHttpMaxInitialLineLength(Integer httpMaxInitialLineLength) |
| `ThreadPoolWriteQueueSize` | `Integer` | Optional | Size for the thread pool queue. See documentation for exact details.<br>**Constraints**: `>= 10`, `<= 2000` | Integer getThreadPoolWriteQueueSize() | setThreadPoolWriteQueueSize(Integer threadPoolWriteQueueSize) |
| `ScriptMaxCompilationsRate` | `String` | Optional | Script compilation circuit breaker limits the number of inline script compilations within a period of time. Default is use-context<br>**Constraints**: *Maximum Length*: `1024` | String getScriptMaxCompilationsRate() | setScriptMaxCompilationsRate(String scriptMaxCompilationsRate) |
| `SearchMaxBuckets` | `Integer` | Optional | Maximum number of aggregation buckets allowed in a single response. OpenSearch default value is used when this is not defined.<br>**Constraints**: `>= 1`, `<= 65536` | Integer getSearchMaxBuckets() | setSearchMaxBuckets(Integer searchMaxBuckets) |
| `ReindexRemoteWhitelist` | `List<String>` | Optional | Whitelisted addresses for reindexing. Changing this value will cause all OpenSearch instances to restart.<br>**Constraints**: *Maximum Items*: `32`, *Maximum Length*: `261` | List<String> getReindexRemoteWhitelist() | setReindexRemoteWhitelist(List<String> reindexRemoteWhitelist) |
| `OverrideMainResponseVersion` | `Boolean` | Optional | Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default is false | Boolean getOverrideMainResponseVersion() | setOverrideMainResponseVersion(Boolean overrideMainResponseVersion) |
| `HttpMaxHeaderSize` | `Integer` | Optional | The max size of allowed headers, in bytes<br>**Constraints**: `>= 1024`, `<= 262144` | Integer getHttpMaxHeaderSize() | setHttpMaxHeaderSize(Integer httpMaxHeaderSize) |
| `EmailSender` | [`OpensearchEmailSenderSettings`](../../doc/models/opensearch-email-sender-settings.md) | Optional | - | OpensearchEmailSenderSettings getEmailSender() | setEmailSender(OpensearchEmailSenderSettings emailSender) |
| `IndicesFielddataCacheSize` | `Integer` | Optional | Relative amount. Maximum amount of heap memory used for field data cache. This is an expert setting; decreasing the value too much will increase overhead of loading field data; too much memory used for field data cache will decrease amount of heap available for other operations.<br>**Constraints**: `>= 3`, `<= 100` | Integer getIndicesFielddataCacheSize() | setIndicesFielddataCacheSize(Integer indicesFielddataCacheSize) |
| `ActionDestructiveRequiresName` | `Boolean` | Optional | - | Boolean getActionDestructiveRequiresName() | setActionDestructiveRequiresName(Boolean actionDestructiveRequiresName) |
| `IndicesMemoryIndexBufferSize` | `Integer` | Optional | Percentage value. Default is 10%. Total amount of heap used for indexing buffer, before writing segments to disk. This is an expert setting. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance.<br>**Constraints**: `>= 3`, `<= 40` | Integer getIndicesMemoryIndexBufferSize() | setIndicesMemoryIndexBufferSize(Integer indicesMemoryIndexBufferSize) |
| `ThreadPoolForceMergeSize` | `Integer` | Optional | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.<br>**Constraints**: `>= 1`, `<= 128` | Integer getThreadPoolForceMergeSize() | setThreadPoolForceMergeSize(Integer threadPoolForceMergeSize) |
| `AuthFailureListeners` | [`OpensearchSecurityPluginSettings`](../../doc/models/opensearch-security-plugin-settings.md) | Optional | - | OpensearchSecurityPluginSettings getAuthFailureListeners() | setAuthFailureListeners(OpensearchSecurityPluginSettings authFailureListeners) |
| `IsmHistory` | [`OpensearchISMHistorySettings`](../../doc/models/opensearch-ism-history-settings.md) | Optional | - | OpensearchISMHistorySettings getIsmHistory() | setIsmHistory(OpensearchISMHistorySettings ismHistory) |
| `ClusterRoutingAllocationNodeConcurrentRecoveries` | `Integer` | Optional | How many concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen on a node. Defaults to 2.<br>**Constraints**: `>= 2`, `<= 16` | Integer getClusterRoutingAllocationNodeConcurrentRecoveries() | setClusterRoutingAllocationNodeConcurrentRecoveries(Integer clusterRoutingAllocationNodeConcurrentRecoveries) |
| `ThreadPoolAnalyzeQueueSize` | `Integer` | Optional | Size for the thread pool queue. See documentation for exact details.<br>**Constraints**: `>= 10`, `<= 2000` | Integer getThreadPoolAnalyzeQueueSize() | setThreadPoolAnalyzeQueueSize(Integer threadPoolAnalyzeQueueSize) |
| `ActionAutoCreateIndexEnabled` | `Boolean` | Optional | Explicitly allow or block automatic creation of indices. Defaults to true | Boolean getActionAutoCreateIndexEnabled() | setActionAutoCreateIndexEnabled(Boolean actionAutoCreateIndexEnabled) |
| `HttpMaxContentLength` | `Integer` | Optional | Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes.<br>**Constraints**: `>= 1`, `<= 2147483647` | Integer getHttpMaxContentLength() | setHttpMaxContentLength(Integer httpMaxContentLength) |
| `ThreadPoolWriteSize` | `Integer` | Optional | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value.<br>**Constraints**: `>= 1`, `<= 128` | Integer getThreadPoolWriteSize() | setThreadPoolWriteSize(Integer threadPoolWriteSize) |
| `ThreadPoolSearchQueueSize` | `Integer` | Optional | Size for the thread pool queue. See documentation for exact details.<br>**Constraints**: `>= 10`, `<= 2000` | Integer getThreadPoolSearchQueueSize() | setThreadPoolSearchQueueSize(Integer threadPoolSearchQueueSize) |
| `IndicesQueryBoolMaxClauseCount` | `Integer` | Optional | Maximum number of clauses Lucene BooleanQuery can have. The default value (1024) is relatively high, and increasing it may cause performance issues. Investigate other approaches first before increasing this value.<br>**Constraints**: `>= 64`, `<= 4096` | Integer getIndicesQueryBoolMaxClauseCount() | setIndicesQueryBoolMaxClauseCount(Integer indicesQueryBoolMaxClauseCount) |
| `ThreadPoolSearchThrottledQueueSize` | `Integer` | Optional | Size for the thread pool queue. See documentation for exact details.<br>**Constraints**: `>= 10`, `<= 2000` | Integer getThreadPoolSearchThrottledQueueSize() | setThreadPoolSearchThrottledQueueSize(Integer threadPoolSearchThrottledQueueSize) |
| `ClusterMaxShardsPerNode` | `Integer` | Optional | Controls the number of shards allowed in the cluster per data node<br>**Constraints**: `>= 100`, `<= 10000` | Integer getClusterMaxShardsPerNode() | setClusterMaxShardsPerNode(Integer clusterMaxShardsPerNode) |

## Example (as JSON)

```json
{
  "http_max_initial_line_length": 4096,
  "script_max_compilations_rate": "75/5m",
  "search_max_buckets": 10000,
  "override_main_response_version": true,
  "http_max_header_size": 8192,
  "action_destructive_requires_name": true,
  "action_auto_create_index_enabled": false,
  "cluster_max_shards_per_node": 1000,
  "thread_pool_search_throttled_size": 12,
  "thread_pool_analyze_size": 192,
  "thread_pool_get_size": 84,
  "thread_pool_get_queue_size": 210,
  "indices_recovery_max_concurrent_file_chunks": 76
}
```

