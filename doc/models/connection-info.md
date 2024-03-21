
# Connection Info

MySQL connection information properties

## Structure

`ConnectionInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uri` | `List<String>` | Optional | - | List<String> getUri() | setUri(List<String> uri) |
| `Params` | `List<String>` | Optional | - | List<String> getParams() | setParams(List<String> params) |
| `Standby` | `List<String>` | Optional | - | List<String> getStandby() | setStandby(List<String> standby) |

## Example (as JSON)

```json
{
  "uri": [
    "uri9",
    "uri0",
    "uri1"
  ],
  "params": [
    "params9",
    "params0",
    "params1"
  ],
  "standby": [
    "standby1"
  ]
}
```

