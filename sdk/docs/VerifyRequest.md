

# VerifyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **byte[]** | The Base64-encoded message to verify (1-4096 decoded bytes), with the same semantics as &#x60;sign&#x60;&#39;s &#x60;message&#x60; field. |  |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | How &#x60;message&#x60; should be interpreted, with the same semantics as &#x60;sign&#x60;&#39;s &#x60;message-type&#x60; field. |  [optional] |
|**signature** | **byte[]** | The Base64-encoded signature to verify against &#x60;message&#x60; (1-6144 decoded bytes). |  |
|**signingAlgorithm** | [**SigningAlgorithmEnum**](#SigningAlgorithmEnum) | The signing algorithm &#x60;signature&#x60; was produced with. Must match the family implied by the key&#39;s &#x60;key-spec&#x60;, with the same semantics as &#x60;sign&#x60;&#39;s &#x60;signing-algorithm&#x60; field. |  |



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



