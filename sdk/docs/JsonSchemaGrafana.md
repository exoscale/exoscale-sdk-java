

# JsonSchemaGrafana


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowEmbedding** | **Boolean** |  |  [optional] |
|**cookieSamesite** | [**CookieSamesiteEnum**](#CookieSamesiteEnum) |  |  [optional] |
|**dashboardPreviewsEnabled** | **Boolean** | This feature is new in Grafana 9 and is quite resource intensive. It may cause low-end plans to work more slowly while the dashboard previews are rendering. |  [optional] |
|**metricsEnabled** | **Boolean** |  |  [optional] |
|**authAzuread** | [**AzureADOAuthIntegration**](AzureADOAuthIntegration.md) |  |  [optional] |
|**alertingEnabled** | **Boolean** |  |  [optional] |
|**unifiedAlertingEnabled** | **Boolean** |  |  [optional] |
|**authGithub** | [**GithubAuthIntegration**](GithubAuthIntegration.md) |  |  [optional] |
|**userAutoAssignOrg** | **Boolean** |  |  [optional] |
|**dataproxySendUserHeader** | **Boolean** |  |  [optional] |
|**googleAnalyticsUaId** | **String** |  |  [optional] |
|**dashboardsVersionsToKeep** | **Integer** |  |  [optional] |
|**editorsCanAdmin** | **Boolean** |  |  [optional] |
|**smtpServer** | [**SMTPServerSettings**](SMTPServerSettings.md) |  |  [optional] |
|**authGitlab** | [**GitLabAuthIntegration**](GitLabAuthIntegration.md) |  |  [optional] |
|**alertingNodataOrNullvalues** | [**AlertingNodataOrNullvaluesEnum**](#AlertingNodataOrNullvaluesEnum) |  |  [optional] |
|**authBasicEnabled** | **Boolean** |  |  [optional] |
|**dateFormats** | [**GrafanaDateFormatSpecifications**](GrafanaDateFormatSpecifications.md) |  |  [optional] |
|**serviceLog** | **Boolean** | Store logs for the service so that they are available in the HTTP API and console. |  [optional] |
|**disableGravatar** | **Boolean** |  |  [optional] |
|**userAutoAssignOrgRole** | [**UserAutoAssignOrgRoleEnum**](#UserAutoAssignOrgRoleEnum) |  |  [optional] |
|**dataproxyTimeout** | **Integer** |  |  [optional] |
|**viewersCanEdit** | **Boolean** |  |  [optional] |
|**dashboardsMinRefreshInterval** | **String** | Signed sequence of decimal numbers, followed by a unit suffix (ms, s, m, h, d), e.g. 30s, 1h |  [optional] |
|**authGoogle** | [**GoogleAuthIntegration**](GoogleAuthIntegration.md) |  |  [optional] |
|**oauthAllowInsecureEmailLookup** | **Boolean** |  |  [optional] |
|**alertingMaxAnnotationsToKeep** | **Integer** |  |  [optional] |
|**authGenericOauth** | [**GenericOAuthIntegration**](GenericOAuthIntegration.md) |  |  [optional] |
|**alertingErrorOrTimeout** | [**AlertingErrorOrTimeoutEnum**](#AlertingErrorOrTimeoutEnum) |  |  [optional] |



## Enum: CookieSamesiteEnum

| Name | Value |
|---- | -----|
| LAX | &quot;lax&quot; |
| STRICT | &quot;strict&quot; |
| NONE | &quot;none&quot; |



## Enum: AlertingNodataOrNullvaluesEnum

| Name | Value |
|---- | -----|
| ALERTING | &quot;alerting&quot; |
| NO_DATA | &quot;no_data&quot; |
| KEEP_STATE | &quot;keep_state&quot; |
| OK | &quot;ok&quot; |



## Enum: UserAutoAssignOrgRoleEnum

| Name | Value |
|---- | -----|
| VIEWER | &quot;Viewer&quot; |
| ADMIN | &quot;Admin&quot; |
| EDITOR | &quot;Editor&quot; |



## Enum: AlertingErrorOrTimeoutEnum

| Name | Value |
|---- | -----|
| ALERTING | &quot;alerting&quot; |
| KEEP_STATE | &quot;keep_state&quot; |



