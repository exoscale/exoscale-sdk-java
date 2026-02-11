

# GetDeploymentResponse

AI deployment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gpuCount** | **Object** | Number of GPUs |  [optional] |
|**updatedAt** | **OffsetDateTime** | Update time |  [optional] [readonly] |
|**deploymentUrl** | **String** | Deployment URL (nullable) |  [optional] |
|**serviceLevel** | **String** | Service level |  [optional] |
|**inferenceEngineVersion** | [**InferenceEngineVersion**](InferenceEngineVersion.md) |  |  [optional] |
|**name** | **String** | Deployment name |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Deployment state |  [optional] |
|**gpuType** | **String** | GPU type family |  [optional] |
|**id** | **UUID** | Deployment ID |  [optional] [readonly] |
|**replicas** | **Object** | Number of replicas (&gt;&#x3D;0) |  [optional] |
|**stateDetails** | **String** | Deployment state details |  [optional] |
|**createdAt** | **Object** | Creation time |  [optional] [readonly] |
|**inferenceEngineParameters** | **List&lt;Object&gt;** | Optional extra inference engine server CLI args |  [optional] |
|**model** | [**Title3Model**](Title3Model.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| CREATING | &quot;creating&quot; |
| ERROR | &quot;error&quot; |
| DEPLOYING | &quot;deploying&quot; |



