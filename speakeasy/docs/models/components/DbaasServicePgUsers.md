# DbaasServicePgUsers

List of service users


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `type`                                                                  | *String*                                                                | :heavy_check_mark:                                                      | Account type                                                            |
| `username`                                                              | *String*                                                                | :heavy_check_mark:                                                      | Account username                                                        |
| `password`                                                              | *Optional<? extends String>*                                            | :heavy_minus_sign:                                                      | Account password. A missing field indicates a user overridden password. |
| `allowReplication`                                                      | *Optional<? extends Boolean>*                                           | :heavy_minus_sign:                                                      | N/A                                                                     |