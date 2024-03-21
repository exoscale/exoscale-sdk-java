
# Dbaas Kafka Acls

## Structure

`DbaasKafkaAcls`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TopicAcl` | [`List<DbaasKafkaTopicAclEntry>`](../../doc/models/dbaas-kafka-topic-acl-entry.md) | Optional | - | List<DbaasKafkaTopicAclEntry> getTopicAcl() | setTopicAcl(List<DbaasKafkaTopicAclEntry> topicAcl) |
| `SchemaRegistryAcl` | [`List<DbaasKafkaSchemaRegistryAclEntry>`](../../doc/models/dbaas-kafka-schema-registry-acl-entry.md) | Optional | - | List<DbaasKafkaSchemaRegistryAclEntry> getSchemaRegistryAcl() | setSchemaRegistryAcl(List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl) |

## Example (as JSON)

```json
{
  "topic-acl": [
    {
      "id": "id4",
      "username": "username6",
      "topic": "topic4",
      "permission": "readwrite"
    }
  ],
  "schema-registry-acl": [
    {
      "id": "id0",
      "username": "username0",
      "resource": "resource0",
      "permission": "schema_registry_read"
    },
    {
      "id": "id0",
      "username": "username0",
      "resource": "resource0",
      "permission": "schema_registry_read"
    },
    {
      "id": "id0",
      "username": "username0",
      "resource": "resource0",
      "permission": "schema_registry_read"
    }
  ]
}
```

