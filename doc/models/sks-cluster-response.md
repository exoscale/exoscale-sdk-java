
# Sks Cluster Response

## Structure

`SksClusterResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SksClusters` | [`List<SksCluster>`](../../doc/models/sks-cluster.md) | Optional | - | List<SksCluster> getSksClusters() | setSksClusters(List<SksCluster> sksClusters) |

## Example (as JSON)

```json
{
  "sks-clusters": [
    {
      "description": "description4",
      "labels": {
        "key0": "labels8",
        "key1": "labels7"
      },
      "cni": "calico",
      "auto-upgrade": false,
      "name": "name4"
    },
    {
      "description": "description4",
      "labels": {
        "key0": "labels8",
        "key1": "labels7"
      },
      "cni": "calico",
      "auto-upgrade": false,
      "name": "name4"
    },
    {
      "description": "description4",
      "labels": {
        "key0": "labels8",
        "key1": "labels7"
      },
      "cni": "calico",
      "auto-upgrade": false,
      "name": "name4"
    }
  ]
}
```

