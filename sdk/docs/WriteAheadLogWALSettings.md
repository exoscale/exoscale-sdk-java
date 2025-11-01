

# WriteAheadLogWALSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxSlotWalKeepSize** | **Integer** | PostgreSQL maximum WAL size (MB) reserved for replication slots. If &#x60;-1&#x60; is specified, replication slots may retain an unlimited amount of WAL files. The default is &#x60;-1&#x60; (upstream default). wal_keep_size minimum WAL size setting takes precedence over this. |  [optional] |
|**maxWalSenders** | **Integer** | PostgreSQL maximum WAL senders. The default is &#x60;20&#x60;. Changing this parameter causes a service restart. |  [optional] |
|**walSenderTimeout** | **Integer** | Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. |  [optional] |
|**walWriterDelay** | **Integer** | WAL flush interval in milliseconds. The default is &#x60;200&#x60;. Setting this parameter to a lower value may negatively impact performance. |  [optional] |



