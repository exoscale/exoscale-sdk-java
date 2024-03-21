
# Dbaas Service Response

## Structure

`DbaasServiceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DbaasServices` | [`List<DbaasServiceCommon>`](../../doc/models/dbaas-service-common.md) | Optional | - | List<DbaasServiceCommon> getDbaasServices() | setDbaasServices(List<DbaasServiceCommon> dbaasServices) |

## Example (as JSON)

```json
{
  "dbaas-services": [
    {
      "updated-at": "2016-03-13T12:52:32.123Z",
      "node-count": 196,
      "node-cpu-count": 126,
      "integrations": [
        {
          "description": "description6",
          "settings": {
            "key1": "val1",
            "key2": "val2"
          },
          "type": "type4",
          "is-enabled": false,
          "source": "source2"
        },
        {
          "description": "description6",
          "settings": {
            "key1": "val1",
            "key2": "val2"
          },
          "type": "type4",
          "is-enabled": false,
          "source": "source2"
        }
      ],
      "zone": "zone6",
      "name": "name4",
      "type": "type6",
      "plan": "plan0"
    },
    {
      "updated-at": "2016-03-13T12:52:32.123Z",
      "node-count": 196,
      "node-cpu-count": 126,
      "integrations": [
        {
          "description": "description6",
          "settings": {
            "key1": "val1",
            "key2": "val2"
          },
          "type": "type4",
          "is-enabled": false,
          "source": "source2"
        },
        {
          "description": "description6",
          "settings": {
            "key1": "val1",
            "key2": "val2"
          },
          "type": "type4",
          "is-enabled": false,
          "source": "source2"
        }
      ],
      "zone": "zone6",
      "name": "name4",
      "type": "type6",
      "plan": "plan0"
    }
  ]
}
```

