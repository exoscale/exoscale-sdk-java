
# Manager

Resource manager

## Structure

`Manager`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Manager ID | UUID getId() | setId(UUID id) |
| `Type` | [`TypeEnum`](../../doc/models/type-enum.md) | Optional | Manager type | TypeEnum getType() | setType(TypeEnum type) |

## Example (as JSON)

```json
{
  "id": "00001baa-0000-0000-0000-000000000000",
  "type": "sks-nodepool"
}
```

