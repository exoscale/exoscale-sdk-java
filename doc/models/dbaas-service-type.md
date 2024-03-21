
# Dbaas Service Type

DBaaS service

## Structure

`DbaasServiceType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `64` | String getName() | setName(String name) |
| `AvailableVersions` | `List<String>` | Optional | DbaaS service available versions | List<String> getAvailableVersions() | setAvailableVersions(List<String> availableVersions) |
| `DefaultVersion` | `String` | Optional | DbaaS service default version | String getDefaultVersion() | setDefaultVersion(String defaultVersion) |
| `Description` | `String` | Optional | DbaaS service description | String getDescription() | setDescription(String description) |
| `Plans` | [`List<DbaasPlan>`](../../doc/models/dbaas-plan.md) | Optional | DbaaS service plans | List<DbaasPlan> getPlans() | setPlans(List<DbaasPlan> plans) |

## Example (as JSON)

```json
{
  "name": "name0",
  "available-versions": [
    "available-versions9",
    "available-versions0"
  ],
  "default-version": "default-version4",
  "description": "description0",
  "plans": [
    {
      "name": "name4",
      "node-count": 30,
      "node-cpu-count": 96,
      "disk-space": 74,
      "node-memory": 208
    }
  ]
}
```

