/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.client.model.IPAddressRateLimitingSettings;
import io.swagger.client.model.InternalAuthenticationBackendLimiting;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OpensearchSecurityPluginSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class OpensearchSecurityPluginSettings {
  @JsonProperty("ip_rate_limiting")
  private IPAddressRateLimitingSettings ipRateLimiting = null;

  @JsonProperty("internal_authentication_backend_limiting")
  private InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting = null;

  public OpensearchSecurityPluginSettings ipRateLimiting(IPAddressRateLimitingSettings ipRateLimiting) {
    this.ipRateLimiting = ipRateLimiting;
    return this;
  }

   /**
   * Get ipRateLimiting
   * @return ipRateLimiting
  **/
  @Schema(description = "")
  public IPAddressRateLimitingSettings getIpRateLimiting() {
    return ipRateLimiting;
  }

  public void setIpRateLimiting(IPAddressRateLimitingSettings ipRateLimiting) {
    this.ipRateLimiting = ipRateLimiting;
  }

  public OpensearchSecurityPluginSettings internalAuthenticationBackendLimiting(InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting) {
    this.internalAuthenticationBackendLimiting = internalAuthenticationBackendLimiting;
    return this;
  }

   /**
   * Get internalAuthenticationBackendLimiting
   * @return internalAuthenticationBackendLimiting
  **/
  @Schema(description = "")
  public InternalAuthenticationBackendLimiting getInternalAuthenticationBackendLimiting() {
    return internalAuthenticationBackendLimiting;
  }

  public void setInternalAuthenticationBackendLimiting(InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting) {
    this.internalAuthenticationBackendLimiting = internalAuthenticationBackendLimiting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpensearchSecurityPluginSettings opensearchSecurityPluginSettings = (OpensearchSecurityPluginSettings) o;
    return Objects.equals(this.ipRateLimiting, opensearchSecurityPluginSettings.ipRateLimiting) &&
        Objects.equals(this.internalAuthenticationBackendLimiting, opensearchSecurityPluginSettings.internalAuthenticationBackendLimiting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipRateLimiting, internalAuthenticationBackendLimiting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpensearchSecurityPluginSettings {\n");
    
    sb.append("    ipRateLimiting: ").append(toIndentedString(ipRateLimiting)).append("\n");
    sb.append("    internalAuthenticationBackendLimiting: ").append(toIndentedString(internalAuthenticationBackendLimiting)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
