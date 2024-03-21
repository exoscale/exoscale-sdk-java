
# Sks Cluster Nodepool Request 1

## Structure

`SksClusterNodepoolRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AntiAffinityGroups` | [`List<AntiAffinityGroup>`](../../doc/models/anti-affinity-group.md) | Optional | Nodepool Anti-affinity Groups<br>**Constraints**: *Unique Items Required* | List<AntiAffinityGroup> getAntiAffinityGroups() | setAntiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) |
| `Description` | `String` | Optional | Nodepool description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `Taints` | [`Map<String, SksNodepoolTaint>`](../../doc/models/sks-nodepool-taint.md) | Optional | - | Map<String, SksNodepoolTaint> getTaints() | setTaints(Map<String, SksNodepoolTaint> taints) |
| `SecurityGroups` | [`List<SecurityGroup>`](../../doc/models/security-group.md) | Optional | Nodepool Security Groups<br>**Constraints**: *Unique Items Required* | List<SecurityGroup> getSecurityGroups() | setSecurityGroups(List<SecurityGroup> securityGroups) |
| `Name` | `String` | Required | Nodepool name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `InstanceType` | [`InstanceType`](../../doc/models/instance-type.md) | Required | Compute instance type | InstanceType getInstanceType() | setInstanceType(InstanceType instanceType) |
| `PrivateNetworks` | [`List<PrivateNetwork>`](../../doc/models/private-network.md) | Optional | Nodepool Private Networks<br>**Constraints**: *Unique Items Required* | List<PrivateNetwork> getPrivateNetworks() | setPrivateNetworks(List<PrivateNetwork> privateNetworks) |
| `Size` | `long` | Required | Number of instances<br>**Constraints**: `> 0` | long getSize() | setSize(long size) |
| `KubeletImageGc` | [`KubeletImageGc`](../../doc/models/kubelet-image-gc.md) | Optional | Kubelet image GC options | KubeletImageGc getKubeletImageGc() | setKubeletImageGc(KubeletImageGc kubeletImageGc) |
| `InstancePrefix` | `String` | Optional | Prefix to apply to instances names (default: pool)<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `30` | String getInstancePrefix() | setInstancePrefix(String instancePrefix) |
| `DeployTarget` | [`DeployTarget`](../../doc/models/deploy-target.md) | Optional | Deploy target | DeployTarget getDeployTarget() | setDeployTarget(DeployTarget deployTarget) |
| `Addons` | [`List<AddonEnum>`](../../doc/models/addon-enum.md) | Optional | Nodepool addons<br>**Constraints**: *Unique Items Required* | List<AddonEnum> getAddons() | setAddons(List<AddonEnum> addons) |
| `DiskSize` | `long` | Required | Nodepool instances disk size in GB<br>**Constraints**: `>= 20`, `<= 50000` | long getDiskSize() | setDiskSize(long diskSize) |

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
  "description": "description8",
  "labels": {
    "key0": "labels6",
    "key1": "labels7",
    "key2": "labels8"
  },
  "taints": {
    "key0": {
      "value": "value2",
      "effect": "PreferNoSchedule"
    },
    "key1": {
      "value": "value2",
      "effect": "PreferNoSchedule"
    }
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
  "name": "name8",
  "instance-type": {
    "id": "00001bb6-0000-0000-0000-000000000000",
    "size": "mega",
    "family": "gpu3",
    "cpus": 158,
    "gpus": 2
  },
  "size": 210,
  "disk-size": 186
}
```

