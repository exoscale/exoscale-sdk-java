

# ThanosQueryUserConfig

Configuration options for Thanos Query.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**queryDefaultEvaluationInterval** | **String** | Set the default evaluation interval for subqueries. |  [optional] |
|**queryLookbackDelta** | **String** | The maximum lookback duration for retrieving metrics during expression evaluations in PromQL. PromQL always evaluates the query for a certain timestamp, and it looks back for the given amount of time to get the latest sample. If it exceeds the maximum lookback delta, it assumes the series is stale and returns none (a gap). The lookback delta should be set to at least 2 times the slowest scrape interval. If unset, it will use the promql default of 5m. |  [optional] |
|**queryMetadataDefaultTimeRange** | **String** | The default metadata time range duration for retrieving labels through Labels and Series API when the range parameters are not specified. The zero value means the range covers the time since the beginning. |  [optional] |
|**queryTimeout** | **String** | Maximum time to process a query by the query node. |  [optional] |
|**storeLimitsRequestSamples** | **Integer** | The maximum samples allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. NOTE: For efficiency, the limit is internally implemented as &#39;chunks limit&#39; considering each chunk contains a maximum of 120 samples. The default value is 100 * store.limits.request-series. |  [optional] |
|**storeLimitsRequestSeries** | **Integer** | The maximum series allowed for a single Series request. The Series call fails if this limit is exceeded. Set to 0 for no limit. The default value is 1000 * cpu_count. |  [optional] |



