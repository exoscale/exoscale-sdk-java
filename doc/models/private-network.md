
# Private Network

Private Network

## Structure

`PrivateNetwork`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Private Network ID | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | Private Network name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Private Network description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Netmask` | `String` | Optional | Private Network netmask | String getNetmask() | setNetmask(String netmask) |
| `StartIp` | `String` | Optional | Private Network start IP address | String getStartIp() | setStartIp(String startIp) |
| `EndIp` | `String` | Optional | Private Network end IP address | String getEndIp() | setEndIp(String endIp) |
| `Leases` | [`List<PrivateNetworkLease>`](../../doc/models/private-network-lease.md) | Optional | Private Network leased IP addresses | List<PrivateNetworkLease> getLeases() | setLeases(List<PrivateNetworkLease> leases) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |

## Example (as JSON)

```json
{
  "id": "000005ba-0000-0000-0000-000000000000",
  "name": "name6",
  "description": "description6",
  "netmask": "netmask6",
  "start-ip": "start-ip8"
}
```

