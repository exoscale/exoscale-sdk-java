

# UpdateDbaasServiceMysqlRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maintenance** | [**UpdateDbaasServiceMysqlRequestMaintenance**](UpdateDbaasServiceMysqlRequestMaintenance.md) |  |  [optional] |
|**plan** | **String** | Subscription plan |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39; |  [optional] |
|**mysqlSettings** | [**JsonSchemaMysql**](JsonSchemaMysql.md) |  |  [optional] |
|**migration** | [**UpdateDbaasServiceMysqlRequestMigration**](UpdateDbaasServiceMysqlRequestMigration.md) |  |  [optional] |
|**binlogRetentionPeriod** | **Long** | The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector. |  [optional] |
|**backupSchedule** | [**UpdateDbaasServiceMysqlRequestBackupSchedule**](UpdateDbaasServiceMysqlRequestBackupSchedule.md) |  |  [optional] |



