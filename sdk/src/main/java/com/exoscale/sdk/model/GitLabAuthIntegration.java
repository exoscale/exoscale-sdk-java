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
 * GitLabAuthIntegration
 */
@JsonPropertyOrder({
  GitLabAuthIntegration.JSON_PROPERTY_ALLOW_SIGN_UP,
  GitLabAuthIntegration.JSON_PROPERTY_ALLOWED_GROUPS,
  GitLabAuthIntegration.JSON_PROPERTY_API_URL,
  GitLabAuthIntegration.JSON_PROPERTY_AUTH_URL,
  GitLabAuthIntegration.JSON_PROPERTY_CLIENT_ID,
  GitLabAuthIntegration.JSON_PROPERTY_CLIENT_SECRET,
  GitLabAuthIntegration.JSON_PROPERTY_TOKEN_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GitLabAuthIntegration {
  public static final String JSON_PROPERTY_ALLOW_SIGN_UP = "allow_sign_up";
  private Boolean allowSignUp;

  public static final String JSON_PROPERTY_ALLOWED_GROUPS = "allowed_groups";
  private List<String> allowedGroups = new ArrayList<>();

  public static final String JSON_PROPERTY_API_URL = "api_url";
  private String apiUrl;

  public static final String JSON_PROPERTY_AUTH_URL = "auth_url";
  private String authUrl;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_TOKEN_URL = "token_url";
  private String tokenUrl;

  public GitLabAuthIntegration() { 
  }

  public GitLabAuthIntegration allowSignUp(Boolean allowSignUp) {
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


  public GitLabAuthIntegration allowedGroups(List<String> allowedGroups) {
    this.allowedGroups = allowedGroups;
    return this;
  }

  public GitLabAuthIntegration addAllowedGroupsItem(String allowedGroupsItem) {
    if (this.allowedGroups == null) {
      this.allowedGroups = new ArrayList<>();
    }
    this.allowedGroups.add(allowedGroupsItem);
    return this;
  }

   /**
   * Get allowedGroups
   * @return allowedGroups
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAllowedGroups() {
    return allowedGroups;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedGroups(List<String> allowedGroups) {
    this.allowedGroups = allowedGroups;
  }


  public GitLabAuthIntegration apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * Get apiUrl
   * @return apiUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiUrl() {
    return apiUrl;
  }


  @JsonProperty(JSON_PROPERTY_API_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  public GitLabAuthIntegration authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

   /**
   * Get authUrl
   * @return authUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthUrl() {
    return authUrl;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }


  public GitLabAuthIntegration clientId(String clientId) {
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


  public GitLabAuthIntegration clientSecret(String clientSecret) {
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


  public GitLabAuthIntegration tokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * Get tokenUrl
   * @return tokenUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenUrl() {
    return tokenUrl;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }


  /**
   * Return true if this GitLab_Auth_integration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitLabAuthIntegration gitLabAuthIntegration = (GitLabAuthIntegration) o;
    return Objects.equals(this.allowSignUp, gitLabAuthIntegration.allowSignUp) &&
        Objects.equals(this.allowedGroups, gitLabAuthIntegration.allowedGroups) &&
        Objects.equals(this.apiUrl, gitLabAuthIntegration.apiUrl) &&
        Objects.equals(this.authUrl, gitLabAuthIntegration.authUrl) &&
        Objects.equals(this.clientId, gitLabAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, gitLabAuthIntegration.clientSecret) &&
        Objects.equals(this.tokenUrl, gitLabAuthIntegration.tokenUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSignUp, allowedGroups, apiUrl, authUrl, clientId, clientSecret, tokenUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitLabAuthIntegration {\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
    sb.append("    allowedGroups: ").append(toIndentedString(allowedGroups)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
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

    // add `allowed_groups` to the URL query string
    if (getAllowedGroups() != null) {
      for (int i = 0; i < getAllowedGroups().size(); i++) {
        joiner.add(String.format("%sallowed_groups%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAllowedGroups().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `api_url` to the URL query string
    if (getApiUrl() != null) {
      joiner.add(String.format("%sapi_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApiUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `auth_url` to the URL query string
    if (getAuthUrl() != null) {
      joiner.add(String.format("%sauth_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `client_id` to the URL query string
    if (getClientId() != null) {
      joiner.add(String.format("%sclient_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `client_secret` to the URL query string
    if (getClientSecret() != null) {
      joiner.add(String.format("%sclient_secret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientSecret()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `token_url` to the URL query string
    if (getTokenUrl() != null) {
      joiner.add(String.format("%stoken_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

