
# Instance Type

Compute instance type

## Structure

`InstanceType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Instance type ID | UUID getId() | setId(UUID id) |
| `Size` | [`SizeEnum`](../../doc/models/size-enum.md) | Optional | Instance type size | SizeEnum getSize() | setSize(SizeEnum size) |
| `Family` | [`FamilyEnum`](../../doc/models/family-enum.md) | Optional | Instance type family | FamilyEnum getFamily() | setFamily(FamilyEnum family) |
| `Cpus` | `Long` | Optional | CPU count<br>**Constraints**: `> 0` | Long getCpus() | setCpus(Long cpus) |
| `Gpus` | `Long` | Optional | GPU count<br>**Constraints**: `> 0` | Long getGpus() | setGpus(Long gpus) |
| `Authorized` | `Boolean` | Optional | Requires authorization or publicly available | Boolean getAuthorized() | setAuthorized(Boolean authorized) |
| `Memory` | `Long` | Optional | Available memory<br>**Constraints**: `> 0` | Long getMemory() | setMemory(Long memory) |
| `Zones` | [`List<ZoneNameEnum>`](../../doc/models/zone-name-enum.md) | Optional | Instance Type available zones | List<ZoneNameEnum> getZones() | setZones(List<ZoneNameEnum> zones) |

## Example (as JSON)

```json
{
  "id": "00001bb6-0000-0000-0000-000000000000",
  "size": "mega",
  "family": "gpu3",
  "cpus": 158,
  "gpus": 2
}
```

