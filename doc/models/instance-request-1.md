
# Instance Request 1

## Structure

`InstanceRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AntiAffinityGroups` | [`List<AntiAffinityGroup>`](../../doc/models/anti-affinity-group.md) | Optional | Instance Anti-affinity Groups<br>**Constraints**: *Unique Items Required* | List<AntiAffinityGroup> getAntiAffinityGroups() | setAntiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) |
| `PublicIpAssignment` | [`PublicIpAssignmentEnum`](../../doc/models/public-ip-assignment-enum.md) | Optional | - | PublicIpAssignmentEnum getPublicIpAssignment() | setPublicIpAssignment(PublicIpAssignmentEnum publicIpAssignment) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `AutoStart` | `Boolean` | Optional | Start Instance on creation (default: true) | Boolean getAutoStart() | setAutoStart(Boolean autoStart) |
| `SecurityGroups` | [`List<SecurityGroup>`](../../doc/models/security-group.md) | Optional | Instance Security Groups<br>**Constraints**: *Unique Items Required* | List<SecurityGroup> getSecurityGroups() | setSecurityGroups(List<SecurityGroup> securityGroups) |
| `Name` | `String` | Optional | Instance name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `InstanceType` | [`InstanceType`](../../doc/models/instance-type.md) | Required | Compute instance type | InstanceType getInstanceType() | setInstanceType(InstanceType instanceType) |
| `Template` | [`Template`](../../doc/models/template.md) | Required | Instance template | Template getTemplate() | setTemplate(Template template) |
| `SshKey` | [`SshKey`](../../doc/models/ssh-key.md) | Optional | SSH key | SshKey getSshKey() | setSshKey(SshKey sshKey) |
| `UserData` | `String` | Optional | Instance Cloud-init user-data<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32768` | String getUserData() | setUserData(String userData) |
| `DeployTarget` | [`DeployTarget`](../../doc/models/deploy-target.md) | Optional | Deploy target | DeployTarget getDeployTarget() | setDeployTarget(DeployTarget deployTarget) |
| `Ipv6Enabled` | `Boolean` | Optional | Enable IPv6. DEPRECATED: use `public-ip-assignments`. | Boolean getIpv6Enabled() | setIpv6Enabled(Boolean ipv6Enabled) |
| `DiskSize` | `long` | Required | Instance disk size in GB<br>**Constraints**: `>= 10`, `<= 50000` | long getDiskSize() | setDiskSize(long diskSize) |
| `SshKeys` | [`List<SshKey>`](../../doc/models/ssh-key.md) | Optional | Instance SSH Keys<br>**Constraints**: *Unique Items Required* | List<SshKey> getSshKeys() | setSshKeys(List<SshKey> sshKeys) |

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
    }
  ],
  "public-ip-assignment": "dual",
  "labels": {
    "key0": "labels2",
    "key1": "labels1"
  },
  "auto-start": false,
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
  "instance-type": {
    "id": "00001bb6-0000-0000-0000-000000000000",
    "size": "mega",
    "family": "gpu3",
    "cpus": 158,
    "gpus": 2
  },
  "template": {
    "maintainer": "maintainer0",
    "description": "description4",
    "ssh-key-enabled": false,
    "family": "family8",
    "name": "name6"
  },
  "disk-size": 52
}
```

