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
import com.exoscale.sdk.model.DbaasExternalEndpoint;
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
 * ListDbaasExternalEndpoints200Response
 */
@JsonPropertyOrder({
  ListDbaasExternalEndpoints200Response.JSON_PROPERTY_DBAAS_ENDPOINTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-30T13:37:22.669691+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class ListDbaasExternalEndpoints200Response {
  public static final String JSON_PROPERTY_DBAAS_ENDPOINTS = "dbaas-endpoints";
  private List<DbaasExternalEndpoint> dbaasEndpoints;

  public ListDbaasExternalEndpoints200Response() { 
  }

  public ListDbaasExternalEndpoints200Response dbaasEndpoints(List<DbaasExternalEndpoint> dbaasEndpoints) {
    this.dbaasEndpoints = dbaasEndpoints;
    return this;
  }

  public ListDbaasExternalEndpoints200Response addDbaasEndpointsItem(DbaasExternalEndpoint dbaasEndpointsItem) {
    if (this.dbaasEndpoints == null) {
      this.dbaasEndpoints = new ArrayList<>();
    }
    this.dbaasEndpoints.add(dbaasEndpointsItem);
    return this;
  }

   /**
   * Get dbaasEndpoints
   * @return dbaasEndpoints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBAAS_ENDPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasExternalEndpoint> getDbaasEndpoints() {
    return dbaasEndpoints;
  }


  @JsonProperty(JSON_PROPERTY_DBAAS_ENDPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbaasEndpoints(List<DbaasExternalEndpoint> dbaasEndpoints) {
    this.dbaasEndpoints = dbaasEndpoints;
  }


  /**
   * Return true if this list_dbaas_external_endpoints_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDbaasExternalEndpoints200Response listDbaasExternalEndpoints200Response = (ListDbaasExternalEndpoints200Response) o;
    return Objects.equals(this.dbaasEndpoints, listDbaasExternalEndpoints200Response.dbaasEndpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbaasEndpoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDbaasExternalEndpoints200Response {\n");
    sb.append("    dbaasEndpoints: ").append(toIndentedString(dbaasEndpoints)).append("\n");
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

    // add `dbaas-endpoints` to the URL query string
    if (getDbaasEndpoints() != null) {
      for (int i = 0; i < getDbaasEndpoints().size(); i++) {
        if (getDbaasEndpoints().get(i) != null) {
          joiner.add(getDbaasEndpoints().get(i).toUrlQueryString(String.format("%sdbaas-endpoints%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

