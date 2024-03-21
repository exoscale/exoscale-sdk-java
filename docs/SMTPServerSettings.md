# SMTPServerSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** |  | 
**port** | **Integer** |  | 
**skipVerify** | **Boolean** |  |  [optional]
**username** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**fromAddress** | **String** |  | 
**fromName** | **String** |  |  [optional]
**starttlsPolicy** | [**StarttlsPolicyEnum**](#StarttlsPolicyEnum) |  |  [optional]

<a name="StarttlsPolicyEnum"></a>
## Enum: StarttlsPolicyEnum
Name | Value
---- | -----
OPPORTUNISTICSTARTTLS | &quot;OpportunisticStartTLS&quot;
MANDATORYSTARTTLS | &quot;MandatoryStartTLS&quot;
NOSTARTTLS | &quot;NoStartTLS&quot;
