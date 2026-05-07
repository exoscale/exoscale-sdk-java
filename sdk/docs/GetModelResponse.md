

# GetModelResponse

AI model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** | Update time |  [readonly] |
|**name** | **String** | Model name |  |
|**state** | [**StateEnum**](#StateEnum) | Model state |  |
|**id** | **UUID** | Model ID |  [readonly] |
|**modelSize** | **Long** | Model size in bytes |  |
|**createdAt** | **OffsetDateTime** | Creation time |  [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| CREATING | &quot;creating&quot; |
| DOWNLOADING | &quot;downloading&quot; |
| ERROR | &quot;error&quot; |
| CREATED | &quot;created&quot; |



