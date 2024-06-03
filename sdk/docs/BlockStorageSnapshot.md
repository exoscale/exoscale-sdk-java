

# BlockStorageSnapshot

Block storage snapshot

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Snapshot ID |  [optional] [readonly] |
|**name** | **String** | Snapshot name |  [optional] |
|**size** | **Long** | Snapshot size |  [optional] |
|**volumeSize** | **Long** | Original Volume size |  [optional] |
|**createdAt** | **OffsetDateTime** | Snapshot creation date |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | Snapshot state |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**blockStorageVolume** | [**BlockStorageVolumeTarget**](BlockStorageVolumeTarget.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PARTIALLY_DESTROYED | &quot;partially-destroyed&quot; |
| DESTROYING | &quot;destroying&quot; |
| CREATING | &quot;creating&quot; |
| CREATED | &quot;created&quot; |
| PROMOTING | &quot;promoting&quot; |
| ERROR | &quot;error&quot; |
| DESTROYED | &quot;destroyed&quot; |
| ALLOCATED | &quot;allocated&quot; |



