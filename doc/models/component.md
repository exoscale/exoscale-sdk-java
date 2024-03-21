
# Component

## Structure

`Component`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Component` | `String` | Required | Service component name | String getComponent() | setComponent(String component) |
| `Host` | `String` | Required | DNS name for connecting to the service component | String getHost() | setHost(String host) |
| `Port` | `long` | Required | Port number for connecting to the service component<br>**Constraints**: `>= 0`, `<= 65535` | long getPort() | setPort(long port) |
| `Route` | [`EnumComponentRouteEnum`](../../doc/models/enum-component-route-enum.md) | Required | - | EnumComponentRouteEnum getRoute() | setRoute(EnumComponentRouteEnum route) |
| `Usage` | [`EnumComponentUsageEnum`](../../doc/models/enum-component-usage-enum.md) | Required | - | EnumComponentUsageEnum getUsage() | setUsage(EnumComponentUsageEnum usage) |

## Example (as JSON)

```json
{
  "component": "component0",
  "host": "host4",
  "port": 200,
  "route": "dynamic",
  "usage": "primary"
}
```

