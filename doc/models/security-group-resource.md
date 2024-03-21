
# Security Group Resource

Security Group

## Structure

`SecurityGroupResource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Security Group ID | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | Security Group name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Visibility` | [`VisibilityEnum`](../../doc/models/visibility-enum.md) | Optional | Whether this points to a public security group. This is only valid when in the context of<br>a rule addition which uses a public security group as a source or destination. | VisibilityEnum getVisibility() | setVisibility(VisibilityEnum visibility) |

## Example (as JSON)

```json
{
  "id": "00001cf6-0000-0000-0000-000000000000",
  "name": "name4",
  "visibility": "private"
}
```

