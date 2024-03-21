
# Ssh Key

SSH key

## Structure

`SshKey`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | SSH key name<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getName() | setName(String name) |
| `Fingerprint` | `String` | Optional | SSH key fingerprint | String getFingerprint() | setFingerprint(String fingerprint) |

## Example (as JSON)

```json
{
  "name": "name6",
  "fingerprint": "fingerprint2"
}
```

