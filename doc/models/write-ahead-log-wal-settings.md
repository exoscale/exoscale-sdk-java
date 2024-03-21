
# Write Ahead Log WAL Settings

## Structure

`WriteAheadLogWALSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WalWriterDelay` | `Integer` | Optional | WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance<br>**Constraints**: `>= 10`, `<= 200` | Integer getWalWriterDelay() | setWalWriterDelay(Integer walWriterDelay) |
| `WalSenderTimeout` | [`WriteAheadLogWALSettingsWalSenderTimeout`](../../doc/models/containers/write-ahead-log-wal-settings-wal-sender-timeout.md) | Optional | This is a container for any-of cases. | WriteAheadLogWALSettingsWalSenderTimeout getWalSenderTimeout() | setWalSenderTimeout(WriteAheadLogWALSettingsWalSenderTimeout walSenderTimeout) |
| `MaxWalSenders` | `Integer` | Optional | PostgreSQL maximum WAL senders<br>**Constraints**: `>= 20`, `<= 64` | Integer getMaxWalSenders() | setMaxWalSenders(Integer maxWalSenders) |
| `MaxSlotWalKeepSize` | `Integer` | Optional | PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this.<br>**Constraints**: `>= -1`, `<= 2147483647` | Integer getMaxSlotWalKeepSize() | setMaxSlotWalKeepSize(Integer maxSlotWalKeepSize) |

## Example (as JSON)

```json
{
  "wal_writer_delay": 50,
  "wal_sender_timeout": 60000,
  "max_wal_senders": 62,
  "max_slot_wal_keep_size": 162
}
```

