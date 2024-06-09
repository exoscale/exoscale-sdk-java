

# UpdateSksNodepoolRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antiAffinityGroups** | [**Set&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Nodepool Anti-affinity Groups |  [optional] |
|**description** | **String** | Nodepool description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**taints** | [**Map&lt;String, SksNodepoolTaint&gt;**](SksNodepoolTaint.md) |  |  [optional] |
|**securityGroups** | [**Set&lt;SecurityGroup&gt;**](SecurityGroup.md) | Nodepool Security Groups |  [optional] |
|**name** | **String** | Nodepool name |  [optional] |
|**instanceType** | [**InstanceType**](InstanceType.md) |  |  [optional] |
|**privateNetworks** | [**Set&lt;PrivateNetwork&gt;**](PrivateNetwork.md) | Nodepool Private Networks |  [optional] |
|**instancePrefix** | **String** | Prefix to apply to managed instances names (default: pool) |  [optional] |
|**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional] |
|**diskSize** | **Long** | Nodepool instances disk size in GiB |  [optional] |



