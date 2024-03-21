# ElasticIpHealthcheck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strikesOk** | **Long** | Number of attempts before considering the target healthy (default: 2) |  [optional]
**tlsSkipVerify** | **Boolean** | Skip TLS verification |  [optional]
**tlsSni** | **String** | An optional domain or subdomain to check TLS against |  [optional]
**strikesFail** | **Long** | Number of attempts before considering the target unhealthy (default: 3) |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | Health check mode | 
**port** | **Long** | Health check port | 
**uri** | **String** | An endpoint to use for the health check, for example &#x27;/status&#x27; |  [optional]
**interval** | **Long** | Interval between the checks in seconds (default: 10) |  [optional]
**timeout** | **Long** | Health check timeout value in seconds (default: 2) |  [optional]

<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
TCP | &quot;tcp&quot;
HTTP | &quot;http&quot;
HTTPS | &quot;https&quot;
