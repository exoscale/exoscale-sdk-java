

# SignRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **byte[]** | The Base64-encoded message to sign (1-4096 decoded bytes). Its meaning depends on &#x60;message-type&#x60;, either the raw plaintext message or an already-hashed digest. |  |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | How &#x60;message&#x60; should be interpreted. |  [optional] |
|**signingAlgorithm** | [**SigningAlgorithmEnum**](#SigningAlgorithmEnum) | The signing algorithm to use. Must match the family implied by the key&#39;s &#x60;key-spec&#x60;. |  |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| RAW | &quot;raw&quot; |
| DIGEST | &quot;digest&quot; |



## Enum: SigningAlgorithmEnum

| Name | Value |
|---- | -----|
| RSASSA_PSS_SHA_256 | &quot;RSASSA_PSS_SHA_256&quot; |
| RSASSA_PSS_SHA_384 | &quot;RSASSA_PSS_SHA_384&quot; |
| RSASSA_PSS_SHA_512 | &quot;RSASSA_PSS_SHA_512&quot; |
| ECDSA_SHA_256 | &quot;ECDSA_SHA_256&quot; |
| ECDSA_SHA_384 | &quot;ECDSA_SHA_384&quot; |
| ECDSA_SHA_512 | &quot;ECDSA_SHA_512&quot; |
| EDDSA_ED25519 | &quot;EDDSA_ED25519&quot; |
| ED25519_PH_SHA_512 | &quot;ED25519_PH_SHA_512&quot; |
| ML_DSA_SHAKE_256 | &quot;ML_DSA_SHAKE_256&quot; |



