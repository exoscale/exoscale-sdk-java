
# Timescale DB Extension Configuration Values

## Structure

`TimescaleDBExtensionConfigurationValues`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MaxBackgroundWorkers` | `Integer` | Optional | The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.<br>**Constraints**: `>= 1`, `<= 4096` | Integer getMaxBackgroundWorkers() | setMaxBackgroundWorkers(Integer maxBackgroundWorkers) |

## Example (as JSON)

```json
{
  "max_background_workers": 8
}
```

