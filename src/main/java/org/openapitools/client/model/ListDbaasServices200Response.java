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


package org.openapitools.client.model;

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
import org.openapitools.client.model.DbaasServiceCommon;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ListDbaasServices200Response
 */
@JsonPropertyOrder({
  ListDbaasServices200Response.JSON_PROPERTY_DBAAS_SERVICES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T18:00:26.790082348Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class ListDbaasServices200Response {
  public static final String JSON_PROPERTY_DBAAS_SERVICES = "dbaas-services";
  private List<DbaasServiceCommon> dbaasServices = new ArrayList<>();

  public ListDbaasServices200Response() { 
  }

  public ListDbaasServices200Response dbaasServices(List<DbaasServiceCommon> dbaasServices) {
    this.dbaasServices = dbaasServices;
    return this;
  }

  public ListDbaasServices200Response addDbaasServicesItem(DbaasServiceCommon dbaasServicesItem) {
    if (this.dbaasServices == null) {
      this.dbaasServices = new ArrayList<>();
    }
    this.dbaasServices.add(dbaasServicesItem);
    return this;
  }

   /**
   * Get dbaasServices
   * @return dbaasServices
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBAAS_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasServiceCommon> getDbaasServices() {
    return dbaasServices;
  }


  @JsonProperty(JSON_PROPERTY_DBAAS_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbaasServices(List<DbaasServiceCommon> dbaasServices) {
    this.dbaasServices = dbaasServices;
  }


  /**
   * Return true if this list_dbaas_services_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDbaasServices200Response listDbaasServices200Response = (ListDbaasServices200Response) o;
    return Objects.equals(this.dbaasServices, listDbaasServices200Response.dbaasServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbaasServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDbaasServices200Response {\n");
    sb.append("    dbaasServices: ").append(toIndentedString(dbaasServices)).append("\n");
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

    // add `dbaas-services` to the URL query string
    if (getDbaasServices() != null) {
      for (int i = 0; i < getDbaasServices().size(); i++) {
        if (getDbaasServices().get(i) != null) {
          joiner.add(getDbaasServices().get(i).toUrlQueryString(String.format("%sdbaas-services%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

