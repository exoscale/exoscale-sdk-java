

# IPAddressRateLimitingSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedTries** | **Integer** | The number of login attempts allowed before login is blocked |  [optional] |
|**blockExpirySeconds** | **Integer** | The duration of time that login remains blocked after a failed login |  [optional] |
|**maxBlockedClients** | **Integer** | The maximum number of blocked IP addresses |  [optional] |
|**maxTrackedClients** | **Integer** | The maximum number of tracked IP addresses that have failed login |  [optional] |
|**timeWindowSeconds** | **Integer** | The window of time in which the value for &#x60;allowed_tries&#x60; is enforced |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of rate limiting |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IP | &quot;ip&quot; |



