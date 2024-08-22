/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.exoscale.sdk.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GithubAuthIntegration
 */
@JsonPropertyOrder({
  GithubAuthIntegration.JSON_PROPERTY_ALLOW_SIGN_UP,
  GithubAuthIntegration.JSON_PROPERTY_ALLOWED_ORGANIZATIONS,
  GithubAuthIntegration.JSON_PROPERTY_AUTO_LOGIN,
  GithubAuthIntegration.JSON_PROPERTY_CLIENT_ID,
  GithubAuthIntegration.JSON_PROPERTY_CLIENT_SECRET,
  GithubAuthIntegration.JSON_PROPERTY_SKIP_ORG_ROLE_SYNC,
  GithubAuthIntegration.JSON_PROPERTY_TEAM_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-22T07:06:13.134792Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GithubAuthIntegration {
  public static final String JSON_PROPERTY_ALLOW_SIGN_UP = "allow_sign_up";
  private Boolean allowSignUp;

  public static final String JSON_PROPERTY_ALLOWED_ORGANIZATIONS = "allowed_organizations";
  private List<String> allowedOrganizations;

  public static final String JSON_PROPERTY_AUTO_LOGIN = "auto_login";
  private Boolean autoLogin;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_SKIP_ORG_ROLE_SYNC = "skip_org_role_sync";
  private Boolean skipOrgRoleSync;

  public static final String JSON_PROPERTY_TEAM_IDS = "team_ids";
  private List<Integer> teamIds;

  public GithubAuthIntegration() { 
  }

  public GithubAuthIntegration allowSignUp(Boolean allowSignUp) {
    this.allowSignUp = allowSignUp;
    return this;
  }

   /**
   * Get allowSignUp
   * @return allowSignUp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_SIGN_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowSignUp() {
    return allowSignUp;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_SIGN_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowSignUp(Boolean allowSignUp) {
    this.allowSignUp = allowSignUp;
  }


  public GithubAuthIntegration allowedOrganizations(List<String> allowedOrganizations) {
    this.allowedOrganizations = allowedOrganizations;
    return this;
  }

  public GithubAuthIntegration addAllowedOrganizationsItem(String allowedOrganizationsItem) {
    if (this.allowedOrganizations == null) {
      this.allowedOrganizations = new ArrayList<>();
    }
    this.allowedOrganizations.add(allowedOrganizationsItem);
    return this;
  }

   /**
   * Get allowedOrganizations
   * @return allowedOrganizations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_ORGANIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedOrganizations() {
    return allowedOrganizations;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_ORGANIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedOrganizations(List<String> allowedOrganizations) {
    this.allowedOrganizations = allowedOrganizations;
  }


  public GithubAuthIntegration autoLogin(Boolean autoLogin) {
    this.autoLogin = autoLogin;
    return this;
  }

   /**
   * Get autoLogin
   * @return autoLogin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoLogin() {
    return autoLogin;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoLogin(Boolean autoLogin) {
    this.autoLogin = autoLogin;
  }


  public GithubAuthIntegration clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public GithubAuthIntegration clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public GithubAuthIntegration skipOrgRoleSync(Boolean skipOrgRoleSync) {
    this.skipOrgRoleSync = skipOrgRoleSync;
    return this;
  }

   /**
   * Get skipOrgRoleSync
   * @return skipOrgRoleSync
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKIP_ORG_ROLE_SYNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipOrgRoleSync() {
    return skipOrgRoleSync;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_ORG_ROLE_SYNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipOrgRoleSync(Boolean skipOrgRoleSync) {
    this.skipOrgRoleSync = skipOrgRoleSync;
  }


  public GithubAuthIntegration teamIds(List<Integer> teamIds) {
    this.teamIds = teamIds;
    return this;
  }

  public GithubAuthIntegration addTeamIdsItem(Integer teamIdsItem) {
    if (this.teamIds == null) {
      this.teamIds = new ArrayList<>();
    }
    this.teamIds.add(teamIdsItem);
    return this;
  }

   /**
   * Get teamIds
   * @return teamIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTeamIds() {
    return teamIds;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamIds(List<Integer> teamIds) {
    this.teamIds = teamIds;
  }


  /**
   * Return true if this Github_Auth_integration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubAuthIntegration githubAuthIntegration = (GithubAuthIntegration) o;
    return Objects.equals(this.allowSignUp, githubAuthIntegration.allowSignUp) &&
        Objects.equals(this.allowedOrganizations, githubAuthIntegration.allowedOrganizations) &&
        Objects.equals(this.autoLogin, githubAuthIntegration.autoLogin) &&
        Objects.equals(this.clientId, githubAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, githubAuthIntegration.clientSecret) &&
        Objects.equals(this.skipOrgRoleSync, githubAuthIntegration.skipOrgRoleSync) &&
        Objects.equals(this.teamIds, githubAuthIntegration.teamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSignUp, allowedOrganizations, autoLogin, clientId, clientSecret, skipOrgRoleSync, teamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubAuthIntegration {\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
    sb.append("    allowedOrganizations: ").append(toIndentedString(allowedOrganizations)).append("\n");
    sb.append("    autoLogin: ").append(toIndentedString(autoLogin)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    skipOrgRoleSync: ").append(toIndentedString(skipOrgRoleSync)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `allow_sign_up` to the URL query string
    if (getAllowSignUp() != null) {
      joiner.add(String.format("%sallow_sign_up%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowSignUp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `allowed_organizations` to the URL query string
    if (getAllowedOrganizations() != null) {
      for (int i = 0; i < getAllowedOrganizations().size(); i++) {
        joiner.add(String.format("%sallowed_organizations%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAllowedOrganizations().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `auto_login` to the URL query string
    if (getAutoLogin() != null) {
      joiner.add(String.format("%sauto_login%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutoLogin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `client_id` to the URL query string
    if (getClientId() != null) {
      joiner.add(String.format("%sclient_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `client_secret` to the URL query string
    if (getClientSecret() != null) {
      joiner.add(String.format("%sclient_secret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientSecret()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `skip_org_role_sync` to the URL query string
    if (getSkipOrgRoleSync() != null) {
      joiner.add(String.format("%sskip_org_role_sync%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSkipOrgRoleSync()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `team_ids` to the URL query string
    if (getTeamIds() != null) {
      for (int i = 0; i < getTeamIds().size(); i++) {
        joiner.add(String.format("%steam_ids%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getTeamIds().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

