
# Access Key Request

IAM Access Key

## Structure

`AccessKeyRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | IAM Access Key name | String getName() | setName(String name) |
| `Tags` | `List<String>` | Optional | IAM Access Key tags | List<String> getTags() | setTags(List<String> tags) |
| `Operations` | `List<String>` | Optional | IAM Access Key operations | List<String> getOperations() | setOperations(List<String> operations) |
| `Resources` | [`List<AccessKeyResource>`](../../doc/models/access-key-resource.md) | Optional | IAM Access Key Resources | List<AccessKeyResource> getResources() | setResources(List<AccessKeyResource> resources) |

## Example (as JSON)

```json
{
  "name": "name8",
  "tags": [
    "tags3",
    "tags4",
    "tags5"
  ],
  "operations": [
    "operations6"
  ],
  "resources": [
    {
      "domain": "partner",
      "resource-type": "product",
      "resource-name": "resource-name2"
    }
  ]
}
```

