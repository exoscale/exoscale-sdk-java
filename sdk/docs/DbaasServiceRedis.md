

# DbaasServiceRedis


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** | Service last update timestamp (ISO 8601) |  [optional] |
|**nodeCount** | **Long** | Number of service nodes in the active plan |  [optional] |
|**connectionInfo** | [**DbaasServiceRedisConnectionInfo**](DbaasServiceRedisConnectionInfo.md) |  |  [optional] |
|**nodeCpuCount** | **Long** | Number of CPUs for each node |  [optional] |
|**prometheusUri** | [**DbaasServiceMysqlPrometheusUri**](DbaasServiceMysqlPrometheusUri.md) |  |  |
|**integrations** | [**List&lt;DbaasIntegration&gt;**](DbaasIntegration.md) | Service integrations |  [optional] |
|**zone** | **String** | The zone where the service is running |  [optional] |
|**nodeStates** | [**List&lt;DbaasNodeState&gt;**](DbaasNodeState.md) | State of individual service nodes |  [optional] |
|**name** | **String** |  |  |
|**redisSettings** | [**JsonSchemaRedis**](JsonSchemaRedis.md) |  |  [optional] |
|**type** | **String** |  |  |
|**state** | **EnumServiceState** |  |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allowed CIDR address blocks for incoming connections |  [optional] |
|**backups** | [**List&lt;DbaasServiceBackup&gt;**](DbaasServiceBackup.md) | List of backups for the service |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**notifications** | [**List&lt;DbaasServiceNotification&gt;**](DbaasServiceNotification.md) | Service notifications |  [optional] |
|**components** | [**List&lt;DbaasServiceRedisComponentsInner&gt;**](DbaasServiceRedisComponentsInner.md) | Service component information objects |  [optional] |
|**maintenance** | [**DbaasServiceMaintenance**](DbaasServiceMaintenance.md) |  |  [optional] |
|**diskSize** | **Long** | TODO UNIT disk space for data storage |  [optional] |
|**nodeMemory** | **Long** | TODO UNIT of memory for each node |  [optional] |
|**uri** | **String** | URI for connecting to the service (may be absent) |  [optional] |
|**uriParams** | **Object** | service_uri parameterized into key-value pairs |  [optional] |
|**version** | **String** | Redis version |  [optional] |
|**createdAt** | **OffsetDateTime** | Service creation timestamp (ISO 8601) |  [optional] |
|**plan** | **String** | Subscription plan |  |
|**users** | [**List&lt;DbaasServiceRedisUsersInner&gt;**](DbaasServiceRedisUsersInner.md) | List of service users |  [optional] |



