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
import com.exoscale.exoscale4j.model.IPAddressRateLimitingSettings;
import com.exoscale.exoscale4j.model.InternalAuthenticationBackendLimiting;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OpensearchSecurityPluginSettings
 */
@JsonPropertyOrder({
  OpensearchSecurityPluginSettings.JSON_PROPERTY_INTERNAL_AUTHENTICATION_BACKEND_LIMITING,
  OpensearchSecurityPluginSettings.JSON_PROPERTY_IP_RATE_LIMITING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:08:43.238996Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OpensearchSecurityPluginSettings {
  public static final String JSON_PROPERTY_INTERNAL_AUTHENTICATION_BACKEND_LIMITING = "internal_authentication_backend_limiting";
  private InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting;

  public static final String JSON_PROPERTY_IP_RATE_LIMITING = "ip_rate_limiting";
  private IPAddressRateLimitingSettings ipRateLimiting;

  public OpensearchSecurityPluginSettings() { 
  }

  public OpensearchSecurityPluginSettings internalAuthenticationBackendLimiting(InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting) {
    this.internalAuthenticationBackendLimiting = internalAuthenticationBackendLimiting;
    return this;
  }

   /**
   * Get internalAuthenticationBackendLimiting
   * @return internalAuthenticationBackendLimiting
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL_AUTHENTICATION_BACKEND_LIMITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InternalAuthenticationBackendLimiting getInternalAuthenticationBackendLimiting() {
    return internalAuthenticationBackendLimiting;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_AUTHENTICATION_BACKEND_LIMITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalAuthenticationBackendLimiting(InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting) {
    this.internalAuthenticationBackendLimiting = internalAuthenticationBackendLimiting;
  }


  public OpensearchSecurityPluginSettings ipRateLimiting(IPAddressRateLimitingSettings ipRateLimiting) {
    this.ipRateLimiting = ipRateLimiting;
    return this;
  }

   /**
   * Get ipRateLimiting
   * @return ipRateLimiting
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_RATE_LIMITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPAddressRateLimitingSettings getIpRateLimiting() {
    return ipRateLimiting;
  }


  @JsonProperty(JSON_PROPERTY_IP_RATE_LIMITING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpRateLimiting(IPAddressRateLimitingSettings ipRateLimiting) {
    this.ipRateLimiting = ipRateLimiting;
  }


  /**
   * Return true if this Opensearch_Security_Plugin_Settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpensearchSecurityPluginSettings opensearchSecurityPluginSettings = (OpensearchSecurityPluginSettings) o;
    return Objects.equals(this.internalAuthenticationBackendLimiting, opensearchSecurityPluginSettings.internalAuthenticationBackendLimiting) &&
        Objects.equals(this.ipRateLimiting, opensearchSecurityPluginSettings.ipRateLimiting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalAuthenticationBackendLimiting, ipRateLimiting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpensearchSecurityPluginSettings {\n");
    sb.append("    internalAuthenticationBackendLimiting: ").append(toIndentedString(internalAuthenticationBackendLimiting)).append("\n");
    sb.append("    ipRateLimiting: ").append(toIndentedString(ipRateLimiting)).append("\n");
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

    // add `internal_authentication_backend_limiting` to the URL query string
    if (getInternalAuthenticationBackendLimiting() != null) {
      joiner.add(getInternalAuthenticationBackendLimiting().toUrlQueryString(prefix + "internal_authentication_backend_limiting" + suffix));
    }

    // add `ip_rate_limiting` to the URL query string
    if (getIpRateLimiting() != null) {
      joiner.add(getIpRateLimiting().toUrlQueryString(prefix + "ip_rate_limiting" + suffix));
    }

    return joiner.toString();
  }
}

