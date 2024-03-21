
# Instance Pool Response

## Structure

`InstancePoolResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InstancePools` | [`List<InstancePool>`](../../doc/models/instance-pool.md) | Optional | - | List<InstancePool> getInstancePools() | setInstancePools(List<InstancePool> instancePools) |

## Example (as JSON)

```json
{
  "instance-pools": [
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
        }
      ],
      "description": "description4",
      "public-ip-assignment": "dual",
      "labels": {
        "key0": "labels2",
        "key1": "labels3",
        "key2": "labels4"
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
      ]
    },
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
        }
      ],
      "description": "description4",
      "public-ip-assignment": "dual",
      "labels": {
        "key0": "labels2",
        "key1": "labels3",
        "key2": "labels4"
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
      ]
    }
  ]
}
```

