

# CreateInstancePoolRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antiAffinityGroups** | [**Set&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Instance Pool Anti-affinity Groups |  [optional] |
|**description** | **String** | Instance Pool description |  [optional] |
|**publicIpAssignment** | [**PublicIpAssignmentEnum**](#PublicIpAssignmentEnum) | Determines public IP assignment of the Instances. Type &#x60;none&#x60; is final and can&#39;t be changed later on. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**securityGroups** | [**Set&lt;SecurityGroup&gt;**](SecurityGroup.md) | Instance Pool Security Groups |  [optional] |
|**elasticIps** | [**Set&lt;ElasticIp&gt;**](ElasticIp.md) | Instances Elastic IPs |  [optional] |
|**name** | **String** | Instance Pool name |  |
|**instanceType** | [**InstanceType**](InstanceType.md) |  |  |
|**minAvailable** | **Long** | Minimum number of running Instances |  [optional] |
|**privateNetworks** | [**Set&lt;PrivateNetwork&gt;**](PrivateNetwork.md) | Instance Pool Private Networks |  [optional] |
|**template** | [**Template**](Template.md) |  |  |
|**size** | **Long** | Number of Instances |  |
|**sshKey** | [**SshKey**](SshKey.md) |  |  [optional] |
|**instancePrefix** | **String** | Prefix to apply to Instances names (default: pool) |  [optional] |
|**userData** | **String** | Instances Cloud-init user-data |  [optional] |
|**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional] |
|**ipv6Enabled** | **Boolean** | Enable IPv6. DEPRECATED: use &#x60;public-ip-assignments&#x60;. |  [optional] |
|**diskSize** | **Long** | Instances disk size in GiB |  |
|**sshKeys** | [**Set&lt;SshKey&gt;**](SshKey.md) | Instances SSH Keys |  [optional] |



## Enum: PublicIpAssignmentEnum

| Name | Value |
|---- | -----|
| INET4 | &quot;inet4&quot; |
| DUAL | &quot;dual&quot; |
| NONE | &quot;none&quot; |



