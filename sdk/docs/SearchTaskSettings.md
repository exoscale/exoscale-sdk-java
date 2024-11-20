

# SearchTaskSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalHeapPercentThreshold** | **BigDecimal** | The heap usage threshold (as a percentage) required for the sum of heap usages of all search tasks before cancellation is applied. Default is 0.5 |  [optional] |
|**elapsedTimeMillisThreshold** | **Integer** | The elapsed time threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 45000 |  [optional] |
|**cancellationRate** | **BigDecimal** | The maximum number of search tasks to cancel per millisecond of elapsed time. Default is 0.003 |  [optional] |
|**heapVariance** | **BigDecimal** | The heap usage variance required for an individual parent task before it is considered for cancellation. A task is considered for cancellation when taskHeapUsage is greater than or equal to heapUsageMovingAverage * variance. Default is 2.0 |  [optional] |
|**heapMovingAverageWindowSize** | **Integer** | The window size used to calculate the rolling average of the heap usage for the completed parent tasks. Default is 10 |  [optional] |
|**cancellationRatio** | **BigDecimal** | The maximum number of search tasks to cancel, as a percentage of successful search task completions. Default is 0.1 |  [optional] |
|**heapPercentThreshold** | **BigDecimal** | The heap usage threshold (as a percentage) required for an individual parent task before it is considered for cancellation. Default is 0.2 |  [optional] |
|**cpuTimeMillisThreshold** | **Integer** | The CPU usage threshold (in milliseconds) required for an individual parent task before it is considered for cancellation. Default is 30000 |  [optional] |
|**cancellationBurst** | **BigDecimal** | The maximum number of search tasks to cancel in a single iteration of the observer thread. Default is 5.0 |  [optional] |



