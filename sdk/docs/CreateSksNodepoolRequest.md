

# CreateSksNodepoolRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antiAffinityGroups** | [**Set&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Nodepool Anti-affinity Groups |  [optional] |
|**description** | **String** | Nodepool description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**taints** | [**Map&lt;String, SksNodepoolTaint&gt;**](SksNodepoolTaint.md) |  |  [optional] |
|**securityGroups** | [**Set&lt;SecurityGroup&gt;**](SecurityGroup.md) | Nodepool Security Groups |  [optional] |
|**name** | **String** | Nodepool name |  |
|**instanceType** | [**InstanceType**](InstanceType.md) |  |  |
|**privateNetworks** | [**Set&lt;PrivateNetwork&gt;**](PrivateNetwork.md) | Nodepool Private Networks |  [optional] |
|**size** | **Long** | Number of instances |  |
|**kubeletImageGc** | [**KubeletImageGc**](KubeletImageGc.md) |  |  [optional] |
|**instancePrefix** | **String** | Prefix to apply to instances names (default: pool) |  [optional] |
|**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional] |
|**addons** | [**Set&lt;AddonsEnum&gt;**](#Set&lt;AddonsEnum&gt;) | Nodepool addons |  [optional] |
|**diskSize** | **Long** | Nodepool instances disk size in GiB |  |



## Enum: Set&lt;AddonsEnum&gt;

| Name | Value |
|---- | -----|
| STORAGE_LVM | &quot;storage-lvm&quot; |



