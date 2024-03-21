
# Operation

Operation

## Structure

`Operation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Operation ID | UUID getId() | setId(UUID id) |
| `Reason` | [`ReasonEnum`](../../doc/models/reason-enum.md) | Optional | Operation failure reason | ReasonEnum getReason() | setReason(ReasonEnum reason) |
| `Reference` | [`Reference`](../../doc/models/reference.md) | Optional | Related resource reference | Reference getReference() | setReference(Reference reference) |
| `Message` | `String` | Optional | Operation message | String getMessage() | setMessage(String message) |
| `State` | [`State5Enum`](../../doc/models/state-5-enum.md) | Optional | Operation status | State5Enum getState() | setState(State5Enum state) |

## Example (as JSON)

```json
{
  "id": "0000113e-0000-0000-0000-000000000000",
  "reason": "busy",
  "reference": {
    "id": "00001bc0-0000-0000-0000-000000000000",
    "link": "link4",
    "command": "command8"
  },
  "message": "message4",
  "state": "success"
}
```

