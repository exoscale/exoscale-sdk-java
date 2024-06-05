

# CreateDbaasServiceOpensearchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxIndexCount** | **Long** | Maximum number of indexes to keep before deleting the oldest one |  [optional] |
|**keepIndexRefreshInterval** | **Boolean** | Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn&#39;t fit your case, you can disable this by setting up this flag to true. |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39; |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**forkFromService** | **String** |  |  [optional] |
|**indexPatterns** | [**List&lt;UpdateDbaasServiceOpensearchRequestIndexPatternsInner&gt;**](UpdateDbaasServiceOpensearchRequestIndexPatternsInner.md) | Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like &#39;logs.?&#39; and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note &#39;logs.?&#39; does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored. |  [optional] |
|**maintenance** | [**UpdateDbaasServiceMysqlRequestMaintenance**](UpdateDbaasServiceMysqlRequestMaintenance.md) |  |  [optional] |
|**indexTemplate** | [**UpdateDbaasServiceOpensearchRequestIndexTemplate**](UpdateDbaasServiceOpensearchRequestIndexTemplate.md) |  |  [optional] |
|**opensearchSettings** | [**JsonSchemaOpensearch**](JsonSchemaOpensearch.md) |  |  [optional] |
|**version** | **String** | OpenSearch major version |  [optional] |
|**recoveryBackupName** | **String** | Name of a backup to recover from for services that support backup names |  [optional] |
|**plan** | **String** | Subscription plan |  |
|**opensearchDashboards** | [**UpdateDbaasServiceOpensearchRequestOpensearchDashboards**](UpdateDbaasServiceOpensearchRequestOpensearchDashboards.md) |  |  [optional] |



