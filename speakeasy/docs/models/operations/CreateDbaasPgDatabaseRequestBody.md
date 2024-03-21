# CreateDbaasPgDatabaseRequestBody


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `databaseName`                                                      | *String*                                                            | :heavy_check_mark:                                                  | N/A                                                                 |
| `lcCollate`                                                         | *Optional<? extends String>*                                        | :heavy_minus_sign:                                                  | Default string sort order (LC_COLLATE) for PostgreSQL database      |
| `lcCtype`                                                           | *Optional<? extends String>*                                        | :heavy_minus_sign:                                                  | Default character classification (LC_CTYPE) for PostgreSQL database |