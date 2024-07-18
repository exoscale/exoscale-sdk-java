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
import com.exoscale.exoscale4j.model.DbaasServiceType;
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
 * ListDbaasServiceTypes200Response
 */
@JsonPropertyOrder({
  ListDbaasServiceTypes200Response.JSON_PROPERTY_DBAAS_SERVICE_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-18T11:55:07.035952Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListDbaasServiceTypes200Response {
  public static final String JSON_PROPERTY_DBAAS_SERVICE_TYPES = "dbaas-service-types";
  private List<DbaasServiceType> dbaasServiceTypes;

  public ListDbaasServiceTypes200Response() { 
  }

  public ListDbaasServiceTypes200Response dbaasServiceTypes(List<DbaasServiceType> dbaasServiceTypes) {
    this.dbaasServiceTypes = dbaasServiceTypes;
    return this;
  }

  public ListDbaasServiceTypes200Response addDbaasServiceTypesItem(DbaasServiceType dbaasServiceTypesItem) {
    if (this.dbaasServiceTypes == null) {
      this.dbaasServiceTypes = new ArrayList<>();
    }
    this.dbaasServiceTypes.add(dbaasServiceTypesItem);
    return this;
  }

   /**
   * Get dbaasServiceTypes
   * @return dbaasServiceTypes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBAAS_SERVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasServiceType> getDbaasServiceTypes() {
    return dbaasServiceTypes;
  }


  @JsonProperty(JSON_PROPERTY_DBAAS_SERVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbaasServiceTypes(List<DbaasServiceType> dbaasServiceTypes) {
    this.dbaasServiceTypes = dbaasServiceTypes;
  }


  /**
   * Return true if this list_dbaas_service_types_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDbaasServiceTypes200Response listDbaasServiceTypes200Response = (ListDbaasServiceTypes200Response) o;
    return Objects.equals(this.dbaasServiceTypes, listDbaasServiceTypes200Response.dbaasServiceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbaasServiceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDbaasServiceTypes200Response {\n");
    sb.append("    dbaasServiceTypes: ").append(toIndentedString(dbaasServiceTypes)).append("\n");
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

    // add `dbaas-service-types` to the URL query string
    if (getDbaasServiceTypes() != null) {
      for (int i = 0; i < getDbaasServiceTypes().size(); i++) {
        if (getDbaasServiceTypes().get(i) != null) {
          joiner.add(getDbaasServiceTypes().get(i).toUrlQueryString(String.format("%sdbaas-service-types%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

