

# GetKeyStoreResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An optional detailed description providing additional context about the key store&#39;s intended use case. |  [optional] |
|**name** | **String** | The display name assigned to the key store. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The key store type. |  [optional] |
|**proxy** | [**KeyStoreProxyResponse**](KeyStoreProxyResponse.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current connection status of the key store. |  [optional] |
|**statusSince** | **OffsetDateTime** | The timestamp indicating when the current key store status last transitioned. |  [optional] |
|**id** | **UUID** | The globally unique identifier assigned to the key store. |  [optional] |
|**health** | [**KeyStoreHealth**](KeyStoreHealth.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation timestamp. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXTERNAL_KEY_STORE | &quot;external-key-store&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;connected&quot; |
| DISCONNECTED | &quot;disconnected&quot; |



