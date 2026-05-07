

# IngestMeteringRequest

Router flush payload: the router's full in-memory usage map with flush identity fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**flushId** | **UUID** | UUID identifying this flush; used for idempotent deduplication |  |
|**usage** | [**Map&lt;String, ApiKeyUsageEntry&gt;**](ApiKeyUsageEntry.md) | Map of api-key-uuid to usage entry. Keys are API key UUIDs. Mirrors the router&#39;s in-memory accumulator structure directly. |  |
|**routerId** | **String** | Router instance identifier that produced this flush |  |
|**createdAt** | **OffsetDateTime** | ISO-8601 UTC timestamp when the flush snapshot was created (truncated to minute boundary for bucketing) |  |



