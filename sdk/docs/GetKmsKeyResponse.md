

# GetKmsKeyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An optional detailed description providing additional context about the key&#39;s intended use case. |  [optional] |
|**rotation** | [**KeyRotationConfig**](KeyRotationConfig.md) |  |  |
|**revision** | [**RevisionStamp**](RevisionStamp.md) |  |  |
|**deleteAt** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** | The display name of the KMS key. |  |
|**multiZone** | **Boolean** | True if this is a multi-zone key. |  |
|**source** | [**SourceEnum**](#SourceEnum) |  |  |
|**usage** | **String** | The cryptographic operation constraints allowed on this key. |  |
|**replicasStatus** | [**List&lt;ReplicaState&gt;**](ReplicaState.md) | Detailed synchronization metrics for each regional replica mirror. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**statusSince** | **OffsetDateTime** | The timestamp indicating exactly when the current key status was last transitioned. |  |
|**id** | **UUID** | The globally unique identifier (UUID) of the retrieved KMS key. |  |
|**replicas** | **List&lt;String&gt;** | A list of availability zones where this specific key has active replica mirrors. |  [optional] |
|**material** | [**KeyMaterial**](KeyMaterial.md) |  |  |
|**originZone** | **String** | The creation zone of the KMS key. |  |
|**createdAt** | **OffsetDateTime** | The UTC timestamp showing when the KMS key was originally provisioned. |  |



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



