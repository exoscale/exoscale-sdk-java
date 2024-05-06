

# JsonSchemaPgbouncer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minPoolSize** | **Integer** |  |  [optional] |
|**ignoreStartupParameters** | [**List&lt;IgnoreStartupParametersEnum&gt;**](#List&lt;IgnoreStartupParametersEnum&gt;) |  |  [optional] |
|**serverLifetime** | **Integer** |  |  [optional] |
|**autodbPoolMode** | [**AutodbPoolModeEnum**](#AutodbPoolModeEnum) |  |  [optional] |
|**serverIdleTimeout** | **Integer** |  |  [optional] |
|**autodbMaxDbConnections** | **Integer** |  |  [optional] |
|**serverResetQueryAlways** | **Boolean** |  |  [optional] |
|**autodbPoolSize** | **Integer** |  |  [optional] |
|**autodbIdleTimeout** | **Integer** |  |  [optional] |



## Enum: List&lt;IgnoreStartupParametersEnum&gt;

| Name | Value |
|---- | -----|
| EXTRA_FLOAT_DIGITS | &quot;extra_float_digits&quot; |
| SEARCH_PATH | &quot;search_path&quot; |



## Enum: AutodbPoolModeEnum

| Name | Value |
|---- | -----|
| SESSION | &quot;session&quot; |
| TRANSACTION | &quot;transaction&quot; |
| STATEMENT | &quot;statement&quot; |



