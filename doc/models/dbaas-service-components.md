
# Dbaas Service Components

Service component information objects

## Structure

`DbaasServiceComponents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Component` | `String` | Required | Service component name | String getComponent() | setComponent(String component) |
| `Host` | `String` | Required | DNS name for connecting to the service component | String getHost() | setHost(String host) |
| `KafkaAuthenticationMethod` | [`EnumKafkaAuthMethodEnum`](../../doc/models/enum-kafka-auth-method-enum.md) | Optional | - | EnumKafkaAuthMethodEnum getKafkaAuthenticationMethod() | setKafkaAuthenticationMethod(EnumKafkaAuthMethodEnum kafkaAuthenticationMethod) |
| `Path` | `String` | Optional | Path component of the service URL (useful only if service component is HTTP or HTTPS endpoint) | String getPath() | setPath(String path) |
| `Port` | `long` | Required | Port number for connecting to the service component<br>**Constraints**: `>= 0`, `<= 65535` | long getPort() | setPort(long port) |
| `Route` | [`RouteEnum`](../../doc/models/route-enum.md) | Required | Network access route | RouteEnum getRoute() | setRoute(RouteEnum route) |
| `Ssl` | `Boolean` | Optional | Whether the endpoint is encrypted or accepts plaintext.<br>By default endpoints are always encrypted and<br>this property is only included for service components that may disable encryption. | Boolean getSsl() | setSsl(Boolean ssl) |
| `Usage` | [`UsageEnum`](../../doc/models/usage-enum.md) | Required | DNS usage name | UsageEnum getUsage() | setUsage(UsageEnum usage) |

## Example (as JSON)

```json
{
  "component": "component4",
  "host": "host2",
  "kafka-authentication-method": "certificate",
  "path": "path0",
  "port": 134,
  "route": "public",
  "ssl": false,
  "usage": "primary"
}
```

