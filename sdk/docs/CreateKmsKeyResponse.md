

# CreateKmsKeyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**revision** | [**RevisionStamp**](RevisionStamp.md) |  |  |
|**name** | **String** |  |  |
|**multiZone** | **Boolean** |  |  |
|**source** | [**SourceEnum**](#SourceEnum) |  |  |
|**usage** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**id** | **UUID** |  |  |
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



