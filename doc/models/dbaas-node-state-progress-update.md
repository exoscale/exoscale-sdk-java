
# Dbaas Node State Progress Update

Extra information regarding the progress for current state

## Structure

`DbaasNodeStateProgressUpdate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Completed` | `boolean` | Required | Indicates whether this phase has been completed or not | boolean getCompleted() | setCompleted(boolean completed) |
| `Current` | `Long` | Optional | Current progress for this phase. May be missing or null.<br>**Constraints**: `>= 0` | Long getCurrent() | setCurrent(Long current) |
| `Max` | `Long` | Optional | Maximum progress value for this phase. May be missing or null. May change.<br>**Constraints**: `>= 0` | Long getMax() | setMax(Long max) |
| `Min` | `Long` | Optional | Minimum progress value for this phase. May be missing or null.<br>**Constraints**: `>= 0` | Long getMin() | setMin(Long min) |
| `Phase` | [`PhaseEnum`](../../doc/models/phase-enum.md) | Required | Key identifying this phase | PhaseEnum getPhase() | setPhase(PhaseEnum phase) |
| `Unit` | `String` | Optional | Unit for current/min/max values. New units may be added.<br>If null should be treated as generic unit | String getUnit() | setUnit(String unit) |

## Example (as JSON)

```json
{
  "completed": false,
  "current": 120,
  "max": 80,
  "min": 162,
  "phase": "prepare",
  "unit": "unit4"
}
```

