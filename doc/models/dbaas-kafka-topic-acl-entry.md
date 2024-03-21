
# Dbaas Kafka Topic Acl Entry

## Structure

`DbaasKafkaTopicAclEntry`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getId() | setId(String id) |
| `Username` | `String` | Required | Kafka username or username pattern<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |
| `Topic` | `String` | Required | Kafka topic name or pattern<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `249` | String getTopic() | setTopic(String topic) |
| `Permission` | [`PermissionEnum`](../../doc/models/permission-enum.md) | Required | Kafka permission | PermissionEnum getPermission() | setPermission(PermissionEnum permission) |

## Example (as JSON)

```json
{
  "id": "id6",
  "username": "username4",
  "topic": "topic2",
  "permission": "admin"
}
```

