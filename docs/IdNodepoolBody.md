# IdNodepoolBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**antiAffinityGroups** | [**List&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Nodepool Anti-affinity Groups |  [optional]
**description** | **String** | Nodepool description |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**taints** | [**SksNodepoolTaints**](SksNodepoolTaints.md) |  |  [optional]
**securityGroups** | [**List&lt;SecurityGroup&gt;**](SecurityGroup.md) | Nodepool Security Groups |  [optional]
**name** | **String** | Nodepool name | 
**instanceType** | [**InstanceType**](InstanceType.md) |  | 
**privateNetworks** | [**List&lt;PrivateNetwork&gt;**](PrivateNetwork.md) | Nodepool Private Networks |  [optional]
**size** | **Long** | Number of instances | 
**kubeletImageGc** | [**KubeletImageGc**](KubeletImageGc.md) |  |  [optional]
**instancePrefix** | **String** | Prefix to apply to instances names (default: pool) |  [optional]
**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional]
**addons** | [**List&lt;AddonsEnum&gt;**](#List&lt;AddonsEnum&gt;) | Nodepool addons |  [optional]
**diskSize** | **Long** | Nodepool instances disk size in GB | 

<a name="List<AddonsEnum>"></a>
## Enum: List&lt;AddonsEnum&gt;
Name | Value
---- | -----
STORAGE_LVM | &quot;storage-lvm&quot;
