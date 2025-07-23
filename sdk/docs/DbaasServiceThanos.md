

# DbaasServiceThanos


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** | Service last update timestamp (ISO 8601) |  [optional] |
|**nodeCount** | **Long** | Number of service nodes in the active plan |  [optional] |
|**connectionInfo** | [**DbaasServiceThanosConnectionInfo**](DbaasServiceThanosConnectionInfo.md) |  |  [optional] |
|**nodeCpuCount** | **Long** | Number of CPUs for each node |  [optional] |
|**prometheusUri** | [**DbaasServiceMysqlPrometheusUri**](DbaasServiceMysqlPrometheusUri.md) |  |  |
|**integrations** | [**List&lt;DbaasIntegration&gt;**](DbaasIntegration.md) | Service integrations |  [optional] |
|**zone** | **String** | The zone where the service is running |  [optional] |
|**nodeStates** | [**List&lt;DbaasNodeState&gt;**](DbaasNodeState.md) | State of individual service nodes |  [optional] |
|**name** | **String** |  |  |
|**type** | **String** |  |  |
|**state** | **EnumServiceState** |  |  [optional] |
|**backups** | [**List&lt;DbaasServiceBackup&gt;**](DbaasServiceBackup.md) | List of backups for the service |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**notifications** | [**List&lt;DbaasServiceNotification&gt;**](DbaasServiceNotification.md) | Service notifications |  [optional] |
|**components** | [**List&lt;DbaasServiceThanosComponentsInner&gt;**](DbaasServiceThanosComponentsInner.md) | Service component information objects |  [optional] |
|**maintenance** | [**DbaasServiceMaintenance**](DbaasServiceMaintenance.md) |  |  [optional] |
|**diskSize** | **Long** | TODO UNIT disk space for data storage |  [optional] |
|**nodeMemory** | **Long** | TODO UNIT of memory for each node |  [optional] |
|**uri** | **String** | URI for connecting to the service (may be absent) |  [optional] |
|**uriParams** | **Object** | service_uri parameterized into key-value pairs |  [optional] |
|**thanosSettings** | [**JsonSchemaThanos**](JsonSchemaThanos.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Service creation timestamp (ISO 8601) |  [optional] |
|**plan** | **String** | Subscription plan |  |



