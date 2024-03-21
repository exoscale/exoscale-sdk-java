
# Connection Info 1

Kafka connection information properties

## Structure

`ConnectionInfo1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Nodes` | `List<String>` | Optional | - | List<String> getNodes() | setNodes(List<String> nodes) |
| `AccessCert` | `String` | Optional | - | String getAccessCert() | setAccessCert(String accessCert) |
| `AccessKey` | `String` | Optional | - | String getAccessKey() | setAccessKey(String accessKey) |
| `ConnectUri` | `String` | Optional | - | String getConnectUri() | setConnectUri(String connectUri) |
| `RestUri` | `String` | Optional | - | String getRestUri() | setRestUri(String restUri) |
| `RegistryUri` | `String` | Optional | - | String getRegistryUri() | setRegistryUri(String registryUri) |

## Example (as JSON)

```json
{
  "nodes": [
    "nodes8",
    "nodes9"
  ],
  "access-cert": "access-cert2",
  "access-key": "access-key2",
  "connect-uri": "connect-uri2",
  "rest-uri": "rest-uri8"
}
```

