
# Acl

## Structure

`Acl`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Rules` | [`List<Rule>`](../../doc/models/rule.md) | Optional | - | List<Rule> getRules() | setRules(List<Rule> rules) |
| `Username` | `String` | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |

## Example (as JSON)

```json
{
  "rules": [
    {
      "index": "index6",
      "permission": "admin"
    }
  ],
  "username": "username8"
}
```

