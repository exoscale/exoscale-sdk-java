

# EncryptResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ciphertext** | **byte[]** | The resulting Base64-encoded ciphertext after encryption. |  |
|**encryptionAlgorithm** | [**EncryptionAlgorithmEnum**](#EncryptionAlgorithmEnum) | The encryption algorithm that was used to encrypt this plaintext. |  |



## Enum: EncryptionAlgorithmEnum

| Name | Value |
|---- | -----|
| AES_256 | &quot;AES_256&quot; |
| RSAES_OAEP_SHA_256 | &quot;RSAES_OAEP_SHA_256&quot; |



