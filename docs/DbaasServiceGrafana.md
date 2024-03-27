

# DbaasServiceGrafana


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | DbaaS service description |  [optional] |
|**updatedAt** | **OffsetDateTime** | Service last update timestamp (ISO 8601) |  [optional] |
|**nodeCount** | **Long** | Number of service nodes in the active plan |  [optional] |
|**connectionInfo** | [**DbaasServiceGrafanaConnectionInfo**](DbaasServiceGrafanaConnectionInfo.md) |  |  [optional] |
|**nodeCpuCount** | **Long** | Number of CPUs for each node |  [optional] |
|**integrations** | [**List&lt;DbaasIntegration&gt;**](DbaasIntegration.md) | Service integrations |  [optional] |
|**zone** | **String** | The zone where the service is running |  [optional] |
|**nodeStates** | [**List&lt;DbaasNodeState&gt;**](DbaasNodeState.md) | State of individual service nodes |  [optional] |
|**name** | **String** |  |  |
|**type** | **String** |  |  |
|**state** | **EnumServiceState** |  |  [optional] |
|**grafanaSettings** | [**JsonSchemaGrafana**](JsonSchemaGrafana.md) |  |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allowed CIDR address blocks for incoming connections |  [optional] |
|**backups** | [**List&lt;DbaasServiceBackup&gt;**](DbaasServiceBackup.md) | List of backups for the service |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**notifications** | [**List&lt;DbaasServiceNotification&gt;**](DbaasServiceNotification.md) | Service notifications |  [optional] |
|**components** | [**List&lt;DbaasServiceMysqlComponentsInner&gt;**](DbaasServiceMysqlComponentsInner.md) | Service component information objects |  [optional] |
|**maintenance** | [**DbaasServiceMaintenance**](DbaasServiceMaintenance.md) |  |  [optional] |
|**diskSize** | **Long** | TODO UNIT disk space for data storage |  [optional] |
|**nodeMemory** | **Long** | TODO UNIT of memory for each node |  [optional] |
|**uri** | **String** | URI for connecting to the service (may be absent) |  [optional] |
|**uriParams** | **Object** | service_uri parameterized into key-value pairs |  [optional] |
|**version** | **String** | Grafana version |  [optional] |
|**createdAt** | **OffsetDateTime** | Service creation timestamp (ISO 8601) |  [optional] |
|**plan** | **String** | Subscription plan |  |
|**users** | [**List&lt;DbaasServiceGrafanaUsersInner&gt;**](DbaasServiceGrafanaUsersInner.md) | List of service users |  [optional] |



