

# ListKmsKeysResponseEntry


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
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**statusSince** | **OffsetDateTime** | The precise time when the key entered its current configuration phase. |  |
|**id** | **UUID** | The globally unique identifier (UUID) tracking this key entity. |  |
|**replicas** | **List&lt;String&gt;** | Array tracking target zones currently maintaining copies of this item. |  [optional] |
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



