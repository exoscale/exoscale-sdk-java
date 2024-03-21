
# Reference

Related resource reference

## Structure

`Reference`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Reference ID | UUID getId() | setId(UUID id) |
| `Link` | `String` | Optional | Link to the referenced resource | String getLink() | setLink(String link) |
| `Command` | `String` | Optional | Command name | String getCommand() | setCommand(String command) |

## Example (as JSON)

```json
{
  "id": "00001e8a-0000-0000-0000-000000000000",
  "link": "link8",
  "command": "command8"
}
```

