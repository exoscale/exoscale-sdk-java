

# BlockStorageVolume

Block storage volume

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Volume ID |  [optional] [readonly] |
|**name** | **String** | Volume name |  [optional] |
|**createdAt** | **OffsetDateTime** | Volume creation date |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | Volume state |  [optional] [readonly] |
|**size** | **Long** | Volume size |  [optional] |
|**blocksize** | **Long** | Volume block size |  [optional] [readonly] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**instance** | [**InstanceTarget**](InstanceTarget.md) |  |  [optional] |



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



