

# ModelUsageCounters

Accumulated Unit Of Measurement (UOM) counters for one model over a flush window

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**outputUom** | **Integer** | Total completion/output Unit Of Measurement (UOM) across all calls in this flush window (e.g., tokens for LLMs, minutes for TTS, pages for OCR) |  |
|**inputUom** | **Integer** | Uncached prompt/input Unit Of Measurement (UOM) across all calls in this flush window (total prompt minus cache-read) |  |
|**cacheWriteInputUom** | **Integer** | Subset of input-uom written to prefix cache across all calls in this flush window; optional, defaults to 0 |  [optional] |
|**cacheReadInputUom** | **Integer** | Prompt/input UOM served from prefix cache across all calls in this flush window (excluded from input-uom); optional, defaults to 0 |  [optional] |
|**callCount** | **Integer** | Number of inference calls in this flush window |  |



