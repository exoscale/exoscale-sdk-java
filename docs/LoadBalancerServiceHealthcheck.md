# LoadBalancerServiceHealthcheck

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | [**ModeEnum**](#ModeEnum) | Healthcheck mode |  [optional]
**interval** | **Long** | Healthcheck interval (default: 10). Must be greater than or equal to Timeout |  [optional]
**uri** | **String** | An endpoint to use for the HTTP healthcheck, e.g. &#x27;/status&#x27; |  [optional]
**port** | **Long** | Healthcheck port |  [optional]
**timeout** | **Long** | Healthcheck timeout value (default: 2). Must be lower than or equal to Interval |  [optional]
**retries** | **Long** | Number of retries before considering a Service failed |  [optional]
**tlsSni** | **String** | SNI domain for HTTPS healthchecks |  [optional]

<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
TCP | &quot;tcp&quot;
HTTP | &quot;http&quot;
HTTPS | &quot;https&quot;
