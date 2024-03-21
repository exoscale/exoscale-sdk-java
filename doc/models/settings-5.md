
# Settings 5

## Structure

`Settings5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Pg` | [`Pg`](../../doc/models/pg.md) | Optional | postgresql.conf configuration values | Pg getPg() | setPg(Pg pg) |
| `Pglookout` | [`Pglookout`](../../doc/models/pglookout.md) | Optional | PGLookout settings | Pglookout getPglookout() | setPglookout(Pglookout pglookout) |
| `Pgbouncer` | [`Pgbouncer`](../../doc/models/pgbouncer.md) | Optional | PGBouncer connection pooling settings | Pgbouncer getPgbouncer() | setPgbouncer(Pgbouncer pgbouncer) |
| `Timescaledb` | [`Timescaledb`](../../doc/models/timescaledb.md) | Optional | TimescaleDB extension configuration values | Timescaledb getTimescaledb() | setTimescaledb(Timescaledb timescaledb) |

## Example (as JSON)

```json
{
  "pg": {
    "properties": {
      "key1": "val1",
      "key2": "val2"
    },
    "additionalProperties": false,
    "type": "type2",
    "title": "title4"
  },
  "pglookout": {
    "properties": {
      "key1": "val1",
      "key2": "val2"
    },
    "additionalProperties": false,
    "type": "type4",
    "title": "title8"
  },
  "pgbouncer": {
    "properties": {
      "key1": "val1",
      "key2": "val2"
    },
    "additionalProperties": false,
    "type": "type0",
    "title": "title6"
  },
  "timescaledb": {
    "properties": {
      "key1": "val1",
      "key2": "val2"
    },
    "additionalProperties": false,
    "type": "type8",
    "title": "title2"
  }
}
```

