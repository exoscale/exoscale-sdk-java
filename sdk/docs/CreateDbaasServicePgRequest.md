

# CreateDbaasServicePgRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pgbouncerSettings** | [**JsonSchemaPgbouncer**](JsonSchemaPgbouncer.md) |  |  [optional] |
|**backupSchedule** | [**UpdateDbaasServiceMysqlRequestBackupSchedule**](UpdateDbaasServiceMysqlRequestBackupSchedule.md) |  |  [optional] |
|**variant** | **EnumPgVariant** |  |  [optional] |
|**integrations** | [**List&lt;CreateDbaasServiceMysqlRequestIntegrationsInner&gt;**](CreateDbaasServiceMysqlRequestIntegrationsInner.md) | Service integrations to be enabled when creating the service. |  [optional] |
|**timescaledbSettings** | [**JsonSchemaTimescaledb**](JsonSchemaTimescaledb.md) |  |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39; |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**forkFromService** | **String** |  |  [optional] |
|**synchronousReplication** | **EnumPgSynchronousReplication** |  |  [optional] |
|**recoveryBackupTime** | **String** | ISO time of a backup to recover from for services that support arbitrary times |  [optional] |
|**pglookoutSettings** | [**JsonSchemaPglookout**](JsonSchemaPglookout.md) |  |  [optional] |
|**maintenance** | [**UpdateDbaasServiceMysqlRequestMaintenance**](UpdateDbaasServiceMysqlRequestMaintenance.md) |  |  [optional] |
|**adminUsername** | **String** | Custom username for admin user. This must be set only when a new service is being created. |  [optional] |
|**version** | **DbaasPgTargetVersions** |  |  [optional] |
|**plan** | **String** | Subscription plan |  |
|**workMem** | **Long** | Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB). |  [optional] |
|**sharedBuffersPercentage** | **Long** | Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value. |  [optional] |
|**pgSettings** | [**JsonSchemaPg**](JsonSchemaPg.md) |  |  [optional] |
|**adminPassword** | **String** | Custom password for admin user. Defaults to random string. This must be set only when a new service is being created. |  [optional] |
|**migration** | [**UpdateDbaasServiceMysqlRequestMigration**](UpdateDbaasServiceMysqlRequestMigration.md) |  |  [optional] |



