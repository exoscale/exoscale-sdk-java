
# Dbaas Mysql User Request

## Structure

`DbaasMysqlUserRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Username` | `String` | Required | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getUsername() | setUsername(String username) |
| `Authentication` | [`EnumMysqlAuthenticationPluginEnum`](../../doc/models/enum-mysql-authentication-plugin-enum.md) | Optional | - | EnumMysqlAuthenticationPluginEnum getAuthentication() | setAuthentication(EnumMysqlAuthenticationPluginEnum authentication) |

## Example (as JSON)

```json
{
  "username": "username8",
  "authentication": "caching_sha2_password"
}
```

