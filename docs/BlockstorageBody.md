# BlockstorageBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Volume name |  [optional]
**size** | **Long** | Volume size in GB.                             When a snapshot ID is supplied, this defaults to the size of the source volume, but can be set to a larger value. |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**blockStorageSnapshot** | [**BlockStorageSnapshotTarget**](BlockStorageSnapshotTarget.md) |  |  [optional]
