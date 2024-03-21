# SksclusterBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Cluster description |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**cni** | [**CniEnum**](#CniEnum) | Cluster CNI |  [optional]
**autoUpgrade** | **Boolean** | Enable auto upgrade of the control plane to the latest patch version available |  [optional]
**oidc** | [**SksOidc**](SksOidc.md) |  |  [optional]
**name** | **String** | Cluster name | 
**level** | [**LevelEnum**](#LevelEnum) | Cluster service level | 
**addons** | [**List&lt;AddonsEnum&gt;**](#List&lt;AddonsEnum&gt;) | Cluster addons |  [optional]
**version** | **String** | Control plane Kubernetes version | 

<a name="CniEnum"></a>
## Enum: CniEnum
Name | Value
---- | -----
CALICO | &quot;calico&quot;
CILIUM | &quot;cilium&quot;

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
