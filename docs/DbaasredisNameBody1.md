# DbaasredisNameBody1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maintenance** | [**DbaasmysqlnameMaintenance**](DbaasmysqlnameMaintenance.md) |  |  [optional]
**plan** | **String** | Subscription plan | 
**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional]
**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#x27;10.20.0.0/16&#x27; |  [optional]
**migration** | [**DbaasmysqlnameMigration**](DbaasmysqlnameMigration.md) |  |  [optional]
**redisSettings** | [**JsonSchemaRedis**](JsonSchemaRedis.md) |  |  [optional]
**forkFromService** | **String** |  |  [optional]
**recoveryBackupName** | **String** | Name of a backup to recover from for services that support backup names |  [optional]
