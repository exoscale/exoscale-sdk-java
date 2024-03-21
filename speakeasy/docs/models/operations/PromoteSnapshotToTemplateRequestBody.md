# PromoteSnapshotToTemplateRequestBody


## Fields

| Field                                       | Type                                        | Required                                    | Description                                 |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `name`                                      | *String*                                    | :heavy_check_mark:                          | Template name                               |
| `description`                               | *Optional<? extends String>*                | :heavy_minus_sign:                          | Template description                        |
| `defaultUser`                               | *Optional<? extends String>*                | :heavy_minus_sign:                          | Template default user                       |
| `sshKeyEnabled`                             | *Optional<? extends Boolean>*               | :heavy_minus_sign:                          | Enable SSH key-based login in the template  |
| `passwordEnabled`                           | *Optional<? extends Boolean>*               | :heavy_minus_sign:                          | Enable password-based login in the template |