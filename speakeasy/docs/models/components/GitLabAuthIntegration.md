# GitLabAuthIntegration


## Fields

| Field                                    | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `allowSignUp`                            | *Optional<? extends Boolean>*            | :heavy_minus_sign:                       | N/A                                      | false                                    |
| `apiUrl`                                 | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | https://gitlab.com/api/v4                |
| `authUrl`                                | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | https://gitlab.com/oauth/authorize       |
| `clientId`                               | *String*                                 | :heavy_check_mark:                       | N/A                                      | b1ba0bf54a4c2c0a1c29                     |
| `clientSecret`                           | *String*                                 | :heavy_check_mark:                       | N/A                                      | bfa6gea4f129076761dcba8ce5e1e406bd83af7b |
| `allowedGroups`                          | List<*String*>                           | :heavy_check_mark:                       | N/A                                      |                                          |
| `tokenUrl`                               | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | https://gitlab.com/oauth/token           |