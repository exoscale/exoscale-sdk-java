
# Opensearch Security Plugin Settings

## Structure

`OpensearchSecurityPluginSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IpRateLimiting` | [`IPAddressRateLimitingSettings`](../../doc/models/ip-address-rate-limiting-settings.md) | Optional | - | IPAddressRateLimitingSettings getIpRateLimiting() | setIpRateLimiting(IPAddressRateLimitingSettings ipRateLimiting) |
| `InternalAuthenticationBackendLimiting` | [`InternalAuthenticationBackendLimiting`](../../doc/models/internal-authentication-backend-limiting.md) | Optional | - | InternalAuthenticationBackendLimiting getInternalAuthenticationBackendLimiting() | setInternalAuthenticationBackendLimiting(InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting) |

## Example (as JSON)

```json
{
  "ip_rate_limiting": {
    "type": "ip",
    "allowed_tries": 116,
    "time_window_seconds": 34,
    "block_expiry_seconds": 114,
    "max_blocked_clients": 226
  },
  "internal_authentication_backend_limiting": {
    "type": "username",
    "authentication_backend": "internal",
    "allowed_tries": 122,
    "time_window_seconds": 228,
    "block_expiry_seconds": 148
  }
}
```

