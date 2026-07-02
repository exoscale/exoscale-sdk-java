

# CreateDbaasServiceClickhouseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maintenance** | [**UpdateDbaasServiceMysqlRequestMaintenance**](UpdateDbaasServiceMysqlRequestMaintenance.md) |  |  [optional] |
|**plan** | **String** | Subscription plan |  |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**version** | **String** | ClickHouse major version |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39; |  [optional] |
|**clickhouseSettings** | [**JsonSchemaClickhouse**](JsonSchemaClickhouse.md) |  |  [optional] |
|**forkFromService** | **String** |  |  [optional] |
|**recoveryBackupName** | **String** | Name of a backup to recover from for services that support backup names |  [optional] |



