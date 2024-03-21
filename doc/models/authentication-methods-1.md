
# Authentication Methods 1

Kafka authentication methods

## Structure

`AuthenticationMethods1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Certificate` | `Boolean` | Optional | Enable certificate/SSL authentication | Boolean getCertificate() | setCertificate(Boolean certificate) |
| `Sasl` | `Boolean` | Optional | Enable SASL authentication | Boolean getSasl() | setSasl(Boolean sasl) |

## Example (as JSON)

```json
{
  "certificate": false,
  "sasl": false
}
```

