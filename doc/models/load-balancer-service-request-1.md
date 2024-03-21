
# Load Balancer Service Request 1

## Structure

`LoadBalancerServiceRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Load Balancer Service name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Load Balancer Service description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `InstancePool` | [`InstancePool`](../../doc/models/instance-pool.md) | Required | Instance Pool | InstancePool getInstancePool() | setInstancePool(InstancePool instancePool) |
| `Protocol` | [`Protocol1Enum`](../../doc/models/protocol-1-enum.md) | Required | Network traffic protocol | Protocol1Enum getProtocol() | setProtocol(Protocol1Enum protocol) |
| `Strategy` | [`StrategyEnum`](../../doc/models/strategy-enum.md) | Required | Load balancing strategy | StrategyEnum getStrategy() | setStrategy(StrategyEnum strategy) |
| `Port` | `long` | Required | Port exposed on the Load Balancer's public IP<br>**Constraints**: `>= 1`, `<= 65535` | long getPort() | setPort(long port) |
| `TargetPort` | `long` | Required | Port on which the network traffic will be forwarded to on the receiving instance<br>**Constraints**: `>= 1`, `<= 65535` | long getTargetPort() | setTargetPort(long targetPort) |
| `Healthcheck` | [`LoadBalancerServiceHealthcheck`](../../doc/models/load-balancer-service-healthcheck.md) | Required | Load Balancer Service healthcheck | LoadBalancerServiceHealthcheck getHealthcheck() | setHealthcheck(LoadBalancerServiceHealthcheck healthcheck) |

## Example (as JSON)

```json
{
  "name": "name8",
  "description": "description8",
  "instance-pool": {
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
      }
    ],
    "description": "description6",
    "public-ip-assignment": "inet4",
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
      }
    ]
  },
  "protocol": "tcp",
  "strategy": "round-robin",
  "port": 154,
  "target-port": 206,
  "healthcheck": {
    "mode": "http",
    "interval": 54,
    "uri": "uri8",
    "port": 178,
    "timeout": 178
  }
}
```

