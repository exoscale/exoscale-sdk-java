

# ListModelsResponseEntry

AI model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** | Update time |  [readonly] |
|**name** | **String** | Model name |  |
|**lifecycleStatus** | [**LifecycleStatusEnum**](#LifecycleStatusEnum) | Model lifecycle state |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Model state |  |
|**id** | **UUID** | Model ID |  [readonly] |
|**modelSize** | **Long** | Model size in bytes |  |
|**createdAt** | **OffsetDateTime** | Creation time |  [readonly] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Model visibility |  [optional] |



## Enum: LifecycleStatusEnum

| Name | Value |
|---- | -----|
| PREVIEW | &quot;preview&quot; |
| ACTIVE | &quot;active&quot; |
| DEPRECATED | &quot;deprecated&quot; |
| EOL | &quot;eol&quot; |
| NULL | &quot;null&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| CREATING | &quot;creating&quot; |
| DOWNLOADING | &quot;downloading&quot; |
| ERROR | &quot;error&quot; |
| CREATED | &quot;created&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| PUBLIC | &quot;public&quot; |



