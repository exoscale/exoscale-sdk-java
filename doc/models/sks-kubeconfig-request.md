
# Sks Kubeconfig Request

Kubeconfig request for a SKS cluster

## Structure

`SksKubeconfigRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ttl` | `Long` | Optional | Validity in seconds of the Kubeconfig user certificate (default: 30 days)<br>**Constraints**: `> 0` | Long getTtl() | setTtl(Long ttl) |
| `User` | `String` | Optional | User name in the generated Kubeconfig. The certificate present in the Kubeconfig will also have this name set for the CN field. | String getUser() | setUser(String user) |
| `Groups` | `List<String>` | Optional | List of roles. The certificate present in the Kubeconfig will have these roles set in the Org field. | List<String> getGroups() | setGroups(List<String> groups) |

## Example (as JSON)

```json
{
  "ttl": 46,
  "user": "user4",
  "groups": [
    "groups8",
    "groups9"
  ]
}
```

