
# Component 4

## Structure

`Component4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Component` | `String` | Required | Service component name | String getComponent() | setComponent(String component) |
| `Host` | `String` | Required | DNS name for connecting to the service component | String getHost() | setHost(String host) |
| `Port` | `long` | Required | Port number for connecting to the service component<br>**Constraints**: `>= 0`, `<= 65535` | long getPort() | setPort(long port) |
| `Route` | [`EnumComponentRouteEnum`](../../doc/models/enum-component-route-enum.md) | Required | - | EnumComponentRouteEnum getRoute() | setRoute(EnumComponentRouteEnum route) |
| `Ssl` | `Boolean` | Optional | Whether the endpoint is encrypted or accepts plaintext.<br>By default endpoints are always encrypted and<br>this property is only included for service components that may disable encryption. | Boolean getSsl() | setSsl(Boolean ssl) |
| `Usage` | [`EnumComponentUsageEnum`](../../doc/models/enum-component-usage-enum.md) | Required | - | EnumComponentUsageEnum getUsage() | setUsage(EnumComponentUsageEnum usage) |

## Example (as JSON)

```json
{
  "component": "component8",
  "host": "host2",
  "port": 34,
  "route": "public",
  "ssl": false,
  "usage": "primary"
}
```

