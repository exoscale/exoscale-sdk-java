

# GetModelResponse

AI model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** | Update time |  [optional] [readonly] |
|**name** | **String** | Model name |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Model state |  [optional] |
|**id** | **UUID** | Model ID |  [optional] [readonly] |
|**modelSize** | **Object** | Model size (nullable) |  [optional] |
|**createdAt** | **Object** | Creation time |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| CREATING | &quot;creating&quot; |
| DOWNLOADING | &quot;downloading&quot; |
| ERROR | &quot;error&quot; |
| CREATED | &quot;created&quot; |



