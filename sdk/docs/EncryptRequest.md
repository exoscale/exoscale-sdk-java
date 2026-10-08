

# EncryptRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encryptionContext** | **byte[]** | Base64-encoded bytes to be used as the Additional Authenticated Data (AAD) for encryption integrity. |  [optional] |
|**encryptionAlgorithm** | [**EncryptionAlgorithmEnum**](#EncryptionAlgorithmEnum) | The encryption algorithm this key must use. Validated against the key&#39;s actual cryptographic profile. Required for asymmetric keys. Symmetric keys use AES_256 when it is omitted. |  [optional] |
|**plaintext** | **byte[]** | The Base64-encoded plaintext data you wish to encrypt. |  |



## Enum: EncryptionAlgorithmEnum

| Name | Value |
|---- | -----|
| AES_256 | &quot;AES_256&quot; |
| RSAES_OAEP_SHA_256 | &quot;RSAES_OAEP_SHA_256&quot; |



