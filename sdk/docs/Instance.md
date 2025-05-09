

# Instance

Instance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**antiAffinityGroups** | [**List&lt;AntiAffinityGroup&gt;**](AntiAffinityGroup.md) | Instance Anti-affinity Groups |  [optional] |
|**publicIpAssignment** | **PublicIpAssignment** |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**securityGroups** | [**List&lt;SecurityGroup&gt;**](SecurityGroup.md) | Instance Security Groups |  [optional] |
|**elasticIps** | [**List&lt;ElasticIp&gt;**](ElasticIp.md) | Instance Elastic IPs |  [optional] |
|**name** | **String** | Instance name |  [optional] |
|**instanceType** | [**InstanceType**](InstanceType.md) |  |  [optional] |
|**privateNetworks** | [**List&lt;ListInstances200ResponseInstancesInnerPrivateNetworksInner&gt;**](ListInstances200ResponseInstancesInnerPrivateNetworksInner.md) | Instance Private Networks |  [optional] |
|**template** | [**Template**](Template.md) |  |  [optional] |
|**state** | **InstanceState** |  |  [optional] |
|**securebootEnabled** | **Boolean** | Indicates if the instance has secure boot enabled |  [optional] |
|**sshKey** | [**SshKey**](SshKey.md) |  |  [optional] |
|**userData** | **String** | Instance Cloud-init user-data (base64 encoded) |  [optional] |
|**macAddress** | **String** | Instance MAC address |  [optional] [readonly] |
|**manager** | [**Manager**](Manager.md) |  |  [optional] |
|**tpmEnabled** | **Boolean** | Indicates if the instance has tpm enabled |  [optional] |
|**deployTarget** | [**DeployTarget**](DeployTarget.md) |  |  [optional] |
|**ipv6Address** | **String** | Instance IPv6 address |  [optional] [readonly] |
|**id** | **UUID** | Instance ID |  [optional] [readonly] |
|**snapshots** | [**List&lt;Snapshot&gt;**](Snapshot.md) | Instance Snapshots |  [optional] |
|**diskSize** | **Long** | Instance disk size in GiB |  [optional] |
|**sshKeys** | [**List&lt;SshKey&gt;**](SshKey.md) | Instance SSH Keys |  [optional] |
|**createdAt** | **OffsetDateTime** | Instance creation date |  [optional] [readonly] |
|**publicIp** | **String** | Instance public IPv4 address |  [optional] [readonly] |



