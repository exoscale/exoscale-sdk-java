

# AutovacuumSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logAutovacuumMinDuration** | **Integer** | Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions. |  [optional] |
|**autovacuumVacuumCostLimit** | **Integer** | Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used. |  [optional] |
|**autovacuumMaxWorkers** | **Integer** | Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start. |  [optional] |
|**autovacuumVacuumThreshold** | **Integer** | Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples |  [optional] |
|**autovacuumNaptime** | **Integer** | Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds, and the default is one minute |  [optional] |
|**autovacuumVacuumScaleFactor** | **BigDecimal** | Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size) |  [optional] |
|**autovacuumVacuumCostDelay** | **Integer** | Specifies the cost delay value that will be used in automatic VACUUM operations. If -1 is specified, the regular vacuum_cost_delay value will be used. The default value is 20 milliseconds |  [optional] |
|**autovacuumAnalyzeScaleFactor** | **BigDecimal** | Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size) |  [optional] |
|**autovacuumAnalyzeThreshold** | **Integer** | Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an  ANALYZE in any one table. The default is 50 tuples. |  [optional] |
|**autovacuumFreezeMaxAge** | **Integer** | Specifies the maximum age (in transactions) that a table&#39;s pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted. |  [optional] |



