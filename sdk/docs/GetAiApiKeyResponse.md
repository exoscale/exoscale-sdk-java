

# GetAiApiKeyResponse

Get AI API key response

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** | Last update timestamp |  [readonly] |
|**allModels** | **Boolean** | True when the key has access to all public models. |  [readonly] |
|**name** | **String** | Human-readable name for the AI API key |  |
|**allDeployments** | **Boolean** | True when the key has access to all deployments of the organization. |  [readonly] |
|**deployments** | [**Set&lt;AiApiKeyDeploymentRef&gt;**](AiApiKeyDeploymentRef.md) | Allowlist of deployments. An empty array denies access to all deployments. Grant access to all deployments with all-deployments instead. |  |
|**models** | **Set&lt;String&gt;** | Allowlist of public model names. An empty array denies access to all public models. Grant access to all public models with all-models instead. |  |
|**id** | **UUID** | AI API key ID |  [readonly] |
|**revokedAt** | **Object** | Revocation timestamp. Null when the API key is active. |  [readonly] |
|**createdAt** | **OffsetDateTime** | Creation timestamp |  [readonly] |



