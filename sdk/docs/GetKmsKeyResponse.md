

# GetKmsKeyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**rotation** | [**KeyRotationConfig**](KeyRotationConfig.md) |  |  |
|**revision** | [**RevisionStamp**](RevisionStamp.md) |  |  |
|**name** | **String** |  |  |
|**multiZone** | **Boolean** |  |  |
|**source** | [**SourceEnum**](#SourceEnum) |  |  |
|**policy** | **String** |  |  |
|**usage** | **String** |  |  |
|**replicasStatus** | [**List&lt;ReplicaState&gt;**](ReplicaState.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**statusSince** | **OffsetDateTime** |  |  |
|**id** | **UUID** |  |  |
|**replicas** | **List&lt;String&gt;** |  |  |
|**material** | [**KeyMaterial**](KeyMaterial.md) |  |  |
|**originZone** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| EXOSCALE_KMS | &quot;exoscale-kms&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |
| PENDING_DELETION | &quot;pending-deletion&quot; |



