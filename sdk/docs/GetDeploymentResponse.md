

# GetDeploymentResponse

AI deployment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gpuCount** | **Long** | Number of GPUs |  [optional] |
|**updatedAt** | **OffsetDateTime** | Update time |  [optional] [readonly] |
|**deploymentUrl** | **String** | Deployment inference endpoint URL |  |
|**serviceLevel** | **String** | Service level |  [optional] |
|**inferenceEngineVersion** | **InferenceEngineVersion** |  |  [optional] |
|**name** | **String** | Deployment name |  |
|**state** | [**StateEnum**](#StateEnum) | Deployment state |  |
|**gpuType** | **String** | GPU type family |  [optional] |
|**id** | **UUID** | Deployment ID |  [optional] [readonly] |
|**replicas** | **Long** | Number of replicas (&gt;&#x3D;0) |  [optional] |
|**stateDetails** | **String** | Deployment state details |  [optional] |
|**createdAt** | **OffsetDateTime** | Creation time |  [optional] [readonly] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Deployment visibility: private for your organization&#39;s deployments, public for Exoscale Managed Inference deployments. |  |
|**inferenceEngineParameters** | **List&lt;String&gt;** | Optional extra inference engine server CLI args |  [optional] |
|**model** | [**ModelRef**](ModelRef.md) |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| CREATING | &quot;creating&quot; |
| PREPARING | &quot;preparing&quot; |
| ERROR | &quot;error&quot; |
| DEPLOYING | &quot;deploying&quot; |
| SCALING | &quot;scaling&quot; |
| UPDATING | &quot;updating&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;public&quot; |
| PRIVATE | &quot;private&quot; |



