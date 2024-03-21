
# Instance Reset Request

## Structure

`InstanceResetRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Template` | [`Template`](../../doc/models/template.md) | Optional | Instance template | Template getTemplate() | setTemplate(Template template) |
| `DiskSize` | `Long` | Optional | Instance disk size in GB<br>**Constraints**: `>= 10`, `<= 50000` | Long getDiskSize() | setDiskSize(Long diskSize) |

## Example (as JSON)

```json
{
  "template": {
    "maintainer": "maintainer0",
    "description": "description4",
    "ssh-key-enabled": false,
    "family": "family8",
    "name": "name6"
  },
  "disk-size": 116
}
```

