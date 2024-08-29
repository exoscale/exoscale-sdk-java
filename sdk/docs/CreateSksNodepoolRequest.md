

# CreateSksNodepoolRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antiAffinityGroups** | [**Set&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Nodepool Anti-affinity Groups |  [optional] |
|**description** | **String** | Nodepool description |  [optional] |
|**publicIpAssignment** | [**PublicIpAssignmentEnum**](#PublicIpAssignmentEnum) | Configures public IP assignment of the Instances with:  * IPv4 (&#x60;inet4&#x60;) addressing only (default); * both IPv4 and IPv6 (&#x60;dual&#x60;) addressing. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**taints** | [**Map&lt;String, SksNodepoolTaint&gt;**](SksNodepoolTaint.md) |  |  [optional] |
|**securityGroups** | [**Set&lt;SecurityGroup&gt;**](SecurityGroup.md) | Nodepool Security Groups |  [optional] |
|**name** | **String** | Nodepool name, lowercase only |  |
|**instanceType** | [**InstanceType**](InstanceType.md) |  |  |
|**privateNetworks** | [**Set&lt;PrivateNetwork&gt;**](PrivateNetwork.md) | Nodepool Private Networks |  [optional] |
|**size** | **Long** | Number of instances |  |
|**kubeletImageGc** | [**KubeletImageGc**](KubeletImageGc.md) |  |  [optional] |
|**instancePrefix** | **String** | Prefix to apply to instances names (default: pool), lowercase only |  [optional] |
|**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional] |
|**addons** | [**Set&lt;AddonsEnum&gt;**](#Set&lt;AddonsEnum&gt;) | Nodepool addons |  [optional] |
|**diskSize** | **Long** | Nodepool instances disk size in GiB |  |



## Enum: PublicIpAssignmentEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| DUAL | &quot;dual&quot; |



## Enum: Set&lt;AddonsEnum&gt;

| Name | Value |
|---- | -----|
| STORAGE_LVM | &quot;storage-lvm&quot; |



