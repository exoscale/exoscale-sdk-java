

# UpdateSksClusterRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Cluster description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**autoUpgrade** | **Boolean** | Enable auto upgrade of the control plane to the latest patch version available |  [optional] |
|**oidc** | [**SksOidc**](SksOidc.md) |  |  [optional] |
|**name** | **String** | Cluster name |  [optional] |
|**enableOperatorsCa** | **Boolean** | Add or remove the operators certificate authority (CA) from the list of trusted CAs of the api server. The default value is true |  [optional] |
|**featureGates** | **Set&lt;String&gt;** | A list of Kubernetes-only Alpha features to enable for API server component |  [optional] |
|**addons** | [**Set&lt;AddonsEnum&gt;**](#Set&lt;AddonsEnum&gt;) | Cluster addons |  [optional] |
|**audit** | [**SksAuditUpdate**](SksAuditUpdate.md) |  |  [optional] |



## Enum: Set&lt;AddonsEnum&gt;

| Name | Value |
|---- | -----|
| EXOSCALE_CLOUD_CONTROLLER | &quot;exoscale-cloud-controller&quot; |
| EXOSCALE_CONTAINER_STORAGE_INTERFACE | &quot;exoscale-container-storage-interface&quot; |
| METRICS_SERVER | &quot;metrics-server&quot; |



