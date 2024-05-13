

# JsonSchemaOpensearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**threadPoolSearchThrottledSize** | **Integer** | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value. |  [optional] |
|**threadPoolAnalyzeSize** | **Integer** | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value. |  [optional] |
|**threadPoolGetSize** | **Integer** | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value. |  [optional] |
|**threadPoolGetQueueSize** | **Integer** | Size for the thread pool queue. See documentation for exact details. |  [optional] |
|**indicesRecoveryMaxConcurrentFileChunks** | **Integer** | Number of file chunks sent in parallel for each recovery. Defaults to 2. |  [optional] |
|**indicesQueriesCacheSize** | **Integer** | Percentage value. Default is 10%. Maximum amount of heap used for query cache. This is an expert setting. Too low value will decrease query performance and increase performance for other operations; too high value will cause issues with other OpenSearch functionality. |  [optional] |
|**threadPoolSearchSize** | **Integer** | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value. |  [optional] |
|**indicesRecoveryMaxBytesPerSec** | **Integer** | Limits total inbound and outbound recovery traffic for each node. Applies to both peer recoveries as well as snapshot recoveries (i.e., restores from a snapshot). Defaults to 40mb |  [optional] |
|**httpMaxInitialLineLength** | **Integer** | The max length of an HTTP URL, in bytes |  [optional] |
|**enableSecurityAudit** | **Boolean** |  |  [optional] |
|**threadPoolWriteQueueSize** | **Integer** | Size for the thread pool queue. See documentation for exact details. |  [optional] |
|**scriptMaxCompilationsRate** | **String** | Script compilation circuit breaker limits the number of inline script compilations within a period of time. Default is use-context |  [optional] |
|**searchMaxBuckets** | **Integer** | Maximum number of aggregation buckets allowed in a single response. OpenSearch default value is used when this is not defined. |  [optional] |
|**reindexRemoteWhitelist** | **List&lt;String&gt;** | Whitelisted addresses for reindexing. Changing this value will cause all OpenSearch instances to restart. |  [optional] |
|**overrideMainResponseVersion** | **Boolean** | Compatibility mode sets OpenSearch to report its version as 7.10 so clients continue to work. Default is false |  [optional] |
|**httpMaxHeaderSize** | **Integer** | The max size of allowed headers, in bytes |  [optional] |
|**emailSender** | [**OpensearchEmailSenderSettings**](OpensearchEmailSenderSettings.md) |  |  [optional] |
|**indicesFielddataCacheSize** | **Integer** | Relative amount. Maximum amount of heap memory used for field data cache. This is an expert setting; decreasing the value too much will increase overhead of loading field data; too much memory used for field data cache will decrease amount of heap available for other operations. |  [optional] |
|**actionDestructiveRequiresName** | **Boolean** |  |  [optional] |
|**pluginsAlertingFilterByBackendRoles** | **Boolean** | Enable or disable filtering of alerting by backend roles. Requires Security plugin. Defaults to false |  [optional] |
|**indicesMemoryIndexBufferSize** | **Integer** | Percentage value. Default is 10%. Total amount of heap used for indexing buffer, before writing segments to disk. This is an expert setting. Too low value will slow down indexing; too high value will increase indexing performance but causes performance issues for query performance. |  [optional] |
|**threadPoolForceMergeSize** | **Integer** | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value. |  [optional] |
|**authFailureListeners** | [**OpensearchSecurityPluginSettings**](OpensearchSecurityPluginSettings.md) |  |  [optional] |
|**ismHistory** | [**OpensearchISMHistorySettings**](OpensearchISMHistorySettings.md) |  |  [optional] |
|**clusterRoutingAllocationNodeConcurrentRecoveries** | **Integer** | How many concurrent incoming/outgoing shard recoveries (normally replicas) are allowed to happen on a node. Defaults to 2. |  [optional] |
|**threadPoolAnalyzeQueueSize** | **Integer** | Size for the thread pool queue. See documentation for exact details. |  [optional] |
|**actionAutoCreateIndexEnabled** | **Boolean** | Explicitly allow or block automatic creation of indices. Defaults to true |  [optional] |
|**httpMaxContentLength** | **Integer** | Maximum content length for HTTP requests to the OpenSearch HTTP API, in bytes. |  [optional] |
|**threadPoolWriteSize** | **Integer** | Size for the thread pool. See documentation for exact details. Do note this may have maximum value depending on CPU count - value is automatically lowered if set to higher than maximum value. |  [optional] |
|**threadPoolSearchQueueSize** | **Integer** | Size for the thread pool queue. See documentation for exact details. |  [optional] |
|**indicesQueryBoolMaxClauseCount** | **Integer** | Maximum number of clauses Lucene BooleanQuery can have. The default value (1024) is relatively high, and increasing it may cause performance issues. Investigate other approaches first before increasing this value. |  [optional] |
|**threadPoolSearchThrottledQueueSize** | **Integer** | Size for the thread pool queue. See documentation for exact details. |  [optional] |
|**clusterMaxShardsPerNode** | **Integer** | Controls the number of shards allowed in the cluster per data node |  [optional] |



