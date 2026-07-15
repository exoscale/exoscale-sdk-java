

# GetDeploymentResponse

AI deployment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gpuCount** | **Long** | Number of GPUs |  |
|**updatedAt** | **OffsetDateTime** | Update time |  [readonly] |
|**deploymentUrl** | **String** | Deployment inference endpoint URL |  |
|**serviceLevel** | **String** | Service level |  |
|**inferenceEngineVersion** | **InferenceEngineVersion** |  |  |
|**name** | **String** | Deployment name |  |
|**state** | [**StateEnum**](#StateEnum) | Deployment state |  |
|**gpuType** | **String** | GPU type family |  |
|**id** | **UUID** | Deployment ID |  [readonly] |
|**replicas** | **Long** | Number of replicas (&gt;&#x3D;0) |  |
|**stateDetails** | **String** | Deployment state details |  |
|**createdAt** | **OffsetDateTime** | Creation time |  [readonly] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Deployment visibility: private for your organization&#39;s deployments, public for Exoscale Managed Inference deployments. |  |
|**inferenceEngineParameters** | **List&lt;String&gt;** | Optional extra inference engine server CLI args |  |
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



