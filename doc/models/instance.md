
# Instance

Instance

## Structure

`Instance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AntiAffinityGroups` | [`List<AntiAffinityGroup>`](../../doc/models/anti-affinity-group.md) | Optional | Instance Anti-affinity Groups | List<AntiAffinityGroup> getAntiAffinityGroups() | setAntiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) |
| `PublicIpAssignment` | [`PublicIpAssignmentEnum`](../../doc/models/public-ip-assignment-enum.md) | Optional | - | PublicIpAssignmentEnum getPublicIpAssignment() | setPublicIpAssignment(PublicIpAssignmentEnum publicIpAssignment) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `SecurityGroups` | [`List<SecurityGroup>`](../../doc/models/security-group.md) | Optional | Instance Security Groups | List<SecurityGroup> getSecurityGroups() | setSecurityGroups(List<SecurityGroup> securityGroups) |
| `ElasticIps` | [`List<ElasticIp>`](../../doc/models/elastic-ip.md) | Optional | Instance Elastic IPs | List<ElasticIp> getElasticIps() | setElasticIps(List<ElasticIp> elasticIps) |
| `Name` | `String` | Optional | Instance name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `InstanceType` | [`InstanceType`](../../doc/models/instance-type.md) | Optional | Compute instance type | InstanceType getInstanceType() | setInstanceType(InstanceType instanceType) |
| `PrivateNetworks` | [`List<PrivateNetwork>`](../../doc/models/private-network.md) | Optional | Instance Private Networks | List<PrivateNetwork> getPrivateNetworks() | setPrivateNetworks(List<PrivateNetwork> privateNetworks) |
| `Template` | [`Template`](../../doc/models/template.md) | Optional | Instance template | Template getTemplate() | setTemplate(Template template) |
| `State` | [`InstanceStateEnum`](../../doc/models/instance-state-enum.md) | Optional | - | InstanceStateEnum getState() | setState(InstanceStateEnum state) |
| `SshKey` | [`SshKey`](../../doc/models/ssh-key.md) | Optional | SSH key | SshKey getSshKey() | setSshKey(SshKey sshKey) |
| `UserData` | `String` | Optional | Instance Cloud-init user-data (base64 encoded)<br>**Constraints**: *Minimum Length*: `1` | String getUserData() | setUserData(String userData) |
| `Manager` | [`Manager`](../../doc/models/manager.md) | Optional | Resource manager | Manager getManager() | setManager(Manager manager) |
| `DeployTarget` | [`DeployTarget`](../../doc/models/deploy-target.md) | Optional | Deploy target | DeployTarget getDeployTarget() | setDeployTarget(DeployTarget deployTarget) |
| `Ipv6Address` | `String` | Optional | Instance IPv6 address | String getIpv6Address() | setIpv6Address(String ipv6Address) |
| `Id` | `UUID` | Optional | Instance ID | UUID getId() | setId(UUID id) |
| `Snapshots` | [`List<Snapshot>`](../../doc/models/snapshot.md) | Optional | Instance Snapshots | List<Snapshot> getSnapshots() | setSnapshots(List<Snapshot> snapshots) |
| `DiskSize` | `Long` | Optional | Instance disk size in GB<br>**Constraints**: `>= 10`, `<= 50000` | Long getDiskSize() | setDiskSize(Long diskSize) |
| `SshKeys` | [`List<SshKey>`](../../doc/models/ssh-key.md) | Optional | Instance SSH Keys | List<SshKey> getSshKeys() | setSshKeys(List<SshKey> sshKeys) |
| `CreatedAt` | `LocalDateTime` | Optional | Instance creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `PublicIp` | `String` | Optional | Instance public IPv4 address | String getPublicIp() | setPublicIp(String publicIp) |

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
  "public-ip-assignment": "inet4",
  "labels": {
    "key0": "labels2",
    "key1": "labels1",
    "key2": "labels0"
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
  ],
  "elastic-ips": [
    {
      "id": "00001d2e-0000-0000-0000-000000000000",
      "ip": "ip4",
      "addressfamily": "inet4",
      "cidr": "cidr0",
      "description": "description0"
    },
    {
      "id": "00001d2e-0000-0000-0000-000000000000",
      "ip": "ip4",
      "addressfamily": "inet4",
      "cidr": "cidr0",
      "description": "description0"
    }
  ]
}
```

