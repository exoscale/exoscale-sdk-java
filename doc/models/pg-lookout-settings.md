
# PG Lookout Settings

## Structure

`PGLookoutSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MaxFailoverReplicationTimeLag` | `Integer` | Optional | Number of seconds of master unavailability before triggering database failover to standby<br>**Default**: `60`<br>**Constraints**: `>= 10`, `<= 9.223372036854776E+18` | Integer getMaxFailoverReplicationTimeLag() | setMaxFailoverReplicationTimeLag(Integer maxFailoverReplicationTimeLag) |

## Example (as JSON)

```json
{
  "max_failover_replication_time_lag": 60
}
```

