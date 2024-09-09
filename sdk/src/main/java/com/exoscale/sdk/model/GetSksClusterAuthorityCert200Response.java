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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetSksClusterAuthorityCert200Response
 */
@JsonPropertyOrder({
  GetSksClusterAuthorityCert200Response.JSON_PROPERTY_CACERT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetSksClusterAuthorityCert200Response {
  public static final String JSON_PROPERTY_CACERT = "cacert";
  private String cacert;

  public GetSksClusterAuthorityCert200Response() { 
  }

  public GetSksClusterAuthorityCert200Response cacert(String cacert) {
    this.cacert = cacert;
    return this;
  }

   /**
   * Get cacert
   * @return cacert
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CACERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCacert() {
    return cacert;
  }


  @JsonProperty(JSON_PROPERTY_CACERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCacert(String cacert) {
    this.cacert = cacert;
  }


  /**
   * Return true if this get_sks_cluster_authority_cert_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSksClusterAuthorityCert200Response getSksClusterAuthorityCert200Response = (GetSksClusterAuthorityCert200Response) o;
    return Objects.equals(this.cacert, getSksClusterAuthorityCert200Response.cacert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSksClusterAuthorityCert200Response {\n");
    sb.append("    cacert: ").append(toIndentedString(cacert)).append("\n");
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

    // add `cacert` to the URL query string
    if (getCacert() != null) {
      joiner.add(String.format("%scacert%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCacert()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
