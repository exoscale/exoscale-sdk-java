

# CreateBlockStorageVolumeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Volume name |  [optional] |
|**size** | **Long** | Volume size in GiB.                             When a snapshot ID is supplied, this defaults to the size of the source volume, but can be set to a larger value. |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**blockStorageSnapshot** | [**BlockStorageSnapshotRef**](BlockStorageSnapshotRef.md) |  |  [optional] |



