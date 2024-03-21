
# Connection Info 2

PG connection information properties

## Structure

`ConnectionInfo2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uri` | `List<String>` | Optional | - | List<String> getUri() | setUri(List<String> uri) |
| `Params` | `List<String>` | Optional | - | List<String> getParams() | setParams(List<String> params) |
| `Standby` | `List<String>` | Optional | - | List<String> getStandby() | setStandby(List<String> standby) |
| `Syncing` | `List<String>` | Optional | - | List<String> getSyncing() | setSyncing(List<String> syncing) |

## Example (as JSON)

```json
{
  "uri": [
    "uri1"
  ],
  "params": [
    "params1"
  ],
  "standby": [
    "standby9",
    "standby0"
  ],
  "syncing": [
    "syncing2"
  ]
}
```

