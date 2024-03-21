
# Settings 4

The JSON schema representing the settings for the given integration type, source, and destination service types.

## Structure

`Settings4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Properties` | `Object` | Optional | - | Object getProperties() | setProperties(Object properties) |
| `AdditionalProperties` | `Boolean` | Optional | - | Boolean getAdditionalProperties() | setAdditionalProperties(Boolean additionalProperties) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |

## Example (as JSON)

```json
{
  "properties": {
    "key1": "val1",
    "key2": "val2"
  },
  "additionalProperties": false,
  "type": "type6",
  "title": "title0"
}
```

