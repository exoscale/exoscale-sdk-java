

# BackgroundBGWriterSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgwriterDelay** | **Integer** | Specifies the delay between activity rounds for the background writer in milliseconds. Default is 200. |  [optional] |
|**bgwriterFlushAfter** | **Integer** | Whenever more than bgwriter_flush_after bytes have been written by the background writer, attempt to force the OS to issue these writes to the underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback. |  [optional] |
|**bgwriterLruMultiplier** | **BigDecimal** | The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0. |  [optional] |
|**bgwriterLruMaxpages** | **Integer** | In each round, no more than this many buffers will be written by the background writer. Setting this to zero disables background writing. Default is 100. |  [optional] |



