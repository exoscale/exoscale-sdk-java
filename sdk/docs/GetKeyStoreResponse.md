

# GetKeyStoreResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The globally unique identifier assigned to the key store. |  [optional] |
|**name** | **String** | The display name assigned to the key store. |  [optional] |
|**description** | **String** | An optional detailed description providing additional context about the key store&#39;s intended use case. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The key store type. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current connection status of the key store. |  [optional] |
|**proxy** | [**KeyStoreProxyResponse**](KeyStoreProxyResponse.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation timestamp. |  [optional] |
|**statusSince** | **OffsetDateTime** | The timestamp indicating when the current key store status last transitioned. |  [optional] |
|**health** | [**KeyStoreHealth**](KeyStoreHealth.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXTERNAL_KEY_STORE | &quot;external-key-store&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;connected&quot; |
| DISCONNECTED | &quot;disconnected&quot; |



