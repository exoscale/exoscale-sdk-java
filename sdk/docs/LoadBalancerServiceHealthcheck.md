

# LoadBalancerServiceHealthcheck

Load Balancer Service healthcheck

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Healthcheck mode |  [optional] |
|**interval** | **Long** | Healthcheck interval (default: 10). Must be greater than or equal to Timeout |  [optional] |
|**uri** | **String** | An endpoint to use for the HTTP healthcheck, e.g. &#39;/status&#39; |  [optional] |
|**port** | **Long** | Healthcheck port |  [optional] |
|**timeout** | **Long** | Healthcheck timeout value (default: 2). Must be lower than or equal to Interval |  [optional] |
|**retries** | **Long** | Number of retries before considering a Service failed |  [optional] |
|**tlsSni** | **String** | SNI domain for HTTPS healthchecks |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| TCP | &quot;tcp&quot; |
| HTTP | &quot;http&quot; |
| HTTPS | &quot;https&quot; |



