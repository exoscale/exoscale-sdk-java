# InstanceBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**antiAffinityGroups** | [**List&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Instance Anti-affinity Groups |  [optional]
**publicIpAssignment** | [**PublicIpAssignment**](PublicIpAssignment.md) |  |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**autoStart** | **Boolean** | Start Instance on creation (default: true) |  [optional]
**securityGroups** | [**List&lt;SecurityGroup&gt;**](SecurityGroup.md) | Instance Security Groups |  [optional]
**name** | **String** | Instance name |  [optional]
**instanceType** | [**InstanceType**](InstanceType.md) |  | 
**template** | [**Template**](Template.md) |  | 
**sshKey** | [**SshKey**](SshKey.md) |  |  [optional]
**userData** | **String** | Instance Cloud-init user-data |  [optional]
**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional]
**ipv6Enabled** | **Boolean** | Enable IPv6. DEPRECATED: use &#x60;public-ip-assignments&#x60;. |  [optional]
**diskSize** | **Long** | Instance disk size in GB | 
**sshKeys** | [**List&lt;SshKey&gt;**](SshKey.md) | Instance SSH Keys |  [optional]
