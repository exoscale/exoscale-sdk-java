# DbaasServicePg

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pgbouncerSettings** | [**JsonSchemaPgbouncer**](JsonSchemaPgbouncer.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Service last update timestamp (ISO 8601) |  [optional]
**nodeCount** | **Long** | Number of service nodes in the active plan |  [optional]
**connectionInfo** | [**DbaasservicepgConnectioninfo**](DbaasservicepgConnectioninfo.md) |  |  [optional]
**backupSchedule** | [**DbaasservicemysqlBackupschedule**](DbaasservicemysqlBackupschedule.md) |  |  [optional]
**nodeCpuCount** | **Long** | Number of CPUs for each node |  [optional]
**integrations** | [**List&lt;DbaasIntegration&gt;**](DbaasIntegration.md) | Service integrations |  [optional]
**zone** | **String** | The zone where the service is running |  [optional]
**nodeStates** | [**List&lt;DbaasNodeState&gt;**](DbaasNodeState.md) | State of individual service nodes |  [optional]
**name** | **String** |  | 
**connectionPools** | [**List&lt;DbaasservicepgConnectionpools&gt;**](DbaasservicepgConnectionpools.md) | PostgreSQL PGBouncer connection pools |  [optional]
**type** | **String** |  | 
**state** | [**EnumServiceState**](EnumServiceState.md) |  |  [optional]
**timescaledbSettings** | [**JsonSchemaTimescaledb**](JsonSchemaTimescaledb.md) |  |  [optional]
**databases** | **List&lt;String&gt;** | List of PostgreSQL databases |  [optional]
**ipFilter** | **List&lt;String&gt;** | Allowed CIDR address blocks for incoming connections |  [optional]
**backups** | [**List&lt;DbaasServiceBackup&gt;**](DbaasServiceBackup.md) | List of backups for the service |  [optional]
**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional]
**notifications** | [**List&lt;DbaasServiceNotification&gt;**](DbaasServiceNotification.md) | Service notifications |  [optional]
**components** | [**List&lt;DbaasservicemysqlComponents&gt;**](DbaasservicemysqlComponents.md) | Service component information objects |  [optional]
**synchronousReplication** | [**EnumPgSynchronousReplication**](EnumPgSynchronousReplication.md) |  |  [optional]
**pglookoutSettings** | [**JsonSchemaPglookout**](JsonSchemaPglookout.md) |  |  [optional]
**maintenance** | [**DbaasServiceMaintenance**](DbaasServiceMaintenance.md) |  |  [optional]
**diskSize** | **Long** | TODO UNIT disk space for data storage |  [optional]
**nodeMemory** | **Long** | TODO UNIT of memory for each node |  [optional]
**uri** | **String** | URI for connecting to the service (may be absent) |  [optional]
**uriParams** | **Object** | service_uri parameterized into key-value pairs |  [optional]
**version** | **String** | PostgreSQL version |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Service creation timestamp (ISO 8601) |  [optional]
**plan** | **String** | Subscription plan | 
**workMem** | **Long** | Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB). |  [optional]
**sharedBuffersPercentage** | **Long** | Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value. |  [optional]
**pgSettings** | [**JsonSchemaPg**](JsonSchemaPg.md) |  |  [optional]
**maxConnections** | **Long** | Maximum number of connections allowed to an instance |  [optional]
**users** | [**List&lt;DbaasservicepgUsers&gt;**](DbaasservicepgUsers.md) | List of service users |  [optional]
