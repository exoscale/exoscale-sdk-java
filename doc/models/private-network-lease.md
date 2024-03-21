
# Private Network Lease

Private Network leased IP address

## Structure

`PrivateNetworkLease`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ip` | `String` | Optional | Private Network IP address | String getIp() | setIp(String ip) |
| `InstanceId` | `UUID` | Optional | Attached instance ID | UUID getInstanceId() | setInstanceId(UUID instanceId) |

## Example (as JSON)

```json
{
  "ip": "ip8",
  "instance-id": "00001bea-0000-0000-0000-000000000000"
}
```

