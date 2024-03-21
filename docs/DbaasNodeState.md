# DbaasNodeState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the service node | 
**progressUpdates** | [**List&lt;DbaasNodeStateProgressUpdate&gt;**](DbaasNodeStateProgressUpdate.md) | Extra information regarding the progress for current state |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Role of this node. Only returned for a subset of service types |  [optional]
**state** | [**StateEnum**](#StateEnum) | Current state of the service node | 

<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
STANDBY | &quot;standby&quot;
MASTER | &quot;master&quot;
READ_REPLICA | &quot;read-replica&quot;

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
LEAVING | &quot;leaving&quot;
RUNNING | &quot;running&quot;
SYNCING_DATA | &quot;syncing_data&quot;
SETTING_UP_VM | &quot;setting_up_vm&quot;
UNKNOWN | &quot;unknown&quot;
