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
 * GoogleAuthIntegration
 */
@JsonPropertyOrder({
  GoogleAuthIntegration.JSON_PROPERTY_ALLOW_SIGN_UP,
  GoogleAuthIntegration.JSON_PROPERTY_CLIENT_ID,
  GoogleAuthIntegration.JSON_PROPERTY_CLIENT_SECRET,
  GoogleAuthIntegration.JSON_PROPERTY_ALLOWED_DOMAINS
})
@JsonTypeName("Google_Auth_integration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T16:37:05.548288+01:00[Europe/Vienna]")
public class GoogleAuthIntegration {
  public static final String JSON_PROPERTY_ALLOW_SIGN_UP = "allow_sign_up";
  private Boolean allowSignUp;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_ALLOWED_DOMAINS = "allowed_domains";
  private List<String> allowedDomains = new ArrayList<>();

  public GoogleAuthIntegration() {
  }

  public GoogleAuthIntegration allowSignUp(Boolean allowSignUp) {
    
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


  public GoogleAuthIntegration clientId(String clientId) {
    
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


  public GoogleAuthIntegration clientSecret(String clientSecret) {
    
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


  public GoogleAuthIntegration allowedDomains(List<String> allowedDomains) {
    
    this.allowedDomains = allowedDomains;
    return this;
  }

  public GoogleAuthIntegration addAllowedDomainsItem(String allowedDomainsItem) {
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
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAllowedDomains() {
    return allowedDomains;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    GoogleAuthIntegration googleAuthIntegration = (GoogleAuthIntegration) o;
    return Objects.equals(this.allowSignUp, googleAuthIntegration.allowSignUp) &&
        Objects.equals(this.clientId, googleAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, googleAuthIntegration.clientSecret) &&
        Objects.equals(this.allowedDomains, googleAuthIntegration.allowedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSignUp, clientId, clientSecret, allowedDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAuthIntegration {\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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

