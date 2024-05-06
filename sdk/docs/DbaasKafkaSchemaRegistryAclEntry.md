

# DbaasKafkaSchemaRegistryAclEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**username** | **String** | Kafka username or username pattern |  |
|**resource** | **String** | Kafka Schema Registry name or pattern |  |
|**permission** | [**PermissionEnum**](#PermissionEnum) | Kafka Schema Registry permission |  |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| READ | &quot;schema_registry_read&quot; |
| WRITE | &quot;schema_registry_write&quot; |



