

# CreateKmsKeyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An optional detailed description providing additional context about the key&#39;s intended use case. |  [optional] |
|**revision** | [**RevisionStamp**](RevisionStamp.md) |  |  |
|**name** | **String** | The display name assigned to the KMS key. |  |
|**multiZone** | **Boolean** | True if this is a multi-zone key. |  |
|**source** | [**SourceEnum**](#SourceEnum) |  |  |
|**usage** | **String** | The cryptographic operation constraints allowed on this key. |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**statusSince** | **OffsetDateTime** | The timestamp indicating exactly when the current key status was last transitioned. |  |
|**id** | **UUID** | The globally unique identifier (UUID) assigned to the newly created KMS key. |  |
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



