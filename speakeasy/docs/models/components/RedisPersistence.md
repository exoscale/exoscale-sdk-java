# RedisPersistence

When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.


## Values

| Name  | Value |
| ----- | ----- |
| `OFF` | off   |
| `RDB` | rdb   |