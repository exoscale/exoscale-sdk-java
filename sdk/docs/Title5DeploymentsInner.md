

# Title5DeploymentsInner

AI deployment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gpuCount** | **Object** | Number of GPUs |  [optional] |
|**updatedAt** | **Object** | Update time |  [optional] [readonly] |
|**deploymentUrl** | **Object** | Deployment URL (nullable) |  [optional] |
|**serviceLevel** | **Object** | Service level |  [optional] |
|**name** | **Object** | Deployment name |  [optional] |
|**gpuType** | **Object** | GPU type family |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Deployment status |  [optional] |
|**id** | **Object** | Deployment ID |  [optional] [readonly] |
|**replicas** | **Object** | Number of replicas (&gt;&#x3D;0) |  [optional] |
|**createdAt** | **Object** | Creation time |  [optional] [readonly] |
|**model** | [**Title3Model**](Title3Model.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| CREATING | &quot;creating&quot; |
| ERROR | &quot;error&quot; |
| DEPLOYING | &quot;deploying&quot; |



