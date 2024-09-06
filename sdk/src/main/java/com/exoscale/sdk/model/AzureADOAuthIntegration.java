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
 * AzureADOAuthIntegration
 */
@JsonPropertyOrder({
  AzureADOAuthIntegration.JSON_PROPERTY_ALLOW_SIGN_UP,
  AzureADOAuthIntegration.JSON_PROPERTY_ALLOWED_DOMAINS,
  AzureADOAuthIntegration.JSON_PROPERTY_ALLOWED_GROUPS,
  AzureADOAuthIntegration.JSON_PROPERTY_AUTH_URL,
  AzureADOAuthIntegration.JSON_PROPERTY_CLIENT_ID,
  AzureADOAuthIntegration.JSON_PROPERTY_CLIENT_SECRET,
  AzureADOAuthIntegration.JSON_PROPERTY_TOKEN_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T07:23:47.609974Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AzureADOAuthIntegration {
  public static final String JSON_PROPERTY_ALLOW_SIGN_UP = "allow_sign_up";
  private Boolean allowSignUp;

  public static final String JSON_PROPERTY_ALLOWED_DOMAINS = "allowed_domains";
  private List<String> allowedDomains;

  public static final String JSON_PROPERTY_ALLOWED_GROUPS = "allowed_groups";
  private List<String> allowedGroups;

  public static final String JSON_PROPERTY_AUTH_URL = "auth_url";
  private String authUrl;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_TOKEN_URL = "token_url";
  private String tokenUrl;

  public AzureADOAuthIntegration() { 
  }

  public AzureADOAuthIntegration allowSignUp(Boolean allowSignUp) {
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


  public AzureADOAuthIntegration allowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }

  public AzureADOAuthIntegration addAllowedDomainsItem(String allowedDomainsItem) {
    if (this.allowedDomains == null) {
      this.allowedDomains = new ArrayList<>();
    }
    this.allowedDomains.add(allowedDomainsItem);
    return this;
  }

   /**
   * Get allowedDomains
   * @return allowedDomains
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedDomains() {
    return allowedDomains;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }


  public AzureADOAuthIntegration allowedGroups(List<String> allowedGroups) {
    this.allowedGroups = allowedGroups;
    return this;
  }

  public AzureADOAuthIntegration addAllowedGroupsItem(String allowedGroupsItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedGroups() {
    return allowedGroups;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedGroups(List<String> allowedGroups) {
    this.allowedGroups = allowedGroups;
  }


  public AzureADOAuthIntegration authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

   /**
   * Get authUrl
   * @return authUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTH_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthUrl() {
    return authUrl;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }


  public AzureADOAuthIntegration clientId(String clientId) {
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


  public AzureADOAuthIntegration clientSecret(String clientSecret) {
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


  public AzureADOAuthIntegration tokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * Get tokenUrl
   * @return tokenUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOKEN_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenUrl() {
    return tokenUrl;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }


  /**
   * Return true if this Azure_AD_OAuth_integration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureADOAuthIntegration azureADOAuthIntegration = (AzureADOAuthIntegration) o;
    return Objects.equals(this.allowSignUp, azureADOAuthIntegration.allowSignUp) &&
        Objects.equals(this.allowedDomains, azureADOAuthIntegration.allowedDomains) &&
        Objects.equals(this.allowedGroups, azureADOAuthIntegration.allowedGroups) &&
        Objects.equals(this.authUrl, azureADOAuthIntegration.authUrl) &&
        Objects.equals(this.clientId, azureADOAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, azureADOAuthIntegration.clientSecret) &&
        Objects.equals(this.tokenUrl, azureADOAuthIntegration.tokenUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSignUp, allowedDomains, allowedGroups, authUrl, clientId, clientSecret, tokenUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureADOAuthIntegration {\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    allowedGroups: ").append(toIndentedString(allowedGroups)).append("\n");
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

    // add `allowed_domains` to the URL query string
    if (getAllowedDomains() != null) {
      for (int i = 0; i < getAllowedDomains().size(); i++) {
        joiner.add(String.format("%sallowed_domains%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAllowedDomains().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `allowed_groups` to the URL query string
    if (getAllowedGroups() != null) {
      for (int i = 0; i < getAllowedGroups().size(); i++) {
        joiner.add(String.format("%sallowed_groups%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAllowedGroups().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
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

