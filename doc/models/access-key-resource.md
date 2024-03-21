
# Access Key Resource

Access key resource

## Structure

`AccessKeyResource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Domain` | [`DomainEnum`](../../doc/models/domain-enum.md) | Optional | Resource domain | DomainEnum getDomain() | setDomain(DomainEnum domain) |
| `ResourceType` | [`ResourceTypeEnum`](../../doc/models/resource-type-enum.md) | Optional | Resource type | ResourceTypeEnum getResourceType() | setResourceType(ResourceTypeEnum resourceType) |
| `ResourceName` | `String` | Optional | Resource name | String getResourceName() | setResourceName(String resourceName) |

## Example (as JSON)

```json
{
  "domain": "partner",
  "resource-type": "product",
  "resource-name": "resource-name8"
}
```

