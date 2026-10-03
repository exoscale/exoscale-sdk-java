

# KeyStoreHealth


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Latest normalized XKS proxy health status. |  [optional] |
|**statusReason** | **String** | Normalized reason for the latest status. |  [optional] |
|**checkedAt** | **OffsetDateTime** | Timestamp of the latest completed health check. |  [optional] |
|**metadataJson** | **byte[]** | Base64-encoded raw successful AWS GetHealthStatus JSON metadata. |  [optional] |
|**errorDetail** | **String** | Normalized error detail for unhealthy observations. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;healthy&quot; |
| UNHEALTHY | &quot;unhealthy&quot; |
| UNKNOWN | &quot;unknown&quot; |



