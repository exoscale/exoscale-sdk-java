
# Anti Affinity Group Request

## Structure

`AntiAffinityGroupRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Anti-affinity Group name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Anti-affinity Group description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "name": "name2",
  "description": "description8"
}
```

