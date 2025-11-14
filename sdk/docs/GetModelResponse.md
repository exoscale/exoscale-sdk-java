

# GetModelResponse

AI model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Model ID |  [optional] [readonly] |
|**name** | **String** | Model name |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Model status |  [optional] |
|**modelSize** | **Long** | Model size (nullable) |  [optional] |
|**createdAt** | **OffsetDateTime** | Creation time |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Update time |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| CREATING | &quot;creating&quot; |
| DOWNLOADING | &quot;downloading&quot; |
| ERROR | &quot;error&quot; |



