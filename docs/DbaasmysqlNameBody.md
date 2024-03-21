# DbaasmysqlNameBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maintenance** | [**DbaasmysqlnameMaintenance**](DbaasmysqlnameMaintenance.md) |  |  [optional]
**plan** | **String** | Subscription plan |  [optional]
**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional]
**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#x27;10.20.0.0/16&#x27; |  [optional]
**mysqlSettings** | [**JsonSchemaMysql**](JsonSchemaMysql.md) |  |  [optional]
**migration** | [**DbaasmysqlnameMigration**](DbaasmysqlnameMigration.md) |  |  [optional]
**binlogRetentionPeriod** | **Long** | The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector. |  [optional]
**backupSchedule** | [**DbaasmysqlnameBackupschedule**](DbaasmysqlnameBackupschedule.md) |  |  [optional]
