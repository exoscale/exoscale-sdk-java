
# Grafana Settings

## Structure

`GrafanaSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllowEmbedding` | `Boolean` | Optional | - | Boolean getAllowEmbedding() | setAllowEmbedding(Boolean allowEmbedding) |
| `CookieSamesite` | [`CookieSameSiteAttributeStrictPreventsSendingCookieForCrossSiteRequestsEffectivelyDisablingDirectLinkingFromOtherSitesToGrafanaLaxIsTheDefaultValueEnum`](../../doc/models/cookie-same-site-attribute-strict-prevents-sending-cookie-for-cross-site-requests-effectively-disabling-direct-linking-from-other-sites-to-grafana-lax-is-the-default-value-enum.md) | Optional | - | CookieSameSiteAttributeStrictPreventsSendingCookieForCrossSiteRequestsEffectivelyDisablingDirectLinkingFromOtherSitesToGrafanaLaxIsTheDefaultValueEnum getCookieSamesite() | setCookieSamesite(CookieSameSiteAttributeStrictPreventsSendingCookieForCrossSiteRequestsEffectivelyDisablingDirectLinkingFromOtherSitesToGrafanaLaxIsTheDefaultValueEnum cookieSamesite) |
| `DashboardPreviewsEnabled` | `Boolean` | Optional | This feature is new in Grafana 9 and is quite resource intensive. It may cause low-end plans to work more slowly while the dashboard previews are rendering. | Boolean getDashboardPreviewsEnabled() | setDashboardPreviewsEnabled(Boolean dashboardPreviewsEnabled) |
| `MetricsEnabled` | `Boolean` | Optional | - | Boolean getMetricsEnabled() | setMetricsEnabled(Boolean metricsEnabled) |
| `RecoveryBasebackupName` | `String` | Optional | **Constraints**: *Maximum Length*: `128`, *Pattern*: `^[a-zA-Z0-9-_:.]+$` | String getRecoveryBasebackupName() | setRecoveryBasebackupName(String recoveryBasebackupName) |
| `AuthAzuread` | [`AzureADOAuthIntegration`](../../doc/models/azure-ado-auth-integration.md) | Optional | - | AzureADOAuthIntegration getAuthAzuread() | setAuthAzuread(AzureADOAuthIntegration authAzuread) |
| `AlertingEnabled` | `Boolean` | Optional | - | Boolean getAlertingEnabled() | setAlertingEnabled(Boolean alertingEnabled) |
| `UnifiedAlertingEnabled` | `Boolean` | Optional | - | Boolean getUnifiedAlertingEnabled() | setUnifiedAlertingEnabled(Boolean unifiedAlertingEnabled) |
| `AuthGithub` | [`GithubAuthIntegration`](../../doc/models/github-auth-integration.md) | Optional | - | GithubAuthIntegration getAuthGithub() | setAuthGithub(GithubAuthIntegration authGithub) |
| `UserAutoAssignOrg` | `Boolean` | Optional | - | Boolean getUserAutoAssignOrg() | setUserAutoAssignOrg(Boolean userAutoAssignOrg) |
| `DataproxySendUserHeader` | `Boolean` | Optional | - | Boolean getDataproxySendUserHeader() | setDataproxySendUserHeader(Boolean dataproxySendUserHeader) |
| `PrivatelinkAccess` | [`AllowAccessToSelectedServiceComponentsThroughPrivatelink`](../../doc/models/allow-access-to-selected-service-components-through-privatelink.md) | Optional | - | AllowAccessToSelectedServiceComponentsThroughPrivatelink getPrivatelinkAccess() | setPrivatelinkAccess(AllowAccessToSelectedServiceComponentsThroughPrivatelink privatelinkAccess) |
| `GoogleAnalyticsUaId` | `String` | Optional | **Constraints**: *Maximum Length*: `64`, *Pattern*: `^(G\|UA\|YT\|MO)-[a-zA-Z0-9-]+$` | String getGoogleAnalyticsUaId() | setGoogleAnalyticsUaId(String googleAnalyticsUaId) |
| `DashboardsVersionsToKeep` | `Integer` | Optional | **Constraints**: `>= 1`, `<= 100` | Integer getDashboardsVersionsToKeep() | setDashboardsVersionsToKeep(Integer dashboardsVersionsToKeep) |
| `EditorsCanAdmin` | `Boolean` | Optional | - | Boolean getEditorsCanAdmin() | setEditorsCanAdmin(Boolean editorsCanAdmin) |
| `SmtpServer` | [`SMTPServerSettings`](../../doc/models/smtp-server-settings.md) | Optional | - | SMTPServerSettings getSmtpServer() | setSmtpServer(SMTPServerSettings smtpServer) |
| `AuthGitlab` | [`GitLabAuthIntegration`](../../doc/models/git-lab-auth-integration.md) | Optional | - | GitLabAuthIntegration getAuthGitlab() | setAuthGitlab(GitLabAuthIntegration authGitlab) |
| `AlertingNodataOrNullvalues` | [`DefaultValueForNoDataOrNullValuesForNewAlertingRulesEnum`](../../doc/models/default-value-for-no-data-or-null-values-for-new-alerting-rules-enum.md) | Optional | - | DefaultValueForNoDataOrNullValuesForNewAlertingRulesEnum getAlertingNodataOrNullvalues() | setAlertingNodataOrNullvalues(DefaultValueForNoDataOrNullValuesForNewAlertingRulesEnum alertingNodataOrNullvalues) |
| `AuthBasicEnabled` | `Boolean` | Optional | - | Boolean getAuthBasicEnabled() | setAuthBasicEnabled(Boolean authBasicEnabled) |
| `DateFormats` | [`GrafanaDateFormatSpecifications`](../../doc/models/grafana-date-format-specifications.md) | Optional | - | GrafanaDateFormatSpecifications getDateFormats() | setDateFormats(GrafanaDateFormatSpecifications dateFormats) |
| `DisableGravatar` | `Boolean` | Optional | - | Boolean getDisableGravatar() | setDisableGravatar(Boolean disableGravatar) |
| `UserAutoAssignOrgRole` | [`SetRoleForNewSignupsDefaultsToViewerEnum`](../../doc/models/set-role-for-new-signups-defaults-to-viewer-enum.md) | Optional | - | SetRoleForNewSignupsDefaultsToViewerEnum getUserAutoAssignOrgRole() | setUserAutoAssignOrgRole(SetRoleForNewSignupsDefaultsToViewerEnum userAutoAssignOrgRole) |
| `DataproxyTimeout` | `Integer` | Optional | **Constraints**: `>= 15`, `<= 90` | Integer getDataproxyTimeout() | setDataproxyTimeout(Integer dataproxyTimeout) |
| `ViewersCanEdit` | `Boolean` | Optional | - | Boolean getViewersCanEdit() | setViewersCanEdit(Boolean viewersCanEdit) |
| `DashboardsMinRefreshInterval` | `String` | Optional | Signed sequence of decimal numbers, followed by a unit suffix (ms, s, m, h, d), e.g. 30s, 1h<br>**Constraints**: *Maximum Length*: `16`, *Pattern*: `^[0-9]+(ms\|s\|m\|h\|d)$` | String getDashboardsMinRefreshInterval() | setDashboardsMinRefreshInterval(String dashboardsMinRefreshInterval) |
| `AuthGoogle` | [`GoogleAuthIntegration`](../../doc/models/google-auth-integration.md) | Optional | - | GoogleAuthIntegration getAuthGoogle() | setAuthGoogle(GoogleAuthIntegration authGoogle) |
| `OauthAllowInsecureEmailLookup` | `Boolean` | Optional | - | Boolean getOauthAllowInsecureEmailLookup() | setOauthAllowInsecureEmailLookup(Boolean oauthAllowInsecureEmailLookup) |
| `AlertingMaxAnnotationsToKeep` | `Integer` | Optional | **Constraints**: `>= 0`, `<= 1000000` | Integer getAlertingMaxAnnotationsToKeep() | setAlertingMaxAnnotationsToKeep(Integer alertingMaxAnnotationsToKeep) |
| `AuthGenericOauth` | [`GenericOAuthIntegration`](../../doc/models/generic-o-auth-integration.md) | Optional | - | GenericOAuthIntegration getAuthGenericOauth() | setAuthGenericOauth(GenericOAuthIntegration authGenericOauth) |
| `AlertingErrorOrTimeout` | [`DefaultErrorOrTimeoutSettingForNewAlertingRulesEnum`](../../doc/models/default-error-or-timeout-setting-for-new-alerting-rules-enum.md) | Optional | - | DefaultErrorOrTimeoutSettingForNewAlertingRulesEnum getAlertingErrorOrTimeout() | setAlertingErrorOrTimeout(DefaultErrorOrTimeoutSettingForNewAlertingRulesEnum alertingErrorOrTimeout) |

## Example (as JSON)

```json
{
  "allow_embedding": false,
  "cookie_samesite": "lax",
  "dashboard_previews_enabled": false,
  "metrics_enabled": true,
  "recovery_basebackup_name": "backup-20191112t091354293891z",
  "alerting_enabled": true,
  "unified_alerting_enabled": true,
  "user_auto_assign_org": false,
  "dataproxy_send_user_header": false,
  "google_analytics_ua_id": "UA-123456-4",
  "dashboards_versions_to_keep": 20,
  "editors_can_admin": false,
  "alerting_nodata_or_nullvalues": "ok",
  "auth_basic_enabled": true,
  "disable_gravatar": false,
  "user_auto_assign_org_role": "Viewer",
  "dataproxy_timeout": 30,
  "viewers_can_edit": false,
  "dashboards_min_refresh_interval": "5s",
  "oauth_allow_insecure_email_lookup": false,
  "alerting_max_annotations_to_keep": 0,
  "alerting_error_or_timeout": "alerting"
}
```

