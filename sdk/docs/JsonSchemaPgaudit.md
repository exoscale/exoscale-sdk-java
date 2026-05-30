

# JsonSchemaPgaudit

System-wide settings for the pgaudit extension.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | **String** | Specifies the master role to use for object audit logging. |  [optional] |
|**logParameter** | **Boolean** | Specifies that audit logging should include the parameters that were passed with the statement. |  [optional] |
|**logRows** | **Boolean** |  |  [optional] |
|**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Specifies the log level that will be used for log entries. |  [optional] |
|**logRelation** | **Boolean** | Specifies whether session audit logging should create a separate log entry for each relation (TABLE, VIEW, etc.) referenced in a SELECT or DML statement. |  [optional] |
|**logStatementOnce** | **Boolean** | Specifies whether logging will include the statement text and parameters with the first log entry for a statement/substatement combination or with every entry. |  [optional] |
|**logMaxStringLength** | **Integer** | Crop parameters representation and whole statements if they exceed this threshold. A (default) value of -1 disable the truncation. |  [optional] |
|**logCatalog** | **Boolean** | Specifies that session logging should be enabled in the case where all relations in a statement are in pg_catalog. |  [optional] |
|**logNestedStatements** | **Boolean** | This GUC allows to turn off logging nested statements, that is, statements that are executed as part of another ExecutorRun. |  [optional] |
|**logStatement** | **Boolean** | Specifies whether logging will include the statement text and parameters (if enabled). |  [optional] |
|**logClient** | **Boolean** | Specifies whether log messages will be visible to a client process such as psql. |  [optional] |
|**featureEnabled** | **Boolean** | Enable pgaudit extension. When enabled, pgaudit extension will be automatically installed.Otherwise, extension will be uninstalled but auditing configurations will be preserved. |  [optional] |
|**log** | [**List&lt;LogEnum&gt;**](#List&lt;LogEnum&gt;) | Specifies which classes of statements will be logged by session audit logging. |  [optional] |
|**logParameterMaxSize** | **Integer** | Specifies that parameter values longer than this setting (in bytes) should not be logged, but replaced with &lt;long param suppressed&gt;. |  [optional] |



## Enum: LogLevelEnum

| Name | Value |
|---- | -----|
| DEBUG1 | &quot;debug1&quot; |
| DEBUG2 | &quot;debug2&quot; |
| DEBUG3 | &quot;debug3&quot; |
| DEBUG4 | &quot;debug4&quot; |
| DEBUG5 | &quot;debug5&quot; |
| INFO | &quot;info&quot; |
| NOTICE | &quot;notice&quot; |
| WARNING | &quot;warning&quot; |
| LOG | &quot;log&quot; |



## Enum: List&lt;LogEnum&gt;

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| DDL | &quot;ddl&quot; |
| FUNCTION | &quot;function&quot; |
| MISC | &quot;misc&quot; |
| MISC_SET | &quot;misc_set&quot; |
| READ | &quot;read&quot; |
| ROLE | &quot;role&quot; |
| WRITE | &quot;write&quot; |



