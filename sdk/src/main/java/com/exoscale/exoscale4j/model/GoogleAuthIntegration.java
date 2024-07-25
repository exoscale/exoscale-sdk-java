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


package com.exoscale.exoscale4j.model;

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
 * GoogleAuthIntegration
 */
@JsonPropertyOrder({
  GoogleAuthIntegration.JSON_PROPERTY_ALLOW_SIGN_UP,
  GoogleAuthIntegration.JSON_PROPERTY_ALLOWED_DOMAINS,
  GoogleAuthIntegration.JSON_PROPERTY_CLIENT_ID,
  GoogleAuthIntegration.JSON_PROPERTY_CLIENT_SECRET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:19:43.121270Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GoogleAuthIntegration {
  public static final String JSON_PROPERTY_ALLOW_SIGN_UP = "allow_sign_up";
  private Boolean allowSignUp;

  public static final String JSON_PROPERTY_ALLOWED_DOMAINS = "allowed_domains";
  private List<String> allowedDomains = new ArrayList<>();

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

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


  /**
   * Return true if this Google_Auth_integration object is equal to o.
   */
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
        Objects.equals(this.allowedDomains, googleAuthIntegration.allowedDomains) &&
        Objects.equals(this.clientId, googleAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, googleAuthIntegration.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSignUp, allowedDomains, clientId, clientSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAuthIntegration {\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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

    // add `client_id` to the URL query string
    if (getClientId() != null) {
      joiner.add(String.format("%sclient_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `client_secret` to the URL query string
    if (getClientSecret() != null) {
      joiner.add(String.format("%sclient_secret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientSecret()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

