
# Icmp 1

ICMP details (default: -1 (ANY))

## Structure

`Icmp1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `Long` | Optional | **Constraints**: `>= -1`, `<= 254` | Long getCode() | setCode(Long code) |
| `Type` | `Long` | Optional | **Constraints**: `>= -1`, `<= 254` | Long getType() | setType(Long type) |

## Example (as JSON)

```json
{
  "code": 20,
  "type": 68
}
```

