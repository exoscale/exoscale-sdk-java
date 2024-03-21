# CdnConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **String** | CDN configuration bucket name |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | CDN configuration status |  [optional]
**fqdn** | **String** | FQDN that serves the bucket contents |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DEACTIVATED | &quot;deactivated&quot;
PENDING | &quot;pending&quot;
ACTIVATED | &quot;activated&quot;
