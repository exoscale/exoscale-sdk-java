

# UpdateAiApiKeyRequest

Update the models and/or deployments accessible by an AI API key. Omitted properties are left unchanged.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allModels** | **Boolean** | Grant or remove access to all public models. Takes precedence over the models array, which is ignored when set. |  [optional] |
|**allDeployments** | **Boolean** | Grant or remove access to all deployments of the organization. Takes precedence over the deployments array, which is ignored when set. |  [optional] |
|**deployments** | [**Set&lt;AiApiKeyDeploymentRef&gt;**](AiApiKeyDeploymentRef.md) | Allowlist of deployments. An empty array denies access to all deployments. Grant access to all deployments with all-deployments instead. |  [optional] |
|**models** | **Set&lt;String&gt;** | Allowlist of public model names. An empty array denies access to all public models. Grant access to all public models with all-models instead. |  [optional] |



