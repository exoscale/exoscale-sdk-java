

# CreateDbaasServiceMysqlRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backupSchedule** | [**UpdateDbaasServiceMysqlRequestBackupSchedule**](UpdateDbaasServiceMysqlRequestBackupSchedule.md) |  |  [optional] |
|**integrations** | [**List&lt;CreateDbaasServiceMysqlRequestIntegrationsInner&gt;**](CreateDbaasServiceMysqlRequestIntegrationsInner.md) | Service integrations to be enabled when creating the service. |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39; |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**forkFromService** | **String** |  |  [optional] |
|**recoveryBackupTime** | **String** | ISO time of a backup to recover from for services that support arbitrary times |  [optional] |
|**mysqlSettings** | [**JsonSchemaMysql**](JsonSchemaMysql.md) |  |  [optional] |
|**maintenance** | [**UpdateDbaasServiceMysqlRequestMaintenance**](UpdateDbaasServiceMysqlRequestMaintenance.md) |  |  [optional] |
|**adminUsername** | **String** | Custom username for admin user. This must be set only when a new service is being created. |  [optional] |
|**version** | **String** | MySQL major version |  [optional] |
|**plan** | **String** | Subscription plan |  |
|**adminPassword** | **String** |  |  [optional] |
|**migration** | [**UpdateDbaasServiceMysqlRequestMigration**](UpdateDbaasServiceMysqlRequestMigration.md) |  |  [optional] |
|**binlogRetentionPeriod** | **Long** | The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector. |  [optional] |



