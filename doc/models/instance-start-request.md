
# Instance Start Request

## Structure

`InstanceStartRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RescueProfile` | [`RescueProfileEnum`](../../doc/models/rescue-profile-enum.md) | Optional | Boot in Rescue Mode, using named profile (supported: netboot, netboot-efi) | RescueProfileEnum getRescueProfile() | setRescueProfile(RescueProfileEnum rescueProfile) |

## Example (as JSON)

```json
{
  "rescue-profile": "netboot-efi"
}
```

