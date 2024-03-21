
# Anti Affinity Group Response

## Structure

`AntiAffinityGroupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AntiAffinityGroups` | [`List<AntiAffinityGroup>`](../../doc/models/anti-affinity-group.md) | Optional | - | List<AntiAffinityGroup> getAntiAffinityGroups() | setAntiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) |

## Example (as JSON)

```json
{
  "anti-affinity-groups": [
    {
      "id": "00001e3a-0000-0000-0000-000000000000",
      "name": "name8",
      "description": "description8",
      "instances": [
        {
          "anti-affinity-groups": [
            {}
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
    },
    {
      "id": "00001e3a-0000-0000-0000-000000000000",
      "name": "name8",
      "description": "description8",
      "instances": [
        {
          "anti-affinity-groups": [
            {}
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
    },
    {
      "id": "00001e3a-0000-0000-0000-000000000000",
      "name": "name8",
      "description": "description8",
      "instances": [
        {
          "anti-affinity-groups": [
            {}
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
  ]
}
```

