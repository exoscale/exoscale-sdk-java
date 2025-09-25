

# SksCluster

SKS Cluster

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Cluster description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**cni** | [**CniEnum**](#CniEnum) | Cluster CNI |  [optional] |
|**autoUpgrade** | **Boolean** | Enable auto upgrade of the control plane to the latest patch version available |  [optional] |
|**name** | **String** | Cluster name |  [optional] |
|**enableOperatorsCa** | **Boolean** | Indicates whether to add operators certificate authority (CA) as part of trusted CAs for the API server. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Cluster state |  [optional] [readonly] |
|**enableKubeProxy** | **Boolean** | Indicates whether to deploy the Kubernetes network proxy. |  [optional] |
|**nodepools** | [**List&lt;SksNodepool&gt;**](SksNodepool.md) | Cluster Nodepools |  [optional] [readonly] |
|**level** | [**LevelEnum**](#LevelEnum) | Cluster level |  [optional] |
|**featureGates** | **Set&lt;String&gt;** | A list of Kubernetes-only Alpha features to enable for API server component |  [optional] |
|**addons** | [**Set&lt;AddonsEnum&gt;**](#Set&lt;AddonsEnum&gt;) |  |  [optional] |
|**id** | **UUID** | Cluster ID |  [optional] [readonly] |
|**audit** | [**SksAudit**](SksAudit.md) |  |  [optional] |
|**version** | **String** | Control plane Kubernetes version |  [optional] |
|**createdAt** | **OffsetDateTime** | Cluster creation date |  [optional] [readonly] |
|**endpoint** | **String** | Cluster endpoint |  [optional] [readonly] |



## Enum: CniEnum

| Name | Value |
|---- | -----|
| CALICO | &quot;calico&quot; |
| CILIUM | &quot;cilium&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ROTATING_CSI_CREDENTIALS | &quot;rotating-csi-credentials&quot; |
| ROTATING_CCM_CREDENTIALS | &quot;rotating-ccm-credentials&quot; |
| CREATING | &quot;creating&quot; |
| UPGRADING | &quot;upgrading&quot; |
| DELETING | &quot;deleting&quot; |
| RUNNING | &quot;running&quot; |
| SUSPENDING | &quot;suspending&quot; |
| UPDATING | &quot;updating&quot; |
| ERROR | &quot;error&quot; |
| ROTATING_KARPENTER_CREDENTIALS | &quot;rotating-karpenter-credentials&quot; |
| RESUMING | &quot;resuming&quot; |



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
| KARPENTER | &quot;karpenter&quot; |



