

# AutovacuumSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logAutovacuumMinDuration** | **Integer** | Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one disables logging autovacuum actions. The default is &#x60;1000&#x60;. |  [optional] |
|**autovacuumVacuumCostLimit** | **Integer** | Specifies the cost limit value that will be used in automatic VACUUM operations. If &#x60;-1&#x60; is specified, the regular vacuum_cost_limit value will be used. The default is &#x60;-1&#x60; (upstream default). |  [optional] |
|**autovacuumMaxWorkers** | **Integer** | Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is &#x60;3&#x60;. Changing this parameter causes a service restart. |  [optional] |
|**autovacuumVacuumThreshold** | **Integer** | Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is &#x60;50&#x60;. |  [optional] |
|**autovacuumNaptime** | **Integer** | Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds. The default is &#x60;60&#x60;. |  [optional] |
|**autovacuumVacuumScaleFactor** | **BigDecimal** | Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM (e.g. &#x60;0.2&#x60; for 20% of the table size). The default is &#x60;0.2&#x60;. |  [optional] |
|**autovacuumVacuumCostDelay** | **Integer** | Specifies the cost delay value that will be used in automatic VACUUM operations. If &#x60;-1&#x60; is specified, the regular vacuum_cost_delay value will be used. The default is &#x60;2&#x60; (upstream default). |  [optional] |
|**autovacuumAnalyzeScaleFactor** | **BigDecimal** | Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE (e.g. &#x60;0.2&#x60; for 20% of the table size). The default is &#x60;0.2&#x60;. |  [optional] |
|**autovacuumAnalyzeThreshold** | **Integer** | Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an ANALYZE in any one table. The default is &#x60;50&#x60;. |  [optional] |
|**autovacuumFreezeMaxAge** | **Integer** | Specifies the maximum age (in transactions) that a table&#39;s pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. The system launches autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. Changing this parameter causes a service restart. |  [optional] |



