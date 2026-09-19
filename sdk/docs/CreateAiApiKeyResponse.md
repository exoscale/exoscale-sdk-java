

# CreateAiApiKeyResponse

Create AI API key response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** |  |  [readonly] |
|**name** | **String** |  |  |
|**value** | **String** | Plaintext AI API key value |  |
|**deployments** | [**List&lt;AiApiKeyDeploymentsResponseInner&gt;**](AiApiKeyDeploymentsResponseInner.md) | Private deployment access. [\&quot;all\&quot;] means access to all deployments, otherwise deployments are returned as objects. |  |
|**models** | **Set&lt;String&gt;** | Public model access. An empty array denies access to all public models, [\&quot;all\&quot;] grants access to all public models, otherwise the array is an allowlist of model names. |  |
|**id** | **UUID** |  |  [readonly] |
|**revokedAt** | **Object** | Last update timestamp |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [readonly] |



