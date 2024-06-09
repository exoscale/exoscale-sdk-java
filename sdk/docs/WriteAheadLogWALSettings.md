

# WriteAheadLogWALSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxSlotWalKeepSize** | **Integer** | PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this. |  [optional] |
|**maxWalSenders** | **Integer** | PostgreSQL maximum WAL senders |  [optional] |
|**walSenderTimeout** | **Integer** | Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. |  [optional] |
|**walWriterDelay** | **Integer** | WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance |  [optional] |



