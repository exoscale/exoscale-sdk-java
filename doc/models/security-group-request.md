
# Security Group Request

## Structure

`SecurityGroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Security Group name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Security Group description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "name": "name4",
  "description": "description4"
}
```

