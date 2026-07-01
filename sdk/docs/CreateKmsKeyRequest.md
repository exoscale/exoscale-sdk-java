

# CreateKmsKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A human-readable display name uniquely identifying the KMS key within the tenant space. |  |
|**description** | **String** | An optional detailed description providing additional context about the key&#39;s intended use case. |  [optional] |
|**usage** | [**UsageEnum**](#UsageEnum) |  |  [optional] |
|**multiZone** | **Boolean** | True if this is a multi-zone key. |  [optional] |



## Enum: UsageEnum

| Name | Value |
|---- | -----|
| ENCRYPT_DECRYPT | &quot;encrypt-decrypt&quot; |



