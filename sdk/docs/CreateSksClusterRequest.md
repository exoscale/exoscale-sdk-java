

# CreateSksClusterRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Cluster description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**cni** | [**CniEnum**](#CniEnum) | Cluster CNI |  [optional] |
|**autoUpgrade** | **Boolean** | Enable auto upgrade of the control plane to the latest patch version available |  [optional] |
|**networking** | [**Networking**](Networking.md) |  |  [optional] |
|**oidc** | [**SksOidc**](SksOidc.md) |  |  [optional] |
|**name** | **String** | Cluster name |  |
|**enableKubeProxy** | **Boolean** | Indicates whether to deploy the Kubernetes network proxy. When unspecified, defaults to &#x60;true&#x60; unless Cilium CNI is selected |  [optional] |
|**level** | [**LevelEnum**](#LevelEnum) | Cluster service level |  |
|**featureGates** | **Set&lt;String&gt;** | A list of Kubernetes-only Alpha features to enable for API server component |  [optional] |
|**addons** | [**Set&lt;AddonsEnum&gt;**](#Set&lt;AddonsEnum&gt;) | Cluster addons |  [optional] |
|**version** | **String** | Control plane Kubernetes version |  |



## Enum: CniEnum

| Name | Value |
|---- | -----|
| CALICO | &quot;calico&quot; |
| CILIUM | &quot;cilium&quot; |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| STARTER | &quot;starter&quot; |
| PRO | &quot;pro&quot; |



## Enum: Set&lt;AddonsEnum&gt;

| Name | Value |
|---- | -----|
| EXOSCALE_CLOUD_CONTROLLER | &quot;exoscale-cloud-controller&quot; |
| EXOSCALE_CONTAINER_STORAGE_INTERFACE | &quot;exoscale-container-storage-interface&quot; |
| METRICS_SERVER | &quot;metrics-server&quot; |



