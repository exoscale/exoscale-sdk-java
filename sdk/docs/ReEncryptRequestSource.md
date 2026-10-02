

# ReEncryptRequestSource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ciphertext** | **byte[]** | The Base64-encoded encrypted payload package ready to undergo source-side key decryption. |  |
|**encryptionContext** | **byte[]** | Optional Base64-encoded encryption context originally appended to the AAD to confirm package validation rules. |  [optional] |
|**key** | **UUID** | The ID of the source key currently protecting the data payload. |  |



