

# IngestMeteringResponse

Result of a metering ingest operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**duplicate** | **Boolean** | True if flush-id was already processed (idempotent retry) |  [optional] |
|**upserted** | **Integer** | Number of rows affected (inserted or updated) in usage_minutely; 0 if duplicate flush-id |  |



