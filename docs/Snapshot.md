# Snapshot

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Snapshot ID |  [optional]
**name** | **String** | Snapshot name |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Snapshot creation date |  [optional]
**state** | [**StateEnum**](#StateEnum) | Snapshot state |  [optional]
**size** | **Long** | Snapshot size in GB |  [optional]
**export** | [**SnapshotExport**](SnapshotExport.md) |  |  [optional]
**instance** | [**Instance**](Instance.md) |  |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
SNAPSHOTTING | &quot;snapshotting&quot;
DELETED | &quot;deleted&quot;
EXPORTING | &quot;exporting&quot;
READY | &quot;ready&quot;
DELETING | &quot;deleting&quot;
ERROR | &quot;error&quot;
EXPORTED | &quot;exported&quot;
