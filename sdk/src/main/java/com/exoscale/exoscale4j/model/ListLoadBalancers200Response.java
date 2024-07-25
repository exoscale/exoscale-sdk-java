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
import com.exoscale.exoscale4j.model.LoadBalancer;
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
 * ListLoadBalancers200Response
 */
@JsonPropertyOrder({
  ListLoadBalancers200Response.JSON_PROPERTY_LOAD_BALANCERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T12:59:58.559957Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListLoadBalancers200Response {
  public static final String JSON_PROPERTY_LOAD_BALANCERS = "load-balancers";
  private List<LoadBalancer> loadBalancers;

  public ListLoadBalancers200Response() { 
  }

  public ListLoadBalancers200Response loadBalancers(List<LoadBalancer> loadBalancers) {
    this.loadBalancers = loadBalancers;
    return this;
  }

  public ListLoadBalancers200Response addLoadBalancersItem(LoadBalancer loadBalancersItem) {
    if (this.loadBalancers == null) {
      this.loadBalancers = new ArrayList<>();
    }
    this.loadBalancers.add(loadBalancersItem);
    return this;
  }

   /**
   * Get loadBalancers
   * @return loadBalancers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOAD_BALANCERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LoadBalancer> getLoadBalancers() {
    return loadBalancers;
  }


  @JsonProperty(JSON_PROPERTY_LOAD_BALANCERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadBalancers(List<LoadBalancer> loadBalancers) {
    this.loadBalancers = loadBalancers;
  }


  /**
   * Return true if this list_load_balancers_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLoadBalancers200Response listLoadBalancers200Response = (ListLoadBalancers200Response) o;
    return Objects.equals(this.loadBalancers, listLoadBalancers200Response.loadBalancers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLoadBalancers200Response {\n");
    sb.append("    loadBalancers: ").append(toIndentedString(loadBalancers)).append("\n");
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

    // add `load-balancers` to the URL query string
    if (getLoadBalancers() != null) {
      for (int i = 0; i < getLoadBalancers().size(); i++) {
        if (getLoadBalancers().get(i) != null) {
          joiner.add(getLoadBalancers().get(i).toUrlQueryString(String.format("%sload-balancers%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

