
# Dbaas Service Notification

Service notifications

## Structure

`DbaasServiceNotification`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Level` | [`LevelEnum`](../../doc/models/level-enum.md) | Required | Notification level | LevelEnum getLevel() | setLevel(LevelEnum level) |
| `Message` | `String` | Required | Human notification message<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1024` | String getMessage() | setMessage(String message) |
| `Type` | [`Type2Enum`](../../doc/models/type-2-enum.md) | Required | Notification type | Type2Enum getType() | setType(Type2Enum type) |
| `Metadata` | `Object` | Required | Notification type | Object getMetadata() | setMetadata(Object metadata) |

## Example (as JSON)

```json
{
  "level": "warning",
  "message": "message2",
  "type": "service_powered_off_removal",
  "metadata": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

