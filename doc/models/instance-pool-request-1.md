
# Instance Pool Request 1

## Structure

`InstancePoolRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AntiAffinityGroups` | [`List<AntiAffinityGroup>`](../../doc/models/anti-affinity-group.md) | Optional | Instance Pool Anti-affinity Groups<br>**Constraints**: *Unique Items Required* | List<AntiAffinityGroup> getAntiAffinityGroups() | setAntiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) |
| `Description` | `String` | Optional | Instance Pool description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `PublicIpAssignment` | [`PublicIpAssignmentEnum`](../../doc/models/public-ip-assignment-enum.md) | Optional | - | PublicIpAssignmentEnum getPublicIpAssignment() | setPublicIpAssignment(PublicIpAssignmentEnum publicIpAssignment) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `SecurityGroups` | [`List<SecurityGroup>`](../../doc/models/security-group.md) | Optional | Instance Pool Security Groups<br>**Constraints**: *Unique Items Required* | List<SecurityGroup> getSecurityGroups() | setSecurityGroups(List<SecurityGroup> securityGroups) |
| `ElasticIps` | [`List<ElasticIp>`](../../doc/models/elastic-ip.md) | Optional | Instances Elastic IPs | List<ElasticIp> getElasticIps() | setElasticIps(List<ElasticIp> elasticIps) |
| `Name` | `String` | Optional | Instance Pool name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `InstanceType` | [`InstanceType`](../../doc/models/instance-type.md) | Optional | Compute instance type | InstanceType getInstanceType() | setInstanceType(InstanceType instanceType) |
| `MinAvailable` | `Long` | Optional | Minimum number of running Instances<br>**Constraints**: `>= 0` | Long getMinAvailable() | setMinAvailable(Long minAvailable) |
| `PrivateNetworks` | [`List<PrivateNetwork>`](../../doc/models/private-network.md) | Optional | Instance Pool Private Networks<br>**Constraints**: *Unique Items Required* | List<PrivateNetwork> getPrivateNetworks() | setPrivateNetworks(List<PrivateNetwork> privateNetworks) |
| `Template` | [`Template`](../../doc/models/template.md) | Optional | Instance template | Template getTemplate() | setTemplate(Template template) |
| `SshKey` | [`SshKey`](../../doc/models/ssh-key.md) | Optional | SSH key | SshKey getSshKey() | setSshKey(SshKey sshKey) |
| `InstancePrefix` | `String` | Optional | Prefix to apply to Instances names (default: pool) | String getInstancePrefix() | setInstancePrefix(String instancePrefix) |
| `UserData` | `String` | Optional | Instances Cloud-init user-data<br>**Constraints**: *Minimum Length*: `1` | String getUserData() | setUserData(String userData) |
| `DeployTarget` | [`DeployTarget`](../../doc/models/deploy-target.md) | Optional | Deploy target | DeployTarget getDeployTarget() | setDeployTarget(DeployTarget deployTarget) |
| `Ipv6Enabled` | `Boolean` | Optional | Enable IPv6. DEPRECATED: use `public-ip-assignments`. | Boolean getIpv6Enabled() | setIpv6Enabled(Boolean ipv6Enabled) |
| `DiskSize` | `Long` | Optional | Instances disk size in GB<br>**Constraints**: `>= 10`, `<= 50000` | Long getDiskSize() | setDiskSize(Long diskSize) |
| `SshKeys` | [`List<SshKey>`](../../doc/models/ssh-key.md) | Optional | Instances SSH keys<br>**Constraints**: *Unique Items Required* | List<SshKey> getSshKeys() | setSshKeys(List<SshKey> sshKeys) |

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
    }
  ],
  "description": "description4",
  "public-ip-assignment": "none",
  "labels": {
    "key0": "labels2"
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
```

