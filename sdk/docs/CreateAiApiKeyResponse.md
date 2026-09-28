

# CreateAiApiKeyResponse

Create AI API key response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** |  |  [readonly] |
|**allModels** | **Boolean** | True when the key has access to all public models. |  |
|**name** | **String** |  |  |
|**value** | **String** | Plaintext AI API key value |  |
|**allDeployments** | **Boolean** | True when the key has access to all deployments of the organization. |  |
|**deployments** | [**Set&lt;AiApiKeyDeploymentRef&gt;**](AiApiKeyDeploymentRef.md) | Allowlist of deployments. An empty array denies access to all deployments. Grant access to all deployments with all-deployments instead. |  |
|**models** | **Set&lt;String&gt;** | Allowlist of public model names. An empty array denies access to all public models. Grant access to all public models with all-models instead. |  |
|**id** | **UUID** |  |  [readonly] |
|**revokedAt** | **Object** | Last update timestamp |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [readonly] |



