

# BlockStorageVolume

Block storage volume

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**instance** | [**InstanceTarget**](InstanceTarget.md) |  |  [optional] |
|**name** | **String** | Volume name |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Volume state |  [optional] [readonly] |
|**size** | **Long** | Volume size |  [optional] |
|**blocksize** | **Long** | Volume block size |  [optional] [readonly] |
|**blockStorageSnapshots** | [**List&lt;BlockStorageSnapshotTarget&gt;**](BlockStorageSnapshotTarget.md) | Volume snapshots, if any |  [optional] |
|**id** | **UUID** | Volume ID |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Volume creation date |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| SNAPSHOTTING | &quot;snapshotting&quot; |
| DELETED | &quot;deleted&quot; |
| CREATING | &quot;creating&quot; |
| DETACHED | &quot;detached&quot; |
| DELETING | &quot;deleting&quot; |
| ATTACHING | &quot;attaching&quot; |
| ERROR | &quot;error&quot; |
| ATTACHED | &quot;attached&quot; |
| DETACHING | &quot;detaching&quot; |



