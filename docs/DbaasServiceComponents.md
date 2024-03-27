

# DbaasServiceComponents

Service component information objects

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**component** | **String** | Service component name |  |
|**host** | **String** | DNS name for connecting to the service component |  |
|**kafkaAuthenticationMethod** | **EnumKafkaAuthMethod** |  |  [optional] |
|**path** | **String** | Path component of the service URL (useful only if service component is HTTP or HTTPS endpoint) |  [optional] |
|**port** | **Long** | Port number for connecting to the service component |  |
|**route** | [**RouteEnum**](#RouteEnum) | Network access route |  |
|**ssl** | **Boolean** | Whether the endpoint is encrypted or accepts plaintext.                                            By default endpoints are always encrypted and                                            this property is only included for service components that may disable encryption. |  [optional] |
|**usage** | [**UsageEnum**](#UsageEnum) | DNS usage name |  |



## Enum: RouteEnum

| Name | Value |
|---- | -----|
| DYNAMIC | &quot;dynamic&quot; |
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |
| PRIVATELINK | &quot;privatelink&quot; |



## Enum: UsageEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| REPLICA | &quot;replica&quot; |



