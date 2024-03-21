
# Sks Cluster Request

## Structure

`SksClusterRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Cluster description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `Cni` | [`CniEnum`](../../doc/models/cni-enum.md) | Optional | Cluster CNI | CniEnum getCni() | setCni(CniEnum cni) |
| `AutoUpgrade` | `Boolean` | Optional | Enable auto upgrade of the control plane to the latest patch version available | Boolean getAutoUpgrade() | setAutoUpgrade(Boolean autoUpgrade) |
| `Oidc` | [`SksOidc`](../../doc/models/sks-oidc.md) | Optional | SKS Cluster OpenID config map | SksOidc getOidc() | setOidc(SksOidc oidc) |
| `Name` | `String` | Required | Cluster name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Level` | [`Level2Enum`](../../doc/models/level-2-enum.md) | Required | Cluster service level | Level2Enum getLevel() | setLevel(Level2Enum level) |
| `Addons` | [`List<Addon1Enum>`](../../doc/models/addon-1-enum.md) | Optional | Cluster addons<br>**Constraints**: *Unique Items Required* | List<Addon1Enum> getAddons() | setAddons(List<Addon1Enum> addons) |
| `Version` | `String` | Required | Control plane Kubernetes version | String getVersion() | setVersion(String version) |

## Example (as JSON)

```json
{
  "description": "description8",
  "labels": {
    "key0": "labels8",
    "key1": "labels7"
  },
  "cni": "calico",
  "auto-upgrade": false,
  "oidc": {
    "client-id": "client-id0",
    "issuer-url": "issuer-url4",
    "username-claim": "username-claim0",
    "username-prefix": "username-prefix2",
    "groups-claim": "groups-claim6",
    "groups-prefix": "groups-prefix2",
    "required-claim": {
      "key0": "required-claim5",
      "key1": "required-claim6"
    }
  },
  "name": "name2",
  "level": "starter",
  "version": "version8"
}
```

