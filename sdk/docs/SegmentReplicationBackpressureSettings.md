

# SegmentReplicationBackpressureSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pressureCheckpointLimit** | **Integer** | The maximum number of indexing checkpoints that a replica shard can fall behind when copying from primary. Once &#x60;segrep.pressure.checkpoint.limit&#x60; is breached along with &#x60;segrep.pressure.time.limit&#x60;, the segment replication backpressure mechanism is initiated. Default is 4 checkpoints. |  [optional] |
|**pressureEnabled** | **Boolean** | Enables the segment replication backpressure mechanism. Default is false. |  [optional] |
|**pressureReplicaStaleLimit** | **BigDecimal** | The maximum number of stale replica shards that can exist in a replication group. Once &#x60;segrep.pressure.replica.stale.limit&#x60; is breached, the segment replication backpressure mechanism is initiated. Default is .5, which is 50% of a replication group. |  [optional] |
|**pressureTimeLimit** | **String** | The maximum amount of time that a replica shard can take to copy from the primary shard. Once segrep.pressure.time.limit is breached along with segrep.pressure.checkpoint.limit, the segment replication backpressure mechanism is initiated. Default is 5 minutes. |  [optional] |



