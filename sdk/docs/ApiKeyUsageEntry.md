

# ApiKeyUsageEntry

Usage breakdown for one API key, grouped by model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organizationId** | **UUID** | Organization that owns this API key |  |
|**models** | [**Map&lt;String, ModelUsageCounters&gt;**](ModelUsageCounters.md) | Map of model-uuid to accumulated counters. Keys are model UUIDs. |  |



