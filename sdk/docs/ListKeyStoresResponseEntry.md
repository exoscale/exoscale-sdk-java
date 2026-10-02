

# ListKeyStoresResponseEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The creation timestamp. |  [optional] |
|**description** | **String** | An optional detailed description providing additional context about the key store&#39;s intended use case. |  [optional] |
|**id** | **UUID** | The globally unique identifier assigned to the key store. |  [optional] |
|**name** | **String** | The display name assigned to the key store. |  [optional] |
|**proxy** | [**KeyStoreProxyResponse**](KeyStoreProxyResponse.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current connection status of the key store. |  [optional] |
|**statusSince** | **OffsetDateTime** | The timestamp indicating when the current key store status last transitioned. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The key store type. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;connected&quot; |
| DISCONNECTED | &quot;disconnected&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXTERNAL_KEY_STORE | &quot;external-key-store&quot; |



