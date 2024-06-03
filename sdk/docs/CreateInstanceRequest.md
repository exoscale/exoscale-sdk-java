

# CreateInstanceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antiAffinityGroups** | [**Set&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Instance Anti-affinity Groups |  [optional] |
|**publicIpAssignment** | **PublicIpAssignment** |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**autoStart** | **Boolean** | Start Instance on creation (default: true) |  [optional] |
|**securityGroups** | [**Set&lt;SecurityGroup&gt;**](SecurityGroup.md) | Instance Security Groups |  [optional] |
|**name** | **String** | Instance name |  [optional] |
|**instanceType** | [**InstanceType**](InstanceType.md) |  |  |
|**template** | [**Template**](Template.md) |  |  |
|**sshKey** | [**SshKey**](SshKey.md) |  |  [optional] |
|**userData** | **String** | Instance Cloud-init user-data (base64 encoded) |  [optional] |
|**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional] |
|**ipv6Enabled** | **Boolean** | Enable IPv6. DEPRECATED: use &#x60;public-ip-assignments&#x60;. |  [optional] |
|**diskSize** | **Long** | Instance disk size in GiB |  |
|**sshKeys** | [**Set&lt;SshKey&gt;**](SshKey.md) | Instance SSH Keys |  [optional] |



