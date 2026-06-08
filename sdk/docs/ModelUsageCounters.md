

# ModelUsageCounters

Accumulated Unit Of Measurement (UOM) counters for one model over a flush window

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**outputUom** | **Integer** | Total completion/output Unit Of Measurement (UOM) across all calls in this flush window (e.g., tokens for LLMs, minutes for TTS, pages for OCR) |  |
|**inputUom** | **Integer** | Total prompt/input Unit Of Measurement (UOM) across all calls in this flush window (e.g., tokens for LLMs, minutes for TTS, pages for OCR) |  |
|**callCount** | **Integer** | Number of inference calls in this flush window |  |



