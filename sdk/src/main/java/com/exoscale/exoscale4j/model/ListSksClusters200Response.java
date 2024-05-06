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
import com.exoscale.exoscale4j.model.SksCluster;
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
 * ListSksClusters200Response
 */
@JsonPropertyOrder({
  ListSksClusters200Response.JSON_PROPERTY_SKS_CLUSTERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T14:27:11.860946+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class ListSksClusters200Response {
  public static final String JSON_PROPERTY_SKS_CLUSTERS = "sks-clusters";
  private List<SksCluster> sksClusters;

  public ListSksClusters200Response() { 
  }

  public ListSksClusters200Response sksClusters(List<SksCluster> sksClusters) {
    this.sksClusters = sksClusters;
    return this;
  }

  public ListSksClusters200Response addSksClustersItem(SksCluster sksClustersItem) {
    if (this.sksClusters == null) {
      this.sksClusters = new ArrayList<>();
    }
    this.sksClusters.add(sksClustersItem);
    return this;
  }

   /**
   * Get sksClusters
   * @return sksClusters
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKS_CLUSTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SksCluster> getSksClusters() {
    return sksClusters;
  }


  @JsonProperty(JSON_PROPERTY_SKS_CLUSTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSksClusters(List<SksCluster> sksClusters) {
    this.sksClusters = sksClusters;
  }


  /**
   * Return true if this list_sks_clusters_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSksClusters200Response listSksClusters200Response = (ListSksClusters200Response) o;
    return Objects.equals(this.sksClusters, listSksClusters200Response.sksClusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sksClusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSksClusters200Response {\n");
    sb.append("    sksClusters: ").append(toIndentedString(sksClusters)).append("\n");
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

    // add `sks-clusters` to the URL query string
    if (getSksClusters() != null) {
      for (int i = 0; i < getSksClusters().size(); i++) {
        if (getSksClusters().get(i) != null) {
          joiner.add(getSksClusters().get(i).toUrlQueryString(String.format("%ssks-clusters%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

