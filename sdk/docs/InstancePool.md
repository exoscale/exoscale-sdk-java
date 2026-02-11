

# InstancePool

Instance Pool

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationConsistentSnapshotEnabled** | **Boolean** | Enable application consistent snapshots |  [optional] |
|**antiAffinityGroups** | [**List&lt;AntiAffinityGroupRef&gt;**](AntiAffinityGroupRef.md) | Instance Pool Anti-affinity Groups |  [optional] |
|**description** | **String** | Instance Pool description |  [optional] |
|**publicIpAssignment** | **PublicIpAssignment** |  |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**securityGroups** | [**List&lt;SecurityGroupRef&gt;**](SecurityGroupRef.md) | Instance Pool Security Groups |  [optional] |
|**elasticIps** | [**List&lt;ElasticIpRef&gt;**](ElasticIpRef.md) | Instances Elastic IPs |  [optional] |
|**name** | **String** | Instance Pool name |  [optional] |
|**instanceType** | [**InstanceTypeRef**](InstanceTypeRef.md) |  |  [optional] |
|**minAvailable** | **Long** | Minimum number of running instances |  [optional] |
|**privateNetworks** | [**List&lt;PrivateNetworkRef&gt;**](PrivateNetworkRef.md) | Instance Pool Private Networks |  [optional] |
|**template** | [**TemplateRef**](TemplateRef.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Instance Pool state |  [optional] [readonly] |
|**size** | **Long** | Number of instances |  [optional] |
|**sshKey** | [**SshKeyRef**](SshKeyRef.md) |  |  [optional] |
|**instancePrefix** | **String** | The instances created by the Instance Pool will be prefixed with this value (default: pool) |  [optional] |
|**userData** | **String** | Instances Cloud-init user-data |  [optional] |
|**manager** | [**Manager**](Manager.md) |  |  [optional] |
|**instances** | [**List&lt;InstanceRef&gt;**](InstanceRef.md) | Instances |  [optional] [readonly] |
|**deployTarget** | [**DeployTargetRef**](DeployTargetRef.md) |  |  [optional] |
|**ipv6Enabled** | **Boolean** | Enable IPv6 for instances |  [optional] |
|**id** | **UUID** | Instance Pool ID |  [optional] [readonly] |
|**diskSize** | **Long** | Instances disk size in GiB |  [optional] |
|**sshKeys** | [**List&lt;SshKeyRef&gt;**](SshKeyRef.md) | Instances SSH keys |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| SCALING_UP | &quot;scaling-up&quot; |
| SCALING_DOWN | &quot;scaling-down&quot; |
| DESTROYING | &quot;destroying&quot; |
| CREATING | &quot;creating&quot; |
| SUSPENDED | &quot;suspended&quot; |
| RUNNING | &quot;running&quot; |
| UPDATING | &quot;updating&quot; |



