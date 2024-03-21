# SksNodepool

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**antiAffinityGroups** | [**List&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Nodepool Anti-affinity Groups |  [optional]
**description** | **String** | Nodepool description |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**taints** | [**SksNodepoolTaints**](SksNodepoolTaints.md) |  |  [optional]
**securityGroups** | [**List&lt;SecurityGroup&gt;**](SecurityGroup.md) | Nodepool Security Groups |  [optional]
**name** | **String** | Nodepool name |  [optional]
**instanceType** | [**InstanceType**](InstanceType.md) |  |  [optional]
**privateNetworks** | [**List&lt;PrivateNetwork&gt;**](PrivateNetwork.md) | Nodepool Private Networks |  [optional]
**template** | [**Template**](Template.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | Nodepool state |  [optional]
**size** | **Long** | Number of instances |  [optional]
**kubeletImageGc** | [**KubeletImageGc**](KubeletImageGc.md) |  |  [optional]
**instancePool** | [**InstancePool**](InstancePool.md) |  |  [optional]
**instancePrefix** | **String** | The instances created by the Nodepool will be prefixed with this value (default: pool) |  [optional]
**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional]
**addons** | [**List&lt;AddonsEnum&gt;**](#List&lt;AddonsEnum&gt;) | Nodepool addons |  [optional]
**id** | [**UUID**](UUID.md) | Nodepool ID |  [optional]
**diskSize** | **Long** | Nodepool instances disk size in GB |  [optional]
**version** | **String** | Nodepool version |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Nodepool creation date |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RENEWING_TOKEN | &quot;renewing-token&quot;
CREATING | &quot;creating&quot;
DELETING | &quot;deleting&quot;
RUNNING | &quot;running&quot;
SCALING | &quot;scaling&quot;
UPDATING | &quot;updating&quot;
ERROR | &quot;error&quot;

<a name="List<AddonsEnum>"></a>
## Enum: List&lt;AddonsEnum&gt;
Name | Value
---- | -----
STORAGE_LVM | &quot;storage-lvm&quot;
