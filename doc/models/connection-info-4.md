
# Connection Info 4

Redis connection information properties

## Structure

`ConnectionInfo4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Uri` | `List<String>` | Optional | - | List<String> getUri() | setUri(List<String> uri) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `Slave` | `List<String>` | Optional | - | List<String> getSlave() | setSlave(List<String> slave) |

## Example (as JSON)

```json
{
  "uri": [
    "uri9"
  ],
  "password": "password2",
  "slave": [
    "slave5",
    "slave6",
    "slave7"
  ]
}
```

