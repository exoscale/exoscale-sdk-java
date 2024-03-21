
# PG Bouncer Connection Pooling Settings

## Structure

`PGBouncerConnectionPoolingSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MinPoolSize` | `Integer` | Optional | **Constraints**: `>= 0`, `<= 10000` | Integer getMinPoolSize() | setMinPoolSize(Integer minPoolSize) |
| `IgnoreStartupParameters` | [`List<EnumOfParametersToIgnoreWhenGivenInStartupPacketEnum>`](../../doc/models/enum-of-parameters-to-ignore-when-given-in-startup-packet-enum.md) | Optional | **Constraints**: *Maximum Items*: `32` | List<EnumOfParametersToIgnoreWhenGivenInStartupPacketEnum> getIgnoreStartupParameters() | setIgnoreStartupParameters(List<EnumOfParametersToIgnoreWhenGivenInStartupPacketEnum> ignoreStartupParameters) |
| `ServerLifetime` | `Integer` | Optional | **Constraints**: `>= 60`, `<= 86400` | Integer getServerLifetime() | setServerLifetime(Integer serverLifetime) |
| `AutodbPoolMode` | [`EnumPgPoolModeEnum`](../../doc/models/enum-pg-pool-mode-enum.md) | Optional | - | EnumPgPoolModeEnum getAutodbPoolMode() | setAutodbPoolMode(EnumPgPoolModeEnum autodbPoolMode) |
| `ServerIdleTimeout` | `Integer` | Optional | **Constraints**: `>= 0`, `<= 86400` | Integer getServerIdleTimeout() | setServerIdleTimeout(Integer serverIdleTimeout) |
| `AutodbMaxDbConnections` | `Integer` | Optional | **Constraints**: `>= 0`, `<= 2147483647` | Integer getAutodbMaxDbConnections() | setAutodbMaxDbConnections(Integer autodbMaxDbConnections) |
| `ServerResetQueryAlways` | `Boolean` | Optional | - | Boolean getServerResetQueryAlways() | setServerResetQueryAlways(Boolean serverResetQueryAlways) |
| `AutodbPoolSize` | `Integer` | Optional | **Constraints**: `>= 0`, `<= 10000` | Integer getAutodbPoolSize() | setAutodbPoolSize(Integer autodbPoolSize) |
| `AutodbIdleTimeout` | `Integer` | Optional | **Constraints**: `>= 0`, `<= 86400` | Integer getAutodbIdleTimeout() | setAutodbIdleTimeout(Integer autodbIdleTimeout) |

## Example (as JSON)

```json
{
  "min_pool_size": 0,
  "ignore_startup_parameters": [
    "extra_float_digits",
    "search_path"
  ],
  "server_lifetime": 3600,
  "autodb_pool_mode": "session",
  "server_idle_timeout": 600,
  "autodb_max_db_connections": 0,
  "server_reset_query_always": false,
  "autodb_pool_size": 0,
  "autodb_idle_timeout": 3600
}
```

