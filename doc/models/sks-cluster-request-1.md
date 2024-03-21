
# Sks Cluster Request 1

## Structure

`SksClusterRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Cluster name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Cluster description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Labels` | `Map<String, String>` | Optional | - | Map<String, String> getLabels() | setLabels(Map<String, String> labels) |
| `Oidc` | [`SksOidc`](../../doc/models/sks-oidc.md) | Optional | SKS Cluster OpenID config map | SksOidc getOidc() | setOidc(SksOidc oidc) |
| `AutoUpgrade` | `Boolean` | Optional | Enable auto upgrade of the control plane to the latest patch version available | Boolean getAutoUpgrade() | setAutoUpgrade(Boolean autoUpgrade) |
| `Addons` | [`List<Addon1Enum>`](../../doc/models/addon-1-enum.md) | Optional | Cluster addons<br>**Constraints**: *Unique Items Required* | List<Addon1Enum> getAddons() | setAddons(List<Addon1Enum> addons) |

## Example (as JSON)

```json
{
  "name": "name0",
  "description": "description0",
  "labels": {
    "key0": "labels8",
    "key1": "labels9"
  },
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
  "auto-upgrade": false
}
```

