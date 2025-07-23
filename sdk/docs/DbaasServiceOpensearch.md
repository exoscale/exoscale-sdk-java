

# DbaasServiceOpensearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | DbaaS service description |  [optional] |
|**maxIndexCount** | **Long** | Maximum number of indexes to keep before deleting the oldest one |  [optional] |
|**updatedAt** | **OffsetDateTime** | Service last update timestamp (ISO 8601) |  [optional] |
|**nodeCount** | **Long** | Number of service nodes in the active plan |  [optional] |
|**connectionInfo** | [**DbaasServiceOpensearchConnectionInfo**](DbaasServiceOpensearchConnectionInfo.md) |  |  [optional] |
|**nodeCpuCount** | **Long** | Number of CPUs for each node |  [optional] |
|**prometheusUri** | [**DbaasServiceMysqlPrometheusUri**](DbaasServiceMysqlPrometheusUri.md) |  |  |
|**integrations** | [**List&lt;DbaasIntegration&gt;**](DbaasIntegration.md) | Service integrations |  [optional] |
|**zone** | **String** | The zone where the service is running |  [optional] |
|**nodeStates** | [**List&lt;DbaasNodeState&gt;**](DbaasNodeState.md) | State of individual service nodes |  [optional] |
|**name** | **String** |  |  |
|**keepIndexRefreshInterval** | **Boolean** | Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn&#39;t fit your case, you can disable this by setting up this flag to true. |  [optional] |
|**type** | **String** |  |  |
|**state** | **EnumServiceState** |  |  [optional] |
|**ipFilter** | **List&lt;String&gt;** | Allowed CIDR address blocks for incoming connections |  [optional] |
|**backups** | [**List&lt;DbaasServiceBackup&gt;**](DbaasServiceBackup.md) | List of backups for the service |  [optional] |
|**terminationProtection** | **Boolean** | Service is protected against termination and powering off |  [optional] |
|**notifications** | [**List&lt;DbaasServiceNotification&gt;**](DbaasServiceNotification.md) | Service notifications |  [optional] |
|**components** | [**List&lt;DbaasServiceMysqlComponentsInner&gt;**](DbaasServiceMysqlComponentsInner.md) | Service component information objects |  [optional] |
|**indexPatterns** | [**List&lt;UpdateDbaasServiceOpensearchRequestIndexPatternsInner&gt;**](UpdateDbaasServiceOpensearchRequestIndexPatternsInner.md) | Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like &#39;logs.?&#39; and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note &#39;logs.?&#39; does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored. |  [optional] |
|**maintenance** | [**DbaasServiceMaintenance**](DbaasServiceMaintenance.md) |  |  [optional] |
|**indexTemplate** | [**DbaasServiceOpensearchIndexTemplate**](DbaasServiceOpensearchIndexTemplate.md) |  |  [optional] |
|**diskSize** | **Long** | TODO UNIT disk space for data storage |  [optional] |
|**nodeMemory** | **Long** | TODO UNIT of memory for each node |  [optional] |
|**uri** | **String** | URI for connecting to the service (may be absent) |  [optional] |
|**opensearchSettings** | [**JsonSchemaOpensearch**](JsonSchemaOpensearch.md) |  |  [optional] |
|**uriParams** | **Object** | service_uri parameterized into key-value pairs |  [optional] |
|**version** | **String** | OpenSearch version |  [optional] |
|**createdAt** | **OffsetDateTime** | Service creation timestamp (ISO 8601) |  [optional] |
|**plan** | **String** | Subscription plan |  |
|**opensearchDashboards** | [**UpdateDbaasServiceOpensearchRequestOpensearchDashboards**](UpdateDbaasServiceOpensearchRequestOpensearchDashboards.md) |  |  [optional] |
|**users** | [**List&lt;DbaasServiceGrafanaUsersInner&gt;**](DbaasServiceGrafanaUsersInner.md) | List of service users |  [optional] |



