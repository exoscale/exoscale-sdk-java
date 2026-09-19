

# UpdateAiApiKeyRequest

Update the models and/or deployments accessible by an AI API key. Omitted properties are left unchanged.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deployments** | **Set&lt;String&gt;** | Deployment IDs accepted as input. |  [optional] |
|**models** | **Set&lt;String&gt;** | Public model access. An empty array denies access to all public models, [\&quot;all\&quot;] grants access to all public models, otherwise the array is an allowlist of model names. |  [optional] |



