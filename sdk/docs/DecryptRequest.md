

# DecryptRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encryptionContext** | **byte[]** | The exact Base64-encoded Additional Authenticated Data (AAD) used during encryption to verify data integrity. |  [optional] |
|**encryptionAlgorithm** | [**EncryptionAlgorithmEnum**](#EncryptionAlgorithmEnum) | The encryption algorithm this key must use. Validated against the key&#39;s actual cryptographic profile. Required for asymmetric keys. Symmetric keys use AES_256 when it is omitted. |  [optional] |
|**ciphertext** | **byte[]** | The Base64-encoded ciphertext payload to be decrypted. |  |



## Enum: EncryptionAlgorithmEnum

| Name | Value |
|---- | -----|
| AES_256 | &quot;AES_256&quot; |
| RSAES_OAEP_SHA_256 | &quot;RSAES_OAEP_SHA_256&quot; |



