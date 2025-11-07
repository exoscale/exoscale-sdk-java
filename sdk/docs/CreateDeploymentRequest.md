

# CreateDeploymentRequest

Deployment an AI model onto a set of GPUs

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | [**ModelRef**](ModelRef.md) |  |  [optional] |
|**name** | **String** | Deployment name |  [optional] |
|**gpuType** | **String** | GPU type family (e.g., gpua5000, gpu3080ti) |  |
|**gpuCount** | **Long** | Number of GPUs (1-8) |  |
|**replicas** | **Long** | Number of replicas (&gt;&#x3D;1) |  [optional] |



