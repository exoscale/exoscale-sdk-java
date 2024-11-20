

# OperatingFactor


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**upper** | **BigDecimal** | Specify the upper occupancy limit of the allocated quota of memory for the shard. If the total memory usage of a shard is above this limit, shard indexing backpressure increases the current allocated memory for that shard. Default is 0.95 |  [optional] |
|**optimal** | **BigDecimal** | Specify the optimal occupancy of the allocated quota of memory for the shard. If the total memory usage of a shard is at this level, shard indexing backpressure doesn’t change the current allocated memory for that shard. Default is 0.85 |  [optional] |
|**lower** | **BigDecimal** | Specify the lower occupancy limit of the allocated quota of memory for the shard. If the total memory usage of a shard is below this limit, shard indexing backpressure decreases the current allocated memory for that shard. Default is 0.75 |  [optional] |



