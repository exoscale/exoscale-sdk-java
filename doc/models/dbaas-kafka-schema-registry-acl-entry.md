
# Dbaas Kafka Schema Registry Acl Entry

## Structure

`DbaasKafkaSchemaRegistryAclEntry`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getId() | setId(String id) |
| `Username` | `String` | Required | Kafka username or username pattern<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |
| `Resource` | `String` | Required | Kafka Schema Registry name or pattern<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `249` | String getResource() | setResource(String resource) |
| `Permission` | [`Permission1Enum`](../../doc/models/permission-1-enum.md) | Required | Kafka Schema Registry permission | Permission1Enum getPermission() | setPermission(Permission1Enum permission) |

## Example (as JSON)

```json
{
  "id": "id0",
  "username": "username0",
  "resource": "resource0",
  "permission": "schema_registry_read"
}
```

