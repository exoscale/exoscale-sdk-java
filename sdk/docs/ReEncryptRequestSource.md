

# ReEncryptRequestSource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **UUID** | The ID of the source key currently protecting the data payload. |  |
|**encryptionContext** | **byte[]** | Optional Base64-encoded encryption context originally appended to the AAD to confirm package validation rules. |  [optional] |
|**encryptionAlgorithm** | [**EncryptionAlgorithmEnum**](#EncryptionAlgorithmEnum) | The encryption algorithm the source key must use. Validated against the key&#39;s actual cryptographic profile. Required for asymmetric keys. Symmetric keys use AES_256 when it is omitted. |  [optional] |
|**ciphertext** | **byte[]** | The Base64-encoded encrypted payload package ready to undergo source-side key decryption. |  |



## Enum: EncryptionAlgorithmEnum

| Name | Value |
|---- | -----|
| AES_256 | &quot;AES_256&quot; |
| RSAES_OAEP_SHA_256 | &quot;RSAES_OAEP_SHA_256&quot; |



