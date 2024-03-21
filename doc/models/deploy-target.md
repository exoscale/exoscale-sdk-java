
# Deploy Target

Deploy target

## Structure

`DeployTarget`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Required | Deploy Target ID | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | Deploy Target name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Type` | [`Type1Enum`](../../doc/models/type-1-enum.md) | Optional | Deploy Target type | Type1Enum getType() | setType(Type1Enum type) |
| `Description` | `String` | Optional | Deploy Target description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "id": "00002028-0000-0000-0000-000000000000",
  "name": "name2",
  "type": "edge",
  "description": "description2"
}
```

