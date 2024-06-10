

# UpdateSksClusterRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Cluster name |  [optional] |
|**description** | **String** | Cluster description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**oidc** | [**SksOidc**](SksOidc.md) |  |  [optional] |
|**autoUpgrade** | **Boolean** | Enable auto upgrade of the control plane to the latest patch version available |  [optional] |
|**addons** | [**Set&lt;AddonsEnum&gt;**](#Set&lt;AddonsEnum&gt;) | Cluster addons |  [optional] |



## Enum: Set&lt;AddonsEnum&gt;

| Name | Value |
|---- | -----|
| EXOSCALE_CLOUD_CONTROLLER | &quot;exoscale-cloud-controller&quot; |
| EXOSCALE_CONTAINER_STORAGE_INTERFACE | &quot;exoscale-container-storage-interface&quot; |
| METRICS_SERVER | &quot;metrics-server&quot; |



