

# ReEncryptResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ciphertext** | **byte[]** | The new Base64-encoded ciphertext block safely wrapped by the chosen destination key parameters. |  |
|**sourceEncryptionAlgorithm** | [**SourceEncryptionAlgorithmEnum**](#SourceEncryptionAlgorithmEnum) | The encryption algorithm that was used to decrypt the source ciphertext. |  |
|**destinationEncryptionAlgorithm** | [**DestinationEncryptionAlgorithmEnum**](#DestinationEncryptionAlgorithmEnum) | The encryption algorithm that was used to encrypt the destination ciphertext. |  |



## Enum: SourceEncryptionAlgorithmEnum

| Name | Value |
|---- | -----|
| AES_256 | &quot;AES_256&quot; |
| RSAES_OAEP_SHA_256 | &quot;RSAES_OAEP_SHA_256&quot; |



## Enum: DestinationEncryptionAlgorithmEnum

| Name | Value |
|---- | -----|
| AES_256 | &quot;AES_256&quot; |
| RSAES_OAEP_SHA_256 | &quot;RSAES_OAEP_SHA_256&quot; |



