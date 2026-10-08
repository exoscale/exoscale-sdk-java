

# ReEncryptRequestDestination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **UUID** | The ID of the target key chosen to encapsulate the newly shifted data translation. |  |
|**encryptionContext** | **byte[]** | Optional new Base64-encoded encryption context to apply under the target destination envelope. |  [optional] |
|**encryptionAlgorithm** | [**EncryptionAlgorithmEnum**](#EncryptionAlgorithmEnum) | The encryption algorithm the destination key must use. Validated against the key&#39;s actual cryptographic profile. Required for asymmetric keys. Symmetric keys use AES_256 when it is omitted. |  [optional] |



## Enum: EncryptionAlgorithmEnum

| Name | Value |
|---- | -----|
| AES_256 | &quot;AES_256&quot; |
| RSAES_OAEP_SHA_256 | &quot;RSAES_OAEP_SHA_256&quot; |



