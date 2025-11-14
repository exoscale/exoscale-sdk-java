

# Snapshot

Snapshot

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Snapshot ID |  [optional] [readonly] |
|**name** | **String** | Snapshot name |  [optional] |
|**createdAt** | **OffsetDateTime** | Snapshot creation date |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) | Snapshot state |  [optional] |
|**size** | **Long** | Snapshot size in GiB |  [optional] [readonly] |
|**export** | [**SnapshotExport**](SnapshotExport.md) |  |  [optional] |
|**instance** | [**Instance**](Instance.md) |  |  [optional] |
|**applicationConsistent** | **Boolean** | Indicates whether the snapshot was taken using an application-consistent method |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| SNAPSHOTTING | &quot;snapshotting&quot; |
| DELETED | &quot;deleted&quot; |
| EXPORTING | &quot;exporting&quot; |
| READY | &quot;ready&quot; |
| DELETING | &quot;deleting&quot; |
| ERROR | &quot;error&quot; |
| EXPORTED | &quot;exported&quot; |



