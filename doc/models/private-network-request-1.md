
# Private Network Request 1

## Structure

`PrivateNetworkRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Private Network name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Private Network description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Netmask` | `String` | Optional | Private Network netmask | String getNetmask() | setNetmask(String netmask) |
| `StartIp` | `String` | Optional | Private Network start IP address | String getStartIp() | setStartIp(String startIp) |
| `EndIp` | `String` | Optional | Private Network end IP address | String getEndIp() | setEndIp(String endIp) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "name": "name8",
  "description": "description8",
  "netmask": "netmask8",
  "start-ip": "start-ip0",
  "end-ip": "end-ip0"
}
```

