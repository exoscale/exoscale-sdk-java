
# Private Network Attach Request

## Structure

`PrivateNetworkAttachRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ip` | `String` | Optional | Static IP address lease for the corresponding network interface | String getIp() | setIp(String ip) |
| `Instance` | [`Instance1`](../../doc/models/instance-1.md) | Required | Compute instance | Instance1 getInstance() | setInstance(Instance1 instance) |

## Example (as JSON)

```json
{
  "ip": "ip8",
  "instance": {
    "id": "00001032-0000-0000-0000-000000000000"
  }
}
```

