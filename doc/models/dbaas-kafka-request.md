
# Dbaas Kafka Request

## Structure

`DbaasKafkaRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthenticationMethods` | [`AuthenticationMethods1`](../../doc/models/authentication-methods-1.md) | Optional | Kafka authentication methods | AuthenticationMethods1 getAuthenticationMethods() | setAuthenticationMethods(AuthenticationMethods1 authenticationMethods) |
| `KafkaRestEnabled` | `Boolean` | Optional | Enable Kafka-REST service | Boolean getKafkaRestEnabled() | setKafkaRestEnabled(Boolean kafkaRestEnabled) |
| `KafkaConnectEnabled` | `Boolean` | Optional | Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network | Boolean getKafkaConnectEnabled() | setKafkaConnectEnabled(Boolean kafkaConnectEnabled) |
| `IpFilter` | `List<String>` | Optional | Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16' | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `SchemaRegistrySettings` | [`SchemaRegistryConfiguration`](../../doc/models/schema-registry-configuration.md) | Optional | - | SchemaRegistryConfiguration getSchemaRegistrySettings() | setSchemaRegistrySettings(SchemaRegistryConfiguration schemaRegistrySettings) |
| `KafkaRestSettings` | [`KafkaRESTConfiguration`](../../doc/models/kafka-rest-configuration.md) | Optional | - | KafkaRESTConfiguration getKafkaRestSettings() | setKafkaRestSettings(KafkaRESTConfiguration kafkaRestSettings) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `KafkaConnectSettings` | [`KafkaConnectConfigurationValues`](../../doc/models/kafka-connect-configuration-values.md) | Optional | - | KafkaConnectConfigurationValues getKafkaConnectSettings() | setKafkaConnectSettings(KafkaConnectConfigurationValues kafkaConnectSettings) |
| `Maintenance` | [`Maintenance`](../../doc/models/maintenance.md) | Optional | Automatic maintenance settings | Maintenance getMaintenance() | setMaintenance(Maintenance maintenance) |
| `KafkaSettings` | [`KafkaBrokerConfigurationValues`](../../doc/models/kafka-broker-configuration-values.md) | Optional | - | KafkaBrokerConfigurationValues getKafkaSettings() | setKafkaSettings(KafkaBrokerConfigurationValues kafkaSettings) |
| `SchemaRegistryEnabled` | `Boolean` | Optional | Enable Schema-Registry service | Boolean getSchemaRegistryEnabled() | setSchemaRegistryEnabled(Boolean schemaRegistryEnabled) |
| `Version` | `String` | Optional | Kafka major version<br>**Constraints**: *Minimum Length*: `1` | String getVersion() | setVersion(String version) |
| `Plan` | `String` | Required | Subscription plan<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getPlan() | setPlan(String plan) |

## Example (as JSON)

```json
{
  "authentication-methods": {
    "certificate": false,
    "sasl": false
  },
  "kafka-rest-enabled": false,
  "kafka-connect-enabled": false,
  "ip-filter": [
    "ip-filter3"
  ],
  "schema-registry-settings": {
    "topic_name": "topic_name2",
    "leader_eligibility": false
  },
  "plan": "plan0"
}
```

