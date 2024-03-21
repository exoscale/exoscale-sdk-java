# GenericOAuthIntegration


## Fields

| Field                                    | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `scopes`                                 | List<*String*>                           | :heavy_minus_sign:                       | N/A                                      |                                          |
| `allowedDomains`                         | List<*String*>                           | :heavy_minus_sign:                       | N/A                                      |                                          |
| `allowedOrganizations`                   | List<*String*>                           | :heavy_minus_sign:                       | N/A                                      |                                          |
| `tokenUrl`                               | *String*                                 | :heavy_check_mark:                       | N/A                                      | https://yourprovider.com/oauth/token     |
| `name`                                   | *Optional<? extends String>*             | :heavy_minus_sign:                       | N/A                                      | My authentication                        |
| `authUrl`                                | *String*                                 | :heavy_check_mark:                       | N/A                                      | https://yourprovider.com/oauth/authorize |
| `apiUrl`                                 | *String*                                 | :heavy_check_mark:                       | N/A                                      | https://yourprovider.com/api             |
| `autoLogin`                              | *Optional<? extends Boolean>*            | :heavy_minus_sign:                       | N/A                                      | false                                    |
| `clientId`                               | *String*                                 | :heavy_check_mark:                       | N/A                                      | b1ba0bf54a4c2c0a1c29                     |
| `clientSecret`                           | *String*                                 | :heavy_check_mark:                       | N/A                                      | bfa6gea4f129076761dcba8ce5e1e406bd83af7b |
| `allowSignUp`                            | *Optional<? extends Boolean>*            | :heavy_minus_sign:                       | N/A                                      | false                                    |