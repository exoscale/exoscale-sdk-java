# CreatePrivateNetworkRequestBody


## Fields

| Field                            | Type                             | Required                         | Description                      |
| -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- |
| `name`                           | *String*                         | :heavy_check_mark:               | Private Network name             |
| `description`                    | *Optional<? extends String>*     | :heavy_minus_sign:               | Private Network description      |
| `netmask`                        | *Optional<? extends String>*     | :heavy_minus_sign:               | Private Network netmask          |
| `startIp`                        | *Optional<? extends String>*     | :heavy_minus_sign:               | Private Network start IP address |
| `endIp`                          | *Optional<? extends String>*     | :heavy_minus_sign:               | Private Network end IP address   |
| `labels`                         | Map<String, *String*>            | :heavy_minus_sign:               | N/A                              |