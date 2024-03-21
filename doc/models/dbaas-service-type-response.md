
# Dbaas Service Type Response

## Structure

`DbaasServiceTypeResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DbaasServiceTypes` | [`List<DbaasServiceType>`](../../doc/models/dbaas-service-type.md) | Optional | - | List<DbaasServiceType> getDbaasServiceTypes() | setDbaasServiceTypes(List<DbaasServiceType> dbaasServiceTypes) |

## Example (as JSON)

```json
{
  "dbaas-service-types": [
    {
      "name": "name4",
      "available-versions": [
        "available-versions5",
        "available-versions6",
        "available-versions7"
      ],
      "default-version": "default-version8",
      "description": "description6",
      "plans": [
        {
          "name": "name4",
          "node-count": 30,
          "node-cpu-count": 96,
          "disk-space": 74,
          "node-memory": 208
        },
        {
          "name": "name4",
          "node-count": 30,
          "node-cpu-count": 96,
          "disk-space": 74,
          "node-memory": 208
        },
        {
          "name": "name4",
          "node-count": 30,
          "node-cpu-count": 96,
          "disk-space": 74,
          "node-memory": 208
        }
      ]
    },
    {
      "name": "name4",
      "available-versions": [
        "available-versions5",
        "available-versions6",
        "available-versions7"
      ],
      "default-version": "default-version8",
      "description": "description6",
      "plans": [
        {
          "name": "name4",
          "node-count": 30,
          "node-cpu-count": 96,
          "disk-space": 74,
          "node-memory": 208
        },
        {
          "name": "name4",
          "node-count": 30,
          "node-cpu-count": 96,
          "disk-space": 74,
          "node-memory": 208
        },
        {
          "name": "name4",
          "node-count": 30,
          "node-cpu-count": 96,
          "disk-space": 74,
          "node-memory": 208
        }
      ]
    }
  ]
}
```

