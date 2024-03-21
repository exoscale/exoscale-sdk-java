
# Ssh Key Request

## Structure

`SshKeyRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | SSH key name<br>**Constraints**: *Pattern*: `^[a-zA-Z]{1}[a-zA-Z0-9._-]{0,254}$` | String getName() | setName(String name) |
| `PublicKey` | `String` | Required | Public key value | String getPublicKey() | setPublicKey(String publicKey) |

## Example (as JSON)

```json
{
  "name": "name2",
  "public-key": "public-key8"
}
```

