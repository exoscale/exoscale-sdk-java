
# SMTP Server Settings

## Structure

`SMTPServerSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Host` | `String` | Required | **Constraints**: *Maximum Length*: `255` | String getHost() | setHost(String host) |
| `Port` | `int` | Required | **Constraints**: `>= 1`, `<= 65535` | int getPort() | setPort(int port) |
| `SkipVerify` | `Boolean` | Optional | - | Boolean getSkipVerify() | setSkipVerify(Boolean skipVerify) |
| `Username` | `String` | Optional | **Constraints**: *Maximum Length*: `255`, *Pattern*: `^[^\x00-\x1F]+$` | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | **Constraints**: *Maximum Length*: `255`, *Pattern*: `^[^\x00-\x1F]+$` | String getPassword() | setPassword(String password) |
| `FromAddress` | `String` | Required | **Constraints**: *Maximum Length*: `319`, *Pattern*: `^[A-Za-z0-9_\-\.+'&]+@(([\da-zA-Z])([_\w-]{0,62})\.){0,127}(([\da-zA-Z])[_\w-]{0,61})?([\da-zA-Z]\.((xn\-\-[a-zA-Z\d]+)\|([a-zA-Z\d]{2,})))$` | String getFromAddress() | setFromAddress(String fromAddress) |
| `FromName` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^[^\x00-\x1F]+$` | String getFromName() | setFromName(String fromName) |
| `StarttlsPolicy` | [`EitherOpportunisticStartTLSMandatoryStartTLSOrNoStartTLSDefaultIsOpportunisticStartTLSEnum`](../../doc/models/either-opportunistic-start-tls-mandatory-start-tls-or-no-start-tls-default-is-opportunistic-start-tls-enum.md) | Optional | - | EitherOpportunisticStartTLSMandatoryStartTLSOrNoStartTLSDefaultIsOpportunisticStartTLSEnum getStarttlsPolicy() | setStarttlsPolicy(EitherOpportunisticStartTLSMandatoryStartTLSOrNoStartTLSDefaultIsOpportunisticStartTLSEnum starttlsPolicy) |

## Example (as JSON)

```json
{
  "host": "smtp.example.com",
  "port": 25,
  "skip_verify": false,
  "username": "smtpuser",
  "password": "ein0eemeev5eeth3Ahfu",
  "from_address": "yourgrafanauser@yourdomain.example.com",
  "from_name": "Company Grafana",
  "starttls_policy": "NoStartTLS"
}
```

