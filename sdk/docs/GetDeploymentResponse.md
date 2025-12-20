

# GetDeploymentResponse

AI deployment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gpuCount** | **Long** | Number of GPUs |  [optional] |
|**updatedAt** | **OffsetDateTime** | Update time |  [optional] [readonly] |
|**deploymentUrl** | **String** | Deployment URL (nullable) |  [optional] |
|**serviceLevel** | **String** | Service level |  [optional] |
|**name** | **String** | Deployment name |  [optional] |
|**gpuType** | **String** | GPU type family |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Deployment status |  [optional] |
|**id** | **UUID** | Deployment ID |  [optional] [readonly] |
|**replicas** | **Long** | Number of replicas (&gt;&#x3D;0) |  [optional] |
|**createdAt** | **OffsetDateTime** | Creation time |  [optional] [readonly] |
|**inferenceEngineParameters** | **List&lt;String&gt;** | Optional extra inference engine server CLI args |  [optional] |
|**model** | [**ModelRef**](ModelRef.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| CREATING | &quot;creating&quot; |
| ERROR | &quot;error&quot; |
| DEPLOYING | &quot;deploying&quot; |



