

# CdnConfiguration

CDN configuration

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bucket** | **String** | CDN configuration bucket name |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | CDN configuration status |  [optional] [readonly] |
|**fqdn** | **String** | FQDN that serves the bucket contents |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DEACTIVATED | &quot;deactivated&quot; |
| PENDING | &quot;pending&quot; |
| ACTIVATED | &quot;activated&quot; |



