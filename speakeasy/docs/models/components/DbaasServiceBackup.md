# DbaasServiceBackup

List of backups for the service


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `backupName`                                                                              | *String*                                                                                  | :heavy_check_mark:                                                                        | Internal name of this backup                                                              |
| `backupTime`                                                                              | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | Backup timestamp (ISO 8601)                                                               |
| `dataSize`                                                                                | *long*                                                                                    | :heavy_check_mark:                                                                        | Backup's original size before compression                                                 |