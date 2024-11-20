

# ShardIndexingBackPressureSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**primaryParameter** | [**PrimaryParameter**](PrimaryParameter.md) |  |  [optional] |
|**operatingFactor** | [**OperatingFactor**](OperatingFactor.md) |  |  [optional] |
|**enforced** | **Boolean** | Run shard indexing backpressure in shadow mode or enforced mode. In shadow mode (value set as false), shard indexing backpressure tracks all granular-level metrics, but it doesn’t actually reject any indexing requests. In enforced mode (value set as true), shard indexing backpressure rejects any requests to the cluster that might cause a dip in its performance. Default is false |  [optional] |
|**enabled** | **Boolean** | Enable or disable shard indexing backpressure. Default is false |  [optional] |



