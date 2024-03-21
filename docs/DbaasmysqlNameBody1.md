# DbaasmysqlNameBody1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupSchedule** | [**DbaasmysqlnameBackupschedule**](DbaasmysqlnameBackupschedule.md) |  |  [optional]
**integrations** | [**List&lt;DbaasmysqlnameIntegrations&gt;**](DbaasmysqlnameIntegrations.md) | Service integrations to be enabled when creating the service. |  [optional]
**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#x27;10.20.0.0/16&#x27; |  [optional]
**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional]
**forkFromService** | **String** |  |  [optional]
**recoveryBackupTime** | **String** | ISO time of a backup to recover from for services that support arbitrary times |  [optional]
**mysqlSettings** | [**JsonSchemaMysql**](JsonSchemaMysql.md) |  |  [optional]
**maintenance** | [**DbaasmysqlnameMaintenance**](DbaasmysqlnameMaintenance.md) |  |  [optional]
**adminUsername** | **String** | Custom username for admin user. This must be set only when a new service is being created. |  [optional]
**version** | **String** | MySQL major version |  [optional]
**plan** | **String** | Subscription plan | 
**adminPassword** | **String** | Custom password for admin user. Defaults to random string. This must be set only when a new service is being created. |  [optional]
**migration** | [**DbaasmysqlnameMigration**](DbaasmysqlnameMigration.md) |  |  [optional]
**binlogRetentionPeriod** | **Long** | The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector. |  [optional]
