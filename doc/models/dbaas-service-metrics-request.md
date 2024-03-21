
# Dbaas Service Metrics Request

## Structure

`DbaasServiceMetricsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Period` | [`PeriodEnum`](../../doc/models/period-enum.md) | Optional | Metrics time period (default: hour) | PeriodEnum getPeriod() | setPeriod(PeriodEnum period) |

## Example (as JSON)

```json
{
  "period": "week"
}
```

