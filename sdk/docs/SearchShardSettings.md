

# SearchShardSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalHeapPercentThreshold** | **BigDecimal** | The heap usage threshold (as a percentage) required for the sum of heap usages of all search shard tasks before cancellation is applied. Default is 0.5 |  [optional] |
|**elapsedTimeMillisThreshold** | **Integer** | The elapsed time threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. Default is 30000 |  [optional] |
|**cancellationRate** | **BigDecimal** | The maximum number of tasks to cancel per millisecond of elapsed time. Default is 0.003 |  [optional] |
|**heapVariance** | **BigDecimal** | The minimum variance required for a single search shard task’s heap usage compared to the rolling average of previously completed tasks before it is considered for cancellation. Default is 2.0 |  [optional] |
|**heapMovingAverageWindowSize** | **Integer** | The number of previously completed search shard tasks to consider when calculating the rolling average of heap usage. Default is 100 |  [optional] |
|**cancellationRatio** | **BigDecimal** | The maximum number of tasks to cancel, as a percentage of successful task completions. Default is 0.1 |  [optional] |
|**heapPercentThreshold** | **BigDecimal** | The heap usage threshold (as a percentage) required for a single search shard task before it is considered for cancellation. Default is 0.5 |  [optional] |
|**cpuTimeMillisThreshold** | **Integer** | The CPU usage threshold (in milliseconds) required for a single search shard task before it is considered for cancellation. Default is 15000 |  [optional] |
|**cancellationBurst** | **BigDecimal** | The maximum number of search tasks to cancel in a single iteration of the observer thread. Default is 10.0 |  [optional] |



