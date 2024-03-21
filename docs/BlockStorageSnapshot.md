# BlockStorageSnapshot

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Snapshot ID |  [optional]
**name** | **String** | Snapshot name |  [optional]
**size** | **Long** | Snapshot size |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Snapshot creation date |  [optional]
**state** | [**StateEnum**](#StateEnum) | Snapshot state |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**blockStorageVolume** | [**BlockStorageVolumeTarget**](BlockStorageVolumeTarget.md) |  |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PARTIALLY_DESTROYED | &quot;partially-destroyed&quot;
DESTROYING | &quot;destroying&quot;
CREATING | &quot;creating&quot;
CREATED | &quot;created&quot;
PROMOTING | &quot;promoting&quot;
ERROR | &quot;error&quot;
DESTROYED | &quot;destroyed&quot;
ALLOCATED | &quot;allocated&quot;
