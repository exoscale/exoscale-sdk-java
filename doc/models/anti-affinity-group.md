
# Anti Affinity Group

Anti-affinity Group

## Structure

`AntiAffinityGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Anti-affinity Group ID | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | Anti-affinity Group name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Anti-affinity Group description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Instances` | [`List<Instance>`](../../doc/models/instance.md) | Optional | Anti-affinity Group instances | List<Instance> getInstances() | setInstances(List<Instance> instances) |

## Example (as JSON)

```json
{
  "id": "00002026-0000-0000-0000-000000000000",
  "name": "name0",
  "description": "description0",
  "instances": [
    {
      "anti-affinity-groups": [
        {
          "id": "00001e3a-0000-0000-0000-000000000000",
          "name": "name8",
          "description": "description8",
          "instances": [
            {}
          ]
        }
      ],
      "public-ip-assignment": "dual",
      "labels": {
        "key0": "labels0",
        "key1": "labels1",
        "key2": "labels2"
      },
      "security-groups": [
        {
          "id": "00001066-0000-0000-0000-000000000000",
          "name": "name8",
          "description": "description8",
          "external-sources": [
            "external-sources8"
          ],
          "rules": [
            {
              "description": "description2",
              "start-port": 220,
              "protocol": "icmp",
              "icmp": {
                "code": 166,
                "type": 42
              },
              "end-port": 32
            },
            {
              "description": "description2",
              "start-port": 220,
              "protocol": "icmp",
              "icmp": {
                "code": 166,
                "type": 42
              },
              "end-port": 32
            }
          ]
        },
        {
          "id": "00001066-0000-0000-0000-000000000000",
          "name": "name8",
          "description": "description8",
          "external-sources": [
            "external-sources8"
          ],
          "rules": [
            {
              "description": "description2",
              "start-port": 220,
              "protocol": "icmp",
              "icmp": {
                "code": 166,
                "type": 42
              },
              "end-port": 32
            },
            {
              "description": "description2",
              "start-port": 220,
              "protocol": "icmp",
              "icmp": {
                "code": 166,
                "type": 42
              },
              "end-port": 32
            }
          ]
        }
      ],
      "elastic-ips": [
        {
          "id": "00001d2e-0000-0000-0000-000000000000",
          "ip": "ip4",
          "addressfamily": "inet4",
          "cidr": "cidr0",
          "description": "description0"
        }
      ]
    }
  ]
}
```

