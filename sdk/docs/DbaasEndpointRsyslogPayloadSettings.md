

# DbaasEndpointRsyslogPayloadSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**format** | **EnumRsyslogFormat** |  |  |
|**key** | **String** | PEM encoded client key |  [optional] |
|**logline** | **String** | Custom syslog message format |  [optional] |
|**server** | **String** | Rsyslog server IP address or hostname |  |
|**ca** | **String** | PEM encoded CA certificate |  [optional] |
|**cert** | **String** | PEM encoded client certificate |  [optional] |
|**tls** | **Boolean** | Require TLS |  |
|**port** | **Long** | Rsyslog server port |  |
|**sd** | **String** | Structured data block for log message |  [optional] |
|**maxMessageSize** | **Long** | Rsyslog max message size |  [optional] |



