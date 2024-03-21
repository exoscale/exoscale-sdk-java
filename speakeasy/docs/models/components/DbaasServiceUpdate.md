# DbaasServiceUpdate

Update waiting to be installed


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `description`                                                                             | *Optional<? extends String>*                                                              | :heavy_minus_sign:                                                                        | Description of the update                                                                 |
| `deadline`                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | Deadline for installing the update                                                        |
| `startAfter`                                                                              | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | The earliest time the update will be automatically applied                                |
| `startAt`                                                                                 | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | The time when the update will be automatically applied                                    |