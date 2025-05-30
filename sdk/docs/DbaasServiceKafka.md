

# DbaasServiceKafka


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** | Service last update timestamp (ISO 8601) |  [optional] |
|**authenticationMethods** | [**DbaasServiceKafkaAuthenticationMethods**](DbaasServiceKafkaAuthenticationMethods.md) |  |  [optional] |
|**nodeCount** | **Long** | Number of service nodes in the active plan |  [optional] |
|**connectionInfo** | [**DbaasServiceKafkaConnectionInfo**](DbaasServiceKafkaConnectionInfo.md) |  |  [optional] |
|**nodeCpuCount** | **Long** | Number of CPUs for each node |  [optional] |
|**kafkaRestEnabled** | **Boolean** | Whether Kafka REST is enabled |  [optional] |
|**prometheusUri** | [**DbaasServiceMysqlPrometheusUri**](DbaasServiceMysqlPrometheusUri.md) |  |  |
|**integrations** | [**List&lt;DbaasIntegration&gt;**](DbaasIntegration.md) | Service integrations |  [optional] |
|**zone** | **String** | The zone where the service is running |  [optional] |
|**nodeStates** | [**List&lt;DbaasNodeState&gt;**](DbaasNodeState.md) | State of individual service nodes |  [optional] |
|**name** | **String** |  |  |
|**kafkaConnectEnabled** | **Boolean** | Whether Kafka Connect is enabled |  [optional] |
|**type** | **String** |  |  |
|**state** | **EnumServiceState** |  |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39; |  [optional] |
|**schemaRegistrySettings** | [**JsonSchemaSchemaRegistry**](JsonSchemaSchemaRegistry.md) |  |  [optional] |
|**backups** | [**List&lt;DbaasServiceBackup&gt;**](DbaasServiceBackup.md) | List of backups for the service |  [optional] |
|**kafkaRestSettings** | [**JsonSchemaKafkaRest**](JsonSchemaKafkaRest.md) |  |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**notifications** | [**List&lt;DbaasServiceNotification&gt;**](DbaasServiceNotification.md) | Service notifications |  [optional] |
|**kafkaConnectSettings** | [**JsonSchemaKafkaConnect**](JsonSchemaKafkaConnect.md) |  |  [optional] |
|**components** | [**List&lt;DbaasServiceKafkaComponentsInner&gt;**](DbaasServiceKafkaComponentsInner.md) | Service component information objects |  [optional] |
|**maintenance** | [**DbaasServiceMaintenance**](DbaasServiceMaintenance.md) |  |  [optional] |
|**kafkaSettings** | [**JsonSchemaKafka**](JsonSchemaKafka.md) |  |  [optional] |
|**diskSize** | **Long** | TODO UNIT disk space for data storage |  [optional] |
|**nodeMemory** | **Long** | TODO UNIT of memory for each node |  [optional] |
|**uri** | **String** | URI for connecting to the service (may be absent) |  [optional] |
|**uriParams** | **Object** | service_uri parameterized into key-value pairs |  [optional] |
|**schemaRegistryEnabled** | **Boolean** | Whether Schema-Registry is enabled |  [optional] |
|**version** | **String** | Kafka version |  [optional] |
|**createdAt** | **OffsetDateTime** | Service creation timestamp (ISO 8601) |  [optional] |
|**plan** | **String** | Subscription plan |  |
|**users** | [**List&lt;DbaasServiceKafkaUsersInner&gt;**](DbaasServiceKafkaUsersInner.md) | List of service users |  [optional] |



