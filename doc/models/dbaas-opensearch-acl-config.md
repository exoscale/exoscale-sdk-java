
# Dbaas Opensearch Acl Config

## Structure

`DbaasOpensearchAclConfig`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Acls` | [`List<Acl>`](../../doc/models/acl.md) | Optional | List of OpenSearch ACLs | List<Acl> getAcls() | setAcls(List<Acl> acls) |
| `AclEnabled` | `Boolean` | Optional | Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access. | Boolean getAclEnabled() | setAclEnabled(Boolean aclEnabled) |
| `ExtendedAclEnabled` | `Boolean` | Optional | Enable to enforce index rules in a limited fashion for requests that use the _mget, _msearch, and _bulk APIs | Boolean getExtendedAclEnabled() | setExtendedAclEnabled(Boolean extendedAclEnabled) |

## Example (as JSON)

```json
{
  "acls": [
    {
      "rules": [
        {
          "index": "index6",
          "permission": "admin"
        },
        {
          "index": "index6",
          "permission": "admin"
        },
        {
          "index": "index6",
          "permission": "admin"
        }
      ],
      "username": "username0"
    },
    {
      "rules": [
        {
          "index": "index6",
          "permission": "admin"
        },
        {
          "index": "index6",
          "permission": "admin"
        },
        {
          "index": "index6",
          "permission": "admin"
        }
      ],
      "username": "username0"
    }
  ],
  "acl-enabled": false,
  "extended-acl-enabled": false
}
```

