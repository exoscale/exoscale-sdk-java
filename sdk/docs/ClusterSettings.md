

# ClusterSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clusterFilecacheRemoteDataRatio** | **BigDecimal** | Defines a limit of how much total remote data can be referenced as a ratio of the size of the disk reserved for the file cache. This is designed to be a safeguard to prevent oversubscribing a cluster. Defaults to 0. |  [optional] |
|**clusterRemoteStore** | [**ClusterSettingsClusterRemoteStore**](ClusterSettingsClusterRemoteStore.md) |  |  [optional] |
|**clusterRoutingAllocationBalancePreferPrimary** | **Boolean** | When set to true, OpenSearch attempts to evenly distribute the primary shards between the cluster nodes. Enabling this setting does not always guarantee an equal number of primary shards on each node, especially in the event of a failover. Changing this setting to false after it was set to true does not invoke redistribution of primary shards. Default is false. |  [optional] |
|**clusterSearchRequestSlowlog** | [**ClusterSettingsClusterSearchRequestSlowlog**](ClusterSettingsClusterSearchRequestSlowlog.md) |  |  [optional] |



