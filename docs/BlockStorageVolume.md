# BlockStorageVolume

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | [**Labels**](Labels.md) |  |  [optional]
**instance** | [**InstanceTarget**](InstanceTarget.md) |  |  [optional]
**name** | **String** | Volume name |  [optional]
**state** | [**StateEnum**](#StateEnum) | Volume state |  [optional]
**size** | **Long** | Volume size |  [optional]
**blocksize** | **Long** | Volume block size |  [optional]
**blockStorageSnapshots** | [**List&lt;BlockStorageSnapshotTarget&gt;**](BlockStorageSnapshotTarget.md) | Volume snapshots, if any |  [optional]
**id** | [**UUID**](UUID.md) | Volume ID |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Volume creation date |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
SNAPSHOTTING | &quot;snapshotting&quot;
DELETED | &quot;deleted&quot;
CREATING | &quot;creating&quot;
DETACHED | &quot;detached&quot;
DELETING | &quot;deleting&quot;
ATTACHING | &quot;attaching&quot;
ERROR | &quot;error&quot;
ATTACHED | &quot;attached&quot;
DETACHING | &quot;detaching&quot;
