# SksCluster

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Cluster description |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**cni** | [**CniEnum**](#CniEnum) | Cluster CNI |  [optional]
**autoUpgrade** | **Boolean** | Enable auto upgrade of the control plane to the latest patch version available |  [optional]
**name** | **String** | Cluster name |  [optional]
**state** | [**StateEnum**](#StateEnum) | Cluster state |  [optional]
**nodepools** | [**List&lt;SksNodepool&gt;**](SksNodepool.md) | Cluster Nodepools |  [optional]
**level** | [**LevelEnum**](#LevelEnum) | Cluster level |  [optional]
**addons** | [**List&lt;AddonsEnum&gt;**](#List&lt;AddonsEnum&gt;) | Cluster addons |  [optional]
**id** | [**UUID**](UUID.md) | Cluster ID |  [optional]
**version** | **String** | Control plane Kubernetes version |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Cluster creation date |  [optional]
**endpoint** | **String** | Cluster endpoint |  [optional]

<a name="CniEnum"></a>
## Enum: CniEnum
Name | Value
---- | -----
CALICO | &quot;calico&quot;
CILIUM | &quot;cilium&quot;

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ROTATING_CCM_CREDENTIALS | &quot;rotating-ccm-credentials&quot;
CREATING | &quot;creating&quot;
UPGRADING | &quot;upgrading&quot;
DELETING | &quot;deleting&quot;
RUNNING | &quot;running&quot;
SUSPENDING | &quot;suspending&quot;
UPDATING | &quot;updating&quot;
ERROR | &quot;error&quot;

<a name="LevelEnum"></a>
## Enum: LevelEnum
Name | Value
---- | -----
STARTER | &quot;starter&quot;
PRO | &quot;pro&quot;

<a name="List<AddonsEnum>"></a>
## Enum: List&lt;AddonsEnum&gt;
Name | Value
---- | -----
EXOSCALE_CLOUD_CONTROLLER | &quot;exoscale-cloud-controller&quot;
EXOSCALE_CONTAINER_STORAGE_INTERFACE | &quot;exoscale-container-storage-interface&quot;
METRICS_SERVER | &quot;metrics-server&quot;
