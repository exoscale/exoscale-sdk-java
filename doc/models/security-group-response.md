
# Security Group Response

## Structure

`SecurityGroupResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SecurityGroups` | [`List<SecurityGroup>`](../../doc/models/security-group.md) | Optional | - | List<SecurityGroup> getSecurityGroups() | setSecurityGroups(List<SecurityGroup> securityGroups) |

## Example (as JSON)

```json
{
  "security-groups": [
    {
      "id": "00001066-0000-0000-0000-000000000000",
      "name": "name8",
      "description": "description8",
      "external-sources": [
        "external-sources8"
      ],
      "rules": [
        {
          "description": "description2",
          "start-port": 220,
          "protocol": "icmp",
          "icmp": {
            "code": 166,
            "type": 42
          },
          "end-port": 32
        },
        {
          "description": "description2",
          "start-port": 220,
          "protocol": "icmp",
          "icmp": {
            "code": 166,
            "type": 42
          },
          "end-port": 32
        }
      ]
    }
  ]
}
```

