
# Authentication Methods

Kafka authentication methods

## Structure

`AuthenticationMethods`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Certificate` | `Boolean` | Optional | Whether certificate/SSL authentication is enabled | Boolean getCertificate() | setCertificate(Boolean certificate) |
| `Sasl` | `Boolean` | Optional | Whether SASL authentication is enabled | Boolean getSasl() | setSasl(Boolean sasl) |

## Example (as JSON)

```json
{
  "certificate": false,
  "sasl": false
}
```

