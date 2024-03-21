
# Dbaas Mysql User Password Reset Request

## Structure

`DbaasMysqlUserPasswordResetRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Password` | `String` | Optional | **Constraints**: *Minimum Length*: `8`, *Maximum Length*: `256` | String getPassword() | setPassword(String password) |
| `Authentication` | [`EnumMysqlAuthenticationPluginEnum`](../../doc/models/enum-mysql-authentication-plugin-enum.md) | Optional | - | EnumMysqlAuthenticationPluginEnum getAuthentication() | setAuthentication(EnumMysqlAuthenticationPluginEnum authentication) |

## Example (as JSON)

```json
{
  "password": "password0",
  "authentication": "caching_sha2_password"
}
```

