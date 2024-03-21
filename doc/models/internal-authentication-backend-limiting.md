
# Internal Authentication Backend Limiting

## Structure

`InternalAuthenticationBackendLimiting`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`InternalAuthenticationBackendLimitingTypeEnum`](../../doc/models/internal-authentication-backend-limiting-type-enum.md) | Optional | The type of rate limiting<br>**Constraints**: *Maximum Length*: `1024` | InternalAuthenticationBackendLimitingTypeEnum getType() | setType(InternalAuthenticationBackendLimitingTypeEnum type) |
| `AuthenticationBackend` | [`InternalAuthenticationBackendLimitingAuthenticationBackendEnum`](../../doc/models/internal-authentication-backend-limiting-authentication-backend-enum.md) | Optional | The internal backend. Enter `internal`<br>**Constraints**: *Maximum Length*: `1024` | InternalAuthenticationBackendLimitingAuthenticationBackendEnum getAuthenticationBackend() | setAuthenticationBackend(InternalAuthenticationBackendLimitingAuthenticationBackendEnum authenticationBackend) |
| `AllowedTries` | `Integer` | Optional | The number of login attempts allowed before login is blocked<br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getAllowedTries() | setAllowedTries(Integer allowedTries) |
| `TimeWindowSeconds` | `Integer` | Optional | The window of time in which the value for `allowed_tries` is enforced<br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getTimeWindowSeconds() | setTimeWindowSeconds(Integer timeWindowSeconds) |
| `BlockExpirySeconds` | `Integer` | Optional | The duration of time that login remains blocked after a failed login<br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getBlockExpirySeconds() | setBlockExpirySeconds(Integer blockExpirySeconds) |
| `MaxBlockedClients` | `Integer` | Optional | The maximum number of blocked IP addresses<br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getMaxBlockedClients() | setMaxBlockedClients(Integer maxBlockedClients) |
| `MaxTrackedClients` | `Integer` | Optional | The maximum number of tracked IP addresses that have failed login<br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getMaxTrackedClients() | setMaxTrackedClients(Integer maxTrackedClients) |

## Example (as JSON)

```json
{
  "type": "username",
  "authentication_backend": "internal",
  "allowed_tries": 10,
  "time_window_seconds": 3600,
  "block_expiry_seconds": 600,
  "max_blocked_clients": 100000,
  "max_tracked_clients": 100000
}
```

