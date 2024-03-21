
# Instance 3

Instance

## Structure

`Instance3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PublicIpAssignment` | [`PublicIpAssignmentEnum`](../../doc/models/public-ip-assignment-enum.md) | Optional | - | PublicIpAssignmentEnum getPublicIpAssignment() | setPublicIpAssignment(PublicIpAssignmentEnum publicIpAssignment) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `SecurityGroups` | [`List<SecurityGroup>`](../../doc/models/security-group.md) | Optional | Instance Security Groups | List<SecurityGroup> getSecurityGroups() | setSecurityGroups(List<SecurityGroup> securityGroups) |
| `Name` | `String` | Optional | Instance name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `InstanceType` | [`InstanceType`](../../doc/models/instance-type.md) | Optional | Compute instance type | InstanceType getInstanceType() | setInstanceType(InstanceType instanceType) |
| `PrivateNetworks` | [`List<PrivateNetwork>`](../../doc/models/private-network.md) | Optional | Instance Private Networks | List<PrivateNetwork> getPrivateNetworks() | setPrivateNetworks(List<PrivateNetwork> privateNetworks) |
| `Template` | [`Template`](../../doc/models/template.md) | Optional | Instance template | Template getTemplate() | setTemplate(Template template) |
| `State` | [`InstanceStateEnum`](../../doc/models/instance-state-enum.md) | Optional | - | InstanceStateEnum getState() | setState(InstanceStateEnum state) |
| `SshKey` | [`SshKey`](../../doc/models/ssh-key.md) | Optional | SSH key | SshKey getSshKey() | setSshKey(SshKey sshKey) |
| `Manager` | [`Manager`](../../doc/models/manager.md) | Optional | Resource manager | Manager getManager() | setManager(Manager manager) |
| `Ipv6Address` | `String` | Optional | Instance IPv6 address | String getIpv6Address() | setIpv6Address(String ipv6Address) |
| `Id` | `UUID` | Optional | Instance ID | UUID getId() | setId(UUID id) |
| `SshKeys` | [`List<SshKey>`](../../doc/models/ssh-key.md) | Optional | Instance SSH Keys | List<SshKey> getSshKeys() | setSshKeys(List<SshKey> sshKeys) |
| `CreatedAt` | `LocalDateTime` | Optional | Instance creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `PublicIp` | `String` | Optional | Instance public IPv4 address | String getPublicIp() | setPublicIp(String publicIp) |

## Example (as JSON)

```json
{
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
  ],
  "name": "name4",
  "instance-type": {
    "id": "00001bb6-0000-0000-0000-000000000000",
    "size": "mega",
    "family": "gpu3",
    "cpus": 158,
    "gpus": 2
  }
}
```

