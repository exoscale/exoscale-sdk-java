

# SksNodepool

SKS Nodepool

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antiAffinityGroups** | [**List&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Nodepool Anti-affinity Groups |  [optional] |
|**description** | **String** | Nodepool description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**taints** | [**Map&lt;String, SksNodepoolTaint&gt;**](SksNodepoolTaint.md) |  |  [optional] |
|**securityGroups** | [**List&lt;SecurityGroup&gt;**](SecurityGroup.md) | Nodepool Security Groups |  [optional] |
|**name** | **String** | Nodepool name |  [optional] |
|**instanceType** | [**InstanceType**](InstanceType.md) |  |  [optional] |
|**privateNetworks** | [**List&lt;PrivateNetwork&gt;**](PrivateNetwork.md) | Nodepool Private Networks |  [optional] |
|**template** | [**Template**](Template.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Nodepool state |  [optional] [readonly] |
|**size** | **Long** | Number of instances |  [optional] |
|**kubeletImageGc** | [**KubeletImageGc**](KubeletImageGc.md) |  |  [optional] |
|**instancePool** | [**InstancePool**](InstancePool.md) |  |  [optional] |
|**instancePrefix** | **String** | The instances created by the Nodepool will be prefixed with this value (default: pool) |  [optional] |
|**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional] |
|**addons** | [**Set&lt;AddonsEnum&gt;**](#Set&lt;AddonsEnum&gt;) | Nodepool addons |  [optional] |
|**id** | **UUID** | Nodepool ID |  [optional] [readonly] |
|**diskSize** | **Long** | Nodepool instances disk size in GiB |  [optional] |
|**version** | **String** | Nodepool version |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Nodepool creation date |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| RENEWING_TOKEN | &quot;renewing-token&quot; |
| CREATING | &quot;creating&quot; |
| DELETING | &quot;deleting&quot; |
| RUNNING | &quot;running&quot; |
| SCALING | &quot;scaling&quot; |
| UPDATING | &quot;updating&quot; |
| ERROR | &quot;error&quot; |



## Enum: Set&lt;AddonsEnum&gt;

| Name | Value |
|---- | -----|
| STORAGE_LVM | &quot;storage-lvm&quot; |



