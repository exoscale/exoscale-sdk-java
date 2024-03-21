
# Icmp

ICMP details

## Structure

`Icmp`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `Long` | Optional | **Constraints**: `>= -1`, `<= 254` | Long getCode() | setCode(Long code) |
| `Type` | `Long` | Optional | **Constraints**: `>= -1`, `<= 254` | Long getType() | setType(Long type) |

## Example (as JSON)

```json
{
  "code": 250,
  "type": 214
}
```

