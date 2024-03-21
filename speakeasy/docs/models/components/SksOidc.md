# SksOidc

SKS Cluster OpenID config map


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `clientId`                                                      | *String*                                                        | :heavy_check_mark:                                              | OpenID client ID                                                |
| `issuerUrl`                                                     | *String*                                                        | :heavy_check_mark:                                              | OpenID provider URL                                             |
| `usernameClaim`                                                 | *Optional<? extends String>*                                    | :heavy_minus_sign:                                              | JWT claim to use as the user name                               |
| `usernamePrefix`                                                | *Optional<? extends String>*                                    | :heavy_minus_sign:                                              | Prefix prepended to username claims                             |
| `groupsClaim`                                                   | *Optional<? extends String>*                                    | :heavy_minus_sign:                                              | JWT claim to use as the user's group                            |
| `groupsPrefix`                                                  | *Optional<? extends String>*                                    | :heavy_minus_sign:                                              | Prefix prepended to group claims                                |
| `requiredClaim`                                                 | Map<String, *String*>                                           | :heavy_minus_sign:                                              | A key value map that describes a required claim in the ID Token |