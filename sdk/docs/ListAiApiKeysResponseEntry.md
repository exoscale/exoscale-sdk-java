

# ListAiApiKeysResponseEntry

AI API key list entry

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** |  |  [readonly] |
|**name** | **String** |  |  |
|**deployments** | [**List&lt;AiApiKeyDeploymentsResponseInner&gt;**](AiApiKeyDeploymentsResponseInner.md) | Private deployment access. [\&quot;all\&quot;] means access to all deployments, otherwise deployments are returned as objects. |  |
|**models** | **Set&lt;String&gt;** | Public model access. An empty array denies access to all public models, [\&quot;all\&quot;] grants access to all public models, otherwise the array is an allowlist of model names. |  |
|**id** | **UUID** |  |  [readonly] |
|**revokedAt** | **Object** | Revocation timestamp. Null when the API key is active. |  [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [readonly] |



