
# Access Key

IAM Access Key

## Structure

`AccessKey`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | IAM Access Key name | String getName() | setName(String name) |
| `Key` | `String` | Optional | IAM Access Key | String getKey() | setKey(String key) |
| `Secret` | `String` | Optional | IAM Access Key Secret | String getSecret() | setSecret(String secret) |
| `Type` | [`Type3Enum`](../../doc/models/type-3-enum.md) | Optional | IAM Access Key type | Type3Enum getType() | setType(Type3Enum type) |
| `Version` | [`VersionEnum`](../../doc/models/version-enum.md) | Optional | IAM Access Key version | VersionEnum getVersion() | setVersion(VersionEnum version) |
| `Tags` | `List<String>` | Optional | IAM Access Key tags | List<String> getTags() | setTags(List<String> tags) |
| `Operations` | `List<String>` | Optional | IAM Access Key operations | List<String> getOperations() | setOperations(List<String> operations) |
| `Resources` | [`List<AccessKeyResource>`](../../doc/models/access-key-resource.md) | Optional | IAM Access Key Resources | List<AccessKeyResource> getResources() | setResources(List<AccessKeyResource> resources) |

## Example (as JSON)

```json
{
  "name": "name6",
  "key": "key6",
  "secret": "secret2",
  "type": "restricted",
  "version": "v2"
}
```

