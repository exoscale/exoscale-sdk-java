
# Component 1

## Structure

`Component1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Component` | `String` | Required | Service component name | String getComponent() | setComponent(String component) |
| `Host` | `String` | Required | DNS name for connecting to the service component | String getHost() | setHost(String host) |
| `KafkaAuthenticationMethod` | [`EnumKafkaAuthMethodEnum`](../../doc/models/enum-kafka-auth-method-enum.md) | Optional | - | EnumKafkaAuthMethodEnum getKafkaAuthenticationMethod() | setKafkaAuthenticationMethod(EnumKafkaAuthMethodEnum kafkaAuthenticationMethod) |
| `Port` | `long` | Required | Port number for connecting to the service component<br>**Constraints**: `>= 0`, `<= 65535` | long getPort() | setPort(long port) |
| `Route` | [`EnumComponentRouteEnum`](../../doc/models/enum-component-route-enum.md) | Required | - | EnumComponentRouteEnum getRoute() | setRoute(EnumComponentRouteEnum route) |
| `Usage` | [`EnumComponentUsageEnum`](../../doc/models/enum-component-usage-enum.md) | Required | - | EnumComponentUsageEnum getUsage() | setUsage(EnumComponentUsageEnum usage) |

## Example (as JSON)

```json
{
  "component": "component8",
  "host": "host2",
  "kafka-authentication-method": "certificate",
  "port": 150,
  "route": "public",
  "usage": "primary"
}
```

