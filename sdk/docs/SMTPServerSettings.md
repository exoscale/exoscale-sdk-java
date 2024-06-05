

# SMTPServerSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromAddress** | **String** |  |  |
|**fromName** | **String** |  |  [optional] |
|**host** | **String** |  |  |
|**password** | **String** |  |  [optional] |
|**port** | **Integer** |  |  |
|**skipVerify** | **Boolean** |  |  [optional] |
|**starttlsPolicy** | [**StarttlsPolicyEnum**](#StarttlsPolicyEnum) |  |  [optional] |
|**username** | **String** |  |  [optional] |



## Enum: StarttlsPolicyEnum

| Name | Value |
|---- | -----|
| OPPORTUNISTICSTARTTLS | &quot;OpportunisticStartTLS&quot; |
| MANDATORYSTARTTLS | &quot;MandatoryStartTLS&quot; |
| NOSTARTTLS | &quot;NoStartTLS&quot; |



