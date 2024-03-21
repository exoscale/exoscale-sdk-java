
# Private Network Update Ip Request

## Structure

`PrivateNetworkUpdateIpRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ip` | `String` | Optional | Static IP address lease for the corresponding network interface | String getIp() | setIp(String ip) |
| `Instance` | [`Instance2`](../../doc/models/instance-2.md) | Optional | - | Instance2 getInstance() | setInstance(Instance2 instance) |

## Example (as JSON)

```json
{
  "ip": "ip8",
  "instance": {
    "id": "00001032-0000-0000-0000-000000000000"
  }
}
```

