
# Sks Cluster

SKS Cluster

## Structure

`SksCluster`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Cluster description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `Cni` | [`CniEnum`](../../doc/models/cni-enum.md) | Optional | Cluster CNI | CniEnum getCni() | setCni(CniEnum cni) |
| `AutoUpgrade` | `Boolean` | Optional | Enable auto upgrade of the control plane to the latest patch version available | Boolean getAutoUpgrade() | setAutoUpgrade(Boolean autoUpgrade) |
| `Name` | `String` | Optional | Cluster name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `State` | [`State6Enum`](../../doc/models/state-6-enum.md) | Optional | Cluster state | State6Enum getState() | setState(State6Enum state) |
| `Nodepools` | [`List<SksNodepool>`](../../doc/models/sks-nodepool.md) | Optional | Cluster Nodepools | List<SksNodepool> getNodepools() | setNodepools(List<SksNodepool> nodepools) |
| `Level` | [`Level1Enum`](../../doc/models/level-1-enum.md) | Optional | Cluster level | Level1Enum getLevel() | setLevel(Level1Enum level) |
| `Addons` | [`List<Addon1Enum>`](../../doc/models/addon-1-enum.md) | Optional | Cluster addons<br>**Constraints**: *Unique Items Required* | List<Addon1Enum> getAddons() | setAddons(List<Addon1Enum> addons) |
| `Id` | `UUID` | Optional | Cluster ID | UUID getId() | setId(UUID id) |
| `Version` | `String` | Optional | Control plane Kubernetes version | String getVersion() | setVersion(String version) |
| `CreatedAt` | `LocalDateTime` | Optional | Cluster creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Endpoint` | `String` | Optional | Cluster endpoint | String getEndpoint() | setEndpoint(String endpoint) |

## Example (as JSON)

```json
{
  "description": "description0",
  "labels": {
    "key0": "labels8",
    "key1": "labels9",
    "key2": "labels0"
  },
  "cni": "calico",
  "auto-upgrade": false,
  "name": "name0"
}
```

