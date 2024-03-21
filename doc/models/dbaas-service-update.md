
# Dbaas Service Update

Update waiting to be installed

## Structure

`DbaasServiceUpdate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the update | String getDescription() | setDescription(String description) |
| `Deadline` | `LocalDateTime` | Optional | Deadline for installing the update | LocalDateTime getDeadline() | setDeadline(LocalDateTime deadline) |
| `StartAfter` | `LocalDateTime` | Optional | The earliest time the update will be automatically applied | LocalDateTime getStartAfter() | setStartAfter(LocalDateTime startAfter) |
| `StartAt` | `LocalDateTime` | Optional | The time when the update will be automatically applied | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |

## Example (as JSON)

```json
{
  "description": "description2",
  "deadline": "2016-03-13T12:52:32.123Z",
  "start-after": "2016-03-13T12:52:32.123Z",
  "start-at": "2016-03-13T12:52:32.123Z"
}
```

