

# CreateDbaasServiceValkeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valkeySettings** | [**JsonSchemaValkey**](JsonSchemaValkey.md) |  |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39; |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**forkFromService** | **String** |  |  [optional] |
|**maintenance** | [**UpdateDbaasServiceMysqlRequestMaintenance**](UpdateDbaasServiceMysqlRequestMaintenance.md) |  |  [optional] |
|**version** | **String** | Valkey major version |  [optional] |
|**recoveryBackupName** | **String** | Name of a backup to recover from for services that support backup names |  [optional] |
|**plan** | **String** | Subscription plan |  |
|**migration** | [**UpdateDbaasServiceMysqlRequestMigration**](UpdateDbaasServiceMysqlRequestMigration.md) |  |  [optional] |



