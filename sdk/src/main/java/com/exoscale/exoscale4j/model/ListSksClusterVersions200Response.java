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
 * ListSksClusterVersions200Response
 */
@JsonPropertyOrder({
  ListSksClusterVersions200Response.JSON_PROPERTY_SKS_CLUSTER_VERSIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T16:12:55.204771Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListSksClusterVersions200Response {
  public static final String JSON_PROPERTY_SKS_CLUSTER_VERSIONS = "sks-cluster-versions";
  private List<String> sksClusterVersions;

  public ListSksClusterVersions200Response() { 
  }

  public ListSksClusterVersions200Response sksClusterVersions(List<String> sksClusterVersions) {
    this.sksClusterVersions = sksClusterVersions;
    return this;
  }

  public ListSksClusterVersions200Response addSksClusterVersionsItem(String sksClusterVersionsItem) {
    if (this.sksClusterVersions == null) {
      this.sksClusterVersions = new ArrayList<>();
    }
    this.sksClusterVersions.add(sksClusterVersionsItem);
    return this;
  }

   /**
   * Get sksClusterVersions
   * @return sksClusterVersions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKS_CLUSTER_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSksClusterVersions() {
    return sksClusterVersions;
  }


  @JsonProperty(JSON_PROPERTY_SKS_CLUSTER_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSksClusterVersions(List<String> sksClusterVersions) {
    this.sksClusterVersions = sksClusterVersions;
  }


  /**
   * Return true if this list_sks_cluster_versions_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSksClusterVersions200Response listSksClusterVersions200Response = (ListSksClusterVersions200Response) o;
    return Objects.equals(this.sksClusterVersions, listSksClusterVersions200Response.sksClusterVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sksClusterVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSksClusterVersions200Response {\n");
    sb.append("    sksClusterVersions: ").append(toIndentedString(sksClusterVersions)).append("\n");
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

    // add `sks-cluster-versions` to the URL query string
    if (getSksClusterVersions() != null) {
      for (int i = 0; i < getSksClusterVersions().size(); i++) {
        joiner.add(String.format("%ssks-cluster-versions%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getSksClusterVersions().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

