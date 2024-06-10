

# UpdateDbaasServiceGrafanaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maintenance** | [**UpdateDbaasServiceMysqlRequestMaintenance**](UpdateDbaasServiceMysqlRequestMaintenance.md) |  |  [optional] |
|**plan** | **String** | Subscription plan |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**grafanaSettings** | [**JsonSchemaGrafana**](JsonSchemaGrafana.md) |  |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allowed CIDR address blocks for incoming connections |  [optional] |



