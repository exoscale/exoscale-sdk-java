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


package com.exoscale.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AzureADOAuthIntegration
 */
@JsonPropertyOrder({
  AzureADOAuthIntegration.JSON_PROPERTY_ALLOW_SIGN_UP,
  AzureADOAuthIntegration.JSON_PROPERTY_CLIENT_ID,
  AzureADOAuthIntegration.JSON_PROPERTY_CLIENT_SECRET,
  AzureADOAuthIntegration.JSON_PROPERTY_AUTH_URL,
  AzureADOAuthIntegration.JSON_PROPERTY_TOKEN_URL,
  AzureADOAuthIntegration.JSON_PROPERTY_ALLOWED_GROUPS,
  AzureADOAuthIntegration.JSON_PROPERTY_ALLOWED_DOMAINS
})
@JsonTypeName("Azure_AD_OAuth_integration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T16:37:05.548288+01:00[Europe/Vienna]")
public class AzureADOAuthIntegration {
  public static final String JSON_PROPERTY_ALLOW_SIGN_UP = "allow_sign_up";
  private Boolean allowSignUp;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_AUTH_URL = "auth_url";
  private String authUrl;

  public static final String JSON_PROPERTY_TOKEN_URL = "token_url";
  private String tokenUrl;

  public static final String JSON_PROPERTY_ALLOWED_GROUPS = "allowed_groups";
  private List<String> allowedGroups;

  public static final String JSON_PROPERTY_ALLOWED_DOMAINS = "allowed_domains";
  private List<String> allowedDomains;

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
        Objects.equals(this.clientId, azureADOAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, azureADOAuthIntegration.clientSecret) &&
        Objects.equals(this.authUrl, azureADOAuthIntegration.authUrl) &&
        Objects.equals(this.tokenUrl, azureADOAuthIntegration.tokenUrl) &&
        Objects.equals(this.allowedGroups, azureADOAuthIntegration.allowedGroups) &&
        Objects.equals(this.allowedDomains, azureADOAuthIntegration.allowedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSignUp, clientId, clientSecret, authUrl, tokenUrl, allowedGroups, allowedDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureADOAuthIntegration {\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
    sb.append("    allowedGroups: ").append(toIndentedString(allowedGroups)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
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

}

