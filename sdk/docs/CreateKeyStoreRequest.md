

# CreateKeyStoreRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A human-readable display name uniquely identifying the key store within the organization. |  |
|**description** | **String** | An optional detailed description providing additional context about the key store&#39;s intended use case. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The key store type. Only external key stores are supported for this API version. |  [optional] |
|**proxy** | [**KeyStoreProxy**](KeyStoreProxy.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXTERNAL_KEY_STORE | &quot;external-key-store&quot; |



