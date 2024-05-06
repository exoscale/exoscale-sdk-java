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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GenerateSksClusterKubeconfig200Response
 */
@JsonPropertyOrder({
  GenerateSksClusterKubeconfig200Response.JSON_PROPERTY_KUBECONFIG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T19:17:33.820745+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class GenerateSksClusterKubeconfig200Response {
  public static final String JSON_PROPERTY_KUBECONFIG = "kubeconfig";
  private String kubeconfig;

  public GenerateSksClusterKubeconfig200Response() { 
  }

  public GenerateSksClusterKubeconfig200Response kubeconfig(String kubeconfig) {
    this.kubeconfig = kubeconfig;
    return this;
  }

   /**
   * Get kubeconfig
   * @return kubeconfig
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KUBECONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKubeconfig() {
    return kubeconfig;
  }


  @JsonProperty(JSON_PROPERTY_KUBECONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKubeconfig(String kubeconfig) {
    this.kubeconfig = kubeconfig;
  }


  /**
   * Return true if this generate_sks_cluster_kubeconfig_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateSksClusterKubeconfig200Response generateSksClusterKubeconfig200Response = (GenerateSksClusterKubeconfig200Response) o;
    return Objects.equals(this.kubeconfig, generateSksClusterKubeconfig200Response.kubeconfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeconfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateSksClusterKubeconfig200Response {\n");
    sb.append("    kubeconfig: ").append(toIndentedString(kubeconfig)).append("\n");
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

    // add `kubeconfig` to the URL query string
    if (getKubeconfig() != null) {
      joiner.add(String.format("%skubeconfig%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKubeconfig()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

