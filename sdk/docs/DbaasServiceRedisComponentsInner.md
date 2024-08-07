

# DbaasServiceRedisComponentsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**component** | **String** | Service component name |  |
|**host** | **String** | DNS name for connecting to the service component |  |
|**port** | **Long** | Port number for connecting to the service component |  |
|**route** | **EnumComponentRoute** |  |  |
|**ssl** | **Boolean** | Whether the endpoint is encrypted or accepts plaintext.              By default endpoints are always encrypted and              this property is only included for service components that may disable encryption. |  [optional] |
|**usage** | **EnumComponentUsage** |  |  |



