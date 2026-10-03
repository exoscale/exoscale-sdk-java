

# CreateKmsKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A human-readable display name uniquely identifying the KMS key within the tenant space. |  |
|**description** | **String** | An optional detailed description providing additional context about the key&#39;s intended use case. |  [optional] |
|**usage** | [**UsageEnum**](#UsageEnum) |  |  [optional] |
|**keySpec** | [**KeySpecEnum**](#KeySpecEnum) | The cryptographic key specification defining the key&#39;s algorithm and, for asymmetric keys, its curve or modulus size. |  [optional] |
|**multiZone** | **Boolean** | True if this is a multi-zone key. |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | Indicates the source of the key material, either generated and held within Exoscale KMS, or backed by an external key store. |  [optional] |
|**xks** | [**XksKey**](XksKey.md) |  |  [optional] |



## Enum: UsageEnum

| Name | Value |
|---- | -----|
| ENCRYPT_DECRYPT | &quot;encrypt-decrypt&quot; |
| SIGN_VERIFY | &quot;sign-verify&quot; |



## Enum: KeySpecEnum

| Name | Value |
|---- | -----|
| AES_256 | &quot;AES_256&quot; |
| ECC_NIST_P256 | &quot;ECC_NIST_P256&quot; |
| ECC_NIST_P384 | &quot;ECC_NIST_P384&quot; |
| ECC_NIST_P521 | &quot;ECC_NIST_P521&quot; |
| ECC_EDWARDS25519 | &quot;ECC_EDWARDS25519&quot; |
| RSA_3072 | &quot;RSA_3072&quot; |
| RSA_4096 | &quot;RSA_4096&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| EXOSCALE_KMS | &quot;exoscale-kms&quot; |
| EXTERNAL_KEY_STORE | &quot;external-key-store&quot; |



