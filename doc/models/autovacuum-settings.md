
# Autovacuum Settings

## Structure

`AutovacuumSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LogAutovacuumMinDuration` | `Integer` | Optional | Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.<br>**Constraints**: `>= -1`, `<= 2147483647` | Integer getLogAutovacuumMinDuration() | setLogAutovacuumMinDuration(Integer logAutovacuumMinDuration) |
| `AutovacuumVacuumCostLimit` | `Integer` | Optional | Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.<br>**Constraints**: `>= -1`, `<= 10000` | Integer getAutovacuumVacuumCostLimit() | setAutovacuumVacuumCostLimit(Integer autovacuumVacuumCostLimit) |
| `AutovacuumMaxWorkers` | `Integer` | Optional | Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.<br>**Constraints**: `>= 1`, `<= 20` | Integer getAutovacuumMaxWorkers() | setAutovacuumMaxWorkers(Integer autovacuumMaxWorkers) |
| `AutovacuumVacuumThreshold` | `Integer` | Optional | Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples<br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getAutovacuumVacuumThreshold() | setAutovacuumVacuumThreshold(Integer autovacuumVacuumThreshold) |
| `AutovacuumNaptime` | `Integer` | Optional | Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds, and the default is one minute<br>**Constraints**: `>= 1`, `<= 86400` | Integer getAutovacuumNaptime() | setAutovacuumNaptime(Integer autovacuumNaptime) |
| `AutovacuumVacuumScaleFactor` | `Double` | Optional | Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size)<br>**Constraints**: `>= 0`, `<= 1` | Double getAutovacuumVacuumScaleFactor() | setAutovacuumVacuumScaleFactor(Double autovacuumVacuumScaleFactor) |
| `AutovacuumVacuumCostDelay` | `Integer` | Optional | Specifies the cost delay value that will be used in automatic VACUUM operations. If -1 is specified, the regular vacuum_cost_delay value will be used. The default value is 20 milliseconds<br>**Constraints**: `>= -1`, `<= 100` | Integer getAutovacuumVacuumCostDelay() | setAutovacuumVacuumCostDelay(Integer autovacuumVacuumCostDelay) |
| `AutovacuumAnalyzeScaleFactor` | `Double` | Optional | Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size)<br>**Constraints**: `>= 0`, `<= 1` | Double getAutovacuumAnalyzeScaleFactor() | setAutovacuumAnalyzeScaleFactor(Double autovacuumAnalyzeScaleFactor) |
| `AutovacuumAnalyzeThreshold` | `Integer` | Optional | Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an  ANALYZE in any one table. The default is 50 tuples.<br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getAutovacuumAnalyzeThreshold() | setAutovacuumAnalyzeThreshold(Integer autovacuumAnalyzeThreshold) |
| `AutovacuumFreezeMaxAge` | `Integer` | Optional | Specifies the maximum age (in transactions) that a table's pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.<br>**Constraints**: `>= 200000000`, `<= 1500000000` | Integer getAutovacuumFreezeMaxAge() | setAutovacuumFreezeMaxAge(Integer autovacuumFreezeMaxAge) |

## Example (as JSON)

```json
{
  "autovacuum_freeze_max_age": 200000000,
  "log_autovacuum_min_duration": 48,
  "autovacuum_vacuum_cost_limit": 44,
  "autovacuum_max_workers": 46,
  "autovacuum_vacuum_threshold": 220,
  "autovacuum_naptime": 230
}
```

