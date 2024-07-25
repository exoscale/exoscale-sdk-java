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
import com.exoscale.exoscale4j.model.PrivateNetwork;
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
 * ListPrivateNetworks200Response
 */
@JsonPropertyOrder({
  ListPrivateNetworks200Response.JSON_PROPERTY_PRIVATE_NETWORKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T12:59:58.559957Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListPrivateNetworks200Response {
  public static final String JSON_PROPERTY_PRIVATE_NETWORKS = "private-networks";
  private List<PrivateNetwork> privateNetworks;

  public ListPrivateNetworks200Response() { 
  }

  public ListPrivateNetworks200Response privateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public ListPrivateNetworks200Response addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
    if (this.privateNetworks == null) {
      this.privateNetworks = new ArrayList<>();
    }
    this.privateNetworks.add(privateNetworksItem);
    return this;
  }

   /**
   * Get privateNetworks
   * @return privateNetworks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PrivateNetwork> getPrivateNetworks() {
    return privateNetworks;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
  }


  /**
   * Return true if this list_private_networks_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPrivateNetworks200Response listPrivateNetworks200Response = (ListPrivateNetworks200Response) o;
    return Objects.equals(this.privateNetworks, listPrivateNetworks200Response.privateNetworks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateNetworks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPrivateNetworks200Response {\n");
    sb.append("    privateNetworks: ").append(toIndentedString(privateNetworks)).append("\n");
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

    // add `private-networks` to the URL query string
    if (getPrivateNetworks() != null) {
      for (int i = 0; i < getPrivateNetworks().size(); i++) {
        if (getPrivateNetworks().get(i) != null) {
          joiner.add(getPrivateNetworks().get(i).toUrlQueryString(String.format("%sprivate-networks%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

