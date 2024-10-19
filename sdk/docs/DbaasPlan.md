

# DbaasPlan

DBaaS plan

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodeCount** | **Long** | DBaaS plan node count |  [optional] [readonly] |
|**backupConfig** | [**DbaasBackupConfig**](DbaasBackupConfig.md) |  |  [optional] |
|**nodeCpuCount** | **Long** | DBaaS plan CPU count per node |  [optional] [readonly] |
|**family** | **String** | Instance family subset which the service can use |  [optional] |
|**diskSpace** | **Long** | DBaaS plan disk space |  [optional] [readonly] |
|**authorized** | **Boolean** | Requires authorization or publicly available |  [optional] [readonly] |
|**name** | **String** | DBaaS plan name |  [optional] [readonly] |
|**maxMemoryPercent** | **Long** | DBaaS plan max memory allocated percentage |  [optional] [readonly] |
|**zones** | **List&lt;String&gt;** | Zones where the plan is available |  [optional] |
|**nodeMemory** | **Long** | DBaaS plan memory count per node |  [optional] [readonly] |



