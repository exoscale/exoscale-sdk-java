

# CreateDeploymentRequest

Deployment an AI model onto a set of GPUs

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gpuCount** | **Long** | Number of GPUs (1-8) |  |
|**inferenceEngineVersion** | [**InferenceEngineVersion**](InferenceEngineVersion.md) |  |  [optional] |
|**name** | **String** | Deployment name |  [optional] |
|**gpuType** | **Object** | GPU type family (e.g., gpua5000, gpu3080ti) |  |
|**replicas** | **Object** | Number of replicas (&gt;&#x3D;1) |  |
|**inferenceEngineParameters** | **List&lt;Object&gt;** | Optional extra inference engine server CLI args |  [optional] |
|**model** | [**Title3Model**](Title3Model.md) |  |  [optional] |



