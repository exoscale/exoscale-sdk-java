

# UpdateSksNodepoolRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antiAffinityGroups** | [**Set&lt;AntiAffinityGroupRef&gt;**](AntiAffinityGroupRef.md) | Nodepool Anti-affinity Groups |  [optional] |
|**description** | **String** | Nodepool description |  [optional] |
|**publicIpAssignment** | [**PublicIpAssignmentEnum**](#PublicIpAssignmentEnum) | Configures public IP assignment of the Instances with:  * IPv4 (&#x60;inet4&#x60;) addressing only; * both IPv4 and IPv6 (&#x60;dual&#x60;) addressing. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**taints** | [**Map&lt;String, SksNodepoolTaint&gt;**](SksNodepoolTaint.md) |  |  [optional] |
|**securityGroups** | [**Set&lt;SecurityGroupRef&gt;**](SecurityGroupRef.md) | Nodepool Security Groups |  [optional] |
|**name** | **String** | Nodepool name, lowercase only |  [optional] |
|**instanceType** | [**InstanceTypeRef**](InstanceTypeRef.md) |  |  [optional] |
|**privateNetworks** | [**Set&lt;PrivateNetworkRef&gt;**](PrivateNetworkRef.md) | Nodepool Private Networks |  [optional] |
|**instancePrefix** | **String** | Prefix to apply to managed instances names (default: pool), lowercase only |  [optional] |
|**deployTarget** | [**DeployTargetRef**](DeployTargetRef.md) |  |  [optional] |
|**diskSize** | **Long** | Nodepool instances disk size in GiB |  [optional] |



## Enum: PublicIpAssignmentEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| DUAL | &quot;dual&quot; |



