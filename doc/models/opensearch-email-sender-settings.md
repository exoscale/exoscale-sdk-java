
# Opensearch Email Sender Settings

## Structure

`OpensearchEmailSenderSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EmailSenderName` | `String` | Required | This should be identical to the Sender name defined in Opensearch dashboards<br>**Constraints**: *Maximum Length*: `40`, *Pattern*: `^[a-zA-Z0-9-_]+$` | String getEmailSenderName() | setEmailSenderName(String emailSenderName) |
| `EmailSenderPassword` | `String` | Required | Sender password for Opensearch alerts to authenticate with SMTP server<br>**Constraints**: *Maximum Length*: `1024`, *Pattern*: `^[^\x00-\x1F]+$` | String getEmailSenderPassword() | setEmailSenderPassword(String emailSenderPassword) |
| `EmailSenderUsername` | `String` | Required | **Constraints**: *Maximum Length*: `320`, *Pattern*: `^[^\x00-\x1F]+$` | String getEmailSenderUsername() | setEmailSenderUsername(String emailSenderUsername) |

## Example (as JSON)

```json
{
  "email_sender_name": "alert-sender",
  "email_sender_password": "very-secure-mail-password",
  "email_sender_username": "jane@example.com"
}
```

