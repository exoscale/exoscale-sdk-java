
# Dbaas Service Kafka

## Structure

`DbaasServiceKafka`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UpdatedAt` | `LocalDateTime` | Optional | Service last update timestamp (ISO 8601) | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `AuthenticationMethods` | [`AuthenticationMethods`](../../doc/models/authentication-methods.md) | Optional | Kafka authentication methods | AuthenticationMethods getAuthenticationMethods() | setAuthenticationMethods(AuthenticationMethods authenticationMethods) |
| `NodeCount` | `Long` | Optional | Number of service nodes in the active plan<br>**Constraints**: `>= 0` | Long getNodeCount() | setNodeCount(Long nodeCount) |
| `ConnectionInfo` | [`ConnectionInfo1`](../../doc/models/connection-info-1.md) | Optional | Kafka connection information properties | ConnectionInfo1 getConnectionInfo() | setConnectionInfo(ConnectionInfo1 connectionInfo) |
| `NodeCpuCount` | `Long` | Optional | Number of CPUs for each node<br>**Constraints**: `>= 0` | Long getNodeCpuCount() | setNodeCpuCount(Long nodeCpuCount) |
| `KafkaRestEnabled` | `Boolean` | Optional | Whether Kafka REST is enabled | Boolean getKafkaRestEnabled() | setKafkaRestEnabled(Boolean kafkaRestEnabled) |
| `Integrations` | [`List<DbaasIntegration>`](../../doc/models/dbaas-integration.md) | Optional | Service integrations | List<DbaasIntegration> getIntegrations() | setIntegrations(List<DbaasIntegration> integrations) |
| `Zone` | `String` | Optional | The zone where the service is running | String getZone() | setZone(String zone) |
| `NodeStates` | [`List<DbaasNodeState>`](../../doc/models/dbaas-node-state.md) | Optional | State of individual service nodes | List<DbaasNodeState> getNodeStates() | setNodeStates(List<DbaasNodeState> nodeStates) |
| `Name` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getName() | setName(String name) |
| `KafkaConnectEnabled` | `Boolean` | Optional | Whether Kafka Connect is enabled | Boolean getKafkaConnectEnabled() | setKafkaConnectEnabled(Boolean kafkaConnectEnabled) |
| `Type` | `String` | Required | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `64` | String getType() | setType(String type) |
| `State` | [`EnumServiceStateEnum`](../../doc/models/enum-service-state-enum.md) | Optional | - | EnumServiceStateEnum getState() | setState(EnumServiceStateEnum state) |
| `IpFilter` | `List<String>` | Optional | Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16' | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `SchemaRegistrySettings` | [`SchemaRegistryConfiguration`](../../doc/models/schema-registry-configuration.md) | Optional | - | SchemaRegistryConfiguration getSchemaRegistrySettings() | setSchemaRegistrySettings(SchemaRegistryConfiguration schemaRegistrySettings) |
| `Backups` | [`List<DbaasServiceBackup>`](../../doc/models/dbaas-service-backup.md) | Optional | List of backups for the service | List<DbaasServiceBackup> getBackups() | setBackups(List<DbaasServiceBackup> backups) |
| `KafkaRestSettings` | [`KafkaRESTConfiguration`](../../doc/models/kafka-rest-configuration.md) | Optional | - | KafkaRESTConfiguration getKafkaRestSettings() | setKafkaRestSettings(KafkaRESTConfiguration kafkaRestSettings) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `Notifications` | [`List<DbaasServiceNotification>`](../../doc/models/dbaas-service-notification.md) | Optional | Service notifications | List<DbaasServiceNotification> getNotifications() | setNotifications(List<DbaasServiceNotification> notifications) |
| `KafkaConnectSettings` | [`KafkaConnectConfigurationValues`](../../doc/models/kafka-connect-configuration-values.md) | Optional | - | KafkaConnectConfigurationValues getKafkaConnectSettings() | setKafkaConnectSettings(KafkaConnectConfigurationValues kafkaConnectSettings) |
| `Components` | [`List<Component1>`](../../doc/models/component-1.md) | Optional | Service component information objects | List<Component1> getComponents() | setComponents(List<Component1> components) |
| `Maintenance` | [`DbaasServiceMaintenance`](../../doc/models/dbaas-service-maintenance.md) | Optional | Automatic maintenance settings | DbaasServiceMaintenance getMaintenance() | setMaintenance(DbaasServiceMaintenance maintenance) |
| `KafkaSettings` | [`KafkaBrokerConfigurationValues`](../../doc/models/kafka-broker-configuration-values.md) | Optional | - | KafkaBrokerConfigurationValues getKafkaSettings() | setKafkaSettings(KafkaBrokerConfigurationValues kafkaSettings) |
| `DiskSize` | `Long` | Optional | TODO UNIT disk space for data storage<br>**Constraints**: `>= 0` | Long getDiskSize() | setDiskSize(Long diskSize) |
| `NodeMemory` | `Long` | Optional | TODO UNIT of memory for each node<br>**Constraints**: `>= 0` | Long getNodeMemory() | setNodeMemory(Long nodeMemory) |
| `Uri` | `String` | Optional | URI for connecting to the service (may be absent) | String getUri() | setUri(String uri) |
| `UriParams` | `Object` | Optional | service_uri parameterized into key-value pairs | Object getUriParams() | setUriParams(Object uriParams) |
| `SchemaRegistryEnabled` | `Boolean` | Optional | Whether Schema-Registry is enabled | Boolean getSchemaRegistryEnabled() | setSchemaRegistryEnabled(Boolean schemaRegistryEnabled) |
| `Version` | `String` | Optional | Kafka version | String getVersion() | setVersion(String version) |
| `CreatedAt` | `LocalDateTime` | Optional | Service creation timestamp (ISO 8601) | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Plan` | `String` | Required | Subscription plan | String getPlan() | setPlan(String plan) |
| `Users` | [`List<User1>`](../../doc/models/user-1.md) | Optional | List of service users | List<User1> getUsers() | setUsers(List<User1> users) |

## Example (as JSON)

```json
{
  "updated-at": "2016-03-13T12:52:32.123Z",
  "authentication-methods": {
    "certificate": false,
    "sasl": false
  },
  "node-count": 156,
  "connection-info": {
    "nodes": [
      "nodes2",
      "nodes3",
      "nodes4"
    ],
    "access-cert": "access-cert2",
    "access-key": "access-key2",
    "connect-uri": "connect-uri6",
    "rest-uri": "rest-uri2"
  },
  "node-cpu-count": 166,
  "name": "name6",
  "type": "type4",
  "plan": "plan8"
}
```

