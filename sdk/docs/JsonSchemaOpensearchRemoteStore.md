

# JsonSchemaOpensearchRemoteStore


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**segmentPressureBytesLagVarianceFactor** | **BigDecimal** | The variance factor that is used together with the moving average to calculate the dynamic bytes lag threshold for activating remote segment backpressure. Defaults to 10. |  [optional] |
|**segmentPressureConsecutiveFailuresLimit** | **Integer** | The minimum consecutive failure count for activating remote segment backpressure. Defaults to 5. |  [optional] |
|**segmentPressureEnabled** | **Boolean** | Enables remote segment backpressure. Default is &#x60;true&#x60; |  [optional] |
|**segmentPressureTimeLagVarianceFactor** | **BigDecimal** | The variance factor that is used together with the moving average to calculate the dynamic time lag threshold for activating remote segment backpressure. Defaults to 10. |  [optional] |



