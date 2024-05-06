

# ListInstances200ResponseInstancesInner

Instance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publicIpAssignment** | **PublicIpAssignment** |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**securityGroups** | [**List&lt;SecurityGroup&gt;**](SecurityGroup.md) | Instance Security Groups |  [optional] |
|**name** | **String** | Instance name |  [optional] |
|**instanceType** | [**InstanceType**](InstanceType.md) |  |  [optional] |
|**privateNetworks** | [**List&lt;ListInstances200ResponseInstancesInnerPrivateNetworksInner&gt;**](ListInstances200ResponseInstancesInnerPrivateNetworksInner.md) | Instance Private Networks |  [optional] |
|**template** | [**Template**](Template.md) |  |  [optional] |
|**state** | **InstanceState** |  |  [optional] |
|**sshKey** | [**SshKey**](SshKey.md) |  |  [optional] |
|**macAddress** | **String** | Instance MAC address |  [optional] |
|**manager** | [**Manager**](Manager.md) |  |  [optional] |
|**ipv6Address** | **String** | Instance IPv6 address |  [optional] |
|**id** | **UUID** | Instance ID |  [optional] |
|**sshKeys** | [**List&lt;SshKey&gt;**](SshKey.md) | Instance SSH Keys |  [optional] |
|**createdAt** | **OffsetDateTime** | Instance creation date |  [optional] |
|**publicIp** | **String** | Instance public IPv4 address |  [optional] |



