
# Load Balancer Request 1

## Structure

`LoadBalancerRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Load Balancer name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Load Balancer description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "name": "name8",
  "description": "description8",
  "labels": {
    "key0": "labels6",
    "key1": "labels7",
    "key2": "labels8"
  }
}
```

