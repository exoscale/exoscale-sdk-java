

# ClickHouseServerSettings

ClickHouse server settings, which can be found in the `system.server_settings` table.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vectorSimilarityIndexCacheSize** | **BigDecimal** | Fraction of total server memory allocated to the vector similarity index cache. 0 disables the cache. Default is 0.07 (7% of server memory). Only effective on ClickHouse 25.8+. |  [optional] |



