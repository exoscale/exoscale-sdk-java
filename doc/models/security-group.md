
# Security Group

Security Group

## Structure

`SecurityGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Security Group ID | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | Security Group name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Description` | `String` | Optional | Security Group description<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `ExternalSources` | `List<String>` | Optional | Security Group external sources<br>**Constraints**: *Unique Items Required* | List<String> getExternalSources() | setExternalSources(List<String> externalSources) |
| `Rules` | [`List<SecurityGroupRule>`](../../doc/models/security-group-rule.md) | Optional | Security Group rules<br>**Constraints**: *Unique Items Required* | List<SecurityGroupRule> getRules() | setRules(List<SecurityGroupRule> rules) |

## Example (as JSON)

```json
{
  "id": "0000244a-0000-0000-0000-000000000000",
  "name": "name0",
  "description": "description0",
  "external-sources": [
    "external-sources0",
    "external-sources1",
    "external-sources2"
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
```

