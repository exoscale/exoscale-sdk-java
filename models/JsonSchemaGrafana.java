package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaGrafana implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The alerting_enabled property
     */
    private Boolean alertingEnabled;
    /**
     * The alerting_error_or_timeout property
     */
    private JsonSchemaGrafanaAlertingErrorOrTimeout alertingErrorOrTimeout;
    /**
     * The alerting_max_annotations_to_keep property
     */
    private Integer alertingMaxAnnotationsToKeep;
    /**
     * The alerting_nodata_or_nullvalues property
     */
    private JsonSchemaGrafanaAlertingNodataOrNullvalues alertingNodataOrNullvalues;
    /**
     * The allow_embedding property
     */
    private Boolean allowEmbedding;
    /**
     * The auth_azuread property
     */
    private JsonSchemaGrafanaAuthAzuread authAzuread;
    /**
     * The auth_basic_enabled property
     */
    private Boolean authBasicEnabled;
    /**
     * The auth_generic_oauth property
     */
    private JsonSchemaGrafanaAuthGenericOauth authGenericOauth;
    /**
     * The auth_github property
     */
    private JsonSchemaGrafanaAuthGithub authGithub;
    /**
     * The auth_gitlab property
     */
    private JsonSchemaGrafanaAuthGitlab authGitlab;
    /**
     * The auth_google property
     */
    private JsonSchemaGrafanaAuthGoogle authGoogle;
    /**
     * The cookie_samesite property
     */
    private JsonSchemaGrafanaCookieSamesite cookieSamesite;
    /**
     * This feature is new in Grafana 9 and is quite resource intensive. It may cause low-end plans to work more slowly while the dashboard previews are rendering.
     */
    private Boolean dashboardPreviewsEnabled;
    /**
     * Signed sequence of decimal numbers, followed by a unit suffix (ms, s, m, h, d), e.g. 30s, 1h
     */
    private String dashboardsMinRefreshInterval;
    /**
     * The dashboards_versions_to_keep property
     */
    private Integer dashboardsVersionsToKeep;
    /**
     * The dataproxy_send_user_header property
     */
    private Boolean dataproxySendUserHeader;
    /**
     * The dataproxy_timeout property
     */
    private Integer dataproxyTimeout;
    /**
     * The date_formats property
     */
    private JsonSchemaGrafanaDateFormats dateFormats;
    /**
     * The disable_gravatar property
     */
    private Boolean disableGravatar;
    /**
     * The editors_can_admin property
     */
    private Boolean editorsCanAdmin;
    /**
     * The google_analytics_ua_id property
     */
    private String googleAnalyticsUaId;
    /**
     * The metrics_enabled property
     */
    private Boolean metricsEnabled;
    /**
     * The oauth_allow_insecure_email_lookup property
     */
    private Boolean oauthAllowInsecureEmailLookup;
    /**
     * The privatelink_access property
     */
    private JsonSchemaGrafanaPrivatelinkAccess privatelinkAccess;
    /**
     * The recovery_basebackup_name property
     */
    private String recoveryBasebackupName;
    /**
     * The smtp_server property
     */
    private JsonSchemaGrafanaSmtpServer smtpServer;
    /**
     * The unified_alerting_enabled property
     */
    private Boolean unifiedAlertingEnabled;
    /**
     * The user_auto_assign_org property
     */
    private Boolean userAutoAssignOrg;
    /**
     * The user_auto_assign_org_role property
     */
    private JsonSchemaGrafanaUserAutoAssignOrgRole userAutoAssignOrgRole;
    /**
     * The viewers_can_edit property
     */
    private Boolean viewersCanEdit;
    /**
     * Instantiates a new JsonSchemaGrafana and sets the default values.
     */
    public JsonSchemaGrafana() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaGrafana
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaGrafana createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaGrafana();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the alerting_enabled property value. The alerting_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAlertingEnabled() {
        return this.alertingEnabled;
    }
    /**
     * Gets the alerting_error_or_timeout property value. The alerting_error_or_timeout property
     * @return a JsonSchemaGrafanaAlertingErrorOrTimeout
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaAlertingErrorOrTimeout getAlertingErrorOrTimeout() {
        return this.alertingErrorOrTimeout;
    }
    /**
     * Gets the alerting_max_annotations_to_keep property value. The alerting_max_annotations_to_keep property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAlertingMaxAnnotationsToKeep() {
        return this.alertingMaxAnnotationsToKeep;
    }
    /**
     * Gets the alerting_nodata_or_nullvalues property value. The alerting_nodata_or_nullvalues property
     * @return a JsonSchemaGrafanaAlertingNodataOrNullvalues
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaAlertingNodataOrNullvalues getAlertingNodataOrNullvalues() {
        return this.alertingNodataOrNullvalues;
    }
    /**
     * Gets the allow_embedding property value. The allow_embedding property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowEmbedding() {
        return this.allowEmbedding;
    }
    /**
     * Gets the auth_azuread property value. The auth_azuread property
     * @return a JsonSchemaGrafanaAuthAzuread
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaAuthAzuread getAuthAzuread() {
        return this.authAzuread;
    }
    /**
     * Gets the auth_basic_enabled property value. The auth_basic_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthBasicEnabled() {
        return this.authBasicEnabled;
    }
    /**
     * Gets the auth_generic_oauth property value. The auth_generic_oauth property
     * @return a JsonSchemaGrafanaAuthGenericOauth
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaAuthGenericOauth getAuthGenericOauth() {
        return this.authGenericOauth;
    }
    /**
     * Gets the auth_github property value. The auth_github property
     * @return a JsonSchemaGrafanaAuthGithub
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaAuthGithub getAuthGithub() {
        return this.authGithub;
    }
    /**
     * Gets the auth_gitlab property value. The auth_gitlab property
     * @return a JsonSchemaGrafanaAuthGitlab
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaAuthGitlab getAuthGitlab() {
        return this.authGitlab;
    }
    /**
     * Gets the auth_google property value. The auth_google property
     * @return a JsonSchemaGrafanaAuthGoogle
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaAuthGoogle getAuthGoogle() {
        return this.authGoogle;
    }
    /**
     * Gets the cookie_samesite property value. The cookie_samesite property
     * @return a JsonSchemaGrafanaCookieSamesite
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaCookieSamesite getCookieSamesite() {
        return this.cookieSamesite;
    }
    /**
     * Gets the dashboard_previews_enabled property value. This feature is new in Grafana 9 and is quite resource intensive. It may cause low-end plans to work more slowly while the dashboard previews are rendering.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDashboardPreviewsEnabled() {
        return this.dashboardPreviewsEnabled;
    }
    /**
     * Gets the dashboards_min_refresh_interval property value. Signed sequence of decimal numbers, followed by a unit suffix (ms, s, m, h, d), e.g. 30s, 1h
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDashboardsMinRefreshInterval() {
        return this.dashboardsMinRefreshInterval;
    }
    /**
     * Gets the dashboards_versions_to_keep property value. The dashboards_versions_to_keep property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDashboardsVersionsToKeep() {
        return this.dashboardsVersionsToKeep;
    }
    /**
     * Gets the dataproxy_send_user_header property value. The dataproxy_send_user_header property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDataproxySendUserHeader() {
        return this.dataproxySendUserHeader;
    }
    /**
     * Gets the dataproxy_timeout property value. The dataproxy_timeout property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDataproxyTimeout() {
        return this.dataproxyTimeout;
    }
    /**
     * Gets the date_formats property value. The date_formats property
     * @return a JsonSchemaGrafanaDateFormats
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaDateFormats getDateFormats() {
        return this.dateFormats;
    }
    /**
     * Gets the disable_gravatar property value. The disable_gravatar property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableGravatar() {
        return this.disableGravatar;
    }
    /**
     * Gets the editors_can_admin property value. The editors_can_admin property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEditorsCanAdmin() {
        return this.editorsCanAdmin;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(30);
        deserializerMap.put("alerting_enabled", (n) -> { this.setAlertingEnabled(n.getBooleanValue()); });
        deserializerMap.put("alerting_error_or_timeout", (n) -> { this.setAlertingErrorOrTimeout(n.getEnumValue(JsonSchemaGrafanaAlertingErrorOrTimeout::forValue)); });
        deserializerMap.put("alerting_max_annotations_to_keep", (n) -> { this.setAlertingMaxAnnotationsToKeep(n.getIntegerValue()); });
        deserializerMap.put("alerting_nodata_or_nullvalues", (n) -> { this.setAlertingNodataOrNullvalues(n.getEnumValue(JsonSchemaGrafanaAlertingNodataOrNullvalues::forValue)); });
        deserializerMap.put("allow_embedding", (n) -> { this.setAllowEmbedding(n.getBooleanValue()); });
        deserializerMap.put("auth_azuread", (n) -> { this.setAuthAzuread(n.getObjectValue(JsonSchemaGrafanaAuthAzuread::createFromDiscriminatorValue)); });
        deserializerMap.put("auth_basic_enabled", (n) -> { this.setAuthBasicEnabled(n.getBooleanValue()); });
        deserializerMap.put("auth_generic_oauth", (n) -> { this.setAuthGenericOauth(n.getObjectValue(JsonSchemaGrafanaAuthGenericOauth::createFromDiscriminatorValue)); });
        deserializerMap.put("auth_github", (n) -> { this.setAuthGithub(n.getObjectValue(JsonSchemaGrafanaAuthGithub::createFromDiscriminatorValue)); });
        deserializerMap.put("auth_gitlab", (n) -> { this.setAuthGitlab(n.getObjectValue(JsonSchemaGrafanaAuthGitlab::createFromDiscriminatorValue)); });
        deserializerMap.put("auth_google", (n) -> { this.setAuthGoogle(n.getObjectValue(JsonSchemaGrafanaAuthGoogle::createFromDiscriminatorValue)); });
        deserializerMap.put("cookie_samesite", (n) -> { this.setCookieSamesite(n.getEnumValue(JsonSchemaGrafanaCookieSamesite::forValue)); });
        deserializerMap.put("dashboard_previews_enabled", (n) -> { this.setDashboardPreviewsEnabled(n.getBooleanValue()); });
        deserializerMap.put("dashboards_min_refresh_interval", (n) -> { this.setDashboardsMinRefreshInterval(n.getStringValue()); });
        deserializerMap.put("dashboards_versions_to_keep", (n) -> { this.setDashboardsVersionsToKeep(n.getIntegerValue()); });
        deserializerMap.put("dataproxy_send_user_header", (n) -> { this.setDataproxySendUserHeader(n.getBooleanValue()); });
        deserializerMap.put("dataproxy_timeout", (n) -> { this.setDataproxyTimeout(n.getIntegerValue()); });
        deserializerMap.put("date_formats", (n) -> { this.setDateFormats(n.getObjectValue(JsonSchemaGrafanaDateFormats::createFromDiscriminatorValue)); });
        deserializerMap.put("disable_gravatar", (n) -> { this.setDisableGravatar(n.getBooleanValue()); });
        deserializerMap.put("editors_can_admin", (n) -> { this.setEditorsCanAdmin(n.getBooleanValue()); });
        deserializerMap.put("google_analytics_ua_id", (n) -> { this.setGoogleAnalyticsUaId(n.getStringValue()); });
        deserializerMap.put("metrics_enabled", (n) -> { this.setMetricsEnabled(n.getBooleanValue()); });
        deserializerMap.put("oauth_allow_insecure_email_lookup", (n) -> { this.setOauthAllowInsecureEmailLookup(n.getBooleanValue()); });
        deserializerMap.put("privatelink_access", (n) -> { this.setPrivatelinkAccess(n.getObjectValue(JsonSchemaGrafanaPrivatelinkAccess::createFromDiscriminatorValue)); });
        deserializerMap.put("recovery_basebackup_name", (n) -> { this.setRecoveryBasebackupName(n.getStringValue()); });
        deserializerMap.put("smtp_server", (n) -> { this.setSmtpServer(n.getObjectValue(JsonSchemaGrafanaSmtpServer::createFromDiscriminatorValue)); });
        deserializerMap.put("unified_alerting_enabled", (n) -> { this.setUnifiedAlertingEnabled(n.getBooleanValue()); });
        deserializerMap.put("user_auto_assign_org", (n) -> { this.setUserAutoAssignOrg(n.getBooleanValue()); });
        deserializerMap.put("user_auto_assign_org_role", (n) -> { this.setUserAutoAssignOrgRole(n.getEnumValue(JsonSchemaGrafanaUserAutoAssignOrgRole::forValue)); });
        deserializerMap.put("viewers_can_edit", (n) -> { this.setViewersCanEdit(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the google_analytics_ua_id property value. The google_analytics_ua_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGoogleAnalyticsUaId() {
        return this.googleAnalyticsUaId;
    }
    /**
     * Gets the metrics_enabled property value. The metrics_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMetricsEnabled() {
        return this.metricsEnabled;
    }
    /**
     * Gets the oauth_allow_insecure_email_lookup property value. The oauth_allow_insecure_email_lookup property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOauthAllowInsecureEmailLookup() {
        return this.oauthAllowInsecureEmailLookup;
    }
    /**
     * Gets the privatelink_access property value. The privatelink_access property
     * @return a JsonSchemaGrafanaPrivatelinkAccess
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaPrivatelinkAccess getPrivatelinkAccess() {
        return this.privatelinkAccess;
    }
    /**
     * Gets the recovery_basebackup_name property value. The recovery_basebackup_name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecoveryBasebackupName() {
        return this.recoveryBasebackupName;
    }
    /**
     * Gets the smtp_server property value. The smtp_server property
     * @return a JsonSchemaGrafanaSmtpServer
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaSmtpServer getSmtpServer() {
        return this.smtpServer;
    }
    /**
     * Gets the unified_alerting_enabled property value. The unified_alerting_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUnifiedAlertingEnabled() {
        return this.unifiedAlertingEnabled;
    }
    /**
     * Gets the user_auto_assign_org property value. The user_auto_assign_org property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUserAutoAssignOrg() {
        return this.userAutoAssignOrg;
    }
    /**
     * Gets the user_auto_assign_org_role property value. The user_auto_assign_org_role property
     * @return a JsonSchemaGrafanaUserAutoAssignOrgRole
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaUserAutoAssignOrgRole getUserAutoAssignOrgRole() {
        return this.userAutoAssignOrgRole;
    }
    /**
     * Gets the viewers_can_edit property value. The viewers_can_edit property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getViewersCanEdit() {
        return this.viewersCanEdit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("alerting_enabled", this.getAlertingEnabled());
        writer.writeEnumValue("alerting_error_or_timeout", this.getAlertingErrorOrTimeout());
        writer.writeIntegerValue("alerting_max_annotations_to_keep", this.getAlertingMaxAnnotationsToKeep());
        writer.writeEnumValue("alerting_nodata_or_nullvalues", this.getAlertingNodataOrNullvalues());
        writer.writeBooleanValue("allow_embedding", this.getAllowEmbedding());
        writer.writeObjectValue("auth_azuread", this.getAuthAzuread());
        writer.writeBooleanValue("auth_basic_enabled", this.getAuthBasicEnabled());
        writer.writeObjectValue("auth_generic_oauth", this.getAuthGenericOauth());
        writer.writeObjectValue("auth_github", this.getAuthGithub());
        writer.writeObjectValue("auth_gitlab", this.getAuthGitlab());
        writer.writeObjectValue("auth_google", this.getAuthGoogle());
        writer.writeEnumValue("cookie_samesite", this.getCookieSamesite());
        writer.writeBooleanValue("dashboard_previews_enabled", this.getDashboardPreviewsEnabled());
        writer.writeStringValue("dashboards_min_refresh_interval", this.getDashboardsMinRefreshInterval());
        writer.writeIntegerValue("dashboards_versions_to_keep", this.getDashboardsVersionsToKeep());
        writer.writeBooleanValue("dataproxy_send_user_header", this.getDataproxySendUserHeader());
        writer.writeIntegerValue("dataproxy_timeout", this.getDataproxyTimeout());
        writer.writeObjectValue("date_formats", this.getDateFormats());
        writer.writeBooleanValue("disable_gravatar", this.getDisableGravatar());
        writer.writeBooleanValue("editors_can_admin", this.getEditorsCanAdmin());
        writer.writeStringValue("google_analytics_ua_id", this.getGoogleAnalyticsUaId());
        writer.writeBooleanValue("metrics_enabled", this.getMetricsEnabled());
        writer.writeBooleanValue("oauth_allow_insecure_email_lookup", this.getOauthAllowInsecureEmailLookup());
        writer.writeObjectValue("privatelink_access", this.getPrivatelinkAccess());
        writer.writeStringValue("recovery_basebackup_name", this.getRecoveryBasebackupName());
        writer.writeObjectValue("smtp_server", this.getSmtpServer());
        writer.writeBooleanValue("unified_alerting_enabled", this.getUnifiedAlertingEnabled());
        writer.writeBooleanValue("user_auto_assign_org", this.getUserAutoAssignOrg());
        writer.writeEnumValue("user_auto_assign_org_role", this.getUserAutoAssignOrgRole());
        writer.writeBooleanValue("viewers_can_edit", this.getViewersCanEdit());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the alerting_enabled property value. The alerting_enabled property
     * @param value Value to set for the alerting_enabled property.
     */
    public void setAlertingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.alertingEnabled = value;
    }
    /**
     * Sets the alerting_error_or_timeout property value. The alerting_error_or_timeout property
     * @param value Value to set for the alerting_error_or_timeout property.
     */
    public void setAlertingErrorOrTimeout(@jakarta.annotation.Nullable final JsonSchemaGrafanaAlertingErrorOrTimeout value) {
        this.alertingErrorOrTimeout = value;
    }
    /**
     * Sets the alerting_max_annotations_to_keep property value. The alerting_max_annotations_to_keep property
     * @param value Value to set for the alerting_max_annotations_to_keep property.
     */
    public void setAlertingMaxAnnotationsToKeep(@jakarta.annotation.Nullable final Integer value) {
        this.alertingMaxAnnotationsToKeep = value;
    }
    /**
     * Sets the alerting_nodata_or_nullvalues property value. The alerting_nodata_or_nullvalues property
     * @param value Value to set for the alerting_nodata_or_nullvalues property.
     */
    public void setAlertingNodataOrNullvalues(@jakarta.annotation.Nullable final JsonSchemaGrafanaAlertingNodataOrNullvalues value) {
        this.alertingNodataOrNullvalues = value;
    }
    /**
     * Sets the allow_embedding property value. The allow_embedding property
     * @param value Value to set for the allow_embedding property.
     */
    public void setAllowEmbedding(@jakarta.annotation.Nullable final Boolean value) {
        this.allowEmbedding = value;
    }
    /**
     * Sets the auth_azuread property value. The auth_azuread property
     * @param value Value to set for the auth_azuread property.
     */
    public void setAuthAzuread(@jakarta.annotation.Nullable final JsonSchemaGrafanaAuthAzuread value) {
        this.authAzuread = value;
    }
    /**
     * Sets the auth_basic_enabled property value. The auth_basic_enabled property
     * @param value Value to set for the auth_basic_enabled property.
     */
    public void setAuthBasicEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.authBasicEnabled = value;
    }
    /**
     * Sets the auth_generic_oauth property value. The auth_generic_oauth property
     * @param value Value to set for the auth_generic_oauth property.
     */
    public void setAuthGenericOauth(@jakarta.annotation.Nullable final JsonSchemaGrafanaAuthGenericOauth value) {
        this.authGenericOauth = value;
    }
    /**
     * Sets the auth_github property value. The auth_github property
     * @param value Value to set for the auth_github property.
     */
    public void setAuthGithub(@jakarta.annotation.Nullable final JsonSchemaGrafanaAuthGithub value) {
        this.authGithub = value;
    }
    /**
     * Sets the auth_gitlab property value. The auth_gitlab property
     * @param value Value to set for the auth_gitlab property.
     */
    public void setAuthGitlab(@jakarta.annotation.Nullable final JsonSchemaGrafanaAuthGitlab value) {
        this.authGitlab = value;
    }
    /**
     * Sets the auth_google property value. The auth_google property
     * @param value Value to set for the auth_google property.
     */
    public void setAuthGoogle(@jakarta.annotation.Nullable final JsonSchemaGrafanaAuthGoogle value) {
        this.authGoogle = value;
    }
    /**
     * Sets the cookie_samesite property value. The cookie_samesite property
     * @param value Value to set for the cookie_samesite property.
     */
    public void setCookieSamesite(@jakarta.annotation.Nullable final JsonSchemaGrafanaCookieSamesite value) {
        this.cookieSamesite = value;
    }
    /**
     * Sets the dashboard_previews_enabled property value. This feature is new in Grafana 9 and is quite resource intensive. It may cause low-end plans to work more slowly while the dashboard previews are rendering.
     * @param value Value to set for the dashboard_previews_enabled property.
     */
    public void setDashboardPreviewsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.dashboardPreviewsEnabled = value;
    }
    /**
     * Sets the dashboards_min_refresh_interval property value. Signed sequence of decimal numbers, followed by a unit suffix (ms, s, m, h, d), e.g. 30s, 1h
     * @param value Value to set for the dashboards_min_refresh_interval property.
     */
    public void setDashboardsMinRefreshInterval(@jakarta.annotation.Nullable final String value) {
        this.dashboardsMinRefreshInterval = value;
    }
    /**
     * Sets the dashboards_versions_to_keep property value. The dashboards_versions_to_keep property
     * @param value Value to set for the dashboards_versions_to_keep property.
     */
    public void setDashboardsVersionsToKeep(@jakarta.annotation.Nullable final Integer value) {
        this.dashboardsVersionsToKeep = value;
    }
    /**
     * Sets the dataproxy_send_user_header property value. The dataproxy_send_user_header property
     * @param value Value to set for the dataproxy_send_user_header property.
     */
    public void setDataproxySendUserHeader(@jakarta.annotation.Nullable final Boolean value) {
        this.dataproxySendUserHeader = value;
    }
    /**
     * Sets the dataproxy_timeout property value. The dataproxy_timeout property
     * @param value Value to set for the dataproxy_timeout property.
     */
    public void setDataproxyTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.dataproxyTimeout = value;
    }
    /**
     * Sets the date_formats property value. The date_formats property
     * @param value Value to set for the date_formats property.
     */
    public void setDateFormats(@jakarta.annotation.Nullable final JsonSchemaGrafanaDateFormats value) {
        this.dateFormats = value;
    }
    /**
     * Sets the disable_gravatar property value. The disable_gravatar property
     * @param value Value to set for the disable_gravatar property.
     */
    public void setDisableGravatar(@jakarta.annotation.Nullable final Boolean value) {
        this.disableGravatar = value;
    }
    /**
     * Sets the editors_can_admin property value. The editors_can_admin property
     * @param value Value to set for the editors_can_admin property.
     */
    public void setEditorsCanAdmin(@jakarta.annotation.Nullable final Boolean value) {
        this.editorsCanAdmin = value;
    }
    /**
     * Sets the google_analytics_ua_id property value. The google_analytics_ua_id property
     * @param value Value to set for the google_analytics_ua_id property.
     */
    public void setGoogleAnalyticsUaId(@jakarta.annotation.Nullable final String value) {
        this.googleAnalyticsUaId = value;
    }
    /**
     * Sets the metrics_enabled property value. The metrics_enabled property
     * @param value Value to set for the metrics_enabled property.
     */
    public void setMetricsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.metricsEnabled = value;
    }
    /**
     * Sets the oauth_allow_insecure_email_lookup property value. The oauth_allow_insecure_email_lookup property
     * @param value Value to set for the oauth_allow_insecure_email_lookup property.
     */
    public void setOauthAllowInsecureEmailLookup(@jakarta.annotation.Nullable final Boolean value) {
        this.oauthAllowInsecureEmailLookup = value;
    }
    /**
     * Sets the privatelink_access property value. The privatelink_access property
     * @param value Value to set for the privatelink_access property.
     */
    public void setPrivatelinkAccess(@jakarta.annotation.Nullable final JsonSchemaGrafanaPrivatelinkAccess value) {
        this.privatelinkAccess = value;
    }
    /**
     * Sets the recovery_basebackup_name property value. The recovery_basebackup_name property
     * @param value Value to set for the recovery_basebackup_name property.
     */
    public void setRecoveryBasebackupName(@jakarta.annotation.Nullable final String value) {
        this.recoveryBasebackupName = value;
    }
    /**
     * Sets the smtp_server property value. The smtp_server property
     * @param value Value to set for the smtp_server property.
     */
    public void setSmtpServer(@jakarta.annotation.Nullable final JsonSchemaGrafanaSmtpServer value) {
        this.smtpServer = value;
    }
    /**
     * Sets the unified_alerting_enabled property value. The unified_alerting_enabled property
     * @param value Value to set for the unified_alerting_enabled property.
     */
    public void setUnifiedAlertingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.unifiedAlertingEnabled = value;
    }
    /**
     * Sets the user_auto_assign_org property value. The user_auto_assign_org property
     * @param value Value to set for the user_auto_assign_org property.
     */
    public void setUserAutoAssignOrg(@jakarta.annotation.Nullable final Boolean value) {
        this.userAutoAssignOrg = value;
    }
    /**
     * Sets the user_auto_assign_org_role property value. The user_auto_assign_org_role property
     * @param value Value to set for the user_auto_assign_org_role property.
     */
    public void setUserAutoAssignOrgRole(@jakarta.annotation.Nullable final JsonSchemaGrafanaUserAutoAssignOrgRole value) {
        this.userAutoAssignOrgRole = value;
    }
    /**
     * Sets the viewers_can_edit property value. The viewers_can_edit property
     * @param value Value to set for the viewers_can_edit property.
     */
    public void setViewersCanEdit(@jakarta.annotation.Nullable final Boolean value) {
        this.viewersCanEdit = value;
    }
}
