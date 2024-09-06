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
 * GenericOAuthIntegration
 */
@JsonPropertyOrder({
  GenericOAuthIntegration.JSON_PROPERTY_SCOPES,
  GenericOAuthIntegration.JSON_PROPERTY_ALLOWED_DOMAINS,
  GenericOAuthIntegration.JSON_PROPERTY_ALLOWED_ORGANIZATIONS,
  GenericOAuthIntegration.JSON_PROPERTY_TOKEN_URL,
  GenericOAuthIntegration.JSON_PROPERTY_NAME,
  GenericOAuthIntegration.JSON_PROPERTY_AUTH_URL,
  GenericOAuthIntegration.JSON_PROPERTY_API_URL,
  GenericOAuthIntegration.JSON_PROPERTY_AUTO_LOGIN,
  GenericOAuthIntegration.JSON_PROPERTY_CLIENT_ID,
  GenericOAuthIntegration.JSON_PROPERTY_CLIENT_SECRET,
  GenericOAuthIntegration.JSON_PROPERTY_ALLOW_SIGN_UP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T07:23:47.609974Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GenericOAuthIntegration {
  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private List<String> scopes;

  public static final String JSON_PROPERTY_ALLOWED_DOMAINS = "allowed_domains";
  private List<String> allowedDomains;

  public static final String JSON_PROPERTY_ALLOWED_ORGANIZATIONS = "allowed_organizations";
  private List<String> allowedOrganizations;

  public static final String JSON_PROPERTY_TOKEN_URL = "token_url";
  private String tokenUrl;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AUTH_URL = "auth_url";
  private String authUrl;

  public static final String JSON_PROPERTY_API_URL = "api_url";
  private String apiUrl;

  public static final String JSON_PROPERTY_AUTO_LOGIN = "auto_login";
  private Boolean autoLogin;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_ALLOW_SIGN_UP = "allow_sign_up";
  private Boolean allowSignUp;

  public GenericOAuthIntegration() { 
  }

  public GenericOAuthIntegration scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public GenericOAuthIntegration addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getScopes() {
    return scopes;
  }


  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public GenericOAuthIntegration allowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }

  public GenericOAuthIntegration addAllowedDomainsItem(String allowedDomainsItem) {
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


  public GenericOAuthIntegration allowedOrganizations(List<String> allowedOrganizations) {
    this.allowedOrganizations = allowedOrganizations;
    return this;
  }

  public GenericOAuthIntegration addAllowedOrganizationsItem(String allowedOrganizationsItem) {
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


  public GenericOAuthIntegration tokenUrl(String tokenUrl) {
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


  public GenericOAuthIntegration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public GenericOAuthIntegration authUrl(String authUrl) {
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


  public GenericOAuthIntegration apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * Get apiUrl
   * @return apiUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_API_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApiUrl() {
    return apiUrl;
  }


  @JsonProperty(JSON_PROPERTY_API_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  public GenericOAuthIntegration autoLogin(Boolean autoLogin) {
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


  public GenericOAuthIntegration clientId(String clientId) {
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


  public GenericOAuthIntegration clientSecret(String clientSecret) {
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


  public GenericOAuthIntegration allowSignUp(Boolean allowSignUp) {
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


  /**
   * Return true if this Generic_OAuth_integration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericOAuthIntegration genericOAuthIntegration = (GenericOAuthIntegration) o;
    return Objects.equals(this.scopes, genericOAuthIntegration.scopes) &&
        Objects.equals(this.allowedDomains, genericOAuthIntegration.allowedDomains) &&
        Objects.equals(this.allowedOrganizations, genericOAuthIntegration.allowedOrganizations) &&
        Objects.equals(this.tokenUrl, genericOAuthIntegration.tokenUrl) &&
        Objects.equals(this.name, genericOAuthIntegration.name) &&
        Objects.equals(this.authUrl, genericOAuthIntegration.authUrl) &&
        Objects.equals(this.apiUrl, genericOAuthIntegration.apiUrl) &&
        Objects.equals(this.autoLogin, genericOAuthIntegration.autoLogin) &&
        Objects.equals(this.clientId, genericOAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, genericOAuthIntegration.clientSecret) &&
        Objects.equals(this.allowSignUp, genericOAuthIntegration.allowSignUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes, allowedDomains, allowedOrganizations, tokenUrl, name, authUrl, apiUrl, autoLogin, clientId, clientSecret, allowSignUp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericOAuthIntegration {\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    allowedOrganizations: ").append(toIndentedString(allowedOrganizations)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    autoLogin: ").append(toIndentedString(autoLogin)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
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

    // add `scopes` to the URL query string
    if (getScopes() != null) {
      for (int i = 0; i < getScopes().size(); i++) {
        joiner.add(String.format("%sscopes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getScopes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `allowed_domains` to the URL query string
    if (getAllowedDomains() != null) {
      for (int i = 0; i < getAllowedDomains().size(); i++) {
        joiner.add(String.format("%sallowed_domains%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAllowedDomains().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `allowed_organizations` to the URL query string
    if (getAllowedOrganizations() != null) {
      for (int i = 0; i < getAllowedOrganizations().size(); i++) {
        joiner.add(String.format("%sallowed_organizations%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAllowedOrganizations().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `token_url` to the URL query string
    if (getTokenUrl() != null) {
      joiner.add(String.format("%stoken_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `auth_url` to the URL query string
    if (getAuthUrl() != null) {
      joiner.add(String.format("%sauth_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `api_url` to the URL query string
    if (getApiUrl() != null) {
      joiner.add(String.format("%sapi_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApiUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `allow_sign_up` to the URL query string
    if (getAllowSignUp() != null) {
      joiner.add(String.format("%sallow_sign_up%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowSignUp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

