# InstancepoolBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**antiAffinityGroups** | [**List&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Instance Pool Anti-affinity Groups |  [optional]
**description** | **String** | Instance Pool description |  [optional]
**publicIpAssignment** | [**PublicIpAssignment**](PublicIpAssignment.md) |  |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**securityGroups** | [**List&lt;SecurityGroup&gt;**](SecurityGroup.md) | Instance Pool Security Groups |  [optional]
**elasticIps** | [**List&lt;ElasticIp&gt;**](ElasticIp.md) | Instances Elastic IPs |  [optional]
**name** | **String** | Instance Pool name | 
**instanceType** | [**InstanceType**](InstanceType.md) |  | 
**minAvailable** | **Long** | Minimum number of running Instances |  [optional]
**privateNetworks** | [**List&lt;PrivateNetwork&gt;**](PrivateNetwork.md) | Instance Pool Private Networks |  [optional]
**template** | [**Template**](Template.md) |  | 
**size** | **Long** | Number of Instances | 
**sshKey** | [**SshKey**](SshKey.md) |  |  [optional]
**instancePrefix** | **String** | Prefix to apply to Instances names (default: pool) |  [optional]
**userData** | **String** | Instances Cloud-init user-data |  [optional]
**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional]
**ipv6Enabled** | **Boolean** | Enable IPv6. DEPRECATED: use &#x60;public-ip-assignments&#x60;. |  [optional]
**diskSize** | **Long** | Instances disk size in GB | 
**sshKeys** | [**List&lt;SshKey&gt;**](SshKey.md) | Instances SSH Keys |  [optional]
