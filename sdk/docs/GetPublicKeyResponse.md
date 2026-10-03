

# GetPublicKeyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyId** | **UUID** | The UUID of the KMS key the public key material belongs to. |  [optional] |
|**keySpec** | **String** | The cryptographic key specification of the key pair, defining its algorithm and curve. |  [optional] |
|**usage** | **String** | The usage of the key pair, either &#x60;encrypt-decrypt&#x60; or &#x60;sign-verify&#x60;. |  [optional] |
|**publicKey** | **byte[]** | The Base64-encoded X.509 SubjectPublicKeyInfo (SPKI) DER encoding of the key&#39;s public key. |  [optional] |



