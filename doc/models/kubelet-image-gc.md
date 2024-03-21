
# Kubelet Image Gc

Kubelet image GC options

## Structure

`KubeletImageGc`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HighThreshold` | `Long` | Optional | **Constraints**: `>= 0` | Long getHighThreshold() | setHighThreshold(Long highThreshold) |
| `LowThreshold` | `Long` | Optional | **Constraints**: `>= 0` | Long getLowThreshold() | setLowThreshold(Long lowThreshold) |
| `MinAge` | `String` | Optional | - | String getMinAge() | setMinAge(String minAge) |

## Example (as JSON)

```json
{
  "high-threshold": 220,
  "low-threshold": 74,
  "min-age": "min-age6"
}
```

