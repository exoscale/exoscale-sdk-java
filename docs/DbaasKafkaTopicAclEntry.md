# DbaasKafkaTopicAclEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**username** | **String** | Kafka username or username pattern | 
**topic** | **String** | Kafka topic name or pattern | 
**permission** | [**PermissionEnum**](#PermissionEnum) | Kafka permission | 

<a name="PermissionEnum"></a>
## Enum: PermissionEnum
Name | Value
---- | -----
ADMIN | &quot;admin&quot;
READ | &quot;read&quot;
READWRITE | &quot;readwrite&quot;
WRITE | &quot;write&quot;
