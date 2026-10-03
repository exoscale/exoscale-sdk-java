

# CreateKmsKeyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An optional detailed description providing additional context about the key&#39;s intended use case. |  [optional] |
|**xks** | [**XksKey**](XksKey.md) |  |  [optional] |
|**rotation** | [**KeyRotationConfig**](KeyRotationConfig.md) |  |  [optional] |
|**revision** | [**RevisionStamp**](RevisionStamp.md) |  |  |
|**name** | **String** | The display name assigned to the KMS key. |  |
|**multiZone** | **Boolean** | True if this is a multi-zone key. |  |
|**source** | [**SourceEnum**](#SourceEnum) | Indicates the source of the key material, either generated and held within Exoscale KMS, or backed by an external key store. |  |
|**keySpec** | **String** | The cryptographic key specification used to generate the key, defining its algorithm and, for asymmetric keys, its curve or modulus size. |  |
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
| EXTERNAL_KEY_STORE | &quot;external-key-store&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |
| PENDING_DELETION | &quot;pending-deletion&quot; |



