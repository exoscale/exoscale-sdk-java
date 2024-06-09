

# UpdateDbaasServiceKafkaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authenticationMethods** | [**UpdateDbaasServiceKafkaRequestAuthenticationMethods**](UpdateDbaasServiceKafkaRequestAuthenticationMethods.md) |  |  [optional] |
|**kafkaRestEnabled** | **Boolean** | Enable Kafka-REST service |  [optional] |
|**kafkaConnectEnabled** | **Boolean** | Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39; |  [optional] |
|**schemaRegistrySettings** | [**JsonSchemaSchemaRegistry**](JsonSchemaSchemaRegistry.md) |  |  [optional] |
|**kafkaRestSettings** | [**JsonSchemaKafkaRest**](JsonSchemaKafkaRest.md) |  |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**kafkaConnectSettings** | [**JsonSchemaKafkaConnect**](JsonSchemaKafkaConnect.md) |  |  [optional] |
|**maintenance** | [**UpdateDbaasServiceMysqlRequestMaintenance**](UpdateDbaasServiceMysqlRequestMaintenance.md) |  |  [optional] |
|**kafkaSettings** | [**JsonSchemaKafka**](JsonSchemaKafka.md) |  |  [optional] |
|**schemaRegistryEnabled** | **Boolean** | Enable Schema-Registry service |  [optional] |
|**version** | **String** | Kafka major version |  [optional] |
|**plan** | **String** | Subscription plan |  [optional] |



